import sql from 'mssql';

export default class Database {
  config = {};
  poolconnection = null;
  connected = false;

  constructor(config) {
    this.config = config;
    console.log(`Database: config: ${JSON.stringify(config)}`);
  }

  async connect() {
    try {
      console.log(`Database connecting...${this.connected}`);
      if (this.connected === false) {
        this.poolconnection = await sql.connect(this.config);
        this.connected = true;
        console.log('Database connection successful');
      } else {
        console.log('Database already connected');
      }
    } catch (error) {
      console.error(`Error connecting to database: ${JSON.stringify(error)}`);
    }
  }

  async disconnect() {
    try {
      this.poolconnection.close();
      console.log('Database connection closed');
    } catch (error) {
      console.error(`Error closing database connection: ${error}`);
    }
  }

  async executeQuery(query) {
    await this.connect();
    const request = this.poolconnection.request();
    const result = await request.query(query);

    return result.rowsAffected[0];
  }

  async readAllBooks() {
    await this.connect();
    const request = this.poolconnection.request();
    const result = await request.query(`SELECT * FROM LIVRE`);

    return result.recordsets[0];
  }

  async readBook(id) {
    await this.connect();

    const request = this.poolconnection.request();
    const result = await request
      .input('id', sql.Int, +id)
      .query(`SELECT * FROM LIVRE WHERE livre_code = @id`);

    return result.recordset[0];
  }

  async updateBook(id, data) {
    await this.connect();

    const request = this.poolconnection.request();

    request.input('id', sql.Int, +id);
    request.input('titre', sql.NVarChar(255), data.titre);
    request.input('statut', sql.Int, data.statut);

    const result = await request.query(
      `UPDATE LIVRE SET livre_titre=@titre, livre_statut=@statut WHERE livre_code = @id`
    );

    return result.rowsAffected[0];
  }

  async deleteBook(id) {
    await this.connect();

    const idAsNumber = Number(id);

    const request = this.poolconnection.request();
    const result = await request
      .input('id', sql.Int, idAsNumber)
      .query(`DELETE FROM LIVRE WHERE livre_code = @id`);

    return result.rowsAffected[0];
  }

  async createBook(data) {
    await this.connect();
    const request = this.poolconnection.request();

    request.input('title', sql.NVarChar(255), data.title);
    request.input('statut', sql.Int, data.statut);

    const result = await request.query(
      `INSERT INTO LIVRE (livre_title,livre_statut) VALUES (@title, @statut)`
    );

    return result.rowsAffected[0];
  }
}
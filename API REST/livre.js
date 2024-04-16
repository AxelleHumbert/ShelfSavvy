import express from 'express';
import { config } from './config.js';
import Database from './database.js';

const router = express.Router();
router.use(express.json());

// Development only - don't do in production
console.log(config);

// Create database object
const database = new Database(config);

router.get('/', async (_, res) => {
  try {
    // Return a list of livre
    const livres = await database.readAllBooks();
    console.log(`livres: ${JSON.stringify(livres)}`);
    res.status(200).json(livres);
  } catch (err) {
    res.status(500).json({ error: err?.message });
  }
});

router.post('/', async (req, res) => {
  try {
    // Create a book
    const livre = req.body;
    console.log(`livre: ${JSON.stringify(livre)}`);
    const rowsAffected = await database.createBook(livre);
    res.status(201).json({ rowsAffected });
  } catch (err) {
    res.status(500).json({ error: err?.message });
  }
});

router.get('/:id', async (req, res) => {
  try {
    // Get the person with the specified ID
    const livreId = req.params.id;
    console.log(`livreId: ${livreId}`);
    if (livreId) {
      const result = await database.readBook(livreId);
      console.log(`livres: ${JSON.stringify(result)}`);
      res.status(200).json(result);
    } else {
      res.status(404);
    }
  } catch (err) {
    res.status(500).json({ error: err?.message });
  }
});

router.put('/:id', async (req, res) => {
  try {
    // Update the book with the specified ID
    const livreId = req.params.id;
    console.log(`livreId: ${livreId}`);
    const livre = req.body;

    if (livreId && livre) {
      delete livre.id;
      console.log(`livre: ${JSON.stringify(livre)}`);
      const rowsAffected = await database.updateBook(livreId, livre);
      res.status(200).json({ rowsAffected });
    } else {
      res.status(404);
    }
  } catch (err) {
    res.status(500).json({ error: err?.message });
  }
});

router.delete('/:id', async (req, res) => {
  try {
    // Delete the person with the specified ID
    const livreId = req.params.id;
    console.log(`livreId: ${livreId}`);

    if (!livreId) {
      res.status(404);
    } else {
      const rowsAffected = await database.deleteBook(livreId);
      res.status(204).json({ rowsAffected });
    }
  } catch (err) {
    res.status(500).json({ error: err?.message });
  }
});

export default router;
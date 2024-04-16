function addBook(){
	var cell, ligne;
	var table = document.getElementById("Tableau_livre");
	var nbLines = table.rows.length;
	
	ligne = table.insertRow(-1);
	
	cell = ligne.insertCell(0);
	cell.innerHTML = "Ligne " + nbLignes + " Cellule 0";
 
    cell = ligne.insertCell(1);
    cell.innerHTML = "Ligne " + nbLignes + " Cellule 1";
 
    cell = ligne.insertCell(2);
    cell.innerHTML = "Ligne " + nbLignes + " Cellule 2";
 
    cell = ligne.insertCell(3);
    cell.innerHTML = "Ligne " + nbLignes + " Cellule 3";
	
}
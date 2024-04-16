<%@page import="com.glob.modeles.StatutVO"%>
<%@page import="com.glob.modeles.GenreVO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page 
import="java.util.*"
import="com.glob.modeles.LivreVO"
import="com.glob.modeles.AuteurVO"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script type = "text/javascript">
function addBook(){
	 var cell, ligne;
	 var tableau = document.getElementById("Tableau_livre");
	 var title = document.getElementById("title").value;
	 var auteur = document.getElementById("inputGroupSelect01").options[document.getElementById("inputGroupSelect01").selectedIndex].text;
	 var genre = document.getElementById("inputGroupSelectGenre").options[document.getElementById("inputGroupSelectGenre").selectedIndex].text;
	 var statut = document.getElementById("inputGroupSelectStatut").options[document.getElementById("inputGroupSelectStatut").selectedIndex].text;
	 
	 
	 ligne = tableau.insertRow(-1); // création d'une ligne pour ajout en fin de table
	                                   // le paramètre est dans ce cas (-1)
	 // création et insertion des cellules dans la nouvelle ligne créée
	 cell = ligne.insertCell(0);
	 cell.innerHTML = title;
	 
	 cell = ligne.insertCell(1);
	 cell.innerHTML = auteur;
	 
	  cell = ligne.insertCell(2);
	  cell.innerHTML = statut;
	 
	  cell = ligne.insertCell(3);
}
</script> 
<title>ShelfSavvy</title>
</head>
<body>
<header>
<nav class="navbar navbar-dark bg-dark">
  	<div class="container-fluid">
    	<a class="navbar-brand" href="#">ShelfSavvy</a>
	</div>
</nav>
</header>
<h4>Liste de vos livres</h4>
<table class="table table-sm" id="Tableau_livre">
	<thead>
		<tr>
	      <th scope="col" style='border: solid black 1px'>Titre</th>
	      <th scope="col" style='border: solid black 1px'>Auteur(s)</th>
	      <th scope="col" style='border: solid black 1px'>Statut</th>
	      <th scope="col" style='border: solid black 1px'>Prendre le livre</th>
	    </tr>
    </thead>
    <tbody>
    	<%
    		Vector<LivreVO> mvLivres = (Vector) request.getAttribute("mvLivres");
    		
	    	for(LivreVO livre : mvLivres){
	    		out.write("	<tr> <td style='border: solid black 1px'>" + livre.getMsTitre() + "</td>");
	    		out.write("<td style='border: solid black 1px'>"+livre.getMvAuteurs().firstElement().getMsNom() + ' ' + livre.getMvAuteurs().firstElement().getMsPrenom() +"</td>");
	    		out.write("<td style='border: solid black 1px'>"+livre.getMoStatut().getMsLibelle()+"</td>");
	    		out.write("<td style='border: solid black 1px; '> <button type='button'><span class='material-symbols-outlined'> swipe_down_alt </span></button> </td> </tr> ");
	    		
	    	};
	    %>
    </tbody>
    
</table>

<form id="addBook_form">
	<fieldset enable>
	    <legend>Ajouter un livre </legend>
	    
	    <div class="input-group">
		  <span class="input-group-text" >Titre</span>
		  <input type="text" aria-label="Title" class="form-control" id="title">

		  <label class="input-group-text" for="inputGroupSelect01">Auteur</label>
		  <select class="form-select" id="inputGroupSelect01">
		    <option selected>Choisisez l'auteur principal</option>
		   <%
    		Vector<AuteurVO> mvAuteurs = (Vector) request.getAttribute("mvAuteurs");
    		
	    	for(AuteurVO auteur : mvAuteurs){
	    		out.write("<option value='"+ auteur.getMiCode()+ "'>"+ auteur.getMsPrenom()+' '+ auteur.getMsNom()+"</option>");	    		
	    	};
	   		 %>
		  </select>

		  <label class="input-group-text" for="inputGroupSelect01">Genre</label>
		  <select class="form-select" id="inputGroupSelectGenre">
		    <option selected>Choisisez le genre principal</option>
		   <%
    		Vector<GenreVO> mvGenres = (Vector) request.getAttribute("mvGenres");
    		
	    	for(GenreVO genre : mvGenres){
	    		out.write("<option value='"+ genre.getMiCode()+ "'>"+ genre.getMsLibelle()+"</option>");	    		
	    	};
	   		 %>
		  </select>
		  
		  <label class="input-group-text" for="inputGroupSelect01">Statut</label>
		  <select class="form-select" id="inputGroupSelectStatut">
		    <option selected>Choisissez le statut du livre</option>
		   <%
    		Vector<StatutVO> mvStatut = (Vector) request.getAttribute("mvStatut");
    		
	    	for(StatutVO statut : mvStatut){
	    		out.write("<option value='"+ statut.getMiCode()+ "'>"+ statut.getMsLibelle()+"</option>");	    		
	    	};
	   		 %>
		  </select>
		</div>
		<div class="col-12">
    		<button class="btn btn-outline-dark" type="button" onclick="addBook()">Ajouter un livre</button>
 		</div>
	</fieldset>
</form>
</body>
</html>
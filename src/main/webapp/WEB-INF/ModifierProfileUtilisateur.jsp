<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.projetEncheres.BO.Utilisateur"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Modifiez votre profile.</title>
        <meta charset="UTF-8">
    </head>
    <body>
    <%@ include file="fragments/menu.jspf"%>
    <form action="ModifierProfile" method="POST">
    <% Utilisateur u = (Utilisateur)session.getAttribute("utilisateur"); %>
    	<label for="pseudo"></label><input name="pseudo" type="text" value="<% out.print(u.getPseudo()); %>">
    	<label for="nom"></label><input name="nom" type="text" value="<% out.print(u.getNom()); %>" disabled>
    	<label for="prenom"></label><input name="prenom" type="text" value="<% out.print(u.getPrenom()); %>" disabled>
    	<label for="email"></label><input name="email" type="email" value="<% out.print(u.getEmail()); %>">
    	<label for="telephone"></label><input name="telephone" type="tel" value="<% out.print(u.getTelephone()); %>">
    	<label for="rue"></label><input name="rue" type="text" value="<% out.print(u.getRue()); %>">
    	<label for="code_postal"></label><input name="code_postal" type="number" value="<% out.print(u.getCodePostal()); %>">
    	<label for="ville"></label><input name="ville" type="text" value="<% out.print(u.getVille()); %>">
    	<label for="credit"></label><input name="credit" type="text" value="<% out.print(u.getCredit()); %>" disabled>
    	<label for="mot_de_passe"></label><input name="mot_de_passe" type="password" placeholder="Nouveau mot de passe ici.">
    	<label for="validation"></label><input name="validation" type="password" placeholder="Vérification du mot de passe ici.">
    	<button type="submit" formaction="/ModifierProfile">Enregistrer</button>
		<button type="submit" formaction="/SupprimerProfile">Supprimer mon compte</button>
    </form>
    </body>
</html>
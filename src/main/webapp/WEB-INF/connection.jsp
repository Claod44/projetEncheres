<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<main class="connexion">
	<form action="Connexion" method="post" class="Connexion" >
		<h1>Connexion</h1>
		<div class="groupForm">
			<label for="pseudo">Pseudo</label> <input type="text" id="pseudo"
				name="pseudo" />
		</div>
		<div class="groupForm">
			<label for="mots_de_passe">Mot de passe</label> <input type="password" id="mots_de_passe"
				name="mots_de_passe" />
		</div>
			<div class="btnsForm">
			<button type="submit">Connexion</button>
			<a href="<%=application.getContextPath()%>/inscription.jsp" >Inscription</a>
		</div>
	</form>
</main>
</body>
</html>
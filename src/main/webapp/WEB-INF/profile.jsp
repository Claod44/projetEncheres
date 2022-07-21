<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<main class="profil">
	<section class="monprofil">
		<h1>Profil</h1>
		<div class="profil-card">
			<div>
				<div class="groupForm">
					<p>pseudo :</p>
					<p>${utilisateur.pseudo}</p>
				</div>
				<div class="groupForm">
					<p>nom :</p>
					<p>${utilisateur.nom}</p>
				</div>
				<div class="groupForm">
					<p>prénom :</p>
					<p>${utilisateur.prenom}</p>
				</div>
				<div class="groupForm">
					<p>email :</p>
					<p>${utilisateur.email}</p>
				</div>
			</div>
			<div>
				<div class="groupForm">
					<p>téléphone :</p>
					<p>${utilisateur.telephone}</p>
				</div>
				<div class="groupForm">
					<p>rue :</p>
					<p>${utilisateur.rue}</p>
				</div>
				<div class="groupForm">
					<p>code Postal :</p>
					<p>${utilisateur.codePostal}</p>
				</div>
				<div class="groupForm">
					<p>ville :</p>
					<p>${utilisateur.ville}</p>
				</div>
			</div>
			<div class="btnsForm">
				<a href="">Modifier</a>
			</div>
		</div>
	</section>
</main>
</body>
</html>
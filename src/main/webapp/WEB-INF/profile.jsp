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
					<p>${Utilisateur.getPseudo()}</p>
				</div>
				<div class="groupForm">
					<p>nom :</p>
					<p>${Utilisateur.getNom()}</p>
				</div>
				<div class="groupForm">
					<p>prénom :</p>
					<p>${Utilisateur.getPrenom()}</p>
				</div>
				<div class="groupForm">
					<p>email :</p>
					<p>${Utilisateur.getEmail()}</p>
				</div>
			</div>
			<div>
				<div class="groupForm">
					<p>téléphone :</p>
					<p>${Utilisateur.getTelephone()}</p>
				</div>
				<div class="groupForm">
					<p>rue :</p>
					<p>${Utilisateur.getRue()}</p>
				</div>
				<div class="groupForm">
					<p>code Postal :</p>
					<p>${Utilisateur.getCodePostal()}</p>
				</div>
				<div class="groupForm">
					<p>ville :</p>
					<p>${Utilisateur.getVille()}</p>
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
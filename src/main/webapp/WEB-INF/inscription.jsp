<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<main class="inscription">
	<form action="Inscription" method="post">
		<div>
			<div class="groupForm">
				<label for="pseudo">pseudo</label>
				<input required type="text" id="pseudo" name="pseudo" placeholder="Pseudo (max 30 caratères)"/>
			</div>
			<div class="groupForm">
				<label for="nom">nom</label>
				<input required type="text" id="nom" name="nom" placeholder="Nom (max 30 caratères)"/>
			</div>
			<div class="groupForm">
				<label for="prenom">prénom</label>
				<input required type="text" id="prenom" name="prenom" placeholder="Prénom (max 30 caratères)"/>
			</div>
			<div class="groupForm">
				<label for="email">email</label>
				<input required type="email" id="email" name="email" placeholder="encheres@eni.fr (max 40 caratères)"/>
			</div>
			<div class="groupForm">
				<label for="telephone">téléphone</label>
				<input required type="tel" id="telephone" name="telephone" placeholder="(*FR) 06..(10 chiffres)"  pattern="[0-9]{10}" />
			</div>
		</div>
		<div>
			<div class="groupForm">
				<label for="rue">rue</label>
				<input required type="text" id="rue" name="rue" placeholder="* (max 60 caratères) " />
			</div>
			<div class="groupForm">
				<label for="code_Postal">code Postal</label>
				<input required type="text" id="code_Postal" name="code_Postal" placeholder="(*FR)  75000" pattern="[0-9]{5}"/>
			</div>
			<div class="groupForm">
				<label for="ville">ville</label>
				<input required type="text" id="ville" name="ville" placeholder="Paris (max 30 caratères)"/>
			</div>
			<div class="groupForm">
				<label for="mdp">Mot de passe </label>
				<input required type="password" id="mot_de_passe" name="mot_de_passe" placeholder="********" />
			</div>
			
		</div>
		<div class="btnsForm">
			<button type="submit">S'inscrire</button>
			<button type ="reset">Annuler</button>
		</div>
	</form>
</main>
</body>
</html>
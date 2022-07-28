<!-- @author Maelle (Edited by Claod) -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
<link rel="stylesheet" href="../css/style.css">
</head>
<body>
<video autoplay muted loop id="videobg">
		<source src="/images/video.mp4" type="video/mp4">
</video>
<%@ include file="fragments/header.jspf"%>
<%@ include file="fragments/menu.jspf"%>
	<section class="monprofil">
		<div class="profil-card">
			<div>
				<div class="groupForm">
					<p>pseudo :</p>
					<p>${pseudo}</p>
				</div>
				<div class="groupForm">
					<p>nom :</p>
					<p>${nom}</p>
				</div>
				<div class="groupForm">
					<p>prénom :</p>
					<p>${prenom}</p>
				</div>
				<div class="groupForm">
					<p>email :</p>
					<p>${email}</p>
				</div>
			</div>
			<div>
				<div class="groupForm">
					<p>téléphone :</p>
					<p>${telephone}</p>
				</div>
				<div class="groupForm">
					<p>rue :</p>
					<p>${rue}</p>
				</div>
				<div class="groupForm">
					<p>code Postal :</p>
					<p>${code_postal}</p>
				</div>
				<div class="groupForm">
					<p>ville :</p>
					<p>${ville}</p>
				</div>
			</div>
			<div class="btnsForm">
				<a href="<%=application.getContextPath()%>/ModifierProfile">Modifier</a>
			</div>
		</div>
	</section>
</body>
</html>
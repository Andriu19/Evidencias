<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>Triple_X_Movie</title>
	<link rel="stylesheet" type="text/css" href="css/estilos.css">
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
	<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
	<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
	<link rel="stylesheet" href="css/master.css?n=1">

	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">

	<link rel="icon" href="img/logo/icon.jpeg" type="image/jpeg" />
</head>
<body>

<div>
  <ul id="slide-out" class="sidenav">
    <li><div class="user-view">
      <div class="background">
       <img src="img/inicio/andromeda.jpg">
      </div>
      <a href="#user"><img class="circle" src="img/inicio/iconusuario.jpg"></a>
      <a href="#name"><span class="white-text name">A.J.R</span></a>
      <a href="#email"><span class="white-text email">Triple_X_Movie</span></a>
    </div></li>
    <li class="activo"><a href="index.php"><i class="fas fa-home"></i> Inicio</a></li>
    <li><a href="view/peliculas.php"><i class="fas fa-video"></i> Películas</a></li>
    <li><div class="divider"></div></li>
    <li><a class="subheader">Opciones</a></li>
    <li><a class="waves-effect" href="view/iniciar_sesion.php">Iniciar sesión</a></li>
    <li><a class="waves-effect" href="view/registrate.php">Registrarse</a></li>
  </ul>
  <a id="menu" href="#" data-target="slide-out" class="sidenav-trigger"><i class="fa fa-bars"></i></a>
</div>

<video src="img/inicio/intensamente-video.mp4" autoplay loop poster="img/inicio/bg.png"></video>

<div class="containerr">
	<center>
	<img width="100" src="img/logo/icon.jpeg" alt="">
	<br><br>
	<br><br>
	<a class="blue darken-4 waves-effect btn-large pulse" href="view/peliculas.php">Ver Películas</a>
<br><br><br>
	<div class="espacio">
		<a class="btn tooltipped waves-effect orange accent-3 fondo" data-position="left" data-tooltip="Inicia sesión!" href="view/iniciar_sesion.php">Iniciar sesión</a>
		<a class="btn tooltipped waves-effect orange accent-3" data-position="right" data-tooltip="Registrate, es gratis!" href="view/registrate.php" >Registrarse</a>
	</div>
	</center>
	
	<center>
	<p id="bottom" class="white-text">© Triple_X_Movie</p>
	</center>
	
</div>

<script type="text/javascript" src="js/js.js"></script>
<script type="text/javascript" src="js/materialize.min.js"></script>
</body>
</html>
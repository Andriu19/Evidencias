<?php
	$servidor="localhost";
	$usuario="root";
	$clave="";
	$baseDeDatos="cubetas";
	$enlace = mysqli_connect($servidor,$usuario,$clave,$baseDeDatos);

	if(!$enlace){
		echo"Error en la conexion con el servidor";
	}
?>

<!DOCTYPE html>
<html dir="ltr" lang="en-US">
<head>

	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<meta name="author" content="SemiColonWeb" />

	<!-- Stylesheets
	============================================= -->
	<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700|Roboto:300,400,500,700|Nunito:900&display=swap" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" href="css/bootstrap.css" type="text/css" />
	<link rel="stylesheet" href="style.css" type="text/css" />
	<link rel="stylesheet" href="css/swiper.css" type="text/css" />

	<!-- One Page Module Specific Stylesheet -->
	<link rel="stylesheet" href="one-page/onepage.css" type="text/css" />
	<!-- / -->

	<link rel="stylesheet" href="css/dark.css" type="text/css" />
	<link rel="stylesheet" href="css/font-icons.css" type="text/css" />
	<link rel="stylesheet" href="one-page/css/et-line.css" type="text/css" />
	<link rel="stylesheet" href="css/animate.css" type="text/css" />
	<link rel="stylesheet" href="css/magnific-popup.css" type="text/css" />

	<link rel="stylesheet" href="one-page/css/fonts.css" type="text/css" />

	<link rel="stylesheet" href="css/custom.css" type="text/css" />
	<meta name="viewport" content="width=device-width, initial-scale=1" />

	<!-- Document Title
	============================================= -->
	<title>TQ Tecnovin LC</title>

	<style>
		.slider-text {
			font-size: 6rem;
			font-family: 'Nunito', sans-serif;
			line-height: 1;
		}

		@media (max-width: 991.98px) {
			.slider-text {
				font-size: 7vw;
			}
		}

		.secondary-color { background: rgb(225, 238, 235) !important; }
	</style>

</head>

<body class="stretched">

	<!-- Document Wrapper
	============================================= -->
	<div id="wrapper" class="clearfix">

		<!-- Header
		============================================= -->
		<header id="header" class="full-header transparent-header border-full-header header-size-custom" data-sticky-shrink="false" data-sticky-class="secondary-color">
			<div id="header-wrap">
				<div class="container">
					<div class="header-row">

						<!-- Logo
						============================================= -->
						<div id="logo">
							<a href="index.html" class="retina-logo" data-dark-logo="one-page/images/canvasone-dark@2x.png"><img src="one-page/images/canvasone@2x.png" alt="Canvas Logo"></a>
						</div><!-- #logo end -->

						<div id="primary-menu-trigger">
							<svg class="svg-trigger" viewBox="0 0 100 100"><path d="m 30,33 h 40 c 3.722839,0 7.5,3.126468 7.5,8.578427 0,5.451959 -2.727029,8.421573 -7.5,8.421573 h -20"></path><path d="m 30,50 h 40"></path><path d="m 70,67 h -40 c 0,0 -7.5,-0.802118 -7.5,-8.365747 0,-7.563629 7.5,-8.634253 7.5,-8.634253 h 20"></path></svg>
						</div>

						<!-- Primary Navigation
						============================================= -->
						<nav class="primary-menu">

							<ul class="one-page-menu menu-container" data-easing="easeInOutExpo" data-speed="1250" data-offset="65">
								<li class="menu-item">
									<a href="#" class="menu-link" data-href="#wrapper"><div>Inicio</div></a>
								</li>
								<li class="menu-item">
									<a href="#" class="menu-link" data-href="#section-about"><div>A cerca de</div></a>
								</li>
								<li class="menu-item">
									<a href="#" class="menu-link" data-href="#section-works"><div>Trabajos</div></a>
								</li>
								<li class="menu-item">
									<a href="#" class="menu-link" data-href="#section-services"><div>Servicios</div></a>
								</li>
								<li class="menu-item">
									<a href="#" class="menu-link" data-href="#section-registro"><div>Registro</div></a>
								</li>
								<li class="menu-item">
									<a href="#" class="menu-link" data-href="#section-contact"><div>Contactanos</div></a>
								</li>
							</ul>

						</nav><!-- #primary-menu end -->

					</div>
				</div>
			</div>
			<div class="header-wrap-clone"></div>
		</header><!-- #header end -->
		<!-- Slider
		============================================= -->
		<section id="slider" class="slider-element min-vh-100 include-header" style="height: 950px">
			<div class="w-100 h-100 position-absolute" class="" style="background: url('/imagenes/AdobeStock_318732539_Preview.jpeg') center bottom no-repeat; background-size: cover; z-index: 1"></div>
			<div class="container">
				<div class="vertical-middle">
					<h2 id="titulo" class="slider-text text-uppercase text-right font-weight-bolder" data-0="margin-top: -300px; opacity: 1" data-450="margin-top: 0px; opacity: .4">TQ<br>Tecnovin</h2>
				</div>
			</div>

		</section><!-- #slider end -->

		<!-- Content
		============================================= -->
		<section id="content">

			<div class="content-wrap py-0">

				<div id="section-about" class="center page-section pt-0 secondary-color">

					<div class="container clearfix">

						<h2 class="mx-auto bottommargin font-body" style="max-width: 700px; font-size: 40px;">DESCRIPCIÓN & VENTAJAS</h2>

						<p class="lead mx-auto bottommargin" style="max-width: 800px;">Pintura formulada con resinas 100% estiren-acrílicas en emulsión acuosa de fácil aplica-ción. Por sus características se puede usar con fines decorativos, protección en interiores y como base blanca.
						<br>Producto ecológico, no contiene solven-tes tóxicos, recubrimiento que se puede usar en edificios, muros, block, etc.,excelente poder cubriente, al ser una pintura 100% estiren-acrílica, forma una película impermeable con excelente adherencia.
						 </p>

						<p class="bottommargin" style="font-size: 16px;"><a href="http://tqtecnoquimicos.com.mx/" data-scrollto="#section-services" data-easing="easeInOutExpo" data-speed="1250" data-offset="70" class="more-link">Leer más <i class="icon-angle-right"></i></a></p>

						<div class="clear"></div>

				         <center>
							<div class="col-md-4 mb-5">
								<div class="team">
									<div class="team-image">
										<img src="/imagenes/cubeta.png" alt="Josh Clark">
										<div class="bg-overlay">
											<div class="bg-overlay-content " data-hover-animate="fadeIn" data-hover-speed="400">
												<p>Puede ser utilizado en construcciones en donde se requiera un alto poder cu-briente, por su formulación cuenta con excelen-te adherencia.</p>
											</div>
											<div class="bg-overlay-bg" data-hover-animate="fadeIn" data-hover-speed="400"></div>
										</div>
									</div>
									<div class="team-desc team-desc-bg">
										<div class="team-title"><h4>Bote de pintura blanca acrilica mate</h4><span>Producto TQ</span></div>
									</div>
								</div>
							</center>
							</div>
							</div>

					</div>

				</div>

				<div id="section-works" class="page-section pt-0">

					<div class="section m-0">
						<div class="container clearfix">
							<div class="mx-auto center" style="max-width: 900px;">
								<h3 class="mb-0 font-weight-light ls1">TQ Tecnoquímicos S.A. de C.V, evalúa todos los parámetros fisicoquímicos de sus productos, con base a las normas de calidad de nuestro laboratorio. Los datos contenidos en este boletín son responsabilidad de la empresa, pero es muy importante que el aplicador o usuario de los productos realice las pruebas respectivas, sobre el desempeño de los materiales para las condiciones específicas de cada obra. </h3>
							</div>
						</div>
					</div>

					<!-- Portfolio Items
					============================================= -->
					<div class="portfolio grid-container row no-gutters">

						<article class="portfolio-item col-lg-6 col-md-4 col-sm-6 col-12 wide">
							<div class="grid-inner">
								<div class="portfolio-image">
									<a href="#">
										<img src="/imagenes/AdobeStock_190617826_Preview.jpeg" alt="Manzana">
									</a>
									<div class="bg-overlay">
										<div class="bg-overlay-content flex-column" data-hover-animate="fadeIn">
											<div class="portfolio-desc p-0 center" data-hover-animate="fadeInDownSmall" data-hover-animate-out="fadeOutUpSmall" data-hover-speed="350">
												<h3><a href="#">El uso se lo das tu</a></h3>
												<span><a href="#">Profesional o artistico</a></span>
											</div>
										</div>
										<div class="bg-overlay-bg" data-hover-animate="fadeIn"></div>
									</div>
								</div>
							</div>
						</article>

						<article class="portfolio-item col-lg-3 col-md-4 col-sm-6 col-12">
							<div class="grid-inner">
								<div class="portfolio-image">
									<a href="#">
										<img src="/imagenes/AdobeStock_180997410_Preview.jpeg" alt="Locked Steel Gate">
									</a>
									<div class="bg-overlay">
										<div class="bg-overlay-content flex-column" data-hover-animate="fadeIn">
											<div class="portfolio-desc p-0 center" data-hover-animate="fadeInDownSmall" data-hover-animate-out="fadeOutUpSmall" data-hover-speed="350">
												<h3><a href="#">Formuladas con resinas vinil acrílicas </a></h3>
												<span><a href="#">Capacidad de adhesión al sustrato</a></span>
											</div>
										</div>
										<div class="bg-overlay-bg" data-hover-animate="fadeIn"></div>
									</div>
								</div>
							</div>
						</article>

						<article class="portfolio-item col-lg-3 col-md-4 col-sm-6 col-12">
							<div class="grid-inner">
								<div class="portfolio-image">
									<a href="#">
										<img src="/imagenes/AdobeStock_213026452_Preview.jpeg" alt="Mac Sunglasses">
									</a>
									<div class="bg-overlay">
										<div class="bg-overlay-content flex-column" data-hover-animate="fadeIn">
											<div class="portfolio-desc p-0 center" data-hover-animate="fadeInDownSmall" data-hover-animate-out="fadeOutUpSmall" data-hover-speed="350">
												<h3><a href="#">Proporcionar mayor tiempo de vida </a></h3>
												<span><a href="#">Uso en cualquier aplicacion.</a></span>
											</div>
										</div>
										<div class="bg-overlay-bg" data-hover-animate="fadeIn"></div>
									</div>
								</div>
							</div>
						</article>

						<article class="portfolio-item col-lg-6 col-md-4 col-sm-6 col-12 wide">
							<div class="grid-inner">
								<div class="portfolio-image">
									<a href="#">
										<img src="/imagenes/AdobeStock_473725914_Preview.jpeg" alt="Open Imagination">
									</a>
									<div class="bg-overlay">
										<div class="bg-overlay-content flex-column" data-hover-animate="fadeIn">
											<div class="portfolio-desc p-0 center" data-hover-animate="fadeInDownSmall" data-hover-animate-out="fadeOutUpSmall" data-hover-speed="350">
												<h3><a href="#">El material debe aplicarse con rodillo o brocha, despues de aplicar la primera mano se recomienda esperar 4 horas antes de aplicar la segunda</a></h3>
												<span><a href="#">Producto facil de aplicar</a></span>
											</div>
										</div>
										<div class="bg-overlay-bg" data-hover-animate="fadeIn"></div>
									</div>
								</div>
							</div>
						</article>

						<article class="portfolio-item col-lg-6 col-md-4 col-sm-6 col-12 wide">
							<div class="grid-inner">
								<div class="portfolio-image">
									<a href="#">
										<img src="/imagenes/AdobeStock_478560225_Preview.jpeg" alt="Console Activity">
									</a>
									<div class="bg-overlay">
										<div class="bg-overlay-content flex-column" data-hover-animate="fadeIn">
											<div class="portfolio-desc p-0 center" data-hover-animate="fadeInDownSmall" data-hover-animate-out="fadeOutUpSmall" data-hover-speed="350">
												<h3><a href="#">La mejor pintura para cualquier espacio</a></h3>
												<span><a href="#">Formulada para cualquier superficie </a></span>
											</div>
										</div>
										<div class="bg-overlay-bg" data-hover-animate="fadeIn"></div>
									</div>
								</div>
							</div>
						</article>

						<article class="portfolio-item col-lg-3 col-md-4 col-sm-6 col-12">
							<div class="grid-inner">
								<div class="portfolio-image">
									<a href="#">
										<img src="/imagenes/AdobeStock_477820655_Preview.jpeg" alt="Open Imagination">
									</a>
									<div class="bg-overlay">
										<div class="bg-overlay-content flex-column" data-hover-animate="fadeIn">
											<div class="portfolio-desc p-0 center" data-hover-animate="fadeInDownSmall" data-hover-animate-out="fadeOutUpSmall" data-hover-speed="350">
												<h3><a href="#"> Aplicar a temperaturas mayores de 5 °C</a></h3>
												<span><a href="#">Cubeta de 19 Lt </a></span>
											</div>
										</div>
										<div class="bg-overlay-bg" data-hover-animate="fadeIn"></div>
									</div>
								</div>
							</div>
						</article>

						<article class="portfolio-item col-lg-3 col-md-4 col-sm-6 col-12">
							<div class="grid-inner">
								<div class="portfolio-image">
									<a href="#">
										<img src="/imagenes/AdobeStock_338193799_Preview.jpeg" alt="Backpack Contents">
									</a>
									<div class="bg-overlay">
										<div class="bg-overlay-content flex-column" data-hover-animate="fadeIn">
											<div class="portfolio-desc p-0 center" data-hover-animate="fadeInDownSmall" data-hover-animate-out="fadeOutDownSmall" data-hover-speed="350">
												<h3><a href="#">El poder cubriente es reducido 2-3</a></h3>
												<span><a href="#">mejor poder cubriente y adherencia</a></span>
											</div>
										</div>
										<div class="bg-overlay-bg" data-hover-animate="fadeIn"></div>
									</div>
								</div>
							</div>
						</article>

					</div><!-- #portfolio end -->

					<div class="topmargin center"><a href="http://tqtecnoquimicos.com.mx/" class="button button-border button-circle font-weight-semibold">Más proyectos</a></div>

				</div>

				<div id="section-services" class="page-section pt-0">

					<div class="section m-0">
						<div class="container clearfix">
							<div class="mx-auto center" style="max-width: 900px;">
								<h2 class="mb-0 font-weight-light ls1">Nuestros productos requieren de un evaluacion por el cliente ya que cada producto esta hecho para cada condicion, al igual se cuenta con un envio y distintos servicios.</h2>
							</div>
						</div>
					</div>

					<div class="row align-items-stretch">

						<div class="col-lg-4 d-none d-md-block" style="background: url('/imagenes/AdobeStock_473725829_Preview.jpeg') center center no-repeat; background-size: cover;"></div>
						<div class="col-lg-8">
							<div class="row align-items-stretch grid-border clearfix">
								<div class="col-lg-4 col-md-6 col-padding">
									<div class="feature-box fbox-center fbox-dark fbox-plain">
										<div class="fbox-icon">
											<a href="http://tqtecnoquimicos.com.mx/"><img src="/imagenes/Camion.png" alt="Envios"></a>
										</div>
										<div class="fbox-content fbox-content-sm">
											<h3>ENVIOS</h3>
										</div>
									</div>
								</div>
								<div class="col-lg-4 col-md-6 col-padding">
									<div class="feature-box fbox-center fbox-dark fbox-plain">
										<div class="fbox-icon">
											<a href="http://tqtecnoquimicos.com.mx/?page_id=248"><img src="/imagenes/Pintura.png" alt="Pintura"></a>
										</div>
										<div class="fbox-content fbox-content-sm">
											<h3>PRODUCTOS</h3>
										</div>
									</div>
								</div>
								<div class="col-lg-4 col-md-6 col-padding">
									<div class="feature-box fbox-center fbox-dark fbox-plain">
										<div class="fbox-icon">
											<a href="http://tqtecnoquimicos.com.mx/?page_id=219"><img src="/imagenes/divisa.png" alt="Especial"></a>
										</div>
										<div class="fbox-content fbox-content-sm">
											<h3>ESPECIALES</h3>
										</div>
									</div>
								</div>
							</div>
						</div>

					</div>

					<div class="section dark m-0">
						<div class="mx-auto center" style="max-width: 900px;">
							<h2 class="mb-0 font-weight-light ls1">¿Te gustan nuestros productos? <a href="http://tqtecnoquimicos.com.mx/"  data-offset="140" data-easing="easeInOutExpo" data-speed="1250" class="button button-border button-circle button-light button-large my-0" style="position: relative; top: -3px;">Ingresa aqui</a></h2>
						</div>
					</div>

					<div class="section parallax m-0 dark" style="background-image: url('/imagenes/AdobeStock_305945858_Preview.jpeg'); padding: 100px 0;" data-bottom-top="background-position:0px 0px;" data-top-bottom="background-position:0px -300px;">

						<div class="container clearfix">

							<div class="row justify-content-end">
								<div class="col-md-7">
									<div class="fslider testimonial testimonial-full bg-transparent border-0 shadow-none p-0" data-arrows="false">
										<div class="flexslider">
											<div class="slider-wrap">
												<div class="slide">
													<div class="testi-content">
														<p style="color: black";>Utilizar un recipiente independiente para la aplicación, evite en lo posible introducir rodillos o brochas con residuos que puedan contaminar el material.</p>
													</div>
												</div>
												<div class="slide">
													<div class="testi-content">
														<p style="color: black";>Respetar el rendimiento señalado.</p>
													</div>
												</div>
												<div class="slide">
													<div class="testi-content">
														<p style="color: black";>No diluir el material.</p>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				  <div id="section-registro">
						<div class="mx-auto topmargin" style="max-width: 670px;">
						
		                        <form action="&" class="formulario" id="formulario" name="formulario" method="POST">
							
		 	                      <div class="col-md-6 mb-4">
									 <input  type="text" id="template-contactform-name" name="nombre" value="" class="sm-form-control border-form-control required" placeholder="Nombre" />
								   </div>
									<div class="col-md-8 mb-4">
										<input type="email" id="template-contactform-email" name="correo" value="" class="required email sm-form-control border-form-control" placeholder="Correo Electronico" />
									</div>
									<div class="col-md-4 mb-4">
										<input type="text" id="template-contactform-phone" name="telefono" value="" class="sm-form-control border-form-control" placeholder="Telefono" />
								
									<select name="estado" class="select-css">
										<option value="no">Seleccione su Estado...</option>
										<option value="Aguascalientes">Aguascalientes</option>
										<option value="Baja California">Baja California</option>
										<option value="Baja California Sur">Baja California Sur</option>
										<option value="Campeche">Campeche</option>
										<option value="Chiapas">Chiapas</option>
										<option value="Chihuahua">Chihuahua</option>
										<option value="CDMX">Ciudad de México</option>
										<option value="Coahuila">Coahuila</option>
										<option value="Colima">Colima</option>
										<option value="Durango">Durango</option>
										<option value="Estado de México">Estado de México</option>
										<option value="Guanajuato">Guanajuato</option>
										<option value="Guerrero">Guerrero</option>
										<option value="Hidalgo">Hidalgo</option>
										<option value="Michoacán">Michoacán</option>
										<option value="Morelos">Morelos</option>
										<option value="Nayarit">Nayarit</option>
										<option value="Nuevo León">Nuevo León</option>
										<option value="Oaxaca">Oaxaca</option>
										<option value="Puebla">Puebla</option>
										<option value="Querétaro">Querétaro</option>
										<option value="Quintana Roo">Quintana Roo</option>
										<option value="San Luis Potosí">San Luis Potosí</option>
										<option value="Sinaloa">Sinaloa</option>
										<option value="Sonora">Sonora</option>
										<option value="Tabasco">Tabasco</option>
										<option value="Tamaulipas">Tamaulipas</option>
										<option value="Tlaxcala">Tlaxcala</option>
										<option value="Veracruz">Veracruz</option>
										<option value="Yucatán">Yucatán</option>
										<option value="Zacatecas">Zacatecas</option>
									</select>
									</div>

									<div class="col-md-6 mb-4">
										<input type="text" id="template-contactform-subject" name="municipio" value="" class="required sm-form-control border-form-control" placeholder="Municipio" />
									</div>

									<div class="col-7 mb-4">
										<textarea class="required sm-form-control border-form-control" id="template-contactform-message" name="cubetas" rows="7" cols="30"  placeholder="Cantidad de cubetas"></textarea>
									</div>

									<div class="col-12 center mb-4">
										<button class="button button-border button-circle font-weight-medium ml-0 topmargin-sm" type="submit" id="template-contactform-submit" name="enviar" value="submit">Enviar</button>
										<br>
										<!---<small style="display: block; font-size: 13px; margin-top: 15px;">We'll do our best to get back to you within 6-8 working hours.</small>--->
									</div>
                             </form>
	                      </div>
	                  </div> 
	              </div>   
	          </div>
	      </div>
		</section><!-- #content end -->

		<!-- Footert
		============================================= -->
		<div id="section-contact"></div>
		<footer id="footer" class="dark border-0">
			<div class="container center">
				<div class="footer-widgets-wrap">
					<center><h3>Contactanos</h3> </center>
					<div class="row mx-auto clearfix">

						<div class="col-lg-4">
							<div class="widget clearfix">
								<h4>Email</h4>
					<p>ventas@tqtecnoquimicos.com.mx</p>
							</div>
						</div>

						<div class="col-lg-4">
							<div class="widget clearfix">
								<h4>Telefonica</h4>
								<p>
									5114-1362<br>
									5114-4460 <br> 
									5114-5805</p>
							</div>
					</div>

						<div class="col-lg-4">
							<div class="widget clearfix">
								<h4>Web</h4>
								<p>www:tqtecnoquimicos.com.mx</p>
							</div>
								</div>
								
							</div>
						</div>
					</div>
		</footer><!-- #footer end -->

	</div><!-- #wrapper end -->

	<!-- Go To Top
	============================================= -->
	<div id="gotoTop" class="icon-angle-up"></div>

	<!-- JavaScripts
	============================================= -->
	<script src="js/jquery.js"></script>
	<script src="js/plugins.min.js"></script>
	<script src="https://maps.google.com/maps/api/js?key=YOUR-API-KEY"></script>

	<!-- Footer Scripts
	============================================= -->
	<script src="js/functions.js"></script>

</body>
</html>
<?php
if(isset($_POST['enviar'])){
			$nombre=$_POST["nombre"];
			$correo=$_POST["correo"];
			$telefono=$_POST["telefono"];
			$estado=$_POST["estado"];
			$municipio=$_POST["municipio"];
			$cubetas=$_POST["cubetas"];
			$id=rand(1,99);

			$insertarDatos = "INSERT INTO  tabla VALUES('$id',
			                                            '$nombre',
			                                            '$correo',
													    '$telefono',
														'$estado',
														'$municipio',
														'$cubetas')";
		$ejecutarInsertar = mysqli_query($enlace, $insertarDatos);

		if(!$ejecutarInsertar){
			echo"Error En la linea SQL";
		}

		}
?>
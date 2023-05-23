-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-01-2021 a las 22:56:15
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cine_je`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comentarios`
--

CREATE TABLE `comentarios` (
  `id` int(11) NOT NULL,
  `pelicula_id` int(11) NOT NULL,
  `comentario` text NOT NULL,
  `fecha` date NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `correo` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `contrasena` varchar(25) NOT NULL,
  `tipo_usuario` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `login`
--

INSERT INTO `login` (`id`, `nombre`, `correo`, `contrasena`, `tipo_usuario`) VALUES
(1, 'JETZY ', 'jetzy_sic@tesco.edu.mx', '123456789J', 'admin'),
(2, 'ANDREA', 'andrea_sic@tesco.edu.mx', '123456789A', 'admin'),
(3, 'RANDI', 'randi.israel_sic@tesco.edu.mx', '123456789R', 'admin'),
(25, 'IVAN', 'edson.ivan_sic@tesco.edu.mx', '444', 'user'),
(26, 'JOYCE', 'joyce.sarahi_sic@tesco.edu.mx', 'dramatica', 'user'),
(27, 'RIGO ', 'rodrigo_sic@tesco.edu.mx', 'elserio', 'user');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `peliculas`
--

CREATE TABLE `peliculas` (
  `id` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `genero` varchar(50) NOT NULL,
  `descripcion` text NOT NULL,
  `fecha` date NOT NULL,
  `trailer` text NOT NULL,
  `link_pelicula` text NOT NULL,
  `imagen` text NOT NULL,
  `imagen_bg` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `peliculas`
--

INSERT INTO `peliculas` (`id`, `nombre`, `genero`, `descripcion`, `fecha`, `trailer`, `link_pelicula`, `imagen`, `imagen_bg`) VALUES
(9, 'Avengers: Endgame', ' FantasÃ­a | ciencia ficciÃ³n', 'Los Vengadores restantes deben encontrar una manera de recuperar a sus aliados para un enfrentamiento Ã©pico con Thanos, el malvado que diezmÃ³ el planeta y el universo.', '2019-08-02', 'UQ3bqYKnyhM', 'UQ3bqYKnyhM', 'AvengersEndgame.jpg', 'hipertextual-nuevo-trailer-avengers-endgame-agradece-fans-universo-marvel-2019351167.jpg'),
(16, 'BAD BOYS: FOR LIFE', 'Acción ', 'En esta tercera entrega de la franquicia, los policías Mike Lowrey (Will Smith) y Marcus Burnett (Martin Lawrence) vuelven a patrullar juntos para intentar derrotar a Armando Armas (Jacob Scipio), el líder de un cartel de drogas mexicano en Miami.', '2020-12-24', 'https://www.youtube.com/watch?v=ek1ePFp-nBI', 'https://www.youtube.com/watch?v=zjzzsegblUI', 'BADBOYS.png', 'BADBOYSPOR.png'),
(17, 'Halloween (2018)', 'Terror', 'Michael Myers lleva 40 años recluido en una institución psiquiátrica de máxima seguridad y está a punto de ser trasladado. Una pareja de documentalistas investiga su historia para dar un punto de vista más humano sobre él, razón por la que buscan a Laurie, quien ha pasado toda su vida en paranoia y preparándose de manera casi militar para el momento en que Michael escape y la busque para una vez más, tratar de matarla.', '2020-12-24', 'https://www.youtube.com/watch?v=ek1ePFp-nBI', 'https://www.youtube.com/watch?v=6i_GnUEvV9w', 'Hallowen.png', 'HalloweenPor.png'),
(18, 'Hubie Halloween', 'Comedia', 'Hubie Dubois (Adam Sandler), un hombre muy excéntrico, hace de voluntario a la comunidad de Salem, donde sufre de burla de niños y también de adultos. Con estos problemas que lleva en su vida diaria, Hubie tendrá la oportunidad de ganarse el respeto de las personas a su alrededor, pues será el encargado de sobrellevar un problema nunca antes visto en la ciudad y de esa forma salvar la Noche de Brujas.', '2020-12-24', 'https://www.youtube.com/watch?v=kY3SuNvqQPw', 'https://www.netflix.com/title/80245104', 'AdamPOR.png', 'Adam.png'),
(19, '500 Days Of Summer', 'Romance', 'Ésta es una historia de chico encuentra chica, así da comienzo el relato del irónico y meticuloso narrador de 500 días juntos. Un desenfrenado e impredecible año y medio del atascado lío amoroso, que no hay por donde cogerlo, de un joven.\r\nTom, el chico, aún sigue creyendo, incluso en este cínico mundo moderno, en la noción de un amor transformador, predestinado por el cosmos y que golpea como un rayo sólo una vez. Summer, la chica, no cree lo mismo. Para nada. Pero eso no impedirá que Tom deje de perseguirla, una y otra vez, como un moderno Don Quijote, con todo su poder y valor. De pronto, Tom se enamora no sólo de la adorable, lista e inteligente mujer, no es que a él le importe nada de eso, sino de la idea misma de Summer, la idea misma de un amor que sigue teniendo el poder de sacudir el corazón y detener el mundo.', '2021-01-05', 'https://www.youtube.com/watch?v=e0xD41ZAHZc   ', 'https://www.imdb.com/title/tt1022603/', '500DOS.jpeg', '500dos1.jpeg'),
(20, 'Deadpool 2', 'Acción', 'En Deadpool 2 nuestro protagonista Deadpool (Ryan Reynolds) debe proteger a un joven mutante (Julian Dennison), perseguido por Cable (Josh Brolin), un soldado mutante con un brazo mecánico y que puede viajar en el tiempo. Para vencer a Cable, Deadpool reúne a un grupo de mutantes con superpoderes llamado X-Force, entre los que figura Domino (Zazie Beetz) y Bedlam (Terry Crews), entre otros.', '2021-01-05', 'https://www.youtube.com/watch?v=XF2cUhfxhs4', 'https://www.youtube.com/watch?v=zfEjMyCILjk', 'D2.jpeg', 'DD2.jpeg'),
(21, 'Rebecca', 'Drama', 'Durante un viaje a Montecarlo, una joven señorita (Lily James) contrae matrimonio de manera repentina con un aristócrata llamado Max de Winter (Armie Hammer). Juntos se trasladan a vivir a la mansión Manderley, situada en Cornualles. Sin embargo, entre sus paredes sigue vivo el fantasma de Rebeca, la anterior mujer del millonario, quien falleció en extrañas circunstancias.', '2021-01-05', 'https://www.youtube.com/watch?v=0tKxW5yP28A                            ', 'https://pelispop.com/rebeca-online-latino/', 'R1.jpeg', 'R2.jpeg'),
(22, 'Bob Esponja Al Rescate', 'Animacion', 'El protagonista se une a su fiel amigo, Patricio Estrella, en la búsqueda de su mascota Gary caracol, quien fuese secuestrado. Ambos se embarcan a una aventura heroica hacia La Ciudad Perdida de Atlantic City para traer de vuelta a su mascota. En el camino comprobarán que no hay nada mejor que el poder de la amistad', '2021-01-05', 'https://youtu.be/kRafwfArcKU', 'https://pelispop.com/bob-esponja-al-rescate-online-latino/', 'Bob.jpeg', 'bob1.jpeg'),
(23, 'Spider-Man', 'Ficcion ', 'Luego de ser mordido por una araña radioactiva, el joven Miles Morales desarrolla misteriosos poderes que lo transforman en el Hombre Araña. Ahora deberá usar sus nuevas habilidades ante el malvado Kingpin, un enorme demente que puede abrir portales hacia otros universos.', '2021-01-05', 'https://youtu.be/-RSseKOWpEQ', 'https://youtu.be/BtKKpX0BdvU', 'Spider.jpeg', 'spider1.jpeg'),
(24, 'After', 'Romantica', 'La joven Tessa Young (Josephine Langford) cursa su primer año en la universidad. Habituada a una vida estable y ordenada, su planeta cambia cuando conoce a Hardin Scott (Hero Fiennes Tiffin), un enigmático joven de obscuro pasado. Desde el primer instante se detestan, por el hecho de que pertenecen a 2 mundos diferentes y son totalmente opuestos.', '2021-01-05', 'https://www.youtube.com/watch?v=3zjxECCWwrU', 'https://mega.nz/folder/S6xAQITB#frLhvj_EzlPhLzNcEE-YtA', 'After.jpg', 'after1.jpg');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comentarios`
--
ALTER TABLE `comentarios`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `peliculas`
--
ALTER TABLE `peliculas`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comentarios`
--
ALTER TABLE `comentarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=70;

--
-- AUTO_INCREMENT de la tabla `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT de la tabla `peliculas`
--
ALTER TABLE `peliculas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

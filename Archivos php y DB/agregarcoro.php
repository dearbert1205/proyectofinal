<?php
$titulo = $_REQUEST["titulo"];
$autor = $_REQUEST["autor"];
$letra = $_REQUEST["letra"];

$con = mysqli_connect("localhost","id11653408_himnariodb","12345678","id11653408_android") or die ("Sin Conexion");$sql = "INSERT INTO alabanza (titulo, autor, letra ) VALUES ('$titulo', '$autor', '$letra')";
$sql = "INSERT INTO coro (titulo, autor, letra ) VALUES ('$titulo', '$autor', '$letra')";

$resul = mysqli_query($con, $sql);

echo $resul;
mysqli_close($con);
?>
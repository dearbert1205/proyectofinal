<?php
$con = mysqli_connect("localhost","id11653408_himnariodb","12345678","id11653408_android") or die ("Sin Conexion");$sql = "INSERT INTO alabanza (titulo, autor, letra ) VALUES ('$titulo', '$autor', '$letra')";
$datos = Array();
$resul = mysqli_query($con,$sql);

while($row = mysqli_fetch_object($resul)){
    $datos[] = $row;
}

echo json_encode($datos);
mysqli_close($con);
?>
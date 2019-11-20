<?php
$id = $_REQUEST["id_c"];
$con = mysqli_connect("localhost","id11653408_himnariodb","12345678","id11653408_android") or die ("Sin Conexion");$sql = "INSERT INTO alabanza (titulo, autor, letra ) VALUES ('$titulo', '$autor', '$letra')";
$sql = "delete from coro where id_c=$id";
if(mysqli_query($con,$sql)){
    echo "Alabanza eliminada exitosamente";
}else{
    echo "Error: " . mysqli_error($con);
}
mysqli_close($con);
?>
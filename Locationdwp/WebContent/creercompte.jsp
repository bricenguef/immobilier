<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> create account </title>
</head>
<body bgcolor="orange">
<center><h2><blink> CREATION DE COMPTE </blink></h2></center><br><br>

<table>
<tr><td> REMPLISSEZ LES INFORMATIONS SUIVANTES : </td></tr>
</table><br><br>
<form method="POST" action="Action">
LOGIN:        <input type="text" name=log size=20><br><br>
MOT DE PASSE: <input type="password" name=pass size=20><br><br>
<div align="center">
<input type="submit" name="OK" value="OK" size="20">
<input type="button"  name="annuler" value="annuler" size="20" >
</div>    
</form>
<a href="index.jsp">ACCUEIL</a>
</body>
</html>
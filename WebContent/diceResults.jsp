<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Dice Results</title>
</head>
<body>
	<h1>You rolled ${userDice.getPreviousRoll()} </h1>
	<a href="rollDice.jsp">Roll Again</a>
	<a href="index.html">Go Back Home</a>
</body>
</html>
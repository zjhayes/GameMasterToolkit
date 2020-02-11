<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Encounter Calculator</title>
</head>
<body>
	<h1>Encounter Calculator</h1>
	<form action="calculateEncounterDifficulty" method="post">
		<p>Enter the number of players and their level to calculate the encounter difficulty.</p>
		<label for="numberOfPlayersTextbox">Number of party members:</label>
		<input id="numberOfPlayersTextbox" type="text" name="numberOfPlayers" size="10">
		<br/>
		<label for="playerLevelTextbox">Party's level:</label>
		<input id="playerLevelTextbox" type="text" name="playerLevel" size="10">
		<br/>
		<input type="submit" value="Calculate">
	</form>
</body>
</html>
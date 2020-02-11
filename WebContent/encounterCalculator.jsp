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
		<label for="playerLevelTextbox">Party's level (up to 20):</label>
		<input id="playerLevelTextbox" type="text" name="playerLevel" size="10">
		<br/>
		<label for="difficultyDropDown">Monster difficulty:</label>
		<select id="difficultyDropDown" name="difficulty">
			<option value="1">Easy</option>
			<option value="2">Medium</option>
			<option value="3">Hard</option>
			<option value="4">Deadly</option>
		</select>
		<br/>
		<input type="submit" value="Calculate">
	</form>
</body>
</html>
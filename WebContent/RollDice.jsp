<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Roll Dice</title>
<style>
	body {
	  background-color: linen;
	  font-family: sans-serif;
	}
	
	h1 {
	  color: maroon;
	  margin-left: 100px;
	}
	
	form {
		padding: 25px 50px 75px 100px;
		margin-left: 10%;
		margin-right: 30%;
		border-style: inset;
		border-collapse: separate;
  		border-spacing: 15px;
	}
	
	.button {
		background-color: maroon;
		border: none;
		color: white;
		padding: 15px 32px;
		text-align: center;
		text-decoration: none;
		display: inline-block;
		font-size: 20px;
	}
	
</style>
</head>
<body>
	<h1>Roll Dice</h1>
	<form action="getDiceRoll" method="post">
		<label for="diceType">What kind of dice are you rolling?</label>
		<select name="diceType">
			<option value="4">D4</option>
			<option value="6">D6</option>
			<option value="8">D8</option>
			<option value="10">D10</option>
			<option value="12">D12</option>
			<option value="20">D20</option>
		</select>
		<br/>
		<label for="numberOfDiceTextbox">How many dice are you rolling?</label>
		<input id="numberOfDiceTextbox" type="text" name="numberOfDice" size="10">
		<br/>
		<input class="button" type="submit" value="Roll!" size="10"/>
	</form>
</body>
</html>
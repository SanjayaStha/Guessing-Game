<%-- 
    Document   : index
    Created on : Oct 8, 2017, 2:11:41 PM
    Author     : sanja
--%>

<%@page import="model.GameNumber"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    GameNumber maximum = new GameNumber(1000);
    GameNumber minimum = new GameNumber(0);
    GameNumber guess = new GameNumber();
    GameNumber target = new GameNumber(50);
   // target.setRandom(maximum.getGamenumber(), minimum.getGamenumber());
    
    

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Guessing Game</title>
    </head>
    <body>
        <h4>Welcome guys...Lets play guessing game!!!</h4>
        <form name="guessform" action="GameServlet" method="get">
            <label> Guess <%guess.getGamenumber();%>
            </label>
            <input type="number" name="guess" value="<% minimum.getGamenumber();%>" />
                   <br />
            <input type="submit" name="guessButton" value="Guess" />
            
            <input type="hidden" name="minimum" value="<%minimum.getGamenumber();%>" />
            <input type="hidden" name="maximum" value="<%maximum.getGamenumber();%>" />
            <input type="hidden" name="guesses" value="<%guess.getGamenumber();%>" />
            <input type="hidden" name="target" value="<%target.getGamenumber();%>" />

        </form>
    </body>
</html>

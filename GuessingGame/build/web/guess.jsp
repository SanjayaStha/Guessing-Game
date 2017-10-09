<%-- 
    Document   : guess
    Created on : Oct 9, 2017, 8:05:03 AM
    Author     : sanja
--%>

<%@page import="model.GameNumber"%>
<%
    GameNumber maximum = new GameNumber(1000);
    GameNumber minimum = new GameNumber(0);
    GameNumber guess = new GameNumber();
    GameNumber target = new GameNumber();
    target.setRandom(maximum.getGamenumber(), minimum.getGamenumber());
    

String mg = (String) request.getAttribute("msg");
 String n = (String) request.getAttribute("n"); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result page</title>
    </head>
    <body>
        
        <% out.println(" " + mg);
        if(n.equals(0)){ %>
        
        <a href="index.jsp"> <input type="button" name="playAgain" /></a>
       <% }
        if(n.equals(1)){ %>
         <form name="guessform" action="gameserclet" method="get">
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
           
       <% }
        %>
    </body>
</html>

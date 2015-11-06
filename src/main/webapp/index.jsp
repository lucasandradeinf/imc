<!DOCTYPE html>

<html>
 
 <head>
		<meta charset="utf-8">		
		<title>Calcular IMC</title>
 </head>
 
 <body>
       <!-- Aqui é HTML. -->
       <h1>Calcule o seu IMC:</h1>
       <!-- Começo do Scriptlet. -->
       <%
       		//Aqui é Java.
       		out.print("Verifique se você esta no peso !");
       %>
       <!-- Fim do Scriptlet. -->
      <hr>
      		<%out.print(new java.util.Date());%>
      <hr>
  
  	<form>
    		Peso: <input type="numeric" name="Peso">
    		<br>
    		Altura: <input type="numeric" name="Altura">
    		<br>
    		<input type="submit">
  	</form>
  
  IMC: 
  
  <%
  
  double peso = request.getParameter("Peso") == null ? 0.0 : Float.parseFloat(request.getParameter("Peso"));
  double altura = request.getParameter("Altura") == null ? 0.0 : Float.parseFloat(request.getParameter("Altura"));
  
  Double imc;
  imc = peso/(altura*altura);
  
  System.out.println((peso / (altura*altura)));
  
   if(imc.isNaN() == false)
   		out.print(java.lang.Math.round(imc));

  %>
  
 </body>
</html>
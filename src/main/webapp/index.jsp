<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "TIENDA MENDEZ" %>
</h1>
<br/>

<form action="/HelloServlet" method="POST">
    <table>
        <tr>
            <td>Dijite el nombre del cliente</td>
            <td><input type="text" name="firstName" /></td>
        </tr>
        <tr>
            <td>Dijite la edad del cliente</td>
            <td><input type="text" name="age" /></td>
        </tr>
        <tr>
            <td>Nombre del producto</td>
            <td><input type="text" name="product" /></td>
        </tr>
        <tr>
            <td>Dijite la cantidad</td>
            <td><input type="number" name="amount" /></td>
        </tr>
        <tr>
            <td>Dijite el precio</td>
            <td><input type="number" name="price" /></td>
        </tr>
    </table>
    <button type="submit">Enviar</button>
</form>
<form action="/HelloServlet" method="get">
    <button type="submit">Listar</button>
</form>

</body>
</html>
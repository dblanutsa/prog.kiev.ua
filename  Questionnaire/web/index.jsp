<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Анкета</title>
    <link rel="stylesheet" href="css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
  </head>
  <body>
  <div class="container main">
    <form class="form-group" action="/send" method="POST">
        <div class="row">
            <label class="col-xs-4 label">Имя: </label>
            <input name="firstname" type="text" class="col-xs-8 input"/><br/>
        </div>
        <div class="row">
            <label class="col-xs-4 label">Фамилия: </label>
            <input name="lastname" type="text" class="col-xs-8 input"/><br/>
        </div>
        <div class="row">
            <label class="col-xs-4 label">Возвраст: </label>
            <input name="age" type="number" class="col-xs-8 input"/><br/>
        </div>
        <label class="col-xs-4 label">Первый язык программирования:</label>
            <ul class="ul">
                <li><input name="len" value="C/C++" type="radio">C/C++</input></li>
                <li><input name="len" value="Pascal" type="radio">Pascal</input></li>
                <li><input name="len" value="Java" type="radio">Java</input></li>
                <li><input name="len" value="Python" type="radio">Python</input></li>
                <li><input name="len" value="C#" type="radio">C#</input></li>
                <li><input name="len" value="JavaScript" type="radio">JavaScript</input></li>
                <li><input name="len" value="PHP" type="radio">PHP</input></li>
                <li><input name="len" value="different" type="radio" checked>Другой</input></li>
            </ul>
        <button type="submit" class="btn btn-primary btn-md button">Submit</button>
    </form>
  </div>
  <script src="js/bootstrap.min.js"></script>
  </body>
</html>

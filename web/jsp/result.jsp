<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html lang="ru">
<head>
    <meta charset="UTF-8">
    <link rel="shortcut icon" href="img/redgry.png">
    <title>RedGry and LeartAule Project</title>

    <link rel="stylesheet index" href="css/main.css">
    <link rel="stylesheet index" href="css/index.css">
    <link rel="stylesheet table" href="css/table.css">
    <link rel="stylesheet header" href="css/header_style.css">
    <link rel="stylesheet header" href="css/footer_style.css">
</head>

<body>
<header>
    <div class="header">
        <div>
            <span class="lab-name">Лабораторная работа №2</span>
        </div>
        <div>
            <span>
                <a href="https://vk.com/egor_redgry/">Кривоносов Егор</a>
                , P3211
            </span>
            <span>
                <a href="https://vk.com/l51444660">Кондрашов Кирилл</a>
                , P3211
            </span>
            <span>
                Вариант
                <a href="#">4566</a>
            </span>
        </div>
    </div>
</header>

<section class="main">
    <div class="special-button">
        <div class="text-center">
            <a href="../index.jsp">
                <button id="submit-button" type="submit">Страница с формой</button>
            </a>
        </div>
    </div>

    <div class="container-table">
        <div class="table">
            <div class="text-center">
                <div class="output" id="output">

                    <jsp:include page="jsp/table.jsp"/>

                </div>
            </div>
        </div>
    </div>
</section>

<footer>
    <div class="footer">
        <div class="logos">
            <a class="git-link" target="_blank" href="https://github.com/RedGry">
                <img class="logo" alt="Логотип"  src="img/redgry.png">
            </a>
            <span> & </span>
            <a class="git-link" target="_blank" href="https://github.com/LeartAule">
                <img class="logo" alt="Логотип"  src="img/leartaule.png">
            </a>
        </div>
    </div>
</footer>

<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
</body>
</html>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<ul id="menu">
    <li>
        <a href="/"><img src="images/Aurora_logo.png" style="width: 180px;"></a>
    </li>
    <c:if test="${userName == null || userName == ''}">
        <li id="login">
            <a href="login">Авторизация</a>
        </li>
    </c:if>
    <c:if test="${userName != null && userName!= ''}">
        <li id="userName">${userName}</li>
        <li id="logout">
            <a href="logout">Выход</a>
        </li>
    </c:if>
    <li id="registration">
        <a href="registration.jsp">Регистрация</a>
    </li>
</ul>


<div id="cart-container">
    <img src="images/spa-constellation@3x.png" style="width:40px; height: 40px;">
    <button id="openCloseCart" onclick="openClose()">Корзина</button>
    <span id="itemCount"></span>
</div>

<div id="search-container">
    <button id="openCloseSearch" onclick="openCloseSearch()">Поиск...</button>
</div>

<script type="text/javascript" src="js/users.js"></script>
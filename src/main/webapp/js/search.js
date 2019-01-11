//$(document).ready ( function(){
// $("#block").css("background-color", "yellow");
//});

$(document).ready ( function(){
    $("#header").load("header.jsp");
    $("#footer").load("footer.jsp");
});

function openCloseSearch() {
    $('#searchWindow').toggle();
}

// Показать и скрыть окно поиска
$('.openCloseSearch').click(function () {
    $('#searchWindow').toggle();
});
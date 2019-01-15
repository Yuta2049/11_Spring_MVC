//$(document).ready ( function(){
// $("#block").css("background-color", "yellow");
//});

$(document).ready ( function(){
    $("#header").load("header.html");
    $("#footer").load("footer.html");
});

function openCloseSearch() {
    $('#searchWindow').toggle();
}

// Показать и скрыть окно поиска
$('.openCloseSearch').click(function () {
    $('#searchWindow').toggle();
});


$('.openCloseAddProduct').click(function () {
    $('#AddProductWindow').toggle();
    })
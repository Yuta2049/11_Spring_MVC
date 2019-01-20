
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

    function findProducts() {

    var token = $('#_csrf').attr('content');
    var header = $('#_csrf_header').attr('content');

        $.ajax({
            url : "/products/search",
            type : "post",
            data : {
                "productName" : $("#findText").val()
            },
            beforeSend: function (xhr) {
                xhr.setRequestHeader(header, token);
            },
            success : function(data) {
                /*console.log(data);
                $("#searchItems").load(url);*/
                $('#searchItems').html(data);
            },
            error : function() {
                console.log("There was an error");
            }
        });
    }




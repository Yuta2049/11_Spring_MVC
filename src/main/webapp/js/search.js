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


    function findProducts() {
        /*$.ajax({
            url : '/products/'+productId+'/edit',
            success : function(data) {
                $('#result').html(data);
            }
        });*/

        $.ajax({
            url : "/products/search",
            type : "post",
            data : {
                "productName" : $("#findText").val()
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

//        //var byName =
//        var name = document.getElementById("findText").value;
//
//        var url = '/products/search'+productId+'/edit';
//        $("#ProductWindow").load(url);

    }


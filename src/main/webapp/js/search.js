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
////        $.ajax({
////            url : "/products/search",
////            type : "post",
////            data : {
////                "productName" : $("#findText").val()
////            },
////            success : function(data) {
////                /*console.log(data);
////                $("#searchItems").load(url);*/
////                $('#searchItems').html(data);
////            },
////            error : function() {
////                console.log("There was an error");
////            }
////        });
//
//    var token = $('#_csrf').attr('content');
//    var header = $('#_csrf_header').attr('content');
//
////$.ajax({
////    type: "POST",
////    url: url,
////    beforeSend: function (xhr) {
////        xhr.setRequestHeader(header, token);
////    },
////    success: function (data, textStatus, jqXHR) {
////        alert(status);
////        alert('bu');
////    },
////    error: function (request, status, error) {
////        alert(status);
////        alert('ne bu');
////    }
////});
//
//        $.ajax({
//            type : "POST",
//            url : "/products/search",
//            data : {
//                "productName" : $("#findText").val()/*;
//                "csrfParameter" : token*/
//            },
///*            beforeSend: function (xhr) {
//                xhr.setRequestHeader(header, token);
//            },
//            success : function(data, jqXHR) {*/
//            success : function(data, textStatus, jqXHR) {
//                alert('bu');
//                /*console.log(data);
//                $("#searchItems").load(url);*/
//                $('#searchItems').html(data);
//            },
//            error : function(request, status, error) {
//                //console.log("There was an error");
//                alert('ne bu');
//                console.log(status);
//            }
//        });
//
}


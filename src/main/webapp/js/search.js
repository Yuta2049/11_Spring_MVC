
// Показать и скрыть окно поиска
$('.openCloseSearch').on('click', function() {
    alert('search');
    $('#searchWindow').toggle();
})

$('.openCloseAddProduct').click(function () {
    $('#AddProductWindow').toggle();
    })

$('#findProducts').on('click', function() {

    if ($("#findText").val() != '') {

        var token = $('#_csrf').attr('content');
        var header = $('#_csrf_header').attr('content');

            $.ajax({
                url : "/products/search",
                type : "get",
                data : {
                    "productName" : $("#findText").val()
                },
                beforeSend: function (xhr) {
                    xhr.setRequestHeader(header, token);
                },
                success : function(data) {
                    /*console.log(data);
                    $("#searchItems").load(url);*/
                    //$('#searchItems').html(data);
                    findProducts(data);
                },
                error : function() {
                    alert("There was an error");
                }
            });
        }
    })


    function findProducts(filteredProducts) {

        var searchItemsDiv = document.getElementById('searchItems');

        $("#searchItems").empty();

        var textCat = '<ul class="products">';

        searchItemsDiv.insertAdjacentHTML('beforeEnd', textCat);

        var findText = $('#findText').val();

            for(var i = 0; i < filteredProducts.length; i++) {

                var text = '<li class="product">';

                text += '<div class="image">';
                text += '<img src="images/' + filteredProducts[i].image + '">';
                text += '</div>';
                text += '<div class="productName">';
                text += filteredProducts[i].name;
                text += '</div>';

                text += '</li>';

                searchItemsDiv.insertAdjacentHTML('beforeEnd', text);
            }

            textCat = '</ul>';

            searchItemsDiv.insertAdjacentHTML('beforeEnd', textCat);
    }





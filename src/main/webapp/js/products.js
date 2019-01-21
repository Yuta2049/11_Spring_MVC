$('.buttonProductEdit').on('click', function() {

    $('#newProductSave').hide();
    $('#editProductSave').show();

    var productId = this.dataset.productId;

        $.ajax({
            url : '/products/'+productId+'/edit',
            success : function(data) {
                /*$('#result').html(data);*/
                /*$("#ProductWindow").load("/fragments/createOrUpdateProductForm");*/
                $("#editProductId").val(data.id);
                $("#editProductName").val(data.name);
                $("#editProductCategory").val(data.category);
                $("#editProductPrice").val(data.price);
                $("#editProductImage").val(data.image);
            }
        });

    })

$('#editProductSave').on('click', function() {

    var token = $('#_csrf').attr('content');
    var header = $('#_csrf_header').attr('content');

    var productId = $("#editProductId").val();
    var productName = $("#editProductName").val();
    var productCategory = $("#editProductCategory").val();
    var productPrice = $("#editProductPrice").val();
    var productImage = $("#editProductImage").val();

    var product = {id : productId,
                  name : productName,
                  category : productCategory,
                  price : productPrice,
                  image : productImage};

    url = '/products/'+productId+'/edit';

        $.ajax({
            contentType: 'application/json',
            url : url,
            type : 'put',
            dataType: 'json',
            data : JSON.stringify(product),
            beforeSend: function (xhr) {
                xhr.setRequestHeader(header, token);
            },
            success : function(data) {
                /*console.log(data);
                $("#searchItems").load(url);*/
                location.reload();
            },
            error : function() {
                console.log("There was an error");
            }
        });
    })


$('#buttonProductNew').on('click', function() {
    $('#newProductSave').show();
    $('#editProductSave').hide();
    })

$('#newProductSave').on('click', function() {

    var token = $('#_csrf').attr('content');
    var header = $('#_csrf_header').attr('content');

    var productId = $("#editProductId").val();
    var productName = $("#editProductName").val();
    var productCategory = $("#editProductCategory").val();
    var productPrice = $("#editProductPrice").val();
    var productImage = $("#editProductImage").val();

    var product = {id : productId,
                  name : productName,
                  category : productCategory,
                  price : productPrice,
                  image : productImage};

    url = '/products/new';

        $.ajax({
            contentType: 'application/json',
            url : url,
            type : 'post',
            dataType: 'json',
            data : JSON.stringify(product),
            beforeSend: function (xhr) {
                xhr.setRequestHeader(header, token);
            },
            success : function(data) {
                location.reload();
            },
            error : function() {
                alert('create product not successful');
            }
        });
    })


$('.buttonProductDelete').on('click', function() {

    var token = $('#_csrf').attr('content');
    var header = $('#_csrf_header').attr('content');

    var productId = this.dataset.productId;

    url = '/products/'+productId+'/delete';

        $.ajax({
            contentType: 'application/json',
            url : url,
            type : "delete",
            dataType: 'json',
            beforeSend: function (xhr) {
                xhr.setRequestHeader(header, token);
            },
            success : function(data) {
                location.reload();
            },
            error : function() {
                alert('delete not successful');
            }
        });
})

function showHiddenTab(productSectionName, tabName, tabName2) {

    var i, x;

    var elem = document.getElementById(tabName);

    $('#' + tabName).hide();
    //$('#'+tabName2).show();

    var elem3 = document.getElementById(tabName2);
    elem3.style.display = "flex";

    var productSection = document.getElementById(productSectionName);
    productSection.style.width = '100%';

    // Закрываем другие скрытые секции

    x = document.getElementsByClassName("visibleSection");
    for (i = 0; i < x.length; i++) {
        if (x[i] != elem) {
            x[i].removeAttribute('style');
        }
    }

    var elem2 = document.getElementById(tabName2);
    x = document.getElementsByClassName("hiddenSection");
    for (i = 0; i < x.length; i++) {
        if (x[i] != elem2) {
            x[i].removeAttribute('style');
        }
    }

    x2 = document.getElementsByClassName("product");
    for (i = 0; i < x2.length; i++) {
        if (x2[i] != productSection) {
            //x2[i].style.flexBasis = '';
            x2[i].removeAttribute('style');
        }
    }
}

function hideHiddenTab(productSectionName, tabName, tabName2) {

    $('#' + tabName).show();
    //$('#'+tabName2).hide();

    elem3 = document.getElementById(tabName2);
    elem3.removeAttribute('style');

    var productSection = document.getElementById(productSectionName);
    productSection.removeAttribute('style');

}




function generateProducts() {

    // Планетарные станции и корабли поколений
    var products = [];

    products[0] = {
        name: "Elysium (Pandorum)",
        image: "elysium_pandorum.jpg",
        category: 1,
        price: 300000000
    }

    products[1] = {
        name: "Death star (Star wars)",
        image: "death_star.jpg",
        category: 1,
        price: 200000000
    }

    products[2] = {
        name: "Ещё большой корабль 3",
        image: "elysium_pandorum.jpg",
        category: 1,
        price: 300
    }

    products[3] = {
        name: "Apple iPhone 4S",
        image: "elysium_pandorum.jpg",
        category: 1,
        price: 400
    }

    products[4] = {
        name: "Avalon (Passengers)",
        image: "avalon_passengers.jpg",
        category: 1,
        price: 6000000000
    }

    products[5] = {
        name: "Axiom (WALL-E)",
        image: "axiom_wall_e.jpg",
        category: 1,
        price: 600
    }

    products[6] = {
        name: "Tet (Oblivion)",
        image: "tet_oblivion.jpg",
        category: 1,
        price: 5500000000
    }

    products[7] = {
        name: "Apple iPhone 8S",
        image: "death_star.jpg",
        category: 1,
        price: 800
    }

    products[8] = {
        name: "Apple iPhone 9S",
        image: "elysium_pandorum.jpg",
        category: 1,
        price: 900
    }

    products[9] = {
        name: "Apple iPhone 10S",
        image: "elysium_pandorum.jpg",
        category: 1,
        price: 1000
    }

    products[10] = {
        name: "Apple iPhone 11S",
        image: "elysium_pandorum.jpg",
        category: 1,
        price: 1100
    }

    products[11] = {
        name: "Apple iPhone 12S",
        image: "elysium_pandorum.jpg",
        category: 1,
        price: 1200
    }

    products[12] = {
        name: "Apple iPhone 13S",
        image: "death_star.jpg",
        category: 1,
        price: 1300
    }

    products[13] = {
        name: "Apple iPhone 14S",
        image: "elysium_pandorum.jpg",
        category: 1,
        price: 1400
    }

    products[13] = {
        name: "Apple iPhone 14S",
        image: "elysium_pandorum.jpg",
        category: 1,
        price: 1400
    }

    products[14] = {
        name: "Alien ship (Prometheus)",
        image: "alien_prometheus.jpg",
        category: 2,
        price: 3000000000
    }

    products[15] = {
        name: "Rocinante (Expanse)",
        image: "rocinante_expanse.jpg",
        category: 2,
        price: 1400
    }

    products[16] = {
        name: "Apple iPhone 14S",
        image: "alien_prometheus.jpg",
        category: 2,
        price: 1400
    }

    products[17] = {
        name: "Apple iPhone 14S",
        image: "alien_prometheus.jpg",
        category: 2,
        price: 1400
    }

    products[18] = {
        name: "Apple iPhone 14S",
        image: "rocinante_expanse.jpg",
        category: 2,
        price: 1400
    }

    products[19] = {
        name: "Apple iPhone 14S",
        image: "alien_prometheus.jpg",
        category: 2,
        price: 1400
    }

    products[20] = {
        name: "Apple iPhone 14S",
        image: "rocinante_expanse.jpg",
        category: 2,
        price: 1400
    }

    products[21] = {
        name: "Apple iPhone 14S",
        image: "alien_prometheus.jpg",
        category: 2,
        price: 1400
    }

    products[22] = {
        name: "Apple iPhone 14S",
        image: "rocinante_expanse.jpg",
        category: 2,
        price: 1400
    }

    products[23] = {
        name: "Восток-1 (Юрий Гагарин)",
        image: "vostok_1_gagarin.jpg",
        category: 3,
        price: 1400
    }

    products[24] = {
        name: "Пепелац (Кин-Дза-Дза)",
        image: "pepelaz_kin_dza_dza.jpg",
        category: 3,
        price: 1400000
    }

    products[25] = {
        name: "BubbleShip (Oblivion)",
        image: "bubbleship_oblivion.jpg",
        category: 3,
        price: 2400000
    }

    products[26] = {
        name: "Другой малый космический корабль",
        image: "pepelaz_kin_dza_dza.jpg",
        category: 3,
        price: 1400
    }

    products[27] = {
        name: "Другой малый космический корабль",
        image: "pepelaz_kin_dza_dza.jpg",
        category: 3,
        price: 1400
    }

    products[28] = {
        name: "Другой малый космический корабль",
        image: "pepelaz_kin_dza_dza.jpg",
        category: 3,
        price: 1400
    }

    products[29] = {
        name: "Другой малый космический корабль",
        image: "pepelaz_kin_dza_dza.jpg",
        category: 3,
        price: 1400
    }

    products[30] = {
        name: "Другой малый космический корабль",
        image: "pepelaz_kin_dza_dza.jpg",
        category: 3,
        price: 1400
    }

    products[31] = {
        name: "Другой малый космический корабль",
        image: "pepelaz_kin_dza_dza.jpg",
        category: 3,
        price: 1400
    }

    products[32] = {
        name: "Другой малый космический корабль",
        image: "pepelaz_kin_dza_dza.jpg",
        category: 3,
        price: 1400
    }

    products[33] = {
        name: "Другой малый космический корабль",
        image: "pepelaz_kin_dza_dza.jpg",
        category: 3,
        price: 1400
    }

    products[34] = {
        name: "Другой малый космический корабль",
        image: "pepelaz_kin_dza_dza.jpg",
        category: 3,
        price: 1400
    }

    return products;
}


function findProducts() {

    var searchItemsDiv = document.getElementById('searchItems');
    //var searchItemsDiv = $('#searchItems');
    $("#searchItems").empty();

    var textCat = '<ul class="products">';

    searchItemsDiv.insertAdjacentHTML('beforeEnd', textCat);

    var findText = $('#findText').val();

    //console.log(findText);
    //var regex = findText;
    if (findText != ' ' && findText != '') {

        var filteredProducts = $.grep(products, function (n, i) {
            return (n.name.includes(findText) || n.price.toString().includes(findText));
        });

        for (var i in filteredProducts) {

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
}


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

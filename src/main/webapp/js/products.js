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



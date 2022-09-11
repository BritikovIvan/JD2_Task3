function showAndHideMoreInfo() {
    var element = document.getElementById('moreInfo');
    var button = document.getElementById('showMore');

    if (element.style.display === "none") {
        element.style.display = "block";
        button.textContent = "Скрыть";
    } else {
        element.style.display = "none";
        button.textContent = "Подробнее";
    }
    
}
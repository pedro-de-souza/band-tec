var vidaK = vida_kakashi.offsetWidth;
var vidaO = vida_obito.offsetWidth;
function Obito() {
    if (vidaK > 0 && vidaO >0) {
        vidaO -= 25;
        vida_obito.style.width = vidaO + 'px';

        if (vidaO <= 0) {
            obi.src = "../..img/obito-fatality.png";
            barra_obito.style.backgroundColor = "white";
            barra_kakashi.style.backgroundColor = "white";
        }
    }

}
function Kakashi() {

    if (vidaO > 0 && vidaK >0) {   
        
        vidaK -= 25;
        var esquerda = 300 - vidaK;
        
        vida_kakashi.style.marginLeft = esquerda + "px";
        vida_kakashi.style.width = vidaK + 'px';

        if (vidaK <=0) {
            kashi.src = "../..img/kakashi-fatality.png";
            barra_kakashi.style.backgroundColor = "white";
            barra_obito.style.backgroundColor = "white";
        }
    }

}
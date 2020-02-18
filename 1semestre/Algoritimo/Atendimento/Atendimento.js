var num_media = 0;
var num_avaliacao = 0;
function Votacao(){
    avaliacao.innerHTML = ++num_avaliacao;
    
    num_avaliacao = Number(avaliacao.innerHTML);   
    num_media += Number(estrelas.value);

    var media_nota = num_media/num_avaliacao;

    media.innerHTML = media_nota.toFixed(2);
}
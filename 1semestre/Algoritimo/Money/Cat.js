function oDinheiro(){
    mensagem.style.display = 'block';
    var valor = parseFloat(valor_meses.value);
    var t_anos = valor*36;
    var q_anos = valor*180;
    tres_anos.innerHTML = t_anos.toLocaleString();
    quinze_anos.innerHTML = q_anos.toLocaleString();
}
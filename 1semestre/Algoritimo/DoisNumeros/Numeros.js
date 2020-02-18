
function aSoma() {
    var num1 = Number(num_pri.value);
    var num2 = Number(num_seg.value);
    mensagem.innerHTML = `A soma entre ${num1} e ${num2} é ${num1 + num2}`;
}
function aDiferenca() {
    var num1 = Number(num_pri.value);
    var num2 = Number(num_seg.value);
    mensagem.innerHTML =`A diferença entre ${num1} e ${num2} é ${num1 - num2}`;
}
function oProduto() {
    var num1 = Number(num_pri.value);
    var num2 = Number(num_seg.value);
    mensagem.innerHTML =`O produto entre ${num1} e ${num2} é ${num1 * num2}`;
}
function aRazao() {
    var num1 = Number(num_pri.value);
    var num2 = Number(num_seg.value);
    mensagem.innerHTML = `A razão entre ${num1} e ${num2} é ${num1/ num2}`;
}
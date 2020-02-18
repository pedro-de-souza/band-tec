<<<<<<< HEAD
function INSS() {
    var salario = slr_bruto.value;
    var inss = salario * 0.10;
    var ir = salario * 0.20;   
    var imposto = salario / 30;

    var liquido = salario - inss - ir - imposto;

    alert(`Apesar de seu bruto ser R$${salario}, após os descontos, você receberá somente R$${liquido.toFixed(2)}`);
=======
function INSS() {
    var salario = slr_bruto.value;
    var inss = salario * 0.10;
    var ir = salario * 0.20;   
    var imposto = salario / 30;

    var liquido = salario - inss - ir - imposto;

    alert(`Apesar de seu bruto ser R$${salario}, após os descontos, você receberá somente R$${liquido.toFixed(2)}`);
>>>>>>> dea7eda666d0f2cabcf59c2ddf21c4e7211bd738
}
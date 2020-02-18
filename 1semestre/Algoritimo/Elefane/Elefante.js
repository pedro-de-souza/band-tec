function Atazanar() {

    mensagem_elefantes.innerHTML ='';

    var elefantes = Number(qtd_elefan.value);
    var mens = ' incomodam, icomodam';
    var incomoda = 1;

    while(incomoda < elefantes) {
        
        mensagem_elefantes.innerHTML += `<br><span>${incomoda} ${incomoda > 1 ? 'elefantes' : 'elefante'} ${incomoda > 1 ? 'incomodam' : 'incomoda'} muita gente!</span><br>`; 
        // Operador Ternário 
        mensagem_elefantes.innerHTML += `<span>${++incomoda} elefantes ${mens}, muito mais!</span><br><br>`;
        mens+= ', incomodam';
    }
}
function AtazanarFor() {

    mensagem_elefantes.innerHTML ='';

    /*for((incomoda = 1, mens = ' incomodam, icomodam'); incomoda < qtd_elefan.value; (mens+= ', incomodam')) {
        
        mensagem_elefantes.innerHTML += `
            <br><span>${incomoda} ${incomoda > 1 ? 'elefantes' : 'elefante'} 
            ${incomoda > 1 ? 'incomodam' : 'incomoda'} muita gente!</span><br>`; 
        mensagem_elefantes.innerHTML += `<span>${++incomoda} elefantes ${mens}, muito mais!</span><br><br>`;
    }*/
    
    for((incomoda = 1, mens = ' incomodam, icomodam'); incomoda < qtd_elefan.value; mens+= ', incomodam') {
        
        mensagem_elefantes.innerHTML += `<br><span>1 elefante incomoda, muito mais!</span><br>`;
        mensagem_elefantes.innerHTML += `<span>${++incomoda} elefantes ${mens}, muito mais!</span><br><br>`;
    }
}
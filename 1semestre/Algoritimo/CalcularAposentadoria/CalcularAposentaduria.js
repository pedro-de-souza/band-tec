function culIdade() {
    var tempo_homem = 60 - idade.value;
    var tempo_mulher = 50 - idade.value;
    if(sexo.value = 'M'){
        alert(`Se for homen faltam ${tempo_homem} anos p/ aposentar`);
    }
    if(sexo.value = 'F'){
        alert(`Se for homen faltam ${tempo_mulher} anos p/ aposentar`);
    }
}
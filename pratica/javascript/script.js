const input = document.querySelector('#input-number');
const button = document.getElementById('button');
let Restante = 0;

var somaArray = 0;

let quantidade50c = 0;
let quantidade25c = 0;
let quantidade10c = 0;
let quantidade5c = 0;
let quantidade1c = 0;

button.addEventListener('click', () => {
  if (input.value > 0) {
    let Restante = input.value;

    const quantidade50c = Math.floor(input.value / 0.5);
    console.log(quantidade50c + ' de 50 centavos');
    valor50c = quantidade50c > 0 ? quantidade50c * 0.5 : 0;

    Restante -= valor50c;

    const quantidade25c = Math.floor(Restante / 0.25);
    console.log(quantidade25c + ' de 25 centavos');
    valor25c = quantidade25c > 0 ? quantidade25c * 0.25 : 0;

    Restante -= valor25c;

    const quantidade10c = Math.floor(Restante / 0.1);
    console.log(quantidade10c + ' de 10 centavos');
    valor10c = quantidade10c > 0 ? quantidade10c * 0.1 : 0;

    Restante -= valor10c;

    const quantidade5c = Math.floor(Restante / 0.05);
    console.log(quantidade5c + ' de 5 centavos');
    valor5c = quantidade5c > 0 ? quantidade5c * 0.05 : 0;

    Restante -= valor5c;

    const quantidade1c = Math.round(Restante / 0.01);

    console.log(quantidade1c + ' de 1 centavos');
    valor1c = quantidade1c > 0 ? quantidade1c * 0.01 : 0;

    Restante = Number(Restante.toFixed(2)) - valor1c;

    var meuArray = [
      quantidade50c,
      quantidade25c,
      quantidade10c,
      quantidade5c,
      quantidade1c
    ]

    for (num of meuArray) {
      somaArray += num;
    }

    console.log('total de moedas: ' + somaArray);

    const saidaMoedas = document.getElementById('resultados')
    saidaMoedas.innerHTML = `<p>Total de moedas: ${somaArray}</p>
                            <p>Sendo:</p>
                            <p>${quantidade50c} de 50 centavos</p>
                            <p>${quantidade25c} de 25 centavos</p>
                            <p>${quantidade10c} de 10 centavos</p>
                            <p>${quantidade5c} de 5 centavos</p>
                            <p>${quantidade1c} de 1 centavo</p>`
  }
  somaArray = 0;
})

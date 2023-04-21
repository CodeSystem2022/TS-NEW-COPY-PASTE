//while = mientras
let contador = 0;
while(contador <3){
    console.log(contador);
    contador ++;
}
console.log("fin del ciclo while");

//do while

let conteo= 0;
do{
    console.log(conteo);
    conteo ++;
}while(conteo < 3);
console.log("fin del ciclo do while");

//for

for( let contando = 0;contando  <3 ;contando++ ) console.log(contando)
console.log("fin del ciclo for");

//palabra reservada break
for (let contando = 0; contando <=10; contando++){
    //muestra los pares
    if(contando %2 ==0){
        console.log(contando);
        //break va a terminar el ciclo al encontrar el primer par, osea la primer condicion
        break;
    }
}
console.log("termina el ciclo al encontrar el primer numero par");

//la palabra continue y etiqutas labels
inicio:
for (let contando = 0; contando <=10; contando++){
    //muestra los pares
    if(contando %2 !== 0){
        //va a continuar a la siguiente iteracion
        continue inicio;
     
    }
    console.log(contando)
}
console.log("termina el ciclo");

//etiquetas labels


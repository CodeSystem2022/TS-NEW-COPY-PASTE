
//let autos = new Array("FERRARI","RENAUL","BMW") sintaxis vieja

const autos = ["FERRARI","RENAUL","BMW"];
console.log(autos)
//recorremos los elementos de un arreglo
console.log(autos[0])
console.log(autos[2])

for(let i=0; i < autos.length; i++){
    console.log(i +" : "+autos[i])
}


//modificamos los elementos del arelo

autos[1]="volvo";
console.log(autos)

//agregamos nuevos valores al arreglo

autos.push("audi");
console.log(autos);

autos[autos.length]="porche"
console.log(autos);
//en esta forma debemos tener cuidado, por que es segun la posicion. si ponemos una existente la reenplaza y si ponemos una mayor crea  vacios
autos[8] = "renault";
console.log(autos);

//como consultar si es un arreglo

console.log(Array.isArray(autos));

console.log(autos instanceof Array);
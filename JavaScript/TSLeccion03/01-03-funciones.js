miFuncion(8,2)

function miFuncion(a,b){
    //console.log("sumamos: "+(a+b));
    return a+b;
}

miFuncion(5,4)

let resultado = miFuncion(6,7);
console.log(resultado);



//funcion expresadas o anonima

let x = function(a,b){return a+b};
resultado = x(5,6);

console.log(resultado);

//funcion de tipo self y invoking

(function(a,b){
    console.log("ejecutando ña funcion: "+(a+b));

})(9,6);


console.log(typeof miFuncion);

function miFuncionDos(a,b){
    console.log(arguments.length)
}
miFuncion(5,7,3,6);

//tostring

let miFunciontTexto = miFuncionDos.toString();
console.log(miFunciontTexto);


//FUNCIONES FLECHAS

const sumaFuncionFecla = (a,b) =>a+b;

resultado = sumaFuncionFecla(3,7);
console.log(resultado);

//funcion expresada
//parametros, dentro de los parentecis: es la lista de varuiables que definimos en la funcion
let sumar = function(a,b){
    console.log(arguments[0]);
    console.log(arguments[1]);
    console.log(arguments[2]);
     
    return a+b +arguments[2];
}
//pasamos argumentos,valores q ue pasamos
resultado = sumar(3,5,9);
console.log(resultado);

//sumar todos los argumentos
let respuesta = sumarTodo(5,4,13,10,9);
console.log(respuesta);

function sumarTodo(){
    let suma =0;
    for(let i=0;i <arguments.length; i++){
        //arguments es para arreglos
        suma+=arguments[i];
    }
    return suma;

}

//tipos primitivos

let k=10;
//paso por valor
function camviarValor(a){
    a = 20;

}
camviarValor(k);
console.log(k);

//paso por referencia
//objeto
const persona = {
    nombre: " juan",
    apellido: "lopez"
}
console.log(persona)

function cambiarValorObjeto(p1){
    p1.nombre = "ignacio";
    p1.apellido = "perez";
}

cambiarValorObjeto(persona);
console.log(persona)



let GRUPO = "COPY-PASTE";
GRUPO = "NEW-COPY-PASTE";

console.log(GRUPO);


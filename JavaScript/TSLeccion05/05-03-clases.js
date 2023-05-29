
//let persona3 = new Persona("carla", "ponce"); //esto no se puede hacer: persona is not defined
//clase padre
class Persona{
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido =apellido;
    }
    //ver
    get nombre(){
        return this._nombre;
    }
    //modificar
    set nombre(nombre){
        this._nombre=nombre;
    }
    //ver
    get apellido(){
        return this._apellido;
    }
    //modificar
    set apellido(apellido){
        this._apellido=apellido;
    }

    nombreCompleto(){
        return this._nombre+" "+this._apellido;
    }
    //sobreescribiendo el metodo de la clase padre(object)
    toString(){//regresa un string
       // se aplica el polimorfismo que significa = multiples formas en tiempo de ejecucion
       //el metodo que se ajecuta depende si es una referencia de tipo padre o hija
        return this.nombreCompleto();
    }

}
class Empleado extends Persona{//CLASE HIJA
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento=departamento;

    }
    get departamento(){
        return this._departamento;

    }
    set departamento(departamento){
        this._departamento=departamento;
    }
    //sobreescritura estamos modificando el metodo con el mismo nombre

    nombreCompleto(){
        return super.nombreCompleto()+", "+this._departamento;
    }
}






let persona1 = new Persona("martin","perez");
//console.log(persona1);
console.log(persona1.nombre);
persona1.nombre="juan carlos";
console.log(persona1.nombre);

let persona2 = new Persona("carlos", "lara");
//console,log(persona2);
console.log(persona2.nombre)
persona2.nombre="maria  laura";
console.log(persona2.nombre)
//tarea
//console.log(persona1);
console.log(persona1.apellido);
persona1.apellido="mesas";
console.log(persona1.apellido);

//console,log(persona2);
console.log(persona2.apellido)
persona2.apellido="gimenez";
console.log(persona2.apellido)


let empleado1 = new Empleado("maria", "gimenez", "sistemas");
console.log(empleado1);
console.log(empleado1.nombreCompleto());

//Object.prototype.toString manera de acceder a atributos de manera dinamica


console.log(empleado1.toString());

console.log(persona1.toString());







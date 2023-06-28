class Producto{
    static contadorProductos =0;
    constructor(nombre,precio){
        this._idProducto= ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;

    }
    get idProducto(){
        return this._idProducto;
    }
    get nombre(){
        return this._nombre;
    }
    get precio(){
        return this._precio;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    set precio(precio){
        this._precio=precio;
    }
    toString(){
        return `idProducto: ${this._idProducto}, nombre: ${this._nombre}, precio: $${this._precio}`;
    }

}//fin clase producto

class Orden{
    static contadorOrdenes = 0;
    static getMAX_PRODUCTOS(){
        return 5;
    }
    constructor(){
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos= [];
        this._contadorProductosAgregados=0;
    }
    get idOrden(){
        return this._idOrden;
    }
    agregarProducto(producto){
        if(this._productos.length < Orden.getMAX_PRODUCTOS()){
            this._productos.push(producto);//SINTAXI UNO
            //this._productos[this._contadorProductosAgregados++] = //producto;segunda sintaxis
        }
        else{
            console.log("nos e puede agregar mas productos")
        }
    }//fin agregar producto
    calcularTotal(){
        let totalVenta = 0;
        for(let producto of this._productos){
            totalVenta+=producto.precio;
        }
        return totalVenta;
    }//fin metodo calcularTotal

    mostrarOrden(){
        let productosOrden = " ";
        for(let producto of this._productos){
            productosOrden += "\n{"+producto.toString()+"  }";

        }//fin for
        console.log(`orden: ${this._idOrden}, total: ${this.calcularTotal()}, Productoa: ${productosOrden}`);
    }//fin metodo mostrarOrden

}//fin clase orden

let producto1 = new Producto("pantalon", 200);
let producto2 = new Producto("camisa", 150);
let producto3 = new Producto("cinturon", 50);

let orden1 = new Orden();
let orden2 = new Orden();


orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);
orden2.agregarProducto(producto1);
orden2.agregarProducto(producto2);
orden2.agregarProducto(producto3);


orden1.mostrarOrden();
orden2.mostrarOrden();




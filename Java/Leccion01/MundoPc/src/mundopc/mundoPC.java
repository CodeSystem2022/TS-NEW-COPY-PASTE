
package mundopc;

import ar.com.system2023.mundopc.*;




public class mundoPC {
    public static void main(String[] args) {
        //IMPORTAR LA CLASE
       Monitor monitorHP = new Monitor("HP", 13);
       Teclado tecladoHP = new Teclado("Bluetooth", "HP");
       Raton ratonHP = new Raton("Bluetooth", "HP");
       Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
       //CREAMOS OTROS OBJETO DE DIFERENTE MARCA
       Monitor monitorGAMER = new Monitor("GAMER", 32);
       Teclado tecladoGAMER = new Teclado("Bluetooth", "GAMER");
       Raton ratonGAMER = new Raton("Bluetooth", "GAMER");
       Computadora computadoraGAMER = new Computadora("Computadora GAMER", monitorGAMER, tecladoGAMER, ratonGAMER);
       //objetos nuevos ejercicio
       Monitor monitorGygabyte = new Monitor("GENIUS", 22);
       Monitor monitorSamsung = new Monitor("SAMSUNG", 29);
       Monitor monitorLG = new Monitor("LG", 29);
       Monitor monitorSONY = new Monitor("SONY", 32);
       
       Teclado tecladoGENIUS = new Teclado("Bluetooth", "GENIUS");
       Raton ratonGENIUS = new Raton("Bluetooth", "GENIUS");
       Teclado tecladoGeniusUSB = new Teclado("USB", "GENIUS");
       Raton ratonGeniusUSB = new Raton("USB", "GENIUS");
       
     
       Teclado tecladoLogitech = new Teclado("Bluetooth", "Logitech");
       Raton ratonLogitech = new Raton("Bluetooth", "Logitech");
       Teclado tecladoLogitechUSB = new Teclado("USB", "Logitech");
       Raton ratonLogitechUSB = new Raton("USB", "Logitech");
       
       
       
       
       
       
       Orden orden1 = new Orden();
       Orden orden2 = new Orden();
       orden1.agregarComputadora(computadoraHP);
       orden1.agregarComputadora(computadoraGAMER);
       orden1.mostrarOrden();
       
       
       Computadora computadorasVarias = new Computadora("variada de marcas", monitorHP, tecladoGAMER, ratonHP);
       orden2.agregarComputadora(computadorasVarias);
       
       orden1.mostrarOrden();
       orden2.mostrarOrden();
       
       //ORDENES EJERCICIO
       
       Computadora computadoraCombo1 = new Computadora("COMBO1", monitorSONY, tecladoGeniusUSB, ratonLogitech);
       
       Orden orden3 = new Orden();
       
       orden3.agregarComputadora(computadoraCombo1);
       orden3.mostrarOrden();
    }
    
}

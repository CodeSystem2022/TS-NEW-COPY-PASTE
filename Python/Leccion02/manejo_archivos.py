
#declaramos una variable
#la w es de write : escribir, encoding="utf8"  para que salgan los acentos

try:
    archivo = open("prueba.txt", "w", encoding="utf8")
    archivo.write("Programar con diferentes tipos de archivos, ahora txt.\n")
    archivo.write("los acentos son importantes para las palabras\n")
    archivo.write("como por ejemplo : acción,ejecución y producción\n")
    archivo.write("las letras son: \n r:read leer, \na:append anexa, \n w: write escribe, \nx crea un archivo")
    archivo.write("\n t: text texto, \n b: archivos binarios, \n w+ lee y escribe, \n r+: escribe y lee \n ")

    archivo.write("con esto terminamos")
except Exception as e:
    print(e)
#finally siempre se ejecuta
finally:
    #cerrar el el archivo
    archivo.close()
#archivo.write("todo quedo perfecto")    este es un error por que el archivo ya esta cerrado




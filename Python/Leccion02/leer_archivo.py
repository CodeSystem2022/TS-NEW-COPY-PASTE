# r:read para leer, a: append, para agregar mas info,x : crea un archivo
archivo = open("prueba.txt","r", encoding="utf8")
#print(archivo.read(16))
#continuamos con la siguiente linea
#print(archivo.read(20))
#print(archivo.readline())

#vamos a iterar el archivo, cada un a de las lineas

# linea in archivo:
    #iteramos todos los elementos del archivo
    #print(linea)

    #accedemos al archivo comos i fuera una lista
    #print(archivo.readlines())

#anexamos informacion y la copiamos a otro

archivo2 = open("copia.txt", "w", encoding="utf8")
archivo2.write(archivo.read())
archivo.close()
archivo2.close()
print("se ha terminado el proceso de leer y copiar archivos")


import psycopg2 #conectarnos con la base de datos

conexion = psycopg2.connect(user='postgres',password='matias182',host='127.0.0.1',port='5432',database='test_bd')
#abrir y cerrar conexion con with
try:
    with conexion:
        with conexion.cursor() as cursor:
            #sentencia = "SELECT * FROM persona"/ todos los datos
            sentencia = "SELECT * FROM persona WHERE id_persona = %s" #/ placeholder/solo un dato
            id_persona = input("digite un numero para el id persona: ")
            #sentencia2 = "SELECT id_persona, nombre FROM persona" /para seleccionar solo lo que queramos de la tabla
            cursor.execute(sentencia,(id_persona,))
            registros = cursor.fetchone()#recuperamos los registros que seran una lista
            print(registros)
except Exception as e:
    print(f'ocurrio un error: {e}')
finally:
    conexion.close()






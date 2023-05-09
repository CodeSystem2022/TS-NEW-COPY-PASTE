import psycopg2 #conectarnos con la base de datos

conexion = psycopg2.connect(user='postgres',password='matias182',host='127.0.0.1',port='5432',database='test_bd')
#abrir y cerrar conexion con with
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'SELECT * FROM persona WHERE id_persona  IN %s' #/ placeholder/solo un dato
            entrada= input("digite los id_personas a buscar (separados por coma): ")
            llaves_primarias = (tuple(entrada.split(",")),)#tupla
            cursor.execute(sentencia, llaves_primarias)
            registros = cursor.fetchall()#recuperamos los registros que seran una lista
            for registro in registros:
                print(registro)

except Exception as e:
    print(f'ocurrio un error: {e}')
finally:
    conexion.close()






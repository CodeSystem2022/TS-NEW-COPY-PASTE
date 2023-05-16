import psycopg2 as bd #conectarnos con la base de datos

conexion = bd.connect(user='postgres',password='matias182',host='127.0.0.1',port='5432',database='test_bd')
#abrir y cerrar conexion con with
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = "INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)"
            valores = ("alex", "rojas", "arojas@gmail.com")
            cursor.execute(sentencia, valores)
            sentencia="UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s"
            valores =("juan carlos", "roldan", "arojas@gmail.com", 1)
            cursor.execute(sentencia, valores)
except Exception as e:

    print(f'ocurrio un error, se hizo un rollback: {e}')
finally:
    conexion.close()
print("termina la transaccion")

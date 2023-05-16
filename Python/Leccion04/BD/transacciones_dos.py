import psycopg2 as bd #conectarnos con la base de datos

conexion = bd.connect(user='postgres',password='matias182',host='127.0.0.1',port='5432',database='test_bd')
#abrir y cerrar conexion con with
try:
    #inicia la transaccion
    conexion.autocommit = False
    cursor = conexion.cursor()
    sentecia = "INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)"
    valores = ("jorge", "prol96798787987", "clara@gmail.com")
    cursor.execute(sentecia, valores)
    sentencia="UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s"
    valores =("juan carlos", "perez", "jcperes@gmail.com", 1)
    cursor.execute(sentencia, valores)
    # hacemoss el commit manualmente,cierre de transaccion
    conexion.commit()
    print("termina la transaccion")
except Exception as e:
    conexion.rollback()
    print(f'ocurrio un error, se hizo un rollback: {e}')
finally:
    conexion.close()


import psycopg2 as bd #conectarnos con la base de datos

conexion = bd.connect(user='postgres',password='matias182',host='127.0.0.1',port='5432',database='test_bd')
#abrir y cerrar conexion con with
try:
    conexion.autocommit = False
    cursor = conexion.cursor()
    sentecia = "INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)"
    valores = ("Maria", "Esperanza", "mesparza@gmail.com")
    cursor.execute(sentecia, valores)
    # hacemoss el commit manualmente
    conexion.commit()
    print("termina la transaccion")
except Exception as e:
    conexion.rollback()
    print(f'ocurrio un error, se hizo un rollback: {e}')
finally:
    conexion.close()






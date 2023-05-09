import psycopg2  # conectarnos con la base de datos

conexion = psycopg2.connect(user='postgres', password='matias182', host='127.0.0.1', port='5432', database='test_bd')
# abrir y cerrar conexion con with
try:
    with conexion:
        with conexion.cursor() as cursor:
            # eliminar registros
            sentencia = "DELETE FROM persona WHERE id_persona=%s"
            entrada = input("digite el numero de registro a eliminar: ")
            valores = (entrada, )  # es una tupla de valores
            cursor.execute(sentencia, valores)
            registros_eliminados = cursor.rowcount
            print(f"el regitro eliminados es: {registros_eliminados}")

except Exception as e:
    print(f'ocurrio un error: {e}')
finally:
    conexion.close()

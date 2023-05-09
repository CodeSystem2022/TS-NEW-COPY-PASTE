import psycopg2  # conectarnos con la base de datos

conexion = psycopg2.connect(user='postgres', password='matias182', host='127.0.0.1', port='5432', database='test_bd')
# abrir y cerrar conexion con with
try:
    with conexion:
        with conexion.cursor() as cursor:
            # actualizar registros
            sentencia = "UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s"
            valores = (
                ("juan carlos", "rolan", "rcarlos@hotmail.com", 4),
                ("romina", "ayala", "rominaayala@gmail.com", 5)
            )  # es una tupla de tuplas
            cursor.executemany(sentencia, valores)
            registros_actualizados = cursor.rowcount
            print(f"los registros actualizados son: {registros_actualizados}")

except Exception as e:
    print(f'ocurrio un error: {e}')
finally:
    conexion.close()

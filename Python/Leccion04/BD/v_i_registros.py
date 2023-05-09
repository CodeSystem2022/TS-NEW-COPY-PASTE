import psycopg2  # conectarnos con la base de datos

conexion = psycopg2.connect(user='postgres', password='matias182', host='127.0.0.1', port='5432', database='test_bd')
# abrir y cerrar conexion con with
try:
    with conexion:
        with conexion.cursor() as cursor:
            # INSERTAR DATOS
            sentencia = 'INSERT INTO  persona (nombre, apellido, email)VALUES(%s, %s, %s)'
            valores = (
                ("carlos", "lara", "clara@gmail.com"),
                ("marcos", "canto", "mcanto@mail.com"),
                ("marcelo", "cuenca", "cuenca@gmail.com")
            )  # esto es una tupla de tuplas
            cursor.executemany(sentencia, valores)
            registros_insertados = cursor.rowcount
            print(f"los registros insertados son: {registros_insertados}")

except Exception as e:
    print(f'ocurrio un error: {e}')
finally:
    conexion.close()

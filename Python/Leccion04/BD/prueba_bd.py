import psycopg2 #conectarnos con la base de datos

conexion = psycopg2.connect(
    user='postgres',
    password='matias182',
    host='127.0.0.1',
    port='5432',
    database='test_bd'

)
cursor = conexion.cursor()
sentencia = "SELECT * FROM persona"
cursor.execute(sentencia)
registros = cursor.fetchall()#recuperamos los registros que seran una lista
print(registros)

cursor.close()
conexion.close()


from capa_datos_persona.Persona import Persona
from capa_datos_persona.conexion import Conexion
from logger_base import log


class PersonaDAO:
    """
    DAO significa: Data Access Object
    CRUD sig:
                create -> insertar
                read -> seleccionar
                update -> actualizar
                delete -> eliminar

    """


    _SELECCIONAR = "SELECT * FROM persona ORDER BY id_persona"
    _INSERTAR = "INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)"
    _ACTUALIZAR = "UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s"
    _ELIMINAR ="DELETE FROM persona WHERE id_persona=%s"
    #definimos los metodos de la clase

    @classmethod
    def seleccionar(cls):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                cursor.execute(cls._SELECCIONAR)
                registros = cursor.fetchall()
                personas = [] #creamos una lista
                for registro in registros:
                    persona = Persona(registro[0],registro[1],registro[2],registro[3])
                    personas.append(persona)
                return personas
    @classmethod
    def insertar(cls, persona):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.nombre, persona.apellido, persona.email)
                cursor.execute(cls._INSERTAR, valores)
                log.debug(f"Persona Insertada: {persona}")
                return cursor.rowcount

    @classmethod
    def actualizar(cls, persona):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.nombre, persona.apellido, persona.email, persona.id_persona)
                cursor.execute(cls._ACTUALIZAR, valores)
                log.debug(f"Persona ACTUALIZADA: {persona}")
                return cursor.rowcount

    @classmethod
    def eliminar(cls, persona):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.id_persona, persona.apellido, persona.email)
                cursor.execute(cls._ELIMINAR, valores)
                log.debug(f"LOS OBJETOS ELIMINADOS SON: {persona}")
                return cursor.rowcount



if __name__ == "__main__":
    #ELIMINAR UN REGISTRO
   # persona1 = Persona(id_persona = 21)
    #personas_eliminadas = PersonaDAO.eliminar(persona1)
    #log.debug(f"personas eliminadas: {personas_eliminadas}")

    #actualizar un registro
   # persona1 = Persona(1, "juan jose", "peña", "jjpeña@gmail.com")
    #personas_actualizadas =PersonaDAO.actualizar(persona1)
    #log.debug(f"Personas actualizadas: {personas_actualizadas}")

    #insertar un registro
   # persona1 = Persona(nombre="omero", apellido="ramos", email="romero@gmail.com")
    #personas_insertadas = PersonaDAO.insertar(persona1)
    #log.debug(f"personas insertadas: {personas_insertadas}")
    #seleccionar objetos
    personas = PersonaDAO.seleccionar()
    for persona in personas:
        log.debug(persona)
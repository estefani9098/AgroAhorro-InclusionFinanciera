--USUARIOS:
CREATE OR ALTER PROCEDURE sp_ConsultarUsuarios
AS
BEGIN
    SELECT 
        ID_Usuario, 
        Usu_Nombre, 
        Usu_Apellido, 
        Usu_Gmail, 
        Usu_Telefono
    FROM tblUsuario;
END;
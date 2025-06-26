 
--CONSULTAR AHORRO POR USUARIO:
CREATE OR ALTER PROCEDURE sp_ConsultarAhorrosPorUsuario
    @idUsuario VARCHAR(10)
AS
BEGIN
    SELECT 
        U.Usu_Nombre,
        M.Met_Nombre,
        A.Aho_Monto,
        A.Aho_Fecha,
        A.Aho_Progreso
    FROM tblUsuario U
    JOIN tblMetaAhorro M ON U.ID_Usuario = M.ID_Usuario
    JOIN tblAhorro A ON M.ID_MetaAhorro = A.ID_MetaAhorro
    WHERE U.ID_Usuario = @idUsuario;
END;

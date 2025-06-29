
--AHORRO:
CREATE OR ALTER PROCEDURE sp_ConsultarAhorros
AS
BEGIN
    SELECT 
        ID_Ahorro,
        Aho_Monto,
        Aho_Fecha,
        Aho_Progreso,
        ID_MetaAhorro
    FROM tblAhorro;
END;
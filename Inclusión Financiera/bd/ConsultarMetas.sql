
--METAS DE AHORRO:
CREATE OR ALTER PROCEDURE sp_ConsultarMetas
AS
BEGIN
    SELECT 
        ID_MetaAhorro,
        Met_Nombre,
        Met_Ahorro,
        Met_Estado,
        Met_FechaLimite,
        Met_Montoactual,
        ID_Usuario
    FROM tblMetaAhorro;
END;

CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `new_view` AS
    SELECT 
        `escambo`.`idEscambo` AS `idEscambo`,
        `detalhesescambo`.`TotalDeTrocas` AS `TotalDeTrocas`
    FROM
        (`escambo`
        JOIN `detalhesescambo`)
    WHERE
        (`escambo`.`TotalDeitensT` = 4)
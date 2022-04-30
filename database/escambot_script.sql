-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Usuário`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Usuário` (
  `idUsuario` INT(11) NOT NULL,
  `Senha` VARCHAR(255) NOT NULL,
  `login` VARCHAR(255) NOT NULL,
  `Nome` VARCHAR(255) NOT NULL,
  `DataDeNascimento` DATE NOT NULL,
  `CPF` VARCHAR(14) NOT NULL,
  `Cidade` VARCHAR(255) NOT NULL,
  `Estado` VARCHAR(255) NOT NULL,
  `Telefone` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Produto` (
  `idProduto` INT(11) NOT NULL,
  `NomeDoProduto` VARCHAR(255) NOT NULL,
  `Rating` INT NOT NULL,
  `TipoDoProduto` VARCHAR(255) NOT NULL,
  `CorDoProduto` VARCHAR(255) NOT NULL,
  `MarcaDoProduto` VARCHAR(255) NOT NULL,
  `UtilidadeDoProduto` VARCHAR(255) NOT NULL,
  `Usuário_idUsuario` INT(11) NOT NULL,
  PRIMARY KEY (`idProduto`),
  INDEX `fk_Produto_Usuário1_idx` (`Usuário_idUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_Produto_Usuário1`
    FOREIGN KEY (`Usuário_idUsuario`)
    REFERENCES `mydb`.`Usuário` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Privilégios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Privilégios` (
  `idPrivilégios` INT(11) NOT NULL,
  `Nome` VARCHAR(45) NOT NULL,
  `TemPrivilégios` TINYINT(1) NOT NULL,
  PRIMARY KEY (`idPrivilégios`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Empregado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Empregado` (
  `ID` INT(11) NOT NULL,
  `Senha` VARCHAR(255) NOT NULL,
  `login` VARCHAR(255) NOT NULL,
  `Nome` VARCHAR(255) NOT NULL,
  `DataDeNascimento` DATE NOT NULL,
  `CPF` VARCHAR(14) NOT NULL,
  `Cidade` VARCHAR(255) NOT NULL,
  `Estado` VARCHAR(255) NOT NULL,
  `Telefone` VARCHAR(255) NOT NULL,
  `Foto` LONGBLOB NOT NULL,
  `E-mail` VARCHAR(255) NOT NULL,
  `Cargo` VARCHAR(255) NOT NULL,
  `Privilégios_idPrivilégios` INT(11) NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_Empregado_Privilégios1_idx` (`Privilégios_idPrivilégios` ASC) VISIBLE,
  CONSTRAINT `fk_Empregado_Privilégios1`
    FOREIGN KEY (`Privilégios_idPrivilégios`)
    REFERENCES `mydb`.`Privilégios` (`idPrivilégios`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Escambo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Escambo` (
  `idEscambo` INT(11) NOT NULL,
  `TotalDeitensT` INT NOT NULL,
  `DRating` INT NOT NULL,
  `DataTroca` DATE NOT NULL,
  `Empregado_ID` INT(11) NOT NULL,
  `Produto_idProduto` INT(11) NOT NULL,
  `Usuário_idUsuario` INT(11) NOT NULL,
  PRIMARY KEY (`idEscambo`),
  INDEX `fk_Escambo_Empregado1_idx` (`Empregado_ID` ASC) VISIBLE,
  INDEX `fk_Escambo_Produto1_idx` (`Produto_idProduto` ASC) VISIBLE,
  INDEX `fk_Escambo_Usuário1_idx` (`Usuário_idUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_Escambo_Empregado1`
    FOREIGN KEY (`Empregado_ID`)
    REFERENCES `mydb`.`Empregado` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Escambo_Produto1`
    FOREIGN KEY (`Produto_idProduto`)
    REFERENCES `mydb`.`Produto` (`idProduto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Escambo_Usuário1`
    FOREIGN KEY (`Usuário_idUsuario`)
    REFERENCES `mydb`.`Usuário` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ProdutoDepartamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ProdutoDepartamento` (
  `idProdutoDepartamento` INT(11) NOT NULL,
  `TAGProdutoDepartamento` VARCHAR(45) NOT NULL,
  `Produto_idProduto` INT(11) NOT NULL,
  PRIMARY KEY (`idProdutoDepartamento`),
  INDEX `fk_ProdutoDepartamento_Produto1_idx` (`Produto_idProduto` ASC) VISIBLE,
  CONSTRAINT `fk_ProdutoDepartamento_Produto1`
    FOREIGN KEY (`Produto_idProduto`)
    REFERENCES `mydb`.`Produto` (`idProduto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ProdutoMercado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ProdutoMercado` (
  `idProdutoMercado` INT(11) NOT NULL,
  `DataDeValidade` DATE NOT NULL,
  `TAGProdutoMercado` VARCHAR(45) NOT NULL,
  `Produto_idProduto` INT(11) NOT NULL,
  PRIMARY KEY (`idProdutoMercado`),
  INDEX `fk_ProdutoMercado_Produto1_idx` (`Produto_idProduto` ASC) VISIBLE,
  CONSTRAINT `fk_ProdutoMercado_Produto1`
    FOREIGN KEY (`Produto_idProduto`)
    REFERENCES `mydb`.`Produto` (`idProduto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`DetalhesEscambo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`DetalhesEscambo` (
  `idDetalhesEscambo` INT(11) NOT NULL,
  `TotalDeTrocas` INT NOT NULL,
  `Escambo_idEscambo` INT(11) NOT NULL,
  PRIMARY KEY (`idDetalhesEscambo`),
  INDEX `fk_DetalhesEscambo_Escambo1_idx` (`Escambo_idEscambo` ASC) VISIBLE,
  CONSTRAINT `fk_DetalhesEscambo_Escambo1`
    FOREIGN KEY (`Escambo_idEscambo`)
    REFERENCES `mydb`.`Escambo` (`idEscambo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

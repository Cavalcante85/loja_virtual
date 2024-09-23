use lojavirtual;

DELIMITER //
DROP TRIGGER IF EXISTS validaChavePessoaUpdate;
CREATE TRIGGER validaChavePessoaUpdate
BEFORE UPDATE ON avaliacao_produto
FOR EACH ROW
BEGIN

CALL `lojavirtual`.`validaChavePessoa`();

END;
//

DELIMITER ;

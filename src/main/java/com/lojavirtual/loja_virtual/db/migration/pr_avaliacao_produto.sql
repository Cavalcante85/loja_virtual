use lojavirtual;

DELIMITER //

CREATE PROCEDURE validaChavePessoa()
BEGIN
   DECLARE CONTINUE HANDLER FOR SQLEXCEPTION
   
   BEGIN
	  DECLARE existe INTEGER;
      
      SET existe = (SELECT count(1) FROM pessoa_fisica WHERE id = NEW.pessoa_id);
      IF (existe <= 0) THEN
		 SET existe = (SELECT count(1) FROM pessoa_juridica WHERE id = NEW.pessoa_id);
	     IF (existe <= 0) THEN
         SELECT 'Não foi encontrado o ID para a pessoa, para realizar a associção do cadastro';
    end if;
    end if;
   END;

END;
//

DELIMITER ;

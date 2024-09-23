SELECT 
    CONSTRAINT_NAME, 
    CONSTRAINT_TYPE 
FROM 
    INFORMATION_SCHEMA.TABLE_CONSTRAINTS 
WHERE 
    TABLE_SCHEMA = 'lojavirtual' 
    AND TABLE_NAME = 'usuario_acesso';
	
	ALTER TABLE `lojavirtual`.`usuario_acesso` ALTER INDEX `UKfhwpg5wu1u5p306q8gycxn9ky` INVISIBLE
insert into cidadao 
(DTYPE, CPF, CARTAO_SUS, COMORBIDADES, DATA_NASC, EMAIL, NOME, PROFISSAO, SENHA, TELEFONE, CARGO, IS_APROVADO, LOCAL_DE_TRABALHO) 
values ('Admin', '123', null, null, null, null, 'Administrador', null, '123', null, null, null, null);

insert into cidadao
(DTYPE, CPF, CARTAO_SUS, COMORBIDADES, DATA_NASC, EMAIL, NOME, PROFISSAO, SENHA, SITUACAO, TELEFONE, CARGO, IS_APROVADO, LOCAL_DE_TRABALHO) 
values ('Cidadao', '12365', '987654', 'Câncer, ovo inchado, caspa', '2000-09-11', 'exemplo@boll.com', 'Paulo', 'Compiteiro', '123', 'NAO_HABILITADO', '99999999', null, false, null);

insert into cidadao
(DTYPE, CPF, CARTAO_SUS, COMORBIDADES, DATA_NASC, EMAIL, NOME, PROFISSAO, SENHA, SITUACAO, TELEFONE, CARGO, IS_APROVADO, LOCAL_DE_TRABALHO) 
values ('Cidadao', '1234', '987654', 'Diabetes, Minigite', '1940-09-11', 'exemplo@boll.com', 'José Maria', 'Aposentado', '123', 'NAO_HABILITADO', '99999999', null, false, null);

insert into cidadao
(DTYPE, CPF, CARTAO_SUS, COMORBIDADES, DATA_NASC, EMAIL, NOME, PROFISSAO, SENHA, SITUACAO, TELEFONE, CARGO, IS_APROVADO, LOCAL_DE_TRABALHO) 
values ('Cidadao', '12345', '987654', 'Pedra na vesicula', '2000-09-11', 'exemplo@boll.com', 'Edmilson', 'Tec. Enfermagem', '123', 'NAO_HABILITADO', '99999999', null, false, null);

insert into cidadao
(DTYPE, CPF, CARTAO_SUS, COMORBIDADES, DATA_NASC, EMAIL, NOME, PROFISSAO, SENHA, SITUACAO, TELEFONE, CARGO, IS_APROVADO, LOCAL_DE_TRABALHO) 
values ('Funcionario', '987654', '987654', 'Dente mole', '2000-05-11', 'exemplo@boll.com', 'José Bonifácio', 'Enfermeiro', '123', 'NAO_HABILITADO', '99999999', 'Enfermeiro', true, 'PSF-II');

insert into cidadao 
(DTYPE, CPF, CARTAO_SUS, COMORBIDADES, DATA_NASC, EMAIL, NOME, PROFISSAO, SENHA, SITUACAO, TELEFONE, CARGO, IS_APROVADO, LOCAL_DE_TRABALHO) 
values ('Funcionario', '123456', '987654', 'Diabetes', '2000-05-11', 'exemplo@boll.com', 'José Bonifácio', 'Mecânico', '123', 'NAO_HABILITADO', '99999999', 'Enfermeiro', false, 'PSF-IV');

insert into vacina
(DIAS_PARA_SEGUNDA_DOSE, FABRICANTE, IS_DISPONIVEL, NOME, QUANTIDADE_DOSES)
values (30, 'Pfizer', false, 'CV19', 2);

insert into vacina
(DIAS_PARA_SEGUNDA_DOSE, FABRICANTE, IS_DISPONIVEL, NOME, QUANTIDADE_DOSES)
values (30, 'China', false, 'Coronavac', 2);


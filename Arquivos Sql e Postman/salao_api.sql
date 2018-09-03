drop database salao_api;
create database salao_api default character set utf8 default collate utf8_general_ci;
use salao_api;

create table IF NOT EXISTS endereco (
	id int unsigned auto_increment,
	cep varchar(15) not null,
	cidade varchar(25) not null,
	descricao varchar(25) not null,
	primary key(id)

)Engine=InnoDB default charset = utf8;

create table IF NOT EXISTS pessoa (
	id int unsigned auto_increment,
	nome varchar(15) not null,
	email varchar(45) not null,
	cpf char(15) not null,
	telefone char(15) not null, 
	id_endereco int unsigned,
	sobrenome varchar(15) not null,
	/*data_nascimento date not null,*/
	foreign key(id_endereco) references endereco(id),
	primary key(id)

)Engine=InnoDB default charset = utf8;


create table IF NOT EXISTS dias_semana (
	id int unsigned auto_increment,
    dia varchar(25) not null,
	primary key(id)

)Engine=InnoDB default charset = utf8;
insert into dias_semana (dia) values ('FRIDAY'),('MONDAY'),('SATURDAY'),('SUNDAY'),('THURSDAY'),('TUESDAY'),('WEDNESDAY
');

create table IF NOT EXISTS funcionario (
	id int unsigned auto_increment,
	id_pessoa int unsigned,
	foreign key(id_pessoa) references pessoa(id),
	primary key(id)

)Engine=InnoDB default charset = utf8;


create table IF NOT EXISTS dias_trabalhados(
	id_dia int unsigned,
    id_funcionario int unsigned,
    foreign key (id_dia) references dias_semana(id),
    foreign key (id_funcionario) references funcionario(id)

)Engine=InnoDB default charset = utf8;


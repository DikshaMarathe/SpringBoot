create table person(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	DOB timestamp,
	primary key(id)
);

INSERT INTO PERSON (ID, NAME, LOCATION, DOB) VALUES (2, 'DIKSHA2', 'PUNE2', SYSDATE());
INSERT INTO PERSON (ID, NAME, LOCATION, DOB) VALUES (3, 'DIKSHA3', 'PUNE3', SYSDATE());
INSERT INTO PERSON (ID, NAME, LOCATION, DOB) VALUES (4, 'DIKSHA4', 'PUNE4', SYSDATE());
INSERT INTO PERSON (ID, NAME, LOCATION, DOB) VALUES (1, 'DIKSHA', 'PUNE', SYSDATE());
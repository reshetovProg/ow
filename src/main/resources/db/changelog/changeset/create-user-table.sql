--liquibase formatted sql
--changeset Reshetov Ivan:3
CREATE TABLE _user
(
    id              uuid NOT NULL,
    name            varchar(256) NULL,
    surname         varchar(256) NULL,
    passport_number varchar(256) NULL,
    CONSTRAINT user_pk PRIMARY KEY (id),
    CONSTRAINT passport_number_fk FOREIGN KEY (passport_number)
    REFERENCES passport(passport_number)
);
--rollback drop table _user;

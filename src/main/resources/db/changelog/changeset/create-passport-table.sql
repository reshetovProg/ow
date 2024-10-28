--liquibase formatted sql
--changeset Reshetov Ivan:2
CREATE TABLE passport
(
    passport_number varchar(256) NOT NULL,
    city            varchar(256) NULL,
    birthday        DATE NULL,
    CONSTRAINT passport_pk PRIMARY KEY (passport_number)
);
--rollback drop table passport;
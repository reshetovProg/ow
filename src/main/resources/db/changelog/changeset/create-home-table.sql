--liquibase formatted sql
--changeset Reshetov Ivan:1
CREATE TABLE home
(
    id     uuid NOT NULL,
    street varchar(256) NULL,
    number varchar(10) NULL,
    CONSTRAINT home_pk PRIMARY KEY (id)
);
--rollback drop table home;
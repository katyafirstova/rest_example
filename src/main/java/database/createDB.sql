--
-- drop sequence if exists user_seq;

-- create sequence user_seq
--     increment by 1
--     no maxvalue
--     no minvalue
--     cache 1;

create table if not exists users(id integer default nextval('user') not null primary key,
                           username text,
                           surname text,
                           addr text,
                           phone text,

                           mail text);

select * from users;

select username, surname, addr, phone, mail from users;
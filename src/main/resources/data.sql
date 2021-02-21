insert into users(username, password, enabled) values ('ashu', 'ashu123', true);
insert into users(username, password, enabled) values ('admin', 'admin123', true);

insert into authorities(username, authority) values('ashu', 'ROLE_USER');
insert into authorities(username, authority) values('admin', 'ROLE_ADMIN');

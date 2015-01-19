-- Insertion of roles
INSERT INTO role(role_id, name) VALUES(1, 'admin');
INSERT INTO role(role_id, name) VALUES(2, 'user');
INSERT INTO user(user_id, email, last_name, login, name, password, role_id) VALUES(1,'test@gmail.com','Klymenko','unnamedproj','Ruslan','test', 1);

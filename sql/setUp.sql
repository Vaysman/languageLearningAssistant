-- Creating of tables
-- Role
CREATE TABLE `role` (
   `role_id` int(11) NOT NULL AUTO_INCREMENT,
   `name` varchar(255) DEFAULT NULL,
   PRIMARY KEY (`role_id`),
   UNIQUE KEY `UK_8sewwnpamngi6b1dwaa88askk` (`name`)
 ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
 
-- User
 CREATE TABLE `user` (
   `user_id` int(11) NOT NULL AUTO_INCREMENT,
   `email` varchar(255) DEFAULT NULL,
   `last_name` varchar(255) DEFAULT NULL,
   `login` varchar(255) DEFAULT NULL,
   `name` varchar(255) DEFAULT NULL,
   `password` varchar(255) DEFAULT NULL,
   `role_id` int(11) NOT NULL,
   PRIMARY KEY (`user_id`),
   UNIQUE KEY `UK_ob8kqyqqgmefl0aco34akdtpe` (`email`),
   UNIQUE KEY `UK_ew1hvam8uwaknuaellwhqchhb` (`login`),
   UNIQUE KEY `UK_kiqfjabx9puw3p1eg7kily8kg` (`password`),
   KEY `FK_qleu8ddawkdltal07p8e6hgva` (`role_id`),
   CONSTRAINT `FK_qleu8ddawkdltal07p8e6hgva` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
-- Insertion of roles
INSERT INTO role(role_id, name) VALUES(1, 'admin');
INSERT INTO role(role_id, name) VALUES(2, 'user');
-- Insert dev user
INSERT INTO user(user_id, email, last_name, login, name, password, role_id) VALUES(1,'test@gmail.com','Klymenko','unnamedproj','Ruslan','test', 1);

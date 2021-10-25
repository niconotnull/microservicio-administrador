INSERT INTO `administrador` (username, password, enabled, nombre, apellido,email) VALUES('nico','$2a$10$vu4V0NIDaPBnwzma18E9.eAXOMQ2UubGbpuBdCfCIeOxZ9WUtrXXW',true, 'Nicolas', 'Tesla', 'nicolas@gmail.com');
INSERT INTO `administrador` (username, password, enabled, nombre, apellido,email) VALUES('hayden','$2a$10$sCVQsEOLsCwiRzwkECXp4OqFNt87mYgJ0XlYOZ0psmYwqcHo1vgmK',true, 'Hayden', 'Cosme', 'hayden@gmail.com');

INSERT INTO `role` (nombre)VALUES('ROLE_USER');
INSERT INTO `role` (nombre)VALUES('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES(1,1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES(2,2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES(2,1);

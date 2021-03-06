/* users values: id, password, firstName, lastName, email */
INSERT INTO users(password,first_name,last_name,email) VALUES
('$2a$10$p.U.3Y4sbTG2m4AyeTG5ruYq7E342kU9JB8UoylxV6aStZGXnEMpO','Ada','Lovelace','ada.lovelace@gmail.com'),
('$2a$10$p.U.3Y4sbTG2m4AyeTG5ruYq7E342kU9JB8UoylxV6aStZGXnEMpO','Betty','Snyder','betty.snyder@gmail.com'),
('$2a$10$p.U.3Y4sbTG2m4AyeTG5ruYq7E342kU9JB8UoylxV6aStZGXnEMpO','Grace','Hopper','grace.hopper@gmail.com'),
('$2a$10$p.U.3Y4sbTG2m4AyeTG5ruYq7E342kU9JB8UoylxV6aStZGXnEMpO','Karen','Sparck Jones','karen.jones@gmail.com'),
('$2a$10$p.U.3Y4sbTG2m4AyeTG5ruYq7E342kU9JB8UoylxV6aStZGXnEMpO','Carol','Shaw','carol.shaw@gmail.com'),
('$2a$10$p.U.3Y4sbTG2m4AyeTG5ruYq7E342kU9JB8UoylxV6aStZGXnEMpO','Roberta','Williams','roberta.williams@gmail.com'),
('$2a$10$p.U.3Y4sbTG2m4AyeTG5ruYq7E342kU9JB8UoylxV6aStZGXnEMpO','Frances','Allen','frances.allen@gmail.com');

/* errors values: id, userId, level, event, system, LocalDate createdDate,
@Size(min = 1, max = 500)detailsLog, filed, LocalDate updateDate */
INSERT INTO errors(user_id,level,event,environment,created_date,details_log,filed) VALUES
(1,'Warning','Create','Produção','10-02-2019','File src/github/Example.java, line 120, in ExampleController',false),
(1,'Error','Create','Produção','10-03-2019','File src/details/Example.java, line 122, in ExampleController',false),
(1,'Info','Create','Produção','11-02-2019','File src/console/Example.java, line 11, in ExampleController',false),
(1,'Warning','Read','Produção','12-02-2019','File console/github/Example.java, line 10, in ExampleController',false),
(1,'Warning','Update','Produção','20-05-2019','File user/github/Example.java, line 19, in ExampleController',false),
(1,'Info','Delete','Produção','08-10-2019','File src/console/Example.java, line 78, in ExampleController',false),
(1,'Warning','Create','Homologação','10-07-2019','File src/github/UserExample.java, line 17, in ExampleController',false),
(1,'Warning','Create','Desenvolvimento','01-02-2019','File src/entry/Example.java, line 124, in ExampleController',false),
(1,'Info','Update','Desenvolvimento','01-02-2019','File src/example/Example.java, line 5465, in ExampleController',false),
(1,'Error','Update','Produção','19-04-2019','File user/github/Example.java, line 7, in ExampleController',false),
(1,'Info','Delete','Produção','30-06-2019','File src/acc/Example.java, line 11, in ExampleController',false),
(1,'Warning','Create','Homologação','29-05-2019','File src/company/Example.java, line 345, in ExampleController',false),
(1,'Warning','Create','Homologação','10-05-2019','File src/person/Example.java, line 13, in ExampleController',false),

(2,'Error','Delete','Produção','20-03-2019','File personal/user/Example.java, line 120, in ExampleController',false),
(2,'Info','Update','Homologação','13-05-2019','File src/console/Example.java, line 10, in ExampleController',false),
(2,'Info','Create','Desenvolvimento','13-10-2019','File src/ex/Example1.java, line 123, in ExampleController',false),
(2,'Warning','Read','Desenvolvimento','12-05-2019','File src/ex/Example.java, line 467, in ExampleController',false),
(2,'Warning','Read','Desenvolvimento','12-05-2019','File src/user/Example.java, line 7867, in ExampleController',false),
(2,'Info','Delete','Desenvolvimento','01-02-2019','File src/source/Example2.java, line 23524, in ExampleController',false),

(3,'Info','Delete','Homologação','21-04-2019','File src/entry/Example.java, line 1, in ExampleController',false),
(3,'Warning','Update','Desenvolvimento','11-10-2019','File src/layout/Example.java, line 2, in ExampleController',false),
(3,'Error','Update','Homologação','23-12-2019','File src/java/Example.java, line 3, in ExampleController',false),
(3,'Error','Read','Produção','21-06-2019','File src/github/Example.java, line 4, in ExampleController',false),
(3,'Warning','Create','Desenvolvimento','06-11-2019','File src/start/Example.java, line 5, in ExampleController',false),
(3,'Info','Update','Desenvolvimento','07-11-2019','File src/python/Example.py, line 6, in ExampleController',false),

(4,'Warning','Update','Produção','20-12-2019','File src/python/Example.py, line 234, in ExampleController',false),
(4,'Info','Create','Homologação','04-04-2019','File src/console/Example.java, line 8762, in ExampleController',false),
(4,'Info','Create','Produção','24-04-2019','File src/example/Example.java, line 44, in ExampleController',false),
(4,'Info','Create','Homologação','14-04-2019','File server/github/Example.java, line 4350, in ExampleController',false),
(4,'Warning','Create','Homologação','08-08-2019','File terminal/github/Example.java, line 1120, in ExampleController',false),
(4,'Info','Delete','Homologação','01-10-2019','File src/console/ExampleJava.java, line 10, in ExampleController',false),

(5,'Error','Read','Produção','27-07-2019','File src/example/ExampleJava.java, line 106, in ExampleController',false),
(5,'Error','Read','Homologação','26-01-2019','File src/example/ExampleJava.java, line 170, in ExampleController',false),
(5,'Error','Delete','Produção','14-02-2019','File src/example/ExampleJava.java, line 108, in ExampleController',false),
(5,'Warning','Update','Produção','11-08-2019','File src/console/ExampleJava.java, line 107, in ExampleController',false),
(5,'Warning','Update','Desenvolvimento','16-07-2019','File src/game/ExampleJava.java, line 110, in ExampleController',false),
(5,'Error','Delete','Produção','27-09-2019','File src/example/ExampleJava.java, line 110, in ExampleController',false),

(6,'Info','Delete','Homologação','05-01-2019','File src/example/ExampleJava.java, line 10, in ExampleController',false),
(6,'Info','Delete','Homologação','04-03-2019','File src/example/ExampleJava.java, line 101, in ExampleController',false),
(6,'Info','Create','Desenvolvimento','30-10-2019','File src/example/ExampleJava.java, line 103, in ExampleController',false),
(6,'Info','Read','Desenvolvimento','31-07-2019','File src/example/ExampleJava.java, line 102, in ExampleController',false),
(6,'Warning','Read','Homologação','08-12-2019','File src/type/ExampleJava.java, line 101, in ExampleController',false),
(6,'Warning','Create','Produção','11-06-2019','File src/print/ExampleJava.java, line 140, in ExampleController',false),
(6,'Warning','Create','Desenvolvimento','10-11-2019','File src/find/ExampleJava.java, line 410, in ExampleController',false),
(6,'Warning','Read','Desenvolvimento','31-01-2019','File src/java/ExampleJava.java, line 1650, in ExampleController',false),

(7,'Error','Delete','Desenvolvimento','14-03-2019','File src/example/ExampleJava.java, line 10, in ExampleController',false),
(7,'Error','Delete','Desenvolvimento','14-03-2019','File src/details/ExampleJava.java, line 310, in ExampleController',false),
(7,'Error','Delete','Desenvolvimento','14-03-2019','File src/example/ExampleJava.java, line 560, in ExampleController',false),
(7,'Error','Update','Produção','15-03-2019','File src/example/ExampleJava.java, line 78, in ExampleController',false),
(7,'Info','Create','Homologação','20-05-2019','File src/example/ExampleJava.java, line 19, in ExampleController',false),
(7,'Info','Read','Produção','22-10-2019','File src/example/ExamplePytohn.py, line 100, in ExampleController',false),
(7,'Warning','Update','Homologação','21-10-2019','File src/example/ExamplePython.py, line 810, in ExampleController',false),
(7,'Info','Read','Homologação','17-05-2019','File src/service/ExampleJava.java, line 173, in ExampleService',false),
(7,'Info','Read','Desenvolvimento','30-11-2019','File src/example/ExampleJava.java, line 854, in ExampleController',false);
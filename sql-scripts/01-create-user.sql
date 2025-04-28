-- Drop user first if they exist
DROP USER if exists 'hbstudent'@'%' ;

-- Now create user with prop privileges
CREATE USER 'hbstudent'@'%' IDENTIFIED BY 'hbstudent';

GRANT ALL PRIVILEGES ON * . * TO 'hbstudent'@'%';
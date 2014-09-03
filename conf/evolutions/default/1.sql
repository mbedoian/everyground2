# --- First database schema

# --- !Ups

CREATE TABLE member (
  member_id INT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  invitation_id INT(20) UNSIGNED,
  email VARCHAR(255),
  password VARCHAR(255),
  salt VARCHAR(255),
  status ENUM('INVITED', 'ACTIVE', 'BANNED', 'INACTIVE'),
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  display_name VARCHAR(50),
  creation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP ,
  modified_date TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (member_id)
);

# --- !Downs

DROP TABLE IF EXISTS member;
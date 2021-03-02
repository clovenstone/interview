-- drop table interview.reviews;

-- create table interview.reviews(
--     id int not null primary key,
--     place varchar(255) not null,
--     review varchar(255) not null
-- );

-- insert into interview.reviews values (1,'Moon bucks', 'Good');
-- insert into interview.reviews values (2,'Moon bucks', 'Bad');
-- insert into interview.reviews values (3,'Stone cafe', 'Good');
-- insert into interview.reviews values (4,'Stone cafe', 'Good');
-- insert into interview.reviews values (5,'Stone cafe', 'Good');
-- insert into interview.reviews values (6,'Cafe corner', 'Good');
-- insert into interview.reviews values (7,'Cafe corner', 'Bad');
-- insert into interview.reviews values (8,'Cafe worst', 'Bad');
-- insert into interview.reviews values (9,'Moon bucks', 'Good');

select * from interview.reviews;

select count(*) from INTERVIEW.reviews group by REVIEW having REVIEW ='Good';

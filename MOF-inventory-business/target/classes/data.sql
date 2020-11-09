insert into todo(id,username,description,target_date,is_done) values(1001,'in28minutes','Learn Spring Boot',sysdate(),false);

insert into todo(id,username,description,target_date,is_done) values(1002,'in28minutes','Learn Spring Boot2',sysdate(),false);

insert into todo(id,username,description,target_date,is_done) values(1003,'in28minutes','Learn Spring Boot3',sysdate(),false);

insert into todo(id,username,description,target_date,is_done) values(1004,'in28minutes','Learn Spring Boot4',sysdate(),false);

insert into todo(id,username,description,target_date,is_done) values(1005,'in28minutes','Learn Spring Boot5',sysdate(),false);

insert into todo(id,username,description,target_date,is_done) values(11001,'dinesh','zLearn Spring Boot D',sysdate(),false);

insert into todo(id,username,description,target_date,is_done) values(11002,'dinesh','yLearn Spring Boot2 D',sysdate(),false);

insert into todo(id,username,description,target_date,is_done) values(11003,'dinesh','bLearn Spring Boot3 D',sysdate(),false);

insert into todo(id,username,description,target_date,is_done) values(11004,'dinesh','aLearn Spring Boot4 D',sysdate(),false);

insert into todo(id,username,description,target_date,is_done) values(11005,'dinesh','bLearn Spring Boot5 D',sysdate(),false);

insert into todo(id,username,description,target_date,is_done) values(11006,'dinesh','dLearn Spring Boot D',sysdate(),false);

insert into todo(id,username,description,target_date,is_done) values(11007,'dinesh',' cLearn Spring Boot2 D',sysdate(),false);

insert into todo(id,username,description,target_date,is_done) values(11008,'dinesh','Learn Spring Boot3 D',sysdate(),false);

insert into todo(id,username,description,target_date,is_done) values(11009,'dinesh','Learn Spring Boot4 D',sysdate(),false);

insert into todo(id,username,description,target_date,is_done) values(11010,'dinesh','Learn Spring Boot5 D',sysdate(),false);


insert into USER_TYPE  values(1,'S');
insert into USER_TYPE  values(2,'C');

insert into user_account(id,username,password) values(1001, 'in28minutes','$2a$10$3zHzb.Npv1hfZbLEU5qsdOju/tk2je6W6PnNnY.c1ujWPcZh4PL6e');
insert into user_account(id,username,password) values(2001, 'dinesh','$2a$10$fRWDhDcMIXuDe5m/WijDrOn5QPwVZQQuol6XKAkS.cgVLtOYGD5ra');

insert into BUSINESS_STREAM(id,business_stream_name) values (1001,'Software');
insert into BUSINESS_STREAM(id,business_stream_name) values (1002,'Accounts');


insert into COMPANY(ID,COMPANY_NAME,COMPANY_WEBSITE_URL,ESTABLISHMENT_DATE,PROFILE_DESCRIPTION,BUSINESS_STREAM_ID)
VALUES(9001,'Google','www.google.com','2020-09-09','Software ',1001);

insert into COMPANY(ID,COMPANY_NAME,COMPANY_WEBSITE_URL,ESTABLISHMENT_DATE,PROFILE_DESCRIPTION,BUSINESS_STREAM_ID)
VALUES(9002,'Yahoo','www.google.com','2020-09-09','Software ',1001);


insert into job_type(id,job_type) values(401,'IT Software');
insert into job_type(id,job_type) values(402,'Accounts');

insert into JOB_LOCATION(ID,CITY ,COUNTRY ,STATE ,STREET_ADDRESS ,ZIP  ) 
values (501,'Delhi','India','Delhi','12-A','110092') ; 
insert into JOB_LOCATION(ID,CITY ,COUNTRY ,STATE ,STREET_ADDRESS ,ZIP  ) 
values (502,'Delhi','India','Delhi','12-A','110092') ; 

insert into job_post(ID,CREATED_DATE ,IS_ACTIVE  ,IS_COMPANY_NAME_HIDDEN,JOB_DESCRIPTION ,COMPANY_ID ,JOB_LOCATION_ID,JOB_TYPE_ID,POSTED_BY_ID) 
values (5001,now(),'Y','N','Java Developer details',9001,501,401,1001);

insert into job_post(ID,CREATED_DATE ,IS_ACTIVE  ,IS_COMPANY_NAME_HIDDEN,JOB_DESCRIPTION ,COMPANY_ID ,JOB_LOCATION_ID,JOB_TYPE_ID,POSTED_BY_ID) 
values (5002,now(),'Y','N','Microservices Development',9002,502,401,1001);





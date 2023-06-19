CREATE TABLE [IF NOT EXISTS] "users"(  
    id BIGINT NOT NULL,  
    first_name varchar(15) NOT NULL,  
    last_name varchar(15) NOT NULL,
    email_address varchar(50) NOT NULL,
    created_at varchar(20) NOT NULL,
    deleted_at varchar(20) NOT NULL,
    merged_at varchar(20) NOT NULL,
    parent_user_id int NOT NULL,  
    PRIMARY KEY (id)  
);  
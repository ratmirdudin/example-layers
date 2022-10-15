-- Creating table app_user
CREATE TABLE IF NOT EXISTS app_user
(
    app_user_id        BIGSERIAL   NOT NULL,
    app_user_username  varchar(50) NOT NULL,
    app_user_firstname varchar(50),
    app_user_lastname  varchar(50),
    app_user_status    varchar(7) default 'Offline',
    PRIMARY KEY (app_user_id),
    CONSTRAINT unique_app_user_username UNIQUE (app_user_username)
);
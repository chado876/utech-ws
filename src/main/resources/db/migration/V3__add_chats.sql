CREATE TABLE chat
(
    id UUID NOT NULL,
    user_telegram_id VARCHAR(50),
    date_created TIMESTAMP,
    PRIMARY KEY (id)
);

CREATE TABLE convo
(
    id UUID NOT NULL,
    user_message VARCHAR(100000),
    bot_message VARCHAR(100000),
    date_created TIMESTAMP,
    chat_id VARCHAR(1000),
    PRIMARY KEY (id)
);

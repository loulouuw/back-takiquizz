CREATE TABLE players
(
    id SERIAL PRIMARY KEY,
    username TEXT NOT NULL,
    email TEXT NOT NULL,
    mdp TEXT NOT NULL,
    total_points INT NOT NULL
);

CREATE TABLE quizzes
(
    id SERIAL PRIMARY KEY,
    title TEXT NOT NULL,
    description TEXT NOT NULL,
    time_limit_per_question INT NOT NULL
);

CREATE TABLE questions
(
    id SERIAL PRIMARY KEY,
    statement TEXT NOT NULL,
    correct_answer TEXT NOT NULL,
    question_type TEXT NOT NULL,
    image TEXT,
    time_limit INT NOT NULL,
    quiz_id SERIAL REFERENCES quizzes(id)
);

CREATE TABLE game_sessions
(
    id SERIAL PRIMARY KEY,
    quiz_id SERIAL REFERENCES quizzes(id),
    current_question_index INT NOT NULL,
    start_time TIMESTAMP NOT NULL,
    end_time TIMESTAMP,
    score1 INT,
    score2 INT,
    player_id1 INT,
    player_id2 INT
);

CREATE TABLE game_sessions_players
(
    game_session_id SERIAL REFERENCES game_sessions(id),
    players_id SERIAL REFERENCES players(id),
    PRIMARY KEY (game_session_id, players_id)
);


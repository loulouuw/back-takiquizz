INSERT INTO players (id, username, email, mdp, total_points) VALUES (1, 'player1', 'player1@example.com','mdp1', 1200);
INSERT INTO players (id, username, email, mdp,total_points) VALUES (2, 'player2', 'player2@example.com', 'mdp2',1500);
INSERT INTO players (id, username, email, mdp,total_points) VALUES (3, 'player3', 'player3@example.com', 'mdp3',1000);
INSERT INTO players (id, username, email, mdp,total_points) VALUES (4, 'player4', 'player4@example.com', 'mdp4',1300);

INSERT INTO quizzes (id, title, description, time_limit_per_question) VALUES (1, 'General Knowledge', 'A quiz to test your general knowledge', 30);
INSERT INTO quizzes (id, title, description, time_limit_per_question) VALUES (2, 'Science Trivia', 'How well do you know science?', 45);

INSERT INTO questions (id, statement, correct_answer, question_type, image, time_limit, quiz_id)
VALUES (1, 'What is the capital of France?', 'Paris', 'multiple_choice', NULL, 30, 1);
INSERT INTO questions (id, statement, correct_answer, question_type, image, time_limit, quiz_id)
VALUES (2, 'Who developed the theory of relativity?', 'Albert Einstein', 'multiple_choice', NULL, 45, 2);
INSERT INTO questions (id, statement, correct_answer, question_type, image, time_limit, quiz_id)
VALUES (3, 'Which planet is known as the Red Planet?', 'Mars', 'multiple_choice', NULL, 30, 1);
INSERT INTO questions (id, statement, correct_answer, question_type, image, time_limit, quiz_id)
VALUES (4, 'What is the chemical symbol for water?', 'H2O', 'multiple_choice', NULL, 45, 2);


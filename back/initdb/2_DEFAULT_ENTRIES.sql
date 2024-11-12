-- Insertion des joueurs
INSERT INTO players (id, username, email, mdp, total_points) VALUES (1, 'player1', 'player1@example.com','mdp1', 1200);
INSERT INTO players (id, username, email, mdp,total_points) VALUES (2, 'player2', 'player2@example.com', 'mdp2',1500);
INSERT INTO players (id, username, email, mdp,total_points) VALUES (3, 'player3', 'player3@example.com', 'mdp3',1000);
INSERT INTO players (id, username, email, mdp,total_points) VALUES (4, 'player4', 'player4@example.com', 'mdp4',1300);

-- Insertion des quizzes
INSERT INTO quizzes (id, title, description, time_limit_per_question) VALUES (1, 'General Knowledge', 'A quiz to test your general knowledge', 30);
INSERT INTO quizzes (id, title, description, time_limit_per_question) VALUES (2, 'Science Trivia', 'How well do you know science?', 45);

-- Insertion des questions
INSERT INTO questions (id, statement, correct_answer, question_type, image, time_limit, quiz_id)
VALUES
    (1, 'What is the capital of France?', 'Paris', 'multiple_choice', NULL, 30, 1),
    (2, 'Who developed the theory of relativity?', 'Albert Einstein', 'multiple_choice', NULL, 45, 2),
    (3, 'Which planet is known as the Red Planet?', 'Mars', 'multiple_choice', NULL, 30, 1),
    (4, 'What is the chemical symbol for water?', 'H2O', 'multiple_choice', NULL, 45, 2);

-- Insertion des mauvaises réponses
-- Pour la question 1
INSERT INTO question_incorrect_answers (question_id, incorrect_answer) VALUES (1, 'London');
INSERT INTO question_incorrect_answers (question_id, incorrect_answer) VALUES (1, 'Berlin');
INSERT INTO question_incorrect_answers (question_id, incorrect_answer) VALUES (1, 'Madrid');

-- Pour la question 2
INSERT INTO question_incorrect_answers (question_id, incorrect_answer) VALUES (2, 'Isaac Newton');
INSERT INTO question_incorrect_answers (question_id, incorrect_answer) VALUES (2, 'Galileo Galilei');
INSERT INTO question_incorrect_answers (question_id, incorrect_answer) VALUES (2, 'Nikola Tesla');

-- Pour la question 3
INSERT INTO question_incorrect_answers (question_id, incorrect_answer) VALUES (3, 'Earth');
INSERT INTO question_incorrect_answers (question_id, incorrect_answer) VALUES (3, 'Jupiter');
INSERT INTO question_incorrect_answers (question_id, incorrect_answer) VALUES (3, 'Venus');

-- Pour la question 4
INSERT INTO question_incorrect_answers (question_id, incorrect_answer) VALUES (4, 'O2');
INSERT INTO question_incorrect_answers (question_id, incorrect_answer) VALUES (4, 'CO2');
INSERT INTO question_incorrect_answers (question_id, incorrect_answer) VALUES (4, 'H2');

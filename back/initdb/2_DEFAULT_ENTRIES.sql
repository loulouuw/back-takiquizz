-- Insertion des joueurs
INSERT INTO players (username, email, mdp, total_points) VALUES
                                                             ('player1', 'player1@example.com', 'mdp1', 1200),
                                                             ('player2', 'player2@example.com', 'mdp2', 1500),
                                                             ('player3', 'player3@egitxample.com', 'mdp3', 1000),
                                                             ('player4', 'player4@example.com', 'mdp4', 1300);

-- Insertion des quizzes
INSERT INTO quizzes (title, description, time_limit_per_question) VALUES ( 'General Knowledge', 'A quiz to test your general knowledge', 30);
INSERT INTO quizzes (title, description, time_limit_per_question) VALUES ( 'Science Trivia', 'How well do you know science?', 45);

-- Insertion des questions
INSERT INTO questions (statement, correct_answer, incorrect_answers, question_type, image, time_limit, quiz_id) VALUES
( 'What is the capital of France?', 'Paris', 'London,Berlin,Madrid', 'multiple_choice', NULL, 30, 1),
( 'Who developed the theory of relativity?', 'Albert Einstein', 'Isaac Newton,Galileo Galilei,Nikola Tesla', 'multiple_choice', NULL, 45, 2),
( 'Which planet is known as the Red Planet?', 'Mars', 'Earth,Jupiter,Venus', 'multiple_choice', NULL, 30, 1),
( 'What is the chemical symbol for water?', 'H2O', 'O2,CO2,H2', 'multiple_choice', NULL, 45, 2);
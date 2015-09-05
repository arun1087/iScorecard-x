CREATE TABLE BATTING_STATS (
ID VARCHAR(255) NOT NULL,
BATTING_POSITION INT(12) NOT NULL,
DID_NOT_BAT VARCHAR(16) NOT NULL DEFAULT 'TRUE',
BALLS_FACED INT(12) NOT NULL DEFAULT 0,
RUNS_SCORED INT(12) NOT NULL DEFAULT 0,
FOURS INT(12) NOT NULL DEFAULT 0,
SIXES INT(12) NOT NULL DEFAULT 0,
PRIMARY KEY(ID));

CREATE TABLE BOWLING_STATS (
ID VARCHAR(255) NOT NULL,
BOWLING_POSITION INT(12) NOT NULL,
DID_NOT_BOWL VARCHAR(16) NOT NULL DEFAULT 'TRUE',
OVERS_BOWLED INT(12) NOT NULL DEFAULT 0,
BALLS_BOWLED_BEFORE_COMPLETING_OVER INT(12) NOT NULL DEFAULT 0,
MAIDENS INT(12) NOT NULL DEFAULT 0,
RUNS_CONCEDED INT(12) NOT NULL DEFAULT 0,
WICKETS_TAKEN INT(12) NOT NULL DEFAULT 0,
PRIMARY KEY(ID));

CREATE TABLE PLAYER_STATS(
ID VARCHAR(255) NOT NULL DEFAULT '',
BATTING_STATS_ID VARCHAR(255) NOT NULL,
BOWLING_STATS_ID VARCHAR(255) NOT NULL,
PRIMARY KEY(ID),
FOREIGN KEY (BATTING_STATS_ID) REFERENCES BATTING_STATS(ID),
FOREIGN KEY (BOWLING_STATS_ID) REFERENCES BOWLING_STATS(ID));
                             
CREATE TABLE PLAYER(
ID VARCHAR(255) NOT NULL,
PLAYER_STATS_ID VARCHAR(255) NOT NULL,
PRIMARY KEY(ID),
FOREIGN KEY(PLAYER_STATS_ID) REFERENCES PLAYER_STATS (ID));
                             
CREATE TABLE TEAM(
ID VARCHAR(255) NOT NULL,
PLAYER_ID VARCHAR(255) NOT NULL,
PRIMARY KEY(ID),
FOREIGN KEY(PLAYER_ID) REFERENCES PLAYER(ID));


CREATE TABLE GAME (
ID VARCHAR(255)NOT NULL,
HOME_TEAM_ID VARCHAR(255) NOT NULL,
AWAY_TEAM_ID VARCHAR(255) NOT NULL,
PRIMARY KEY (ID),
FOREIGN KEY (HOME_TEAM_ID) REFERENCES TEAM(ID),
FOREIGN KEY (AWAY_TEAM_ID) REFERENCES TEAM(ID));
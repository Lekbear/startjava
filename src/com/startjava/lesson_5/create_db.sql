DROP DATABASE IF EXISTS jaegers;

CREATE DATABASE jaegers;

\connect jaegers ;

DROP TABLE IF EXISTS jaegers;

CREATE TABLE jaegers (
    id        SERIAL PRIMARY KEY,
    modelName TEXT,
    mark      TEXT,
    height    INTEGER,
    weight    INTEGER,
    status    TEXT,
    origin    TEXT,
    launch    INTEGER,
    kaijuKill INTEGER
);

\ir 'init_db.sql'
\ir 'queries.sql'
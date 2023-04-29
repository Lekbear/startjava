\echo 'print the whole table'
SELECT *
  FROM jaegers;

\echo 'display only non-destroyed robots'
SELECT *
  FROM jaegers
 WHERE status != 'Destroyed';

\echo 'display robots of several series: Mark-1 and Mark-4'
SELECT *
  FROM jaegers
 WHERE mark IN ('Mark-1', 'Mark-4');

\echo 'display all robots except Mark-1 and Mark-4'
SELECT *
  FROM jaegers
 WHERE mark NOT IN ('Mark-1', 'Mark-4');

\echo 'sort table in descending order by column mark'
SELECT *
  FROM jaegers
 ORDER BY mark DESC;

\echo 'display information about the oldest robot'
SELECT *
  FROM jaegers
 ORDER BY launch
 LIMIT 1;

\echo 'display the robots that have destroyed the most kaiju'
SELECT *
  FROM jaegers
 WHERE kaijukill =
       (SELECT MAX(kaijuKill)
          FROM jaegers);

\echo 'display average weight of robots'
SELECT AVG(weight)
  FROM jaegers;

\echo 'increase by one the number of kaiju destroyed by robots that have not yet been destroyed'
UPDATE jaegers
   SET kaijukill = kaijukill + 1
 WHERE status != 'Destroyed';

 \echo 'remove destroyed robots'
 DELETE FROM jaegers
       WHERE status = 'Destroyed';
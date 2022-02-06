/*
6
Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION.
 Your result cannot contain duplicates.
*/

SELECT DISTINCT CITY FROM STATION 
WHERE CITY REGEXP '^[aeiou]';


/* 
7
Query the list of CITY names ending with vowels (a, e, i, o, u) from STATION.
 Your result cannot contain duplicates.
*/

SELECT DISTINCT CITY FROM STATION 
WHERE CITY REGEXP '.*[aeiou]$';


/* 
8
Query the list of CITY names from STATION which have vowels
 (i.e., a, e, i, o, and u) as both their first and last characters. 
Your result cannot contain duplicates.
*/

SELECT DISTINCT CITY
FROM STATION
WHERE CITY REGEXP '^[AEIOU].*[aeiou]$';


/*
9
Query the list of CITY names from STATION that do not start with vowels. 
Your result cannot contain duplicates.
*/

SELECT DISTINCT CITY
FROM STATION
WHERE CITY NOT REGEXP '^[AEIOU]';


/*
10
Query the list of CITY names from STATION that do not end with vowels.
 Your result cannot contain duplicates.
*/

SELECT DISTINCT CITY
FROM STATION
WHERE CITY NOT REGEXP '[AEIOU]$';



/*
11
Query the list of CITY names from STATION that either do not start with vowels or do not end with vowels.
 Your result cannot contain duplicates.
*/

SELECT DISTINCT CITY FROM station
WHERE left(city,1) not in('a','e','i','o','u')
OR right(city,1) not in('a','e','i','o','u');


/*
12
Query the list of CITY names from STATION that do not start with vowels and do not end with vowels.
 Your result cannot contain duplicates.
*/

SELECT DISTINCT CITY FROM station
WHERE left(city,1) not in('a','e','i','o','u')
AND right(city,1) not in('a','e','i','o','u');
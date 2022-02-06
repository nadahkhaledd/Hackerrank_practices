/*
18
Consider  and  to be two points on a 2D plane.
 a  -> minimum(LAT_N in STATION).
 b  ->  minimum (LONG_W in STATION).
 c  ->  maximum(LAT_N in STATION).
 d  -> maximum (LONG_W in STATION).
Query the Manhattan Distance between points  and  and round it to a scale of 4 decimal places.
*/
SELECT ROUND(ABS(MIN(LAT_N)-MAX(LAT_N)) + ABS(MIN(LONG_W)-MAX(LONG_W)), 4) FROM STATION;


/*
19
Query the Euclidean Distance between points p1 and p2 and format your answer to display 4 decimal digits.
*/
SELECT ROUND(SQRT(POW(MIN(LAT_N)-MAX(LAT_N), 2) + POW(MIN(LONG_W)-MAX(LONG_W), 2)), 4) FROM STATION;


/*
20
A median is defined as a number separating the higher half of a data set from the lower half.
 Query the median of the Northern Latitudes (LAT_N) from STATION and round your answer to 4 decimal places.
*/
Select round(S.LAT_N,4) from station AS S where (select count(Lat_N) from station where Lat_N < S.LAT_N ) = (select count(Lat_N) from station where Lat_N > S.LAT_N);
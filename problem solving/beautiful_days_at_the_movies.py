"""
Lily likes to play games with integers.
 She has created a new game where she determines the difference between a number and its reverse.
She decides to apply her game to decision making. She will look at a numbered range of days and will only go to a movie on a beautiful day.

Given a range of numbered days, [i....j] and a number k,
 determine the number of days in the range that are beautiful.
 Beautiful numbers are defined as numbers where |i-reverse(i)| is evenly divisible by k. 
If a day's value is a beautiful number, it is a beautiful day. Return the number of beautiful days in the range.
"""

a, b, k = map(int, input().split())
ans = 0
for i in range(a, b+1):
    ans = ans + abs(not (i - int(str(i)[::-1]))%k)
    
print (ans)


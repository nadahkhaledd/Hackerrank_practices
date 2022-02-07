"""
A person wants to determine the most expensive computer keyboard and USB drive that can be purchased with a give budget.
 Given price lists for keyboards and USB drives and a budget,
 find the cost to buy them. If it is not possible to buy both items, return -1.
"""

import sys

s,n,m = raw_input().strip().split(' ')
s,n,m = [int(s),int(n),int(m)]
keyboards = map(int,raw_input().strip().split(' '))
pendrives = map(int,raw_input().strip().split(' '))
sorted(keyboards)
sorted(pendrives)
max = -1
for i in keyboards:
    for j in pendrives:
        sum = i+j
        if sum<=s:
            if sum>max:
                max = sum
print max

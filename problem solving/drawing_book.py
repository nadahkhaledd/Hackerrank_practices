"""
A teacher asks the class to open their books to a page number.
 A student can either start turning pages from the front of the book or from the back of the book. 
They always turn pages one at a time. When they open the book, page  is always on the right side.
Each page except the last page will always be printed on both sides.
 The last page may only be printed on the front, given the length of the book.
 If the book is n pages long, and a student wants to turn to page p, 
what is the minimum number of pages to turn? They can start at the beginning or the end of the book.
"""

#!/bin/python3

import math
import sys

def pageCount(n, p):
    return min(p//2,n//2-(p//2))
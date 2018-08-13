# -*- coding: utf-8 -*-
import sys

def doubleit(x):
    # If you feed this a string, x * 2 will just concatonate 2 of the string
    # together, not raising the error, so we have to check it manually.
    if not isinstance(x, (int, float)):
        raise TypeError
    var = x * 2
    return var

def addword(y):
    z = "Adding a number to a string doesn't work" + y

def doublelines(filename):
    with open(filename) as fh:
        newlist = [ str(doubleit(int(val))) for val in fh ]
    with open(filename, 'w') as fh:
        fh.write('\n'.join(newlist))

if __name__ == '__main__':
    input_val = sys.argv[1]
    doubled_val = doubleit(input_val)
    print('The value of {0} is {1}'.format(input_val, doubled_val))

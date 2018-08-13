# -*- coding: utf-8 -*-
"""Section 6 - Exceptions"""
#%%
"""Trapping And Raising Exceptions"""

# Running this program without the exception handler tells you the typical
# error is a "KeyError." We then create an exception handler to handle that
# type of error.

mydict = {'a':1, 'b':2, 'c':3, 'd':4}

key = input('Please input a key: ')

try:
    print('Testing for error...')
    print('The Value for {0} is {1}'.format(key, mydict[key]))
    print('Everything is good!')

except KeyError:
    print('Trapped error!')
    print('The key ' + key + ' does not exist.')
    print('Program continues despite error...')
#%%
    
# This example doesn't work in Spyder for some reason, but the point was
# just to show that you can handle two error types / exceptions at once    
    
import sys

try:
    arg = sys.argv[1] # look for an argument
    num = int(arg)    # convert argument to integer (to check if its an int)

except(IndexError, ValueError):
    exit('Please enter an integer on the command line!')

print('Thanks for the integer!')
#%%
def make_delim_line(list_to_join, delim):
    
    try:
        formatted_line = delim.join(list_to_join)
    
    except TypeError:
        raise TypeError('make_delim_line(): arg 1 must be a list or tuple')
        # "raise" makes the error more descriptive / helpful
    
    return formatted_line

fline = make_delim_line(100, ',')
#%%
mydict = {'a':1, 'b':2}

try:
    print(5/0)

except ZeroDivisionError as e:
    # print(e.message)
    # looks like exception "messages" are deprecated in Python 3?
    print(e.args)
#%%
"""Custom Exceptions"""

class MyError(Exception):
    def __init__(self, *args): # *args = can handle any # of exceptions or none
        print('Calling init!')
        if args:
            self.message = args[0] # use the first arg as new error msg
        else:
            self.message = ''
        
    def __str__(self):
        print('Calling str!')
        if self.message:
            return "Here's a MyError exception with a message: {0}".format(self.message)
        else:
            return "Here's a MyError exception!"

# raise MyError

raise MyError('Houston, we have a problem!')
#%%
"""Assignment 4"""

import os

class ConfigKeyError(Exception):
    def __init__(self, this, key):
        self.key = key # key that was requested, but not found
        self.keys = this.keys() # all keys in the ConfigDict object
    def __str__(self):
        return 'Key "{0}" not found. Available keys: ({1})'.format(self.key, ', '.join(self.keys))

class ConfigDict(dict):
    
    def __init__(self, filename):
        
        self._filename = filename # private variable
        
        if not os.path.isfile(self._filename): # if file doesn't exist
            try:
                open(self._filename, 'w').close()
            except IOError:
                raise IOError('Arg to ConfigDict must be a valid pathname!')
                
        with open(self._filename) as fh:
        # with block so it auto closes / cleans up after itself
            for line in fh:
                line = line.rstrip()
                # strips any white space from end of each line
                key, value = line.split('=', 1)
                # argument is in case value contains an =
                # want it to parse after the first =
                dict.__setitem__(self, key, value)
                # has to be dict. otherwise would create recursive loop
                # __setitem__ would repeatedly call itself
                # sets each line in our instance
    
    def __getitem__(self, key):
        if not key in self:
            raise ConfigKeyError(self, key)
        return dict.__getitem__(self, key)
    
    def __setitem__(self, key, value):
        
        dict.__setitem__(self, key, value)
        # again, calling dict's set item to avoid recursive loop
        with open(self._filename, 'w') as fh:
            # open file and write new values to it
            for key, val in self.items():
                fh.write('{0}={1}\n'.format(key, val))

# cc = ConfigDict('help\config.txt') # not a valid path, triggers IOError

cc = ConfigDict('config.txt')

cc.__getitem__('x') # key not in dictionary, triggers error we created







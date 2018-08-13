# -*- coding: utf-8 -*-
"""Section 8 - Efficiency & Testing"""
#%%
"""Python Debugger"""
#%%
import pdb

values = [1,2,3,4,5,6,7,8,9,10]

for val in values:
    mysum = 0 # the problem (obviously)
    mysum = mysum + val
    pdb.set_trace() # pauses after each part of the loop
    # allows you to inspect variables, see what's going wrong

print(mysum)

# typing variable names shows their current state
# typing "n" during PDB moves to next execution (within main program context)
# typing "s" enters function for detailed look
# l = list (list next step)
# h = help
# q = quit
#%%
""""Logging"""
#%%
import logging

logging.basicConfig(level=logging.INFO,
                    format='%(asctime)s  %(levelname)s:%(message)',
                    filename='example.log')
# Export file and time format won't work here because I'm using an "IPython"
# console that already has logging handlers built in..

logging.debug('This message will be ignored.')
# Will not log this unless you change the logging level

logging.info('This should be logged.')
logging.warning('And this, too.')
#%%
"""Benchmarking - The TimeIt Module"""
#%%
import timeit

print('by index:  ',
      timeit.timeit(stmt="mydict['c']",
                    setup="mydict = {'a':5, 'b':6, 'c':7}",
                    number=1000000)
      )

print('by get:    ',
      timeit.timeit(stmt="mydict.get('c')",
                    setup="mydict = {'a':5, 'b':6, 'c':7}",
                    number=1000000)
      )
#%%
import timeit

def testme(this_dict, key):
    return this_dict[key]
      
print(timeit.timeit("testme(mydict, key)",
                    setup="from __main__ import testme; mydict = {'a':5, 'b':6, 'c':7}; key='c'",
                    number=10000)
      )
# time test for a function
#%%
"""Pytest Module"""
#%%
## In a file called myprogram.py
#import sys
#
#def doubleit(x):
#    var = x * 2
#    return var
#
#if __name__ == '__main__': # If myprogram.py is imported, rather than executed
## directly, do not run this code. Useful for testing.
#    input_val = sys.argv[1]
#    doubled_val = doubleit(input_val)
#    print('The value of {0} is {1}'.format(input_val, doubled_val))

import myprogram
import pytest

def test_doubleit():
    assert myprogram.doubleit(10) == 20
    a = myprogram.doubleit(10)
    print("Double it = " + str(a))
    
def test_doubleit_type():
    with pytest.raises(TypeError): # asserting a raised error, basically
        myprogram.doubleit('hello')
    print("Looking for an int, not a string!")

def test_addword_type():
    with pytest.raises(TypeError): # asserting a raised error, basically
        myprogram.addword(50)
    print("Can't add a number to a string! Type Error!")

test_doubleit()
test_doubleit_type()
test_addword_type()
#%%
import os
import shutil
import myprogram

class TestDoubleIt(object):
    
    file_template = 'testnums_template.txt'
    file_tester = 'testnums.txt'
    
    def setup_class(self):
        shutil.copy(TestDoubleIt.file_template, TestDoubleIt.file_tester)
        print("Copying template file to test file.")
        
    def teardown_class(self):
        os.remove(TestDoubleIt.file_tester)
        print("Removing test file.")
    
    def test_doublelines(self):
        myprogram.doublelines(TestDoubleIt.file_tester)
        old_vals = [ int(line) for line in open (TestDoubleIt.file_template) ]
        new_vals = [ int(line) for line in open (TestDoubleIt.file_tester) ]
        for old_val, new_val in zip(old_vals, new_vals):
            assert int(new_val) == int(old_val) * 2
        print("Test complete!")

a = TestDoubleIt()

a.setup_class()
a.test_doublelines()
a.teardown_class()




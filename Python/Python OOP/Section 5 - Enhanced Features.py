# -*- coding: utf-8 -*-
"""Section 5 - Enhanced Features"""
#%%
"""Implementing Core Syntax"""
class SumList(object):
    
    def __init__(self, this_list):
        
        self.mylist = this_list
    
    def __add__(self, other): # Python's "magic method" for the add (+) operator
        
        new_list = [ x + y for x, y in zip(self.mylist, other.mylist) ]
        
        # following 4 lines do the same as line above
        # new_list = []
        # zipped_list = zip(self.mylist, other.mylist)
        # for tup in zipped_list:
        #     new_list.append(tup[0] + tup[1])
        
        return SumList(new_list)
    
    def __repr__(self): # Python's "magic method" for print command
        
        return str(self.mylist) # Converts the list to a string

cc = SumList([1,2,3,4,5])
dd = SumList([100,200,300,400,500])

ee = cc + dd # cc.__add__(dd)
print(ee) # Would normally just print "this is a SumList object" without adjusted __repr__ method
#%%
"""Subclassing built-ins"""
class MyList(list):
    # MyList inherits from "list" object but indexes from 1 instead of 0!
    def __getitem__(self, index):
        if index == 0: raise IndexError
        if index > 0: index = index - 1
        return list.__getitem__(self, index) # This method is called when we access
                                             # a value with subscript (x[1] etc.)
    def __setitem__(self, index, value):
        if index == 0: raise IndexError
        if index > 0: index = index - 1
        list.__selfitem__(self, index, value)

x = MyList(['a', 'b', 'c']) # __init__() inherited from builtin list

x.append('spam') # append() inherited from builtin list

print(x) # __repr__ inherited from builtin list

print(x[1]) # 'a' (MyList.__getitem__ customizes superclass method)
            # Asking to print index 1 but shows variable in index 0
print(x[4]) # 'spam' Asking to print index 4 (which doesn't exist) but shows variable in index 3
#%%
"""Attribute Encapsulation"""
class GetSet(object):
    
    def __init__(self,value):
        self.attrval = value
    
    @property
    def var(self):
        print('getting the "var" attribute')
        return self.attrval
    
    @var.setter
    def var(self, value):
        print('setting the "var" attribute')
        self.attrval = value
        
    @var.deleter
    def var(self):
        print('deleting the "var" attribute')
        self.attrval = None

me = GetSet(5)
me.var = 1000

print(me.var)
del me.var
print(me.var)
#%%
"""Private Variable Names"""
class GetSet(object):
    
    instance_count = 0
    
    __mangled_name = 'no privacy!'
    
    def __init__(self,value):
        self._attrval = value
        GetSet.instance_count += 1
    
    @property
    def var(self):
        print('getting the "var" attribute')
        return self._attrval
    
    @var.setter
    def var(self, value):
        print('setting the "var" attribute')
        self._attrval = value
        
    @var.deleter
    def var(self):
        print('deleting the "var" attribute')
        self._attrval = None

cc = GetSet(5)
cc.var = 10

print(cc._attrval)
# print(cc.__mangled_name) won't work becase __ made it a private variable
print(cc._GetSet__mangled_name) # this works
#%%
"""With Context"""
class MyClass(object):
    
    def __enter__(self):
        print('we have entered "with"')
        return self
    
    def __exit__(self, type, value, traceback):
        print('error type: {0}'.format(type))
        print('error value: {0}'.format(value))
        print('error traceback: {0}'.format(traceback))
        print('we are leaving "with"')
        #when exiting with block, automatically closes / "cleans up"
    
    def sayhi(self):
        print('hi, instance %s' % (id(self)))

with MyClass() as cc:
    cc.sayhi()
    # 5/0 un-comment to demonstrate the error tracker

print('after the "with" block')
#%%
"""New Style Classes"""
# old style "Classic" class
class OldClass():
    pass

# new style class (the only kind in Python 3)
class NewClass(object):
    pass

oc = OldClass()
nc = NewClass()

print(type(oc)) # hmmm, this works when it's not supposed to
print(type(nc)) # guess this lesson is out of date where it concerns Python 3

print(oc.__class__) # this would be required to show class type of 
                    # old style class in Python 2.X
#%%
"""Assignment 3"""
import os

class ConfigDict(dict):
    
    def __init__(self, filename):
        
        self._filename = filename # private variable
        if os.path.isfile(self._filename): # if file exists
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
    
    def __setitem__(self, key, value):
        
        dict.__setitem__(self, key, value)
        # again, calling dict's set item to avoid recursive loop
        with open(self._filename, 'w') as fh:
            # open file and write new values to it
            for key, val in self.items():
                fh.write('{0}={1}\n'.format(key, val))

cc = ConfigDict('config.txt')

cc['key'] = 'value'
cc['test 1'] = 'value 1'
cc['test 2'] = '==='
#%%










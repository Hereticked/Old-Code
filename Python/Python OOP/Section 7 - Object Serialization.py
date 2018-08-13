# -*- coding: utf-8 -*-
"""Section 7 - Object Serialization"""
#%%
"""Pickle"""
#%%
import pickle

mylist = ['a', 'b', 'c', 'd']

#with open('datafile.txt', 'wb') as fh: # need 'wb' for "write binary"
#    pickle.dump(mylist, fh)

with open('datafile.txt', 'rb') as fh: # need 'rb' for "read binary"
    unpickledlist = pickle.load(fh)
    
print(unpickledlist)
#%%
import pickle

x = pickle.dumps(['a', 'b', 1, 2.5])

var = pickle.loads(x)

print(var)

type(x)
#%%
import pickle

this_int = 555
this_string = 'o hai'
mydict_of_lists = {
        'a': [1, 2, 3],
        'b': [4, 5, 6]
        }
query_results = [('joe', 22, 'clerk'), ('pete', 34, 'janitor')]

with open('datafile.txt', 'wb') as fh:
    pickle.dump((this_int, this_string, mydict_of_lists, query_results), fh)

with open('datafile.txt', 'rb') as fh:
    tup = pickle.load(fh)

print(tup[0])
print(tup[1])
print(tup[2])
print(tup[3])
#%%
import pickle

class MyClass(object):
    
    def __init__(self, init_val):
        self.val = init_val
    
    def increment(self):
        self.val += 1
        
cc = MyClass(5)
cc.increment()
cc.increment()

with open('datafile.txt', 'wb') as fh:
    pickle.dump(cc, fh)
    
with open('datafile.txt', 'rb') as fh:
    unpickled_cc = pickle.load(fh)

print(unpickled_cc)
print(unpickled_cc.val)
#%%
"""JSON"""
#%%
import json

mydict = {'a': [1, 2, 3], 'b': [4, 5, 6], 'c': [7, 8, 9]}

x = json.dumps(mydict)

print(x)

mystruct = json.loads(x)

for key in mystruct:
    print(key)
    for el in mystruct[key]:
        print("   {0}".format(el))
#%%
import json

with open('config.json') as fh:
    conf = json.load(fh)

with open('config.json', 'wb') as fh:
    json.dump(conf, fh, indent=4, separators=(',', ': '))

# This isn't executable (no practice json file)
# This is just to show how to make JSON output readable
#%%
"""YAML"""
#%%
# Couldn't install  -_-
# No biggie, not that different from JSON
# Just some extra little organization features
#%%
"""Assignment 5"""
#%%
import os
import pickle

class ConfigKeyError(Exception):
    
    def __init__(self, this, key):
        self.key = key # key that was requested, but not found
        self.keys = this.keys() # all keys in the ConfigDict object
        
    def __str__(self):
        return 'Key "{0}" not found. Available keys: ({1})'.format(self.key, ', '.join(self.keys))

class ConfigPickleDict(dict):
    
    def __init__(self, picklename):
        
        self._filename = picklename
        
        if not os.path.isfile(self._filename): # if file doesn't exist
            with open(self._filename, 'wb') as fh:
                pickle.dump({}, fh) # create empty pickle file so it has something to read
                
        with open(self._filename, 'rb') as fh:
        # with block so it auto closes / cleans up after itself
            pkl = pickle.load(fh)
            self.update(pkl) # copy loaded pickle to "self"
    
    def __getitem__(self, key):
        
        if not key in self:
            raise ConfigKeyError(self, key)
        return dict.__getitem__(self, key)
    
    def __setitem__(self, key, value):
        
        dict.__setitem__(self, key, value)
        # again, calling dict's set item to avoid recursive loop
        with open(self._filename, 'wb') as fh:
            # open file and write new values to it
            pickle.dump(self, fh)

#cc = ConfigPickleDict('test.pickle')

print(cc)








# -*- coding: utf-8 -*-
"""
Section 3: Classes
"""
#%%
class myClass(object):
    var = 10
    
this_obj = myClass()

print(this_obj)
print(this_obj.var)
#%%
class Joe(object):
    def callme(self):
        print('calling "call me" method with instance: ')
        print(self)

thisjoe = Joe()

thisjoe.callme()

print()
print(thisjoe)
#%%
import random

class myClass(object):
    def doThis(self):
        self.rand_val = random.randint(1,20)

myInst = myClass()
myInst.doThis()
print(myInst.rand_val)
#%%
"""Basic Encapsulation"""
#%%
class myInteger(object):
    def set_val(self, val):
        try:
            val = int(val)
        except ValueError:
            return
        self.val = val
    
    def get_val(self):
        return self.val
    
    def increment_val(self):
        self.val = self.val + 1

i = myInteger()
i.set_val(15)
print(i.get_val())
#%%
"""Init Constructor"""
#%%
class myNum(object):
    def __init__(self, value):
        try:
            value = int(value)
        except ValueError:
            value = 0
        self.val = value
    
    def increment(self):
        self.val = self.val + 1

a = myNum(0)
b = myNum(5)
a.increment()
a.increment()
b.increment()
print(a.val)
print(b.val)
#%%
class instanceCounter(object):
    
    count = 0
    
    def __init__(self, val):
        self.val = val
        instanceCounter.count += 1
    
    def set_val(self, newval):
        self.val = newval
    
    def get_val(self):
        return self.val
    
    def get_count(self):
        return instanceCounter.count

a = instanceCounter(5)
b = instanceCounter(10)
c = instanceCounter(15)

for obj in (a, b, c):
    print("val of obj: %s" % (obj.get_val())) #initialized value
    print("count (from instance): %s" % (obj.count)) #always 3 (because 3 objects have been intialized)
#%%
class maxSizeList(object):
    
    def __init__(self, max): #initialize
        self.max = max #max size (from argument)
        self.list = [] #empty list
    
    def push(self, word):
        self.list.append(word) #add new word to list
        
        if len(self.list) > self.max: #checks length vs max size
            self.list.pop(0) #removes first word in list
    
    def get_list(self):
        return self.list

a = maxSizeList(3)
b = maxSizeList(1)

a.push("hello")
a.push("How")
a.push("are you")
a.push("today?")
b.push("sup?")
b.push("o hai!")

print(a.get_list())
print(b.get_list())
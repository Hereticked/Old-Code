# -*- coding: utf-8 -*-
"""
Section 4 - Inheritance And Polymorphism
"""
#%%
class animal(object): #Inherits from class object (superclass used to create all others)
    def __init__(self, name):
        self.name = name
    def eat(self, food):
        print('%s is eating %s.' % (self.name, food))

class dog(animal): #Inherits from class animal
    def fetch(self, thing):
        print('%s goes after the %s!' % (self.name, thing))

class cat(animal): #Inherits from class animal
    def swat(self):
        print('%s shreds the string!' % (self.name))

r = dog('Rover')
f = cat('Fluffy')

r.fetch('paper')
f.swat()
r.eat('dog food')
f.eat('cat food')
r.swat() #Will error because dog class can't access cat method
#%%
"""
Inherting the Constructor
You can use "super" to call parent class method even when you're already using
the same method in your child class (in this case, __init__)
"""
import random

class animal(object):
    
    def __init__(self, name):
        self.name = name
    
class dog(animal):
    
    def __init__(self, name):
        super(dog, self).__init__(name)
        self.breed = random.choice(['Shih Tzu', 'Beagle', 'Mutt'])
    
    def fetch(self, thing):
        print('%s goes after the %s!' % (self.name, thing))

d = dog('Rex')

print(d.name)
print(d.breed)
d.fetch('bone')
#%%
class instanceCounter(object):
    count = 0
    
    def __init__(self, val):
        self.val = self.filterint(val)
        instanceCounter.count += 1
    
    @staticmethod #static = utility method, not passing the instance or class
    def filterint(value):
        if not isinstance(value, int): #check if value is int
            return 0
        else:
            return value

a = instanceCounter(5)
b = instanceCounter(10)
c = instanceCounter('hello')

print(a.val)
print(b.val)
print(c.val)
#%%
"""
Assignment to create a program to write log files to txt and list files to csv
while showing appropriate class hierarchy and making the parent class do the
bulk of the work so code is short and clean. Making write an "abstract method"
is done to ensure that this method is included in both child classes (won't
run without them.)
"""
from abc import abstractmethod, ABCMeta
import datetime

class WriteFile(metaclass=ABCMeta):
    
    def __init__(self, filename):
        self.filename = filename
        
    @abstractmethod
    def write(self):
        return
    
    def write_line(self, text):
        fh = open(self.filename, 'a')
        fh.write(text + '\n')
        fh.close()

class LogFile(WriteFile):
    
    def write(self, this_line):
        dt = datetime.datetime.now()
        date_str = dt.strftime('%Y-%m-%d %H:%M') #format string how we want
        self.write_line('{0}   {1})'.format(date_str, this_line))
    
class DelimFile (WriteFile):
    #Needs a separate init because it has the delim parameter in addition to the filename
    def __init__(self, filename, delim):
        super(DelimFile, self).__init__(filename)
        self.delim = delim
    
    def write(self, this_list):
        line = self.delim.join(this_list)
        self.write_line(line)

log = LogFile('log.txt')                  # passes the filename to write to
mydelim = DelimFile('data.csv', ',')      # passes the filename to write to and a delimeter

log.write('this is a log message')        # writes a message to the file
log.write('this is another log message')  # same

mydelim.write(['a', 'b', 'c', 'd'])       # writes a list of values separated by comma to the file
mydelim.write(['1', '2', '3', '4'])       # same
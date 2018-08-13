# -problem3_6.py *- coding: utf-8 -*-

import sys

filein = sys.argv[1]
fileout = sys.argv[2]

readfile = open (filein)
writefile = open (fileout, 'w')

for line in readfile:
    charct = len(line.strip("\n")) #strip new line char and count characters
    charctstr = str(charct) # convert to string
    writefile.write(charctstr + "\n")

readfile.close()
writefile.close()
"""Energy Balance Solver"""
#%%
import itertools

if __name__ == "__main__":
  # the values of the cells, in a list: [a, b, c, d]
  original_values = [1,-2,7,-2,-7,0,7,1,8,-5,-2,-4,0,1,-4,0,-4,7,4,-7,0,-3,5,7,-1,4,-5,-1,1,-8,6,3,0,-2,-1,-2]
  # the sums to match, in a list: [a, b, c, d]
  # (write them down in the order given by the Guide
  sums = [-7,-1,-5,14,5,-1,9,-9,3,-8,-3,7]
  # the addends, *inside a string*, with curly braces: "{{a,b}, {c,d,e}}"
  # (copy&paste them from the Guide)
  addends = "{{0, 1, 2, 3, 4, 5}, {0, 6, 12, 18, 24, 30}, {6, 7, 8, 9, 10, 11}, {1, 7, 13, 19, 25, 31}, {12, 13, 14, 15, 16, 17}, {2, 8, 14, 20, 26, 32}, {18, 19, 20, 21, 22, 23}, {3, 9, 15, 21, 27, 33}, {24, 25, 26, 27, 28, 29}, {4, 10, 16, 22, 28, 34}, {30, 31, 32, 33, 34, 35}, {5, 11, 17, 23, 29, 35}}"
  # if you enter the addends with square brackets ([[]]]), comment the following line prepending a hash (#)
  addends = eval(addends.replace('{', '[').replace('}', ']'))

  fixed = ['?'] * len(original_values)
  fixedn = [0] * len(original_values)

  def check_sums(f):
    if f >= len(addends):
      return True
    # filter available cells
    acells = list(original_values)
    for i in range(len(fixed)):
      if fixedn[i]:
        j = acells.index(fixed[i])
        acells = acells[0:j] + acells[j+1:]
    # filter cells to look for
    ftuple = []
    fsum = 0
    for x in addends[f]:
      if fixedn[x]:
        fsum += fixed[x]
      else:
        ftuple += [x]
        fixedn[x] += 1
    # check permutations
    for p in itertools.permutations(acells, len(ftuple)):
      if sum(p) + fsum == sums[f]:
        for x in range(len(ftuple)):
          fixed[ftuple[x]] = p[x]
        if check_sums(f+1):
          return True
    for x in ftuple:
      fixedn[x] -= 1
    return False

  if check_sums(0):
    print(fixed)
    print('----')
    for i in range(len(addends)):
      print(addends[i], ' :: ', [fixed[x] for x in addends[i]], '=', sums[i])
  else:
    print("Can't find")
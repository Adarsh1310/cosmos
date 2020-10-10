#Adarsh Srivastava AI20MTECH14008
import numpy as np
inirow = int(input("Enter the number of rows:"))
inicol= int(input("Enter the number of columns:"))
print("Enter the entries in a single line")
entries = list(map(float, input().split()))
matrix= np.array(entries).reshape(inirow, inicol)
temp=matrix
aug=[]
def reduction(matrix):
    rows,columns=matrix.shape
    if rows == 0 or columns == 0:
        return matrix
    for i in range(len(matrix)):
        if matrix[i][0] != 0:
            break
    else:
        return np.hstack([matrix[:, :1], reduction(matrix[:, 1:])])
    if i > 0:
      matrix[[i,0]]=matrix[[0,i]]
    matrix[0] /= matrix[0][0]
    matrix[1:] = matrix[1:] - matrix[0] * matrix[1:, 0:1]
    return np.vstack([matrix[:1], np.hstack([matrix[1:, :1],reduction(matrix[1:, 1:]) ])])
def reducedrow(matrix):
    if inirow == inicol:
        if np.linalg.det(temp)!=0:
          aug = np.hstack([matrix, np.identity(inirow)])
          reduction(aug)
          r=len(aug)
          c=len(aug[0])
          row = r - 1
          for k in range(row+1):
              i=k
              for j in range(c):
                  if aug[k, j] == 1:
                      while (i > 0):
                          aug[i - 1] -= aug[i - 1, j] * aug[k]
                          i =i- 1

          print("Echelon Form")
          for i in range(inirow):

              for j in range(inicol):
                  print(aug[i][j], end=" ")
              print()
          print("Inverse")
          for i in range(inirow):
            for j in range(inicol, inicol+inicol):
                  print(aug[i][j], end=" ")
            print()
        else:
              reduction(temp)
              r = len(temp)
              c = len(temp[0])
              row = r - 1
              for k in range(row + 1):
                  i = k
                  for j in range(c):
                      if temp[k, j] == 1:
                          while (i > 0):
                              temp[i - 1] -= temp[i - 1, j] * temp[k]
                              i =i-1

              print("Echelon Form")
              for i in range(inirow):

                  for j in range(inicol):
                      print(temp[i][j], end=" ")
                  print()
              print("Inverse does not exist")
    else:
        reduction(temp)
        r, c = temp.shape
        row = r - 1

        while (row > 0):
            i = row
            for j in range(c):
                if temp[i, j] == 1:
                    while (i > 0):
                        temp[i - 1] -= temp[i - 1, j] * temp[row]
                        i -= 1
            row -= 1
        print("Echelon Form")
        print(temp)
        print("Inverse does not exist")
reducedrow(matrix)

# -*- coding: utf-8 -*-
import numpy
"Taking inputs from the user"
XY=numpy.zeros(2,dtype=int)#Insert Target and Query Length
cost=numpy.zeros(2,dtype=int)#Insert cost for gap and mismatch
XY=[ int(x) for x in input().split()]#spliting lenghts to keep it in an array
cost=[ int(x) for x in input().split()]#spliting costs to keep it in an array
target=input()#taking the target input
query=input()#taking the query input
GapCost=cost[0]#storing cost of Gap in GapCost
MismatchCost=cost[1]#storing cost of mismatch in MismatchCost
"Table Creation"
GeneTable=numpy.zeros((XY[0]+1,XY[1]+1),dtype=int)#table that will be used for memorization
for i in range(0,XY[1]+1):#making first row as a multiple of cost
  GeneTable[0][i]=i*GapCost
for j in range(0,XY[0]+1):#same for first column.This will be explained in PDF.
  GeneTable[j][0]=j*GapCost
OutputTarget=[]#This will store the final target after alignment
OutputQuery=[]#This will store final query after alignment
"Using table to find out the least cost"
i=1
while i<XY[0]+1:
  j=1
  while j<XY[1]+1:
    if target[i-1]!=query[j-1]:
      CostGap1=GeneTable[i][j-1]+GapCost#calculating cost from the previous element in the row
      CostGap2=GeneTable[i-1][j]+GapCost#calculating cost from the previous element in the column
      CostDiagonal=GeneTable[i-1][j-1]+MismatchCost#calculating mismatch cost
      FinalCost=min(CostGap1,CostGap2,CostDiagonal)#finding the minimum
      GeneTable[i][j]=FinalCost#storing the minimum cost
    else:
      FinalCost=GeneTable[i-1][j-1]#if they are same simply copy diagonal
      GeneTable[i][j]=FinalCost
    j=j+1
  i=i+1
i=XY[0]
j=XY[1]
"Backtracking from the last point of the 2d array"
while i!=0 or j!=0:#this loop will find out the alignment
  Cost1=GeneTable[i][j-1]+GapCost#calculating cost from the previous element in the row
  Cost2=GeneTable[i-1][j]+GapCost#calculating cost from the previous element in the column
  Cost3=GeneTable[i-1][j-1]+MismatchCost#calculating mismatch cost
  if target[i-1]==query[j-1]:#if characters are equal then print those characters
    temp1,temp=[target[i-1]],[target[j-1]]
    i=i-1
    j=j-1
  elif Cost1==GeneTable[i][j]:#using row first so that lexographically sequence alignment is printed
    temp,temp1=[query[j-1]],["_"]
    j=j-1
  elif Cost2==GeneTable[i][j]:#now using columns
    temp1,temp=[target[i-1]],["_"]
    i=i-1
  elif Cost3==GeneTable[i][j]:#finally comparing diagonal
    temp1,temp=[target[i-1]],[query[j-1]]
    i=i-1
    j=j-1
  OutputQuery=temp+OutputQuery
  OutputTarget=temp1+OutputTarget
print(GeneTable[XY[0]][XY[1]])#printing cost
print(*OutputTarget)#printing target
print(*OutputQuery)#printing query

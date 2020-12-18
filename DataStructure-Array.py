import numpy
class Node:#Creating Node
   def __init__( self, data ):
      self.data = data
      self.next = None
class LinkedList:#Linked List
   def __init__( self ):
      self.head = None
      self.tail = None
   def AddNode( self, data ):#Adding node to the linked list
      node = Node( data )
      if self.head == None:
         self.head = node
      if self.tail != None:
         self.tail.next = node
      self.tail = node
   def RemoveNode( self, data ):#Deleting first occurence of node
      node = self.head  
      if node!=None and node.data == data:  
        self.head = node.next
        node = None
        return 0
      else:
        while(node!=None):  
            if node.data == data:  
                break
            previous = node  
            node = node.next
        if node == None :  
            return 0
        previous.next = node.next
        return 1
        node = None
   def AddBeg(self, data):#Adding node at the beginning
      node = Node(data) 
      node.next = self.head 
      self.head = node 
query=numpy.empty(2,dtype=int)#this array will take the input query
operation=input()#input for which operation is to be performed
"dynamic2sum function will give the number of target values that can be found using x and y"
def dynamic2sum(start,end):#this is the query function which will take nlogn time at worst.
    count=0
    sorting(elements)
    for value in range(start,end+1):
      first=0
      last=len(elements)-1
      while first!=last:
        if (elements[first]+elements[last])==value:
          count=count+1
          break
        else:
          if (elements[first]+elements[last])>value:
            last=last-1
          else:
            first=first+1
    print(count)
"Sorting the input array in ascending order"
def sorting(elements):#using merge sort to sort these values.
  mid = int(len(elements)/2)
  left=numpy.empty(mid,dtype=int)
  right=numpy.empty(len(elements)-mid,dtype=int)
  if len(elements)>1:
        c=0
        for i in range(0,mid):
          left[i]=elements[i]
        for i in range(mid,len(elements)):
          right[c]=elements[i]
          c=c+1
        sorting(left)
        sorting(right)
        i=0
        j=0
        k=0       
        rightlength=len(right)
        while i < mid and j < rightlength:
            if right[j]>left[i] :
                temp=left[i]
                i=i+1
            else:
                temp=right[j]
                j=j+1
            elements[k]=temp
            k=k+1
        for l in range(i,mid):
            elements[k]=left[l]
            k=k+1
        for m in range(j,rightlength):
            elements[k]=right[m]
            k=k+1
"Taking input"
ele=LinkedList()#input
length=0
while operation!="E":
  if operation=="I":
    ele.AddBeg(int(input()))
    length=length+1
  elif operation=="D":
    remove=int(input())
    x=ele.RemoveNode(remove)
    if length>0 and x !=0:
      length=length-1
  elif operation=="Q":
    temp=[ int(x) for x in input().split()]
    elements=numpy.empty(length, dtype=int)
    i=0
    list=ele.head
    if list!=None:
      while (list!=None):
        elements[i]=list.data
        list=list.next
        i=i+1
      dynamic2sum(temp[0],temp[1])
  operation=input()

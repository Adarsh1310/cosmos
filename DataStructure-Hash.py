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
def query (start,end,ele,length):#this is the query function
  elements=numpy.empty(length, dtype=int)#array for input elements
  i=0
  list=ele.head
  while (list!=None):#transferring input to elements array. This will take O(n) time
    elements[i]=list.data
    list=list.next
    i=i+1
  count=0 #this will store the final count
  for i in range(start,end+1):
    hashtable=numpy.empty(len(elements),dtype=object)#creating hash table
    for j in range(0,len(elements)):
      hashtable[j]=LinkedList()
    for value in elements:
      difference=i-value#finding difference for each element of array
      if search(difference,hashtable)==False:#searching if difference is in the hashtable or not
        insert(value,(value%len(elements)),hashtable)#if not then inserting value
      else:
        count=count+1#else increasing the count
        break
  print(count)
def insert(val,pos,hashtable):#input operation for hash table
  hashtable[pos].AddNode(val)
def search(diff,hashtable):#search for hash table
  current = hashtable[(diff)%length].head 
  while current != None: 
    if current.data == diff: 
      return True
    current = current.next
  return False
"The query portion will take O((b-a)n(1+alpha)).Here alpha will generally be constant hence O(n) per target value"
ele=LinkedList()#input link list
length=0
"Input method"
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
    hashtable=numpy.empty(length,dtype=object)
    for i in range(0,length):
      hashtable[i]=LinkedList()
    query(temp[0],temp[1],ele,length)
  operation=input()


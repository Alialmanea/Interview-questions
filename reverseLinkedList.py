
class Node:
  def __init__(self,data):
    self.data = data
    self.next = None

class LinkdeList:
  def __init__(self):
    self.head = None

  def push(self, data):
    newNode = Node(data)

    if self.head is None:
      self.head = newNode
      return

    newNode.next = self.head
    self.head = newNode

  def append (self, data):
    newNode = Node(data)

    if self.head is None:
      self.head = newNode
      return

    last = self.head 
    while (last.next): 
      last = last.next

    last.next =  newNode   
    return

  def __str__(self):
    temp = self.head
    restr = ''
    while temp:
      restr = restr +'{}--> '.format(temp.data)
      temp = temp.next
    return restr  

def reverseLinkedList(ls):
  returnls = LinkdeList()
  temp = ls.head
  while temp:
    returnls.push(temp.data)
    temp = temp.next

  return returnls  



def main():
  ls = LinkdeList()
  ls.append(1)
  ls.append(2)
  ls.append(3)
  ls.append(4)
  print(ls)
  print(reverseLinkedList(ls))

  


main()

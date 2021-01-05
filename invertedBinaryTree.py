def invertedTree(tree):
  invertedtree = tree
  if invertedtree:
    left = invertedtree.left
    right = invertedtree.right
    invertedtree.left = right
    invertedtree.right = left
    invertedTree(invertedtree.left)
    invertedTree(invertedtree.right)
  else :
    return None  
  return invertedtree  

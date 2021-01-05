#include <stdio.h>
#include <stdlib.h>

struct node {
  int data;
  struct node* left;
  struct node* right;
};

typedef struct node* Node;


Node newNode (int data){
  Node n = (Node) malloc(sizeof(Node));
  n ->data = data;
  n->left = NULL;
  n->right = NULL;

  return n;
}

int d = 0;

void depth(Node root, int i){
  d += i;
  if(root->left != NULL)
    depth(root->left, i+1);
  if(root->right != NULL)
    depth(root->right, i+1);
}

int sumDepth(Node root){
   d = 0;
  depth(root, 0);
  return d;
}



int maxDepth(Node root){
  if (root == NULL)
    return 0;
  else{
    int left = maxDepth(root->left);
    int right = maxDepth(root->right);

    if(left > right)
      return left +1;
    else
      return right +1;
    
  }  
}


int main(void) {
  Node root = newNode(1);
  root ->left = newNode(2);
  root ->left->right = newNode(3);
  root ->left->left = newNode(4);
  root ->right = newNode(5);
  root ->left->left->right = newNode(6); /* the depth here is 4 */  
  printf("Max Deth of tree is : %d ",maxDepth(root));
  printf("\nThe Sum of Deth is :%d",sumDepth(root));
  return 0;
}

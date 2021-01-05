#include <stdio.h>
#include <stdlib.h>

struct node{
  int data;
  struct node* left;
  struct node* right;
};
typedef struct node* Node;

Node newNode(int data){
  Node newnode = (Node) malloc(sizeof(Node));
  newnode ->right = NULL;
  newnode ->data = data;
  newnode ->left = NULL;
  return newnode;
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

void inorder(Node root){
  if(root == NULL)
    return;
  inorder(root->left);
  printf("%d ",root->data);
  inorder(root->right);
    

}

int main(void) {
  Node root = newNode(1);
  root ->left = newNode(2);
  root ->left->right = newNode(3);
  root ->left->left = newNode(4);
  root ->right = newNode(5);
  root ->left->left->right = newNode(6); /* the depth here is 4 */  
  inorder(root);
  printf("\nMax Deth of tree is : %d ",maxDepth(root));
  return 0;
}

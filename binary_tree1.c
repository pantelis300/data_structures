#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct node 
{
	char data[15];
	struct node *left;
	struct node *right;
};


struct node * createNode(char * data)
{
	// Allocate memory for new_node
	struct node * new_node = (struct node *)malloc(sizeof(struct node));

	// Assign a new string value
	strcpy(new_node->data, data);

	// Initialize left and right children as NULL
	new_node->left = NULL;
	new_node->right = NULL;
}


void printInorder(struct node * root)
{
	if (root == NULL)
		return;

	printInorder(root->left);
	printf("Data: %s\n", root->data);
	printInorder(root->right);
}



int main(int argc, char **argv)
{
	struct node *root = createNode("John");
	root->left = createNode("Mike");
	root->right = createNode("Jenny");

	printInorder(root);

	return 0;
}
	

all: binary_tree1

binary_tree1: binary_tree1.o
	gcc -o binary_tree1 binary_tree1.o

binary_tree1.o: binary_tree1.c
	gcc -Wall -c -std=c99 binary_tree1.c


clean:
	rm -f binary_tree1 *.o

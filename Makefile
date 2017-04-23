JAVAC=/usr/bin/javac
.SUFFIXES: .java .class

.java.class:
	javac -g -d bin/ -cp bin/ $*.java

CLASSES = \
	src/Entry.java \
	src/Node.java \
	src/Tree.java \
	src/BTQueueNode.java \
	src/BTQueue.java \
	src/AVLTree.java \
	src/BinaryTreeNode.java \
	src/BinaryTree.java \
	src/SearchIt.java \
	src/SearchAVL.java \
	src/QueryFileGenerator \
	src/InsertAVL.java \
	src/InsertIt.java \
	src/Driver.java
	

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) bin/*.class

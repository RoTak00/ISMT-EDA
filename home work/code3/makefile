SRC = TestLinkedList.java \
      TestStack.java \
      TestQueue.java \
      TestDoubleLinkedList.java \
      TestDeque.java

compile:
	javac $(SRC)

run:
	# use --ignore-errors, some tests have exceptions for a purpose
	java TestLinkedList
	java TestStack
	java TestQueue
	java TestDoubleLinkedList
	java TestDeque

clean:
	rm -f *.class	
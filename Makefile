JC=javac

main.class: main.java
	$(JC) main.java

run: main.class
	java main

clean:
	rm -fr *.class

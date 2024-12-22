all: 
	find * -name "*.java" > sources.txt
	javac @sources.txt

fclean: clean

clean: 
	find * -name "*.class" > todel.txt
	rm -rf @todel.txt

re: fclean all
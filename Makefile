auto_save:
	git add *
	git commit -m "auto_save"
	git push


Analyzer_compile:
	javac ./operations_analyzer/*.java
	java main

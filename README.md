# Structural Design Patterns Programming Exercises
Source code for Composite design pattern from https://github.com/teiniker/teiniker-lectures-designpatterns.
Import as Maven projects. Implement and refactor until unit tests succeed. Consult TODO.txt for instructions.
## Composite-AppleTree-Exercise
![Composite Pattern](https://raw.githubusercontent.com/j05t/composite/master/Composite-AppleTree-Solution/ClassDiagram.png)
# github.com/j05t/composite

Implementieren Sie die fehlenden Sub-Klassen "Leaf", "GreenApple",
"RedApple" und "Branch" die zusammen mit der Klasse "Node" ein 
Composite Pattern bilden.

Als Operation für die Baumstruktur sollen die Methoden:

	int numberOfLeafs();
	int numberOfRedApples();
	int numberOfGreenApples();
	
implementiert werden, welche die Anzahl der gleichen Knoten (Leaf, 
RedApple oder GreenApple) im Baum ermitteln. 

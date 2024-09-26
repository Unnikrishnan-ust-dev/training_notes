class Egg{
double price;
String type;
int shelfLife;
String expiry;
}

class Milk{
double price;
String type;
int shelfLife;
String expiry;
double quantity;
}

class Chocolate{
double price;
String type;
int shelfLife;
String expiry;
List<String> ingredients;
double weight;
}

class Apple{
double price;
String type;
int shelfLife;
String expiry;
double quantity;
}

class Bread{
double price;
String type;
int shelfLife;
String expiry;
List<String> ingredients;
int slices;
double quanity;
}

class Store{
ArrayList<Egg> eggs = new ArrayList<>();
HashSet<Milk> milks = new HashSet<>();
LinkedList<Chocolate> chocolates = new LinkedList<>();
TreeSet<Apple> apples = new TreeSet<>();
Queue<Bread> breads = new Queue<>();

HashMap<Integer,Collection> items = new HashMap<>();

Store(){
	Egg egg1 = new Egg(6,"chicken",3,"21/07/24");
	Egg egg2 = new Egg(8,"duck",4,"22/07/24");
	Egg egg3 = new Egg(4,"quill",2,"20/07/24");
	Egg egg4 = new Egg(6,"chicken",2,"23/07/24");
	Egg egg5 = new Egg(6,"chicken",4,"25/07/24");
	Egg egg6 = new Egg(8,"duck",4,"26/07/24");
	Egg egg7 = new Egg(8,"duck",4,"23/07/24");
	Egg egg8 = new Egg(6,"chicken",5,"28/07/24");
	Egg egg9 = new Egg(4,"quill",4,"24/07/24");
	Egg egg10 = new Egg(4,"quill",2,"20/07/24");
	eggs.add(egg1);
	eggs.add(egg2);
	eggs.add(egg3);
	eggs.add(egg4);
	eggs.add(egg5);
	eggs.add(egg6);
	eggs.add(egg7);
	eggs.add(egg8);
	eggs.add(egg9);
	eggs.add(egg10);
	
	Milk milk1 = new Milk(80,"whole",2,"21/07/24",1);
	Milk milk2 = new Milk(60,"almond",2,"21/07/24",0.5);
	Milk milk3 = new Milk(100,"cow",2,"21/07/24",1);
	Milk milk4 = new Milk(140,"goat",2,"21/07/24",1);
	Milk milk5 = new Milk(120,"oat",2,"21/07/24",2);
	Milk milk6 = new Milk(160,"whole",2,"25/07/24",2);
	Milk milk7 = new Milk(60,"almond",2,"25/07/24",0.5);
	Milk milk8 = new Milk(50,"cow",2,"25/07/24",0.5);
	Milk milk9 = new Milk(280,"goat",2,"25/07/24",2);
	Milk milk10 = new Milk(240,"oat",2,"25/07/24",2);
	milks.add(milk1);
	milks.add(milk2);
	milks.add(milk3);
	milks.add(milk4);
	milks.add(milk5);
	milks.add(milk6);
	milks.add(milk7);
	milks.add(milk8);
	milks.add(milk9);
	milks.add(milk10);
	
	Chocolate c1 = new Chocolate(100,"Milk Chocolate",100,"21/07/24",["milk","coco powder","sugar"],0.1);
	Chocolate c2 = new Chocolate(150,"Dark Chocolate",100,"21/07/24",["coco powder","sugar"],0.2);
	Chocolate c3 = new Chocolate(200,"Almond Chocolate",100,"21/07/24",["milk","coco powder","sugar","almond"],0.2);
	Chocolate c4 = new Chocolate(100,"Dairy Milk",100,"21/07/24",["milk","coco powder","sugar"],0.1);
	Chocolate c5 = new Chocolate(100,"Five Star",100,"21/07/24",["milk","coco powder","sugar"],0.1);
	Chocolate c6 = new Chocolate(120,"kitKat",100,"21/07/24",["milk","coco powder","sugar"],0.125);
	Chocolate c7 = new Chocolate(100,"Milk Chocolate",100,"21/07/24",["milk","coco powder","sugar"],0.1);
	Chocolate c8 = new Chocolate(100,"Milk Chocolate",100,"21/07/24",["milk","coco powder","sugar"],0.1);
	Chocolate c9 = new Chocolate(100,"Milk Chocolate",100,"21/07/24",["milk","coco powder","sugar"],0.1);
	Chocolate c10 = new Chocolate(100,"Milk Chocolate",100,"21/07/24",["milk","coco powder","sugar"],0.1);
	chocolates.add(c1);
	chocolates.add(c2);
	chocolates.add(c3);
	chocolates.add(c4);
	chocolates.add(c5);
	chocolates.add(c6);
	chocolates.add(c7);
	chocolates.add(c8);
	chocolates.add(c9);
	chocolates.add(c10);
	
	Apple a1 = new Apple(100,"kashmiri",5,"21/07/24",1);
	Apple a2 = new Apple(150,"shimla",5,"25/07/24",1);
	Apple a3 = new Apple(200,"selam",5,"21/07/24",1);
	Apple a4 = new Apple(300,"green",5,"21/07/24",1);
	Apple a5 = new Apple(80,"red",5,"21/07/24",1);
	Apple a6 = new Apple(100,"kashmiri",5,"21/07/24",1);
	Apple a7 = new Apple(150,"shimla",5,"21/07/24",1);
	Apple a8 = new Apple(110,"kodaikanal",5,"21/07/24",1);
	Apple a9 = new Apple(100,"kashmiri",5,"21/07/24",1);
	Apple a10 = new Apple(100,"kashmiri",5,"10/08/24",1);
	apples.add(a1);
	apples.add(a2);
	apples.add(a3);
	apples.add(a4);
	apples.add(a5);
	apples.add(a6);
	apples.add(a7);
	apples.add(a8);
	apples.add(a9);
	apples.add(a10);
	
	Bread b1 = new Bread(50,"white",30,"21/07/24",["milk","flour","sugar"],20,0.3);
	Bread b2 = new Bread(40,"brown",30,"26/07/24",["milk","flour","sugar"],20,0.3);
	Bread b3 = new Bread(60,"sweet",30,"30/07/24",["milk","flour","sugar"],20,0.3);
	Bread b4 = new Bread(50,"non-sweet",30,"24/07/24",["milk","flour","sugar"],20,0.3);
	Bread b5 = new Bread(60,"milk",30,"21/07/24",["milk","flour","sugar"],20,0.3);
	Bread b6 = new Bread(50,"white",30,"25/07/24",["milk","flour","sugar"],20,0.3);
	Bread b7 = new Bread(60,"sweet",30,"21/07/24",["milk","flour","sugar"],20,0.3);
	Bread b8 = new Bread(40,"brown",30,"21/07/24",["milk","flour","sugar"],20,0.3);
	Bread b9 = new Bread(50,"white",30,"21/07/24",["milk","flour","sugar"],20,0.3);
	Bread b10 = new Bread(70,"oat",30,"21/07/24",["milk","flour","sugar"],20,0.3);
	breads.add(b1);
	breads.add(b2);
	breads.add(b3);
	breads.add(b4);
	breads.add(b5);
	breads.add(b6);
	breads.add(b7);
	breads.add(b8);
	breads.add(b9);
	breads.add(b10);
	
	this.items.put(1,eggs);
	this.items.put(2,milks);
	this.items.put(3,chocolates);
	this.items.put(4,apples);
	this.items.put(5,breads);
}

public getBreads(){
	System.out.printLn(breads.toString());
}

public getBreads(){
	System.out.printLn(breads.toString());
}

public getBreads(){
	System.out.printLn(breads.toString());
}

public getBreads(){
	System.out.printLn(breads.toString());
}

public getBreads(){
	System.out.printLn(breads.toString());
}

public viewItems(){
	System.out.printLn("Enter the item ");
	
}
}
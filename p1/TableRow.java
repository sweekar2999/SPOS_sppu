
public class TableRow {
String symbol;
int address,index;
public String getSymbol() {
	return symbol;
}
public TableRow(String symbol, int address) {
	super();
	this.symbol = symbol;
	this.address = address;
	index=0;
}
public void setSymbol(String symbol) {
	this.symbol = symbol;
}
public TableRow(String symbol, int address, int index) {
	super();
	this.symbol = symbol;
	this.address = address;
	this.index = index;
}
public int getAddress() {
	return address;
}
public void setAddess(int address) {
	this.address = address;
}
public int getIndex() {
	return index;
}
public void setIndex(int index) {
	this.index = index;
}

public static void main(String args[])
{
    
    TableRow r1 = new TableRow("Symbol1", 100);
    TableRow r2 = new TableRow("Symbol2", 200, 1);

        // Access and print information
        System.out.println("Symbol: " + r1.getSymbol());
        System.out.println("Address: " + r1.getAddress());
        System.out.println("Index: " + r1.getIndex());

        System.out.println("Symbol: " + r2.getSymbol());
        System.out.println("Address: " + r2.getAddress());
        System.out.println("Index: " + r2.getIndex());
    

}

}
package cz.spsejecna.vanecek;
/*
 *  @author Ondøej Vanìèek C2a
 */
public class Heap {
	
	//promìnné
	
	public int virtualSize;
	public int size2;
	private int[] field = null;
	
	//metody
	
	public int getLeftChild(int i) {
		return 2*i+1;
	}
	public int getRightChild(int i) {
		return 2*i+2;
	}
	public int getParent(int i) {
		if(i%2 == 0)
			return (i-1)/2;
		return i/2;
	}
	
	public int getVirtualSize() {
		return virtualSize;
	}
	public void setVirtualSize(int virtualSize) {
		this.virtualSize = virtualSize;
	}
	public int min() {
		int tempMin = Integer.MAX_VALUE;
		for (int i = 0; i < virtualSize; i++) {
			if (field[i] < tempMin)
				tempMin = field[i];
		}
		return tempMin;
	}
	public int extractMin() {
		int min = min();
		for(int i=0;i<virtualSize;i++) {
			if (min() == field[i]){
				for (int j=i;j<virtualSize-1;j++){
					field[j] = field[j + 1];
				}
				virtualSize--;
				field[virtualSize] = 0;
				for (int j=0;j<virtualSize;j++){
					if (field[j] < field[getParent(j)]) {
						int temp = field[getParent(j)];
						field[getParent(j)] = field[j];
						field[j] = temp;
					}
				}
			}
			break;
		}
		return min;
	}
	public void insert(int v) {
		if(virtualSize<=0){
			virtualSize = 1;
			field = new int[size2];
			field[virtualSize - 1] = v;
		}else{
			if(virtualSize >= field.length){
				int[] con2 = new int[field.length*2];
				for(int i=0;i<field.length;i++)
					con2[i] = field[i];
				field = con2;
			}
			field[virtualSize] = v;
			int index1 = virtualSize;
			virtualSize++;
			while (index1 != 0 && field[index1] < field[getParent(index1)]) {
				int temp = field[getParent(index1)];
				field[getParent(index1)] = field[index1];
				field[index1] = temp;
				index1 = getParent(index1);
			}
		}
	}
	public String toString() {
		String text = "";
		for (int i=0;i<virtualSize;i++)
			text += field[i] + (i<virtualSize-1 ? "," : "");
		return "[" + text + "]";
	}
	public Heap() {
		this.virtualSize = virtualSize;
		
		}
	public int size() {
		return getVirtualSize(); 
	}
}
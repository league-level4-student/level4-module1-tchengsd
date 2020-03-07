package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] array;
	public ArrayList() {
		array = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {		
		return array[loc];
	}
	
	public void add(T val) {
		T[] temp = (T[]) new Object[array.length + 1];
		for(int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		temp[temp.length - 1] = val;
		array = temp;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] temp = (T[]) new Object[array.length + 1];
		for(int i = 0; i < loc; i++) {
			temp[i] = array[i];
		}
		temp[loc] = val;
		for(int i = loc + 1; i < temp.length; i++) {
			temp[i] = array[i-1];
		}
		array = temp;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		array[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] temp = (T[]) new Object[array.length - 1];
		for(int i = 0; i < loc; i++) {
			temp[i] = array[i];
		}
		for(int i = loc; i < temp.length; i++) {
			temp[i] = array[i+1];
		}
		array = temp;
	}
	
	public boolean contains(T val) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == val) {
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		return array.length;
	}
}
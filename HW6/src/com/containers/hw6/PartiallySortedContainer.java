
package com.containers.hw6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PartiallySortedContainer <T> implements Iterable<T> {

	private int maxSize_;

	private List<T> base;

	public T firstZero;

	public T firstPositive;

	public T firstNegative;

	public PartiallySortedContainer(int maxSize) {

		maxSize_ = maxSize;
		base = new ArrayList<>(maxSize);
	}
	
	private class InputIterator implements Iterator<T>{
		private int current;

		@Override
		public boolean hasNext() {
			 if (current < PartiallySortedContainer.this.base.size()) {
	                return true;
	            } else {
	                return false;
	            }
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
	}
	
	

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}

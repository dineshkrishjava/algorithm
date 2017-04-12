package com.dineshkrish;

/**
 * 
 * @author Dinesh Krishnan
 *
 */

public interface RoundRobin<T> {

	public T select() throws RoundRobinException;

	public void add(T ref);

	public void remove(T ref);

	public void update(T ref);
}

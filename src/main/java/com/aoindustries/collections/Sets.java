/*
 * ao-collections - Collections and related utilities for Java.
 * Copyright (C) 2020  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of ao-collections.
 *
 * ao-collections is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ao-collections is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with ao-collections.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aoindustries.collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * General-purpose utilities for working with {@link Set}.
 *
 * @author  AO Industries, Inc.
 */
public class Sets {

	private Sets() {
	}

	/**
	 * Combines two sets, maintaining order.
	 *
	 * @see  LinkedHashSet
	 */
	// TODO:? https://commons.apache.org/proper/commons-collections/apidocs/org/apache/commons/collections4/SetUtils.html#union-java.util.Set-java.util.Set-
	public static <E> Set<E> union(Set<? extends E> set1, Set<? extends E> set2) {
		Set<E> union = AoCollections.newLinkedHashSet(set1.size() + set2.size());
		union.addAll(set1);
		union.addAll(set2);
		return union;
	}

	/**
	 * Combines multiple sets, maintaining order.
	 *
	 * @see  LinkedHashSet
	 */
	@SafeVarargs
	public static <E> Set<E> union(Set<? extends E> ... sets) {
		int size = 0;
		for(Set<? extends E> set : sets) {
			size += set.size();
		}
		Set<E> union = AoCollections.newLinkedHashSet(size);
		for(Set<? extends E> set : sets) {
			union.addAll(set);
		}
		return union;
	}

	/**
	 * Combines a set with some new elements, maintaining order.
	 *
	 * @see  LinkedHashSet
	 */
	@SafeVarargs
	@SuppressWarnings("varargs")
	public static <E> Set<E> union(Set<? extends E> set, E ... elements) {
		int size = set.size() + elements.length;
		Set<E> union = AoCollections.newLinkedHashSet(size);
		union.addAll(set);
		union.addAll(Arrays.asList(elements));
		return union;
	}
}

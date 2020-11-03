/*
 * ao-collections - Collections and related utilities for Java.
 * Copyright (C) 2006, 2007, 2008, 2009, 2010, 2011, 2013, 2016, 2020  AO Industries, Inc.
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

import java.util.Collection;

/**
 * A primitive collection.
 *
 * @see  Collection
 */
// TODO: Support IntStream
public interface IntCollection extends Collection<Integer> {

	boolean contains(int elem);

	int[] toArrayInt();

	boolean add(int o);

	boolean removeByValue(int value);
}

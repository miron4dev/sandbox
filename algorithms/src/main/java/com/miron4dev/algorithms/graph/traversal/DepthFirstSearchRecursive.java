package com.miron4dev.algorithms.graph.traversal;

import com.miron4dev.algorithms.graph.Vertex;

public class DepthFirstSearchRecursive implements GraphTraversal {

	@Override
	public void traverse(Vertex root) {
		root.setVisited(true);

		for (Vertex neighbour : root.getNeighbours()) {
			if (!neighbour.isVisited()) {
				traverse(neighbour);
			}
		}
	}
}

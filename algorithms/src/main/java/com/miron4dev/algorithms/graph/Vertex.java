package com.miron4dev.algorithms.graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private final List<Vertex> neighbours = new ArrayList<>();
	private final String name;
	private boolean visited;

	public Vertex(String name) {
		this.name = name;
	}

	public void addNeighbour(Vertex vertex) {
		neighbours.add(vertex);
	}

	public List<Vertex> getNeighbours() {
		return neighbours;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	@Override
	public String toString() {
		return name;
	}
}

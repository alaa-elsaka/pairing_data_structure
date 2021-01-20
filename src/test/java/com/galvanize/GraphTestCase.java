package com.galvanize;

import org.junit.jupiter.api.BeforeEach;

public class GraphTestCase {
    Graph graph;

    @BeforeEach
    void setUp() {
        graph = new Graph();
    }

//    @Test
//    void testAddVertex() {
//        Vertex v = new Vertex("Los Angeles, CA");
//        graph.addVertex(v);
//
//        assertEquals(1, graph.size());
//    }
//
//    @Test
//    void testAddEdge() {
//        Vertex laCity = new Vertex("Los Angeles, CA");
//        Vertex oakCity = new Vertex("Oakland, CA");
//        int distance = 300;
//        graph.addVertex(laCity);
//        graph.addVertex(oakCity);
//        graph.addEdge(laCity, oakCity, distance);
//        assertTrue(graph.isConnected(laCity, oakCity));
//    }
//
//    @Test
//    void testGetPathTo() {
//        Vertex ny = new Vertex("New York, NY");
//        Vertex oakland = new Vertex("Oakland, CA");
//        Vertex denver = new Vertex("Denver, CO");
//        Vertex chicago = new Vertex("Chicago, IL");
//        ArrayList<Vertex> expected = new ArrayList<Vertex>();
//        expected.add(oakland);
//        expected.add(denver);
//        expected.add(chicago);
//        assertEquals(expected, graph.getPathTo(chicago, oakland));
//    }
}

package com.acn.sortchunk;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import org.junit.*;

class SortChunkTest {
	
	int[] array = new int[] {3,2,1};
	
	


	@Test
	void test() {
		List<int[]> end = SortChunk.run(array);
		assertEquals(end.size(), array.length);
		assertNotEquals(end.get(0), array[0]);
		
	}

}


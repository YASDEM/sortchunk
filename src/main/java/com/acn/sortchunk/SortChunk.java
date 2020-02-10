package com.acn.sortchunk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


public class SortChunk {
	
	
	static ListOfList lol;
	static BubbleSort bs;
	
	@Autowired
	public SortChunk (ListOfList lol, BubbleSort bs) {
		this.lol = lol;
		this.bs = bs;
	}
	
	
	public static List<int[]> run(int[] arr) {
		return lol.sliceList(bs.betterSort(arr, false), 1, true);
		
	
	}
}

package com.visa.training.threads;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.SynchronousQueue;

public class FileSearch {

	public static void main(String[] args) {
		
		String fileName=args[0];
		String folderName=args[1];
		File folder=new File(folderName);
		File[] contents=folder.listFiles();
		Queue<File> filesQueue=new ConcurrentLinkedQueue<File>();
		filesQueue.addAll(Arrays.asList(contents));
		List<File> results=Collections.synchronizedList(new ArrayList<>());
		
//		SearchWorker w1=new SearchWorker(fileName,filesQueue,results);
		

	}

}

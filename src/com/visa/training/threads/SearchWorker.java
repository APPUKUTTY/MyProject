package com.visa.training.threads;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class SearchWorker extends Thread {
	
	String fileName;
	Queue<File> filesQueue;
	List<File> results;
	
	public void run()
	{
		while(true)
		{
			File fileTaken=filesQueue.poll();
			if(fileTaken==null)
			{
				System.out.println("not a file or folder");
				break;
			}else if(fileTaken.isFile() && fileTaken.equals(fileName))
				results.add(fileTaken);
			else if(fileTaken.isDirectory())
			{
				File[] newFiles=fileTaken.listFiles();
				results.addAll(Arrays.asList(newFiles));
			}
		}
	}
	
}

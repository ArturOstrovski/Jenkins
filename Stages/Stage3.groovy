package com.javacodegeeks.java.core;
 
import java.io.File;
def PrintFreeSpace () {

    File diskPartition = new File("C:");
    long totalCapacity = diskPartition.getTotalSpace(); 
    long freePartitionSpace = diskPartition.getFreeSpace(); 
    long usablePatitionSpace = diskPartition.getUsableSpace(); 
    
    System.out.println("Total C partition size : " + totalCapacity / (1024*1024*1024) + " GB");
    System.out.println("Usable Space : " + usablePatitionSpace / (1024 *1024*1024) + " GB");
    System.out.println("Free Space : " + freePartitionSpace / (1024 *1024*1024) + " GB");
    
}
return this

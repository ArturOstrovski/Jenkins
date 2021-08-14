package com.javacodegeeks.java.core
 
import java.io.File
 
 
    def free_Spacesss () {
 
        diskPartition = new File("C:")
 
        long totalCapacity = diskPartition.getTotalSpace() 
 
        long freePartitionSpace = diskPartition.getFreeSpace()
        long usablePatitionSpace = diskPartition.getUsableSpace()
 
        println("Total C partition size : " + totalCapacity / (1024*1024*1024) + " GB")
        println("Usable Space : " + usablePatitionSpace / (1024 *1024*1024) + " GB")
        println("Free Space : " + freePartitionSpace / (1024 *1024*1024) + " GB")
    }
return this

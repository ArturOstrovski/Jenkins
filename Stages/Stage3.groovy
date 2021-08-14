package com.javacodegeeks.java.core
 
import java.io.File
 
 
    def free_Spacesss () {
 
        def diskPartition = new File("C:")
     
        File file = new File("C:\file\file.txt") 
        println file.text 
        
        def sampleDirSize = diskPartition.directorySize()
        long totalCapacity = diskPartition.getTotalSpace() 
 
        long freePartitionSpace = diskPartition.getFreeSpace()
        long usablePatitionSpace = diskPartition.getUsableSpace()
        
        println("Total C partition size : " + sampleDirSize + " GB")
        println("Total C partition size : " + totalCapacity / (1024*1024*1024) + " GB")
        println("Usable Space : " + usablePatitionSpace / (1024 *1024*1024) + " GB")
        println("Free Space : " + freePartitionSpace / (1024 *1024*1024) + " GB")
    }
return this

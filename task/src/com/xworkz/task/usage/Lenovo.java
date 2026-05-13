package com.xworkz.task.usage;

import com.xworkz.task.inner.Os;

public class Lenovo {
   private Os os;

   public Lenovo(Os os)
   {
       this.os= os;
   }
   public void runOperatingSystem()
   {
       if(os!=null)
       {
           this.os.buffer();
           os.restart();
           os.update();
       }
   }

}

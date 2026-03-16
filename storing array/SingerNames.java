class SingerNames{
	
	String[]singers;
	int currenctIndex=0;
	
	SingerNames(String[]singers)
	{
		this.singers=singers;
		
	}
	void music(String singer)
	{
		System.out.println("executing music in singersname");
		System.out.println("singers:"+singer);
		if(this.singers!=null)
		{
			System.out.println("checking the singers");
			int singersIndex=this.singers.length-1;
			if(this.currenctIndex<=singersIndex)
			{
				System.out.println("music storing to sing"+this.currenctIndex);
				this.singers[this.currenctIndex]=singer;
				this.currenctIndex++;;
				System.out.println("music is stroing ins index"+this.currenctIndex);
			}else{
				System.out.println("array is full cannot store the musics");
			}
		}else{
			
			System.out.println("singers are not initial with array");
		}
	}
	
	
}
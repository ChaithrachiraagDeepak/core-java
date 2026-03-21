class StoreTreeTypesRunner{
	public static void main(String... values)
	{
		String[] types=new String[10];
		StoreTreeTypes tree=new StoreTreeTypes(types);
		tree.save("mango tree");
		tree.save("Banyan tree");
		tree.save("Banana plant");
		tree.save("coconut tree");
		tree.save("silver tree");
		tree.save("sandal wood tree");
		tree.save("Apple tree");
		tree.save("Ashoka tree");
		tree.save("Teak tree");
		tree.save("sapota tree");
		
		System.out.println("-----------------------------------------------");
		
		boolean found=tree.search("silver tree");
		System.out.println("tree name found:"+found);
		
		boolean take = tree.update(3,"gold");
		System.out.println("we updated new name:"+take);
		
		boolean get = tree.update("Teak tree", "small tree");
		System.out.println("we updated name using string:"+get);
		
		boolean store = tree.delete(8);
		System.out.println("deleing the mentioned index:"+store);
		
		boolean storing = tree.delete("Apple tree");
		System.out.println("deleting index using stirng");
		
		

	}
	
}
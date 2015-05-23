package edu.sjsu.cmpe.cache.client;

public class Client {
	
	
	public static void main(String[] args) throws Exception {
        System.out.println("******************Client Started**************");
        
        CRDTClient crdtClient=new CRDTClient();
        crdtClient.putCacheClient(1,"a");
        System.out.println("**Server A Stoped for 30000 **");
        //Then, sleep for ~30 seconds so that you will have enough time to stop the server A
        Thread.sleep(30000);
        crdtClient.putCacheClient(1,"b");
        System.out.println("**Server B Stoped for 30000 **");
        Thread.sleep(30000);
        crdtClient.getCacheClient(1);
        System.out.println("**Server C Stoped for 30000 **");
    }

}

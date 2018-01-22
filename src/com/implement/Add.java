package com.implement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.music.Album;
import com.music.Artist;
import com.music.Library;

public class Add {
	
	//To add Library
	public void addLibrary()
	{
		
		try
		{
			Library lib = new Library();
			
			//For current working Directory
			String currentDir = new java.io.File( "." ).getCanonicalPath();
	        
	        File file = new File(currentDir+"/library.txt");
	        
	        List<Library> libList = new ArrayList<Library>();
	      //Create the file
	       if (file.createNewFile())
	       {
	    	
	    	   lib.setLib_no(1);
	       }
	       //If file already exists
	       else
	       {
	    	  
	    	   FileReader fileReader = new FileReader(file);	//To read the content of file
	    	   BufferedReader bufferedReader = new BufferedReader(fileReader);
	    	   String line = null;
	    	   while ((line = bufferedReader.readLine()) != null) 
	    	   {
					String[] linesplit = line.split("%");
					if(linesplit.length>1)
					{
						lib.setLib_no(Integer.parseInt(linesplit[0]));
						lib.setName(linesplit[1]);
						libList.add(lib);
					}
					else
					{
						lib.setLib_no(1);
					}

	    	   }
	    	   fileReader.close();
	    	   lib.setLib_no(lib.getLib_no()+1); //To set the ID for library
	       }
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   System.out.println("Enter the library name:");
		   String name = br.readLine();
			
	       lib.setName(name);
	       
	      //Write Content
	      
	       FileWriter writer = new FileWriter(file,true);
	       writer.write(lib.getLib_no()+"%"+lib.getName());
	       writer.write("\n");
	       writer.close();
	        
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Add addLibrary "+e.getMessage());
		}
	}
	
	//To add Artist
	public void addArtist()
	{
		try
		{
			Artist artist = new Artist();
			
			//For current working Directory
			String currentDir = new java.io.File( "." ).getCanonicalPath();
	        
	        File file = new File(currentDir+"/artist.txt");
	        
	        List<Artist> artList = new ArrayList<Artist>();
	      //Create the file
	       if (file.createNewFile())
	       {
	    	
	    	   artist.setArtist_id(1);
	       }
	       //If file already exists
	       else
	       {
	    	  
	    	   FileReader fileReader = new FileReader(file);	//To read the content of file
	    	   BufferedReader bufferedReader = new BufferedReader(fileReader);
	    	   String line = null;
	    	   while ((line = bufferedReader.readLine()) != null) 
	    	   {
					String[] linesplit = line.split("%");
					if(linesplit.length>1)
					{
						artist.setArtist_id(Integer.parseInt(linesplit[0]));
						artist.setName(linesplit[1]);
						artList.add(artist);
					}
					else
					{
						artist.setArtist_id(1);
					}

	    	   }
	    	   fileReader.close();
	    	   artist.setArtist_id(artist.getArtist_id()+1); //To set the ID for artist
	       }
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   System.out.println("Enter the artist name:");
		   String name = br.readLine();
			
	       artist.setName(name);
	       Iterator<Artist> iterator = artList.iterator();
	       boolean flag = true;
	       while(iterator.hasNext())
	       {
	    	   Artist a =  (Artist)iterator.next();
	    	   if((a.getName().toUpperCase()).equals(name.toUpperCase()))
	    	   {
	    		   flag = false;
	    		   break;
	    	   }
	    	   
	       }
	       
	      //Write Content
	      if(flag) //If artist does not exists then add
	      {
		       FileWriter writer = new FileWriter(file,true);
		       writer.write(artist.getArtist_id()+"%"+artist.getName().toUpperCase());
		       writer.write("\n");
		       writer.close();
	      }
	      else //When artist already present
	      {
	    	  System.out.println("Artist name already exists!!!!");
	      }
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Add addArtist "+e.getMessage());
		}
	}
	
	public void addAlbum()
	{
		try
		{
			Album album = new Album();
			//For current working Directory
			String currentDir = new java.io.File( "." ).getCanonicalPath();
	        
	        File file = new File(currentDir+"/album.txt");
	        
	        
		}
		catch(Exception e)
		{
			System.out.println("Add addAlbum() :"+e.getMessage());
		}
	}
	
	public static void main(String args[])
	{
		try
		{
			Add a = new Add();
		//	a.addLibrary();
			a.addArtist();
			
		}
		catch(Exception e)
		{
			System.out.println("Add.java exception "+e.getMessage());
		}
	}
}

package com.implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

import com.music.Album;
import com.music.Artist;
import com.music.Song;

public class LibraryCollection {

	HashMap<String, String> albumHash = new HashMap<String,String>();
	HashMap<Integer,String> artistHash = new HashMap<Integer,String>();
	HashMap<Song, HashMap<Integer, String>> songHash = new HashMap<Song, HashMap<Integer, String>>();
	
	public boolean isArtist()
	{
		return false;
	}
	
	public void addAlbum()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n;
			Album a = new Album();
			System.out.println("Enter the name of album:\t");
			a.setName(br.readLine());
			a.setLib_name("Anand Singh");
			
			albumHash.put(a.getName(), a.getLib_name());
			
			System.out.println("How many songs:\t");
			n = Integer.parseInt(br.readLine());
			
			for(int i = 0;i < n;i++)
			{
				Song s = new Song();
				s.setAlbum_name(a.getName());
				System.out.println("Enter the Artist name:\t");
				Artist artist = new Artist();
				artist.setName(br.readLine());
				if(isArtist())
				{
					
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println("addAlbum exception "+e.getMessage());
		}
	}
	
	public static void main(String[] args) 
	{
		try
		{
			LibraryCollection lib = new LibraryCollection();
			System.out.println("::Welcome to Anand Music Library::\n");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				System.out.println("\n1.Display Songs\n2.Add Album\n3.Edit album\n4.Delete Album\n5.Exit\n");
				System.out.println("Enter the choice::\t");
				int ch = Integer.parseInt(br.readLine());
				switch(ch)
				{
					case 1:
							break;
							
					case 2: lib.addAlbum();
							break;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in main "+e.getMessage());
		}
	}

}

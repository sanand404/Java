package com.music;

public class Song {
	private int track_id;
	private String title;
	private String album_name;
	private int artist_id; //Artist Id Foreign Key
	
	public Song(){}

	public Song(int track_id, String title, String album_name, int artist_id) {
		super();
		this.track_id = track_id;
		this.title = title;
		this.album_name = album_name;
		this.artist_id = artist_id;
	}

	public int getTrack_id() {
		return track_id;
	}

	public void setTrack_id(int track_id) {
		this.track_id = track_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAlbum_name() {
		return album_name;
	}

	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}

	public int getArtist_id() {
		return artist_id;
	}

	public void setArtist_id(int artist_id) {
		this.artist_id = artist_id;
	}
	
	
	
}

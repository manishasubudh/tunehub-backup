package com.kodnest.tunehub.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Song 
{
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	int id;
	String name;
	String artist;
	String link;
	String genre;
	@ManyToMany
	List<Playlist> playlist;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public List<Playlist> getPlaylist() {
		return playlist;
	}
	public void setPlaylist(List<Playlist> playlist) {
		this.playlist = playlist;
	}
	@Override
	public String toString() {
		return "Song [id=" + id + ", name=" + name + ", artist=" + artist + ", link=" + link + ", genre=" + genre
				+ ", playlist=" + playlist + "]";
	}
	public Song(int id, String name, String artist, String link, String genre, List<Playlist> playlist) {
		super();
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.link = link;
		this.genre = genre;
		this.playlist = playlist;
	}
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
		
}

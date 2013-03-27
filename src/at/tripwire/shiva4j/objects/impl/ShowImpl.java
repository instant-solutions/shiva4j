package at.tripwire.shiva4j.objects.impl;

import java.sql.Timestamp;

public class ShowImpl {

	private int id;
	private String title;
	private Timestamp datetime;
	private boolean ticketsLeft;
	private Venue venue;
	private ArtistImpl[] artists;
	private OtherArtist[] otherArtists;

	public static class Venue {
		private String name;
		private String latitude;
		private String longitude;

		/**
		 * Venue's name.
		 */
		public String getName() {
			return name;
		}

		/**
		 * Venue's latitude.
		 */
		public String getLatitude() {
			return latitude;
		}

		/**
		 * Venue's longitude.
		 */
		public String getLongitude() {
			return longitude;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}

		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}
	}

	public static class OtherArtist {
		private String name;
		private String musicBrainzId;
		private String facebookTourDatesUrl;
		private String imageUrl;

		/**
		 * Name of the artist.
		 */
		public String getName() {
			return name;
		}

		/**
		 * MusicBrainz.com ID.
		 */
		public String getMusicBrainzId() {
			return musicBrainzId;
		}

		/**
		 * URI to BandsInTown's Facebook app for this artist.
		 */
		public String getFacebookTourDatesUrl() {
			return facebookTourDatesUrl;
		}

		/**
		 * URI to an image of the artist.
		 */
		public String getImageUrl() {
			return imageUrl;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setMusicBrainzId(String musicBrainzId) {
			this.musicBrainzId = musicBrainzId;
		}

		public void setFacebookTourDatesUrl(String facebookTourDatesUrl) {
			this.facebookTourDatesUrl = facebookTourDatesUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}
	}

	/**
	 * BandsInTown's ID for this event.
	 */
	public int getId() {
		return id;
	}

	/**
	 * The title of the event.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Date and time of the show.
	 */
	public Timestamp getDatetime() {
		return datetime;
	}

	/**
	 * A boolean representing the availability (or not) of tickets for the
	 * concert.
	 */
	public boolean isTicketsLeft() {
		return ticketsLeft;
	}

	/**
	 * A structure identifying the venue where the event takes place.
	 */
	public Venue getVenue() {
		return venue;
	}

	/**
	 * A list of artist resources.
	 */
	public ArtistImpl[] getArtists() {
		return artists;
	}

	/**
	 * A list with artists that are not in Shiva's database.
	 */
	public OtherArtist[] getOtherArtists() {
		return otherArtists;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
	}

	public void setTicketsLeft(boolean ticketsLeft) {
		this.ticketsLeft = ticketsLeft;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public void setArtists(ArtistImpl[] artists) {
		this.artists = artists;
	}

	public void setOtherArtists(OtherArtist[] otherArtists) {
		this.otherArtists = otherArtists;
	}
}
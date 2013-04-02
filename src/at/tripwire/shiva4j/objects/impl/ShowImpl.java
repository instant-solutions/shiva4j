package at.tripwire.shiva4j.objects.impl;

import java.sql.Timestamp;

import at.tripwire.shiva4j.objects.Artist;
import at.tripwire.shiva4j.objects.Show;

public class ShowImpl implements Show {

	private int id;
	private String title;
	private Timestamp datetime;
	private boolean ticketsLeft;
	private Venue venue;
	private ArtistImpl[] artists;
	private OtherArtist[] otherArtists;

	public static class VenueImpl implements Venue {
		private String name;
		private String latitude;
		private String longitude;

		/**
		 * {@inheritDoc}
		 */
		public String getName() {
			return name;
		}

		/**
		 * {@inheritDoc}
		 */
		public String getLatitude() {
			return latitude;
		}

		/**
		 * {@inheritDoc}
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

	public static class OtherArtistImpl implements OtherArtist {
		private String name;
		private String musicBrainzId;
		private String facebookTourDatesUrl;
		private String imageUrl;

		/**
		 * {@inheritDoc}
		 */
		public String getName() {
			return name;
		}

		/**
		 * {@inheritDoc}
		 */
		public String getMusicBrainzId() {
			return musicBrainzId;
		}

		/**
		 * {@inheritDoc}
		 */
		public String getFacebookTourDatesUrl() {
			return facebookTourDatesUrl;
		}

		/**
		 * {@inheritDoc}
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
	 * {@inheritDoc}
	 */
	public int getId() {
		return id;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * {@inheritDoc}
	 */
	public Timestamp getDatetime() {
		return datetime;
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean isTicketsLeft() {
		return ticketsLeft;
	}

	/**
	 * {@inheritDoc}
	 */
	public Venue getVenue() {
		return venue;
	}

	/**
	 * {@inheritDoc}
	 */
	public Artist[] getArtists() {
		return artists;
	}

	/**
	 * {@inheritDoc}
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
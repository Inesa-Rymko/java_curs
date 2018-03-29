package Composition;

	public class Music extends MusicalSound {

		private String title;
		private String author;
		private Gener gener;
		private double duration;

		public Music(String tembre, String title, String author, Gener gener,
				double duration) {
			super(tembre);
			this.title = title;
			this.author = author;
			this.gener = gener;
			this.duration = duration;
		}

		//public Music() {
		//	super();
		//}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public Gener getGener() {
			return gener;
		}

		public void setGener(Gener gener) {
			this.gener = gener;
		}

		public double getDuration() {
			return duration;
		}

		public void setDuration(double duration) {
			this.duration = duration;
		}
		
		@Override
		public String toString() {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(" Music [title=" + title + ", author=" + author
					+ ", gener=" + gener + ", duration=" + duration
					+ super.toString() + "]");
			return stringBuilder.toString();
		}
				
	}

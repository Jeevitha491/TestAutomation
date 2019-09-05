package com.selenium.helper;

public class FileDataManager {
		public static FileDataManager fdm = new FileDataManager();
		public ConfigReader cr;

		public ConfigReader getconfigReader() throws Throwable {
			if (cr == null) {
				cr = new ConfigReader();
			}
			return cr;

		}

		private FileDataManager() {

		}
	}



package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.VideoGame;

public class VideoGameRunner {

	public static void main(String[] args) {
		VideoGame game0 = new VideoGame();
		VideoGame game1 = new VideoGame("Minecraft");
		VideoGame game2 = new VideoGame("Minecraft", true);
		VideoGame game3 = new VideoGame("Minecraft", true, "3D Sandbox");

		String platforms[] = {"MacOS", "iPadOS", "ChromeOS"};
		double[] versions = {20.09, 20.11, 20.17};
		double ratingOfVersion[] = {8.9, 6.5, 9.1};

		VideoGame game4 = new VideoGame(platforms);
		VideoGame game5 = new VideoGame(platforms, versions);
		VideoGame game6 = new VideoGame(platforms, versions, ratingOfVersion);

		VideoGame game7 = new VideoGame("Minecraft", platforms);
		VideoGame game8 = new VideoGame("Minecraft", true, "3D Sandbox", platforms);
		VideoGame book9 = new VideoGame("Minecraft", true, "3D Sandbox",platforms,versions,ratingOfVersion);

	}
}

package com.xworkz.assignments.things;

import java.util.Arrays;

public class OS {
	public String name;
    public String version;
    public int releaseYear;
    public String developer;
    public boolean is64Bit;
    public String[] supportedLanguages;
    public int installedUsers;
    public boolean isOpenSource;
    public double marketShare;
    public String defaultBrowser;

    // No-argument constructor
    public OS() {
    }

    // All-argument constructor
    public OS(String name, String version, int releaseYear, String developer, boolean is64Bit,
              String[] supportedLanguages, int installedUsers, boolean isOpenSource, double marketShare,
              String defaultBrowser) {
        this.name = name;
        this.version = version;
        this.releaseYear = releaseYear;
        this.developer = developer;
        this.is64Bit = is64Bit;
        this.supportedLanguages = supportedLanguages;
        this.installedUsers = installedUsers;
        this.isOpenSource = isOpenSource;
        this.marketShare = marketShare;
        this.defaultBrowser = defaultBrowser;
    }

    // Display method
    public void displayProperties() {
        System.out.println("Name: " + name);
        System.out.println("Version: " + version);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Developer: " + developer);
        System.out.println("64-bit: " + is64Bit);
        System.out.println("Supported Languages: " + Arrays.toString(supportedLanguages));
        System.out.println("Installed Users: " + installedUsers);
        System.out.println("Open Source: " + isOpenSource);
        System.out.println("Market Share: " + marketShare);
        System.out.println("Default Browser: " + defaultBrowser);
    }

}


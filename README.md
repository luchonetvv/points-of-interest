# PointsOfInterestApp
## _This project contain una app Android for to consume an API Rest of Google Maps that show points of interest of many topics._


PointsOfInterestApp is a rest api-consume, mobile-ready, offline-storage compatible,
Android-Native viewer of articles.

## Features

- Include Google Map and consume Places.

PointsOfInterestApp is a lightweight Android app based on the formatting conventions that developers naturally use in build to software.

## Tech

PointsOfInterestApp uses a number of open source projects to work properly:

- [Framework Android](https://developer.android.com/) - A Framework serves to be able to write code or develop an application in a simpler way..
- [Retrofit](https://square.github.io/retrofit/) - Retrofit is a REST server client for Android and Java developed by Square, very simple and very easy to learn..
- [Gson](https://github.com/google/gson) - Gson is a Java library that can be used to convert Java Objects into their JSON representation.
- [Room](https://developer.android.com/training/data-storage/room) - The Room persistence library provides an abstraction layer over SQLite to allow fluent database access while harnessing the full power of SQLite.
- [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - The ViewModel class is designed to store and manage UI-related data in a lifecycle conscious way.

And of course PointsOfInterestApp itself is open source with a [public repository](https://github.com/luchonetvv/points-of-interest)
on GitHub.

## Requirements

- [Git](https://git-scm.com/) - Git is a free and open source distributed version control system designed to handle everything from small to very large projects with speed and efficiency.
- [Java](https://www.java.com/en/) - Java is a programming language and computing platform first released by Sun Microsystems in 1995. Install Java 8 and Java 11.
- [Android Studio](https://developer.android.com/studio) - Android Studio provides the fastest tools for building apps on every type of Android device. Version Arctic Fox | 2020.3.1 Patch 3.

## Demo


## Installation

Clone the repository.

```bash
git clone git@github.com:luchonetvv/points-of-interest.git
git status
```

You have to install Java 8 and Java 11.

Install Android Studio and then open the project...
Only need to execute the run button and will build the project satisfactory.

Or if you want to build and install via terminal, this are steps:

> Note: Set `Java 11` is required for execute gradle tools.
> Note: The `Physical Device` have to have configure the [Developer Options, Debugging USB](https://developer.android.com/studio/debug/dev-options) and connected the device to laptop.

On Mac or Linux
```bash
./gradlew installDebug
```

On Windows
```bash
gradlew.bat installDebug
```

## License

Apache License, Version 2.0

**Free Software, Hell Yeah!**

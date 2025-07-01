# MovieApp

MovieApp is a modern Android application written in Kotlin using Jetpack Compose. The app allows users to browse, search, and view details about various movies. All movie data is loaded from a local JSON file bundled with the app—no external database is required. Images are loaded efficiently via an image holder (e.g., Coil) and the UI is responsive and material-themed.

## Features

- **Browse Movies:** Scroll through a list of movies with posters and essential info.
- **Movie Details:** Tap on a movie to see detailed information, including storyline, cast, and a gallery of images.
- **Image Gallery:** Swipe through movie stills and posters in detail screens.
- **Fluid UI:** Built with Jetpack Compose for smooth animations and adaptive layouts.
- **Offline Ready:** All data is shipped with the app in JSON—no internet or backend needed except for loading images.
- **Material 3 Design:** Uses the latest Material Design components and theming.

## Screenshots 
<img width="225" alt="Screenshot 2025-07-01 at 2 03 41 PM" src="https://github.com/user-attachments/assets/9ac00a3f-6755-4548-893c-5d9e4556d709" /> <img width="225" alt="Screenshot 2025-07-01 at 2 04 11 PM" src="https://github.com/user-attachments/assets/79739108-144f-4788-adea-6a861c6ce911" /> <img width="225" alt="Screenshot 2025-07-01 at 2 04 26 PM" src="https://github.com/user-attachments/assets/39c1d4c8-0f1a-4a2f-866a-0dc42fe84087" /> <img width="225" alt="Screenshot 2025-07-01 at 2 04 49 PM" src="https://github.com/user-attachments/assets/607d2858-df80-48a6-9603-7b98ebd08525" />

## Getting Started

### Prerequisites

- Android Studio (Giraffe or later recommended)
- Kotlin 1.8+
- Minimum SDK 21
- Internet connection (for image loading only)

### Setup

1. **Clone the repository:**
   ```sh
   git clone https://github.com/bhargavvadhiya23/MovieApp.git
   cd MovieApp
   ```

2. **Open in Android Studio:**
   - Select `Open an existing project` and choose the `MovieApp` folder.

3. **Build & Run:**
   - Click the run button in Android Studio or use Shift+F10.

4. **Explore:**
   - Browse the movie list and tap on any movie for details and gallery.
     

## Technologies Used

- **Kotlin** (Android app language)
- **Jetpack Compose** (Modern UI toolkit)
- **Coil** (Image loading in Compose)
- **Material 3** (Material Design components)
- **Local JSON** (for movie data; no Room DB or server)

## Acknowledgements

- Movie poster & stills from public sources (IMDB).
- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Coil Image Loader](https://coil-kt.github.io/coil/)

---

_Developed by [bhargavvadhiya23](https://github.com/bhargavvadhiya23)_

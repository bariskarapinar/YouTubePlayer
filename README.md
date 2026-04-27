# 📺 YouTube Player - Android Masterclass 🚀

<p align="center">
  <img src="https://user-images.githubusercontent.com/30619162/175788671-a278f789-2e95-4cb0-a7bc-6d49a351a14e.jpeg" width="80%" alt="YouTube Player Banner">
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Kotlin-1.7+-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin">
  <img src="https://img.shields.io/badge/Android-32+-3DDC84?style=for-the-badge&logo=android&logoColor=white" alt="Android">
  <img src="https://img.shields.io/badge/Architecture-MVVM-FF4081?style=for-the-badge" alt="Architecture">
  <img src="https://img.shields.io/badge/API-YouTube_v3-FF0000?style=for-the-badge&logo=youtube&logoColor=white" alt="YouTube API">
</p>

---

## 🌟 Overview

**YouTube Player** is a high-performance, modern Android application developed as part of an **Android App Development Masterclass**. This project serves as a comprehensive deep dive into the **Kotlin** programming language and the **Android Ecosystem**. 

It demonstrates the seamless integration of the **YouTube Android Player API**, allowing users to stream videos and playlists directly within a custom-built environment. This project isn't just an app; it's a testament to mastering professional Android development workflows.

---

## 📸 Screen-by-Screen Walkthrough

### 🏠 Dashboard & Navigation
The journey begins at the Dashboard, where users can choose between an embedded player experience or a standalone intent-based approach.

<p align="center">
  <img src="https://user-images.githubusercontent.com/30619162/175788589-96fa4d1f-7185-4713-9de2-448326da8561.jpeg" width="23%" alt="Main Screen">
  <img src="https://user-images.githubusercontent.com/30619162/175788591-f53b7e32-847d-4025-b1d2-0341309ebd20.jpeg" width="23%" alt="Navigation">
  <img src="https://user-images.githubusercontent.com/30619162/175788597-2694b672-b48a-4f3b-888c-6c27706f84a9.jpeg" width="23%" alt="Options">
  <img src="https://user-images.githubusercontent.com/30619162/175788596-f3349ccf-3b88-4827-bed1-92562269fcb9.jpeg" width="23%" alt="Standalone Menu">
</p>

### 🎬 Video Playback Experience
Integrated playback allows for a seamless experience without leaving the application.

<p align="center">
  <img src="https://user-images.githubusercontent.com/30619162/175788672-4dadace5-c36a-4216-bce9-d02aa9417660.jpeg" width="48%" alt="Portrait Player">
  <img src="https://user-images.githubusercontent.com/30619162/175788673-49de1782-9233-4ea0-83d7-c0bde8f1b7b4.jpeg" width="48%" alt="Landscape Player">
</p>

---

## ✨ Key Features

- 🎥 **Integrated Video Playback:** Seamlessly play YouTube videos within the app using `YouTubePlayerView`.
- 📂 **Playlist Support:** Full support for loading and navigating through YouTube playlists.
- 🛠️ **Standalone Player:** Launch the official YouTube player via Intent for a native experience.
- 🎮 **Playback Controls:** Granular control over play, pause, seek, and buffering states.
- 📱 **Responsive Design:** Optimized layouts for a fluid user experience across various screen sizes.
- 🔔 **Event Handling:** Real-time feedback using `PlaybackEventListener` and `PlayerStateChangeListener`.

---

## 🏗️ Architecture & Flow

### 🛠 MVVM Pattern
The project is built following the **Model-View-ViewModel (MVVM)** architectural pattern to ensure separation of concerns, testability, and maintainability.

```mermaid
graph TD
    subgraph View_Layer
        A[MainActivity] 
        B[YoutubeActivity]
        C[StandaloneActivity]
    end
    
    subgraph Logic_Layer
        VM[ViewModel]
    end
    
    subgraph Data_Layer
        API[YouTube API Service]
        JAR[YouTubeAndroidPlayerApi.jar]
    end

    View_Layer <--> Logic_Layer
    Logic_Layer <--> Data_Layer
```

### 🔄 User Flow
```mermaid
sequenceDiagram
    participant User
    participant Main as MainActivity
    participant YT as YoutubeActivity
    participant SA as StandaloneActivity
    participant API as YouTube API

    User->>Main: Tap "Play Single"
    Main->>YT: Launch YoutubeActivity
    YT->>API: Initialize(API_KEY)
    API-->>YT: SUCCESS
    YT->>API: loadVideo(VIDEO_ID)
    
    User->>Main: Tap "Standalone Menu"
    Main->>SA: Launch StandaloneActivity
    User->>SA: Tap "Play Video"
    SA->>API: Intent: ACTION_VIEW
    API-->>User: Open YouTube App
```

---

## 📊 MAD Score (Modern Android Development)

| Category | Status | Tech Used |
| :--- | :---: | :--- |
| **Language** | ✅ | Kotlin 1.7+ |
| **UI** | ✅ | View System / XML |
| **Architecture** | ✅ | MVVM Architecture |
| **Libraries** | ✅ | Jetpack (AppCompat, KTX) |
| **Tooling** | ✅ | Android Studio Dolphin+ |

---

## 📂 Project Structure

```text
app/src/main/java/com/gamebit/youtubeplayer/
├── MainActivity.kt        # Dashboard entry point
├── YoutubeActivity.kt     # Embedded player implementation
└── StandaloneActivity.kt  # Intent-based player controls

app/src/main/res/layout/
├── activity_main.xml      # Dashboard interface
├── activity_youtube.xml   # Player interface
└── activity_standalone.xml # Standalone control interface
```

---

## 🛠 Tech Stack

- **Language:** [Kotlin](https://kotlinlang.org/) - Modern, expressive, and safe.
- **Layout:** [ConstraintLayout](https://developer.android.com/training/constraint-layout) - For complex, flat hierarchies.
- **API:** [YouTube Android Player API](https://developers.google.com/youtube/android/player) - Official Google API.
- **Components:** [Material Design](https://material.io/) - For a modern look and feel.
- **Extension:** [Kotlin Android Extensions](https://kotlinlang.org/docs/parcelable.html) - Synthetic view binding.

---

## 🚀 Getting Started

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/YouTubePlayer.git
   ```
2. **Obtain a YouTube API Key:**
   - Go to [Google Developers Console](https://console.developers.google.com/).
   - Create a project and enable the "YouTube Data API v3".
   - Generate an API Key.
3. **Add the Key to the project:**
   - Create/Update `app/src/main/res/values/keys.xml`:
     ```xml
     <resources>
         <string name="GOOGLE_API_KEY">YOUR_API_KEY_HERE</string>
     </resources>
     ```
4. **Run the app:**
   - Open in Android Studio and hit **Run**!

---

## 🤝 Acknowledgements

- **Udemy Masterclass:** Inspiration and guidance for this educational project.
- **Google Developers:** For providing the YouTube Player API documentation.

---

<p align="center">
  Made with ❤️ for learning Android Development
</p>

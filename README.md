# ToDo Application

A modern Android ToDo application built with Kotlin and Jetpack Compose, featuring local data persistence and priority-based task management.

## Features

- ✅ Create, read, update, and delete tasks
- 🎯 Priority-based task organization (High, Medium, Low, None)
- 🔍 Search functionality across task titles and descriptions
- 📊 Sort tasks by priority (ascending/descending)
- 💾 Local data persistence using Room database
- 🎨 Modern UI built with Jetpack Compose
- 🏗️ Clean architecture with dependency injection

## Tech Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Database**: Room (SQLite)
- **Dependency Injection**: Dagger Hilt
- **Architecture**: MVVM with Repository pattern
- **Minimum SDK**: 21 (Android 5.0)
- **Target SDK**: 34 (Android 14)

## Dependencies

### Core Dependencies
- **Jetpack Compose BOM**: 2023.10.01
- **Compose UI**: Latest stable
- **Material 3**: Modern Material Design components
- **Activity Compose**: 1.8.2
- **Lifecycle Runtime KTX**: 2.7.0

### Database
- **Room**: 2.6.1
  - Room KTX for coroutines support
  - Room Runtime
  - Room Compiler (KSP)

### Dependency Injection
- **Dagger Hilt**: 2.50
- **Hilt Android Compiler**: 2.50

### Testing
- **JUnit**: 4.13.2
- **Android Test Extensions**: 1.1.5
- **Espresso**: 3.5.1
- **Compose UI Testing**: Latest

## Project Structure

```
app/src/main/java/com/example/todoapplication/
├── data/
│   ├── models/
│   │   ├── ToDoTask.kt          # Task entity model
│   │   └── Priority.kt          # Priority enum with colors
│   ├── repositories/            # Repository implementations
│   ├── ToDoDao.kt              # Room DAO interface
│   └── ToDoDatabase.kt         # Room database configuration
├── di/
│   └── DatabaseModule.kt       # Hilt dependency injection modules
├── ui/
│   └── theme/                  # Compose theme configuration
├── util/
│   └── Constants.kt            # Application constants
├── MainActivity.kt             # Main activity
└── ToDoApplication.kt          # Application class with Hilt
```

## Database Schema

### ToDoTask Entity
- `id`: Auto-generated primary key
- `title`: Task title (String)
- `description`: Task description (String)
- `priority`: Task priority (Priority enum)

### Available Operations
- Get all tasks (ordered by ID)
- Get specific task by ID
- Add new task
- Update existing task
- Delete task
- Delete all tasks
- Search tasks by title/description
- Sort by priority (low to high / high to low)

## Getting Started

### Prerequisites
- Android Studio Arctic Fox or later
- JDK 17
- Android SDK with API level 34
- Gradle 8.2.1 or compatible

### Installation

1. Clone the repository:
```bash
git clone <repository-url>
cd ToDoApplication
```

2. Open the project in Android Studio

3. Sync the project with Gradle files

4. Build and run the application:
```bash
./gradlew assembleDebug
```

Or use Android Studio's run button to install on a device/emulator.

### Building APK

To build a debug APK:
```bash
./gradlew assembleDebug
```

To build a release APK:
```bash
./gradlew assembleRelease
```

## Architecture

This application follows Clean Architecture principles:

- **Presentation Layer**: Jetpack Compose UI components
- **Domain Layer**: Use cases and business logic
- **Data Layer**: Repository pattern with Room database

### Key Architectural Components

1. **Room Database**: Local data persistence
2. **Repository Pattern**: Abstraction layer for data operations
3. **Hilt Dependency Injection**: Manages dependencies across the app
4. **Jetpack Compose**: Modern declarative UI framework
5. **Coroutines & Flow**: Asynchronous programming and reactive data streams

## Features in Detail

### Task Management
- Create tasks with title, description, and priority
- Edit existing tasks
- Delete individual tasks or all tasks
- Mark tasks with priority levels (High, Medium, Low, None)

### Search & Filter
- Real-time search across task titles and descriptions
- Sort tasks by priority (ascending/descending order)
- Filter tasks based on priority levels

### Data Persistence
- All tasks are stored locally using Room database
- Data persists across app sessions
- Automatic database migrations handled by Room

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## Development Guidelines

- Follow Kotlin coding conventions
- Use Jetpack Compose for all UI components
- Implement proper error handling
- Write unit tests for business logic
- Use Hilt for dependency injection
- Follow Material Design 3 guidelines

## Testing

Run unit tests:
```bash
./gradlew test
```

Run instrumented tests:
```bash
./gradlew connectedAndroidTest
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Built with Android Jetpack libraries
- Uses Material Design 3 components
- Inspired by modern Android development best practices

---

**Note**: This application is designed for local use only. All data is stored locally on the device and is not synchronized with any cloud services.

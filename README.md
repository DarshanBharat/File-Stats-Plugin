# File Stats — JetBrains IDE Plugin

<p align="center">
  <img src="src/main/resources/META-INF/pluginIcon.svg" width="96" height="96" alt="File Stats Icon" />
</p>

<p align="center">
  <b>Real-Time File, Line, Selection, and Document Statistics for JetBrains IDEs</b>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/IntelliJ_Platform-2022.3%2B-blue?logo=intellijidea" alt="IntelliJ Platform" />
  <img src="https://img.shields.io/badge/version-1.0.0-green.svg" alt="Version" />
  <img src="https://img.shields.io/badge/JVM-17%2B-orange.svg" alt="JVM 17+" />
  <img src="https://img.shields.io/badge/license-MIT-blue.svg" alt="License" />
</p>

---

## 💡 Why File Stats?

By default, JetBrains IDEs only show your cursor's current line and column (e.g., `10:1`). They **do not show**:
* Total lines in the file
* Real-time character count
* File size on disk
* Real-time metrics for selected text
* Document metadata for non-code files (PDF pages, image resolution, video duration, spreadsheet sheets, etc.)

**File Stats** upgrades your status bar with live, clean, and customizable metrics that integrate seamlessly into the native IDE theme without vertical stretching or visual clutter.

---

## 📸 Status Bar Preview

```text
Normal View:
Ln 42/250  ·  12,450 chars  ·  4.2 KB

With Active Selection:
Sel: 5 lines, 142 chars  |  Ln 42/250  ·  12,450 chars  ·  4.2 KB

PDF Documents:
PDF: 15 pages  ·  2.4 MB

Images (PNG, JPG, SVG, WebP):
IMG: 1920×1080 px  ·  PNG  ·  420 KB

Spreadsheets (Excel):
Excel: 3 sheets  ·  ~1,250 rows  ·  185 KB
```

---

## ✨ Key Features

### 1. 📏 100% Pixel-Perfect Native Integration
* **Strict Height & Font Matching**: Implements the official `StatusBarWidget.TextPresentation` API wrapped in IntelliJ's native `TextPanel`.
* **Zero Bar Stretching**: Enforces the native 20px compact height, 11pt font, and subtle hover pill matching native items like `UTF-8`, `LF`, and Git branch indicators.

### 2. 🎛️ Full Customization (`Settings | Tools | File Stats`)
Customize which metrics appear and choose your preferred style variation:
* **Line Count**: `Ln 42/250` *(Standard)*, `42/250`, `Line 42 of 250`, `L: 42/250`, `42:250`, or `42 (total 250)`.
* **Character Count**: `12,450 chars` *(Standard)*, `12,450 ch`, `12,450`, `12.5k chars`, or `Chars: 12,450`.
* **File Size**: `4.2 KB` *(Standard auto-scaled)*, `Size: 4.2 KB`, `(4.2 KB)`, or `4.2K`.
* **Text Selection**: `Sel: 4 lines, 120 chars` *(Standard)*, `4L, 120c`, `[4 lines, 120 chars]`, or `Selected: 4L / 120 chars`.
* **Separators**: Middle dot (` · `), Pipe (` | `), Bullet (` • `), Slash (` / `), Spaces, or Dash.
* **Live Interactive Preview**: Test and preview styling variations in real time directly inside the Settings dialog.

### 3. 🖱️ Native Upward Popup Menu
Clicking on the status bar widget (left-click or right-click) opens a native JetBrains popup menu:
* ⚙️ **Settings...**: Opens `Settings | Tools | File Stats` directly.
* 📊 **View Detailed Statistics...**: Opens a comprehensive breakdown dialog showing word count, non-whitespace characters, line endings (`LF`/`CRLF`), encoding, and metadata.
* 📋 **Copy Statistics as Markdown**: Copies a formatted Markdown table to your clipboard.
* 📄 **Copy Statistics as Plain Text**: Copies plain text metrics to your clipboard.

### 4. 🚫 Zero Clutter: Automatic Hiding
Unsupported binary files (`.exe`, `.dll`, `.class`, `.pyc`, `.bin`, `.db`) and directory folders automatically collapse to **0-width**. The widget is completely hidden from the status bar when viewing unsupported files.

---

## 📊 Supported File Formats

| Category | File Extensions | Extracted Metrics |
| :--- | :--- | :--- |
| **Source Code & Scripts** | `.py`, `.java`, `.ts`, `.js`, `.cpp`, `.c`, `.rs`, `.go`, `.cs`, `.php`, `.rb`, `.html`, `.css`, `.json`, `.yaml`, `.sql`, `.sh`, `.md`, `.txt` | Current & total lines, live selection lines/chars, total characters, file size |
| **Tabular Data** | `.csv`, `.tsv`, `.tab`, `.psv` | Delimiter (`Comma`, `Tab`, `Semicolon`, `Pipe`), total rows, column count, header detection |
| **Jupyter Notebooks** | `.ipynb` | Total cell count, code cells vs. markdown cells, file size |
| **PDF Documents** | `.pdf` | Exact page count, PDF version (`PDF: 15 pages · 2.4 MB`) |
| **Word Documents** | `.docx`, `.doc`, `.dotx` | Page count, word count, paragraph count, character count |
| **Excel Spreadsheets** | `.xlsx`, `.xls`, `.xlsm`, `.xltx` | Sheet count, sheet names, primary row & column count |
| **PowerPoint** | `.pptx`, `.ppsx`, `.ppt` | Slide count (`PPT: 24 slides · 5.1 MB`) |
| **Images** | `.png`, `.jpg`, `.jpeg`, `.gif`, `.webp`, `.svg`, `.bmp`, `.ico`, `.tiff`, `.avif` | Pixel dimensions ($W \times H$), aspect ratio, format, megapixels |
| **Videos** | `.mp4`, `.mov`, `.m4v`, `.mkv`, `.webm`, `.avi`, `.flv`, `.wmv` | Resolution, duration (`HH:MM:SS`), format, file size |
| **Audio** | `.mp3`, `.wav`, `.ogg`, `.flac`, `.aac`, `.m4a`, `.wma`, `.aiff` | Sample rate (kHz), bitrate (kbps), channels, duration |
| **Archives** | `.zip`, `.jar`, `.war`, `.ear`, `.tar`, `.gz`, `.tgz`, `.7z`, `.rar`, `.bz2`, `.xz` | Packed entry count, compression ratio, file size |

---

## 🚀 Supported JetBrains IDEs

Compatible with all IDEs built on the IntelliJ Platform (version **2022.3** through **2026+**):

* 🐍 **PyCharm** (Community & Professional)
* ☕ **IntelliJ IDEA** (Community & Ultimate)
* 🌐 **WebStorm**
* ⚙️ **CLion**
* 🐹 **GoLand**
* 🐘 **PhpStorm**
* 🎯 **Rider**
* 💾 **DataGrip**
* 🤖 **Android Studio**
* 🦀 **RustRover**

---

## 📥 Installation

### From JetBrains Marketplace
1. Open your JetBrains IDE.
2. Go to **Settings / Preferences** (`Ctrl+Alt+S` or `Cmd+,`) → **Plugins**.
3. In the **Marketplace** tab, search for **`File Stats`**.
4. Click **Install** and restart the IDE.

### From Disk (Offline / Manual)
1. Download **`File-Stats-1.0.0.zip`** from [Releases](https://github.com/DarshanBharat/File-Stats-Plugin/releases).
2. Go to **Settings** → **Plugins** → click the **⚙ (gear icon)** → **Install Plugin from Disk...**.
3. Select `File-Stats-1.0.0.zip` and restart the IDE.

---

## 🛠️ Building From Source

### Prerequisites
* JDK 17 or later
* Git

### Build with Gradle
Clone the repository and build the distribution ZIP:
```bash
git clone https://github.com/DarshanBharat/File-Stats-Plugin.git
cd File-Stats-Plugin
gradle buildPlugin
```
The packaged plugin ZIP will be generated in `build/distributions/File-Stats-1.0.0.zip`.

---

## ⌨️ Shortcuts

* **`Ctrl + Alt + Shift + S`** (`Cmd + Alt + Shift + S` on macOS): Open the Detailed File Statistics dialog for the current file.
* **Status Bar Click**: Left-click or right-click the widget to open the popup menu.

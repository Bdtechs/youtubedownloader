<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="/static/css/style.css">
    <title>YouTube Downloader</title>
</head>
<body>
    <header class="bg-dark text-white text-center py-3">
        <h1>YouTube Downloader</h1>
        <nav class="navbar navbar-expand-lg navbar-dark">
            <div class="container">
                <a class="navbar-brand" href="/">Home</a>
                <a class="nav-link" href="/youtube-downloader">Download</a>
            </div>
        </nav>
    </header>
    <main class="container mt-5">
        <h2 class="text-center">Welcome to YouTube Downloader</h2>
        <p class="text-center">Easily download videos from YouTube with our tool.</p>
        <div class="text-center mt-4">
            <a href="/youtube-downloader" class="btn btn-primary btn-lg">Go to Downloader</a>
        </div>
    </main>
</body>
</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="/static/css/style.css">
    <title>YouTube Downloader</title>
</head>
<body>
    <header class="bg-dark text-white text-center py-3">
        <h1>YouTube Downloader</h1>
        <nav class="navbar navbar-expand-lg navbar-dark">
            <div class="container">
                <a class="navbar-brand" href="/">Home</a>
                <a class="nav-link" href="/youtube-downloader">Download</a>
            </div>
        </nav>
    </header>
    <main class="container mt-5">
        <h2 class="text-center">Download Videos from YouTube</h2>
        <form method="POST" class="mt-4">
            <div class="mb-3">
                <label for="url" class="form-label">YouTube Video URL</label>
                <input type="text" id="url" name="url" class="form-control" placeholder="Enter YouTube URL" required>
            </div>
            <div class="text-center">
                <button type="submit" class="btn btn-success">Download</button>
            </div>
        </form>
    </main>
</body>
</html>

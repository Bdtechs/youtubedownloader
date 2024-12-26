### 1. app.py (Backend Logic)
from flask import Flask, render_template, request, send_file
import requests
from pytube import YouTube
import os

app = Flask(__name__)
DOWNLOAD_FOLDER = "downloads"
if not os.path.exists(DOWNLOAD_FOLDER):
    os.makedirs(DOWNLOAD_FOLDER)

@app.route('/')
def home():
    return render_template('index.html')

@app.route('/youtube-downloader', methods=['GET', 'POST'])
def youtube_downloader():
    if request.method == 'POST':
        url = request.form['url']
        try:
            yt = YouTube(url)
            stream = yt.streams.get_highest_resolution()
            file_path = os.path.join(DOWNLOAD_FOLDER, stream.default_filename)
            stream.download(output_path=DOWNLOAD_FOLDER)
            return send_file(file_path, as_attachment=True)
        except Exception as e:
            return f"Error: {str(e)}"
    return render_template('youtube_downloader.html')

if __name__ == '__main__':
    app.run(debug=True)

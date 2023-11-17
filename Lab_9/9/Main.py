from Camera import Camera
from VideoCamera import VideoCamera

my_camera = Camera()
my_camera.viewDistance()
my_camera.viewFocusParameters()
my_camera.makePhoto()
my_camera.viewStorage()


my_video_camera = VideoCamera()

my_video_camera.makeVideo()
my_video_camera.viewStorage()
my_video_camera.makePhoto(3)
my_video_camera.viewStorage()
my_video_camera.deleteVideo()
my_video_camera.viewStorage()
my_video_camera.viewFocusParameters()
from Camera import Camera
class VideoCamera (Camera):
    def __init__(self,weight = 1.7, res = 1000000):
        super().__init__(res)
        self.__weight = weight
        
    def getWeight(self):
        return self.__weight
    
    def makeVideo(self, time = 1):
        count = 0
        while count < time:
            self.makePhoto(30)
            count = count + 1
            
    def deleteVideo(self,time = 1):
        count = 0
        while count < time:
            self.deletePhoto(30)
            count = count + 1
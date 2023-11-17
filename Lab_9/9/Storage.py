class Storage:
    def __init__(self, standart_photoNumber = 0, standart_maxPhotoNumber = 100000):
        self.__photoNumber = standart_photoNumber
        self.__maxPhotoNumber = standart_maxPhotoNumber
    def deletePhoto(self):
        if self.__photoNumber == 0:
            print("Error. Storage is empty")
        else:
            self.__photoNumber = self.__photoNumber - 1
            
    def makePhoto(self):
        if self.__photoNumber == self.__maxPhotoNumber:
            print("Error. Storage is full")
        else:
            self.__photoNumber = self.__photoNumber + 1
            
    def getPhotoNumber (self):
        return self.__photoNumber
    
    def getMaxPhotoNumber (self):
        return self.__maxPhotoNumber
        

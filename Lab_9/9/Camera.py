from Button import Button
from Storage import Storage
from FocusControl import FocusControl

class Camera:
    def __init__(self, res = 1000):
        self.__button = Button(res)
        self.__storage = Storage()
        self.__focusDistance = FocusControl()
        
    def makePhoto (self, quantity = 1):
        count = 0
        while count < quantity:
            self.__button.clickButton()
            self.__storage.makePhoto()
            count = count + 1
        
    def deletePhoto (self, quantity = 1):
        count = 0
        while count < quantity:
            self.__storage.deletePhoto()
            count = count + 1
            
    def viewStorage (self):
       print(f"{self.__storage.getPhotoNumber()} memori units are currently occupied in storage")    
        
    def distanceUp (self):
        self.__focusDistance.scrollUp()
        
    def distanceDown (self):
        self.__focusDistance.scrollDown()
        
    def viewDistance (self):
        print(f"{self.__focusDistance.getFocusDistance()} is distance now ")
        
    def viewFocusParameters(self):
        print(f"Minimal distance is {self.__focusDistance.getMinFocusDistance()}")
        print(f"Maximal distance is {self.__focusDistance.getMaxFocusDistance()}")
        print(f"Now distance is {self.__focusDistance.getFocusDistance()}")
class Button: 
    def __init__(self, res=1000000):
        self.__btnResource = res
    def clickButton(self):
        self.__btnResource = self.__btnResource - 1
    def getButtonResource(self):
        return self.__btnResource

class Solution:
    def isNStraightHand(self, hand: List[int], groupSize: int) -> bool:

        isRightElements = False
        isCorrectLength = False

        #determine if the length of hand is divisible by groupSize
        if (len(hand) % groupSize) == 0:
            isCorrectLength = True
        else:
            return False

        #find groupSize number of ascending-by-1 integers
        #start each group with smallest int
        num_groups = len(hand)/groupSize
        while num_groups > 0:
            hand.sort()
            smallestNum = hand[0]
            numWereLookingFor = smallestNum + 1
            soFarItCanBeSolved = True
            groupBeingFormed = []
            groupBeingFormed.append(smallestNum)
            while len(groupBeingFormed) < groupSize:
                if soFarItCanBeSolved and (numWereLookingFor in hand):
                    soFarItCanBeSolved = True
                    groupBeingFormed.append(numWereLookingFor)
                    hand.remove(numWereLookingFor)
                    numWereLookingFor += 1
                else:
                    soFarItCanBeSolved = False
                if soFarItCanBeSolved == False:
                    return False
            num_groups -= 1
            

        if isCorrectLength and isRightElements:
            return True
        else:
            return False

class Solution:
    def isNStraightHand(self, hand: List[int], groupSize: int) -> bool:

        isRightElements = False
        isCorrectLength = False

        #determine if the length of hand is divisible by groupSize
        if (len(hand) % groupSize) == 0:
            isCorrectLength = True
            #print('isCorrectLength = True')
        else:
            return False

        #find groupSize number of ascending-by-1 integers
        #start each group with smallest int
        num_groups = len(hand)/groupSize
        while num_groups > 0:
            #print('hand array is ' + str(hand))
            hand.sort()
            smallestNum = hand[0]
            numWereLookingFor = smallestNum + 1
            soFarItCanBeSolved = True
            groupBeingFormed = []
            groupBeingFormed.append(smallestNum)
            hand.remove(smallestNum)
            while len(groupBeingFormed) < groupSize:
                if soFarItCanBeSolved and (numWereLookingFor in hand):
                    soFarItCanBeSolved = True
                    groupBeingFormed.append(numWereLookingFor)
                    hand.remove(numWereLookingFor)
                    numWereLookingFor += 1
                    #print('groupBeingFormed = ' + str(groupBeingFormed))
                else:
                    soFarItCanBeSolved = False
                if soFarItCanBeSolved == False:
                    return False
            num_groups -= 1
            
        if num_groups == 0:
            #print('isRightElements = true')
            isRightElements = True

        if isCorrectLength and isRightElements:
            return True
        else:
            return False

import subprocess, sys, os, time

def runInstance(numLoops):
    command = "python RunTestSuite.py " + numLoops
    process = subprocess.call(command, shell=True)


numInstances = int(sys.argv[1])
numLoops = sys.argv[2]

timeStart = time.time()

for i in range(numInstances):
    print("Instance " + str(i) + ": ")
    runInstance(numLoops)

timeEnd = time.time()
elapsedTime = timeEnd - timeStart

elapsedMin = int(elapsedTime / 60)
elapsedSec = int(elapsedTime % 60)

if elapsedSec < 10:
    elapsedSec = "0" + str(elapsedSec)

elapsedTime = str(elapsedMin) + ":" + str(elapsedSec)

print("Stress Test Complete. " + str(numInstances) + " ran, each with " + str(numLoops) + " loop(s) Taking " + elapsedTime + " mins")

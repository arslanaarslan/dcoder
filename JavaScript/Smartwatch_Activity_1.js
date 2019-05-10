const activityData = "12221231211";
var numberOfSteps = 0;
var numberOfHeartBeats = 0;
for(var i=0; i < activityData.length; i++){
	if (activityData[i] == 1){
    	numberOfSteps++;
	} 

	if (activityData[i] == 2){
    	numberOfHeartBeats++;
	} 
}

console.log("Number Of Steps: " + numberOfSteps);
console.log("Number Of Heart Beats: " + numberOfHeartBeats);
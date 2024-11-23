
/**
 * @param {list_list_int32} intervals
 * @return {int32}
 */
function can_attend_all_meetings(intervals) {
    // Write your code here.
    let obj = {};
    for(let i = 0; i < intervals.length; i++) {
        const [start,end] = intervals[i];
        obj[`s${i}`] = start;
        obj[`e${i}`] = end;
    }
    const entries = Object.entries(obj);
    const sortedEntries = entries.sort((a, b) => a[1] - b[1]);
    const sortedObj = Object.fromEntries(sortedEntries);
    let curr = 0;
    let min = 1;
    for(let key in sortedObj){
        if(key.includes("s")){
          curr += 1;
        }else {
            curr -= 1;
        }
        if(curr > min) {
              min = curr;
        }
    }
    if(min > 1) {
        return 0;
    }else {
        return 1;
    }
}


/**
 * @param {list_list_int32} intervals
 * @return {int32}
 */
function can_attend_all_meetings(intervals) {
    // Write your code here.
    // let obj = {};
    // for(let i = 0; i < intervals.length; i++) {
    //     const [start,end] = intervals[i];
    //     obj[`s${i}`] = start;
    //     obj[`e${i}`] = end;
    // }
    // const entries = Object.entries(obj);
    // const sortedEntries = entries.sort((a, b) => a[1] - b[1]);
    // const sortedObj = Object.fromEntries(sortedEntries);
    // let curr = 0;
    // let min = 1;
    // for(let key in sortedObj){
    //     if(key.includes("s")){
    //       curr += 1;
    //     }else {
    //         curr -= 1;
    //     }
    //     if(curr > min) {
    //           min = curr;
    //     }
    // }
     intervals.sort((a, b) => a[0] - b[0]);
    for (let i = 1; i < intervals.length; i++) {
        const [prevStart, prevEnd] = intervals[i - 1];
        const [currStart, currEnd] = intervals[i];
        if (currStart < prevEnd) {
            return 0;
        }
    }

    return 1;
  
}

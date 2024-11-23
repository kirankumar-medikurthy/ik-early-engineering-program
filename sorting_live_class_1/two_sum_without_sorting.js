function two_sum(numbers, target) {
    let obj = {}; // Stores the number as key and its index as value
    
    for (let i = 0; i < numbers.length; i++) {
        const complement = target - numbers[i]; // Find the complement
        
        if (obj.hasOwnProperty(complement)) {
            // If complement exists, return indices
            return [obj[complement], i];
        }
        
        // Store the current number's index in the object
        obj[numbers[i]] = i;
    }
    
    // Return default result if no solution is found
    return [-1, -1];
}

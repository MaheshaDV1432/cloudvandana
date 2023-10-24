//B. Perform sorting of an array in descending order.

  function descendingSort(arr) {
    var len = arr.length;
    for (var i = 0; i < len - 1; i++) {
      for (var j = 0; j < len - 1 - i; j++) {
        if (arr[j] < arr[j + 1]) 
        {
          var temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return arr;
  }
  
  var myArray = [4, 2, 7, 1, 9, 3];
  descendingSort(myArray);
  console.log(myArray); // Outputs: [9, 7, 4, 3, 2, 1]
  
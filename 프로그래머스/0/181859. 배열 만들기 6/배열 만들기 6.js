function solution(arr) {
    var answer = [];
    for (let i = 0; i < arr.length; i++) {
        if (answer.length > 0) {
            if (arr[i] === answer[answer.length - 1]) {
                answer.pop();
            } else {
                answer.push(arr[i]);
            }
        } else {
            answer.push(arr[i]);
        }
    }
    if (answer.length === 0) {
        answer.push(-1);
    }
    return answer;
}
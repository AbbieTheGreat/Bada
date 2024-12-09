function appendToDisplay(value) {
    document.getElementById('calc-display').value += value;
}

function calculateResult() {
    try {
        document.getElementById('calc-display').value = eval(document.getElementById('calc-display').value);
    } catch (error) {
        document.getElementById('calc-display').value = 'Error';
    }
}

function clearDisplay() {
    document.getElementById('calc-display').value = '';
}

document.addEventListener('keydown', function (event) {
    // Check if the pressed key is a number or an operator
    if ((event.key >= '0' && event.key <= '9') || ['+', '-', '*', '/'].includes(event.key)) {
        event.preventDefault();
        appendToDisplay(event.key);
    } else if (event.key === '.' || event.key === 'Enter') {
        event.preventDefault();
        // Handle the dot key or Enter key if needed
        if (event.key === '.') {
            appendToDisplay(event.key);
        } else if (event.key === 'Enter') {
            calculateResult();
        }
    } else if (event.key === 'Backspace') {
        event.preventDefault();
        clearDisplay();
    }
});


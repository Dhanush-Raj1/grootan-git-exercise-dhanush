const express = require('express');
const app = express();

const userData = {
  name: 'Groot',
  email: 'ven@diesel.com',
  avatar: 'https://i.pravatar.cc/150'
};

app.get('/', (req, res) => {
  res.send('Welcome!');
});

app.get('/profile', (req, res) => {
  res.json(userData); 
});

const PORT = 3000;
app.listen(PORT, () => {
  console.log(`Server running on port ${PORT}`);
});
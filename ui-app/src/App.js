import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import axios from 'axios'

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      name: '',
    }
  }
  componentDidMount() {
    axios.get('/rest/resource/accounts')
    .then(response => {
      console.log(response.data);
      let nameStr=response.data[0].uname
      this.setState({ name: nameStr });
    })
    .catch(error => {
      console.log(error);
    });
  }
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <p>
            Welcome :{this.state.name}
          </p>
         
        </header>
      </div>
    );
  }
}

export default App;

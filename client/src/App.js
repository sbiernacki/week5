import './App.css';
import {Component} from "react";
import axios from "axios";
import WeatherForm from "./WeatherForm";
import WeatherData from "./WeatherData";

class App extends Component {

    constructor(props) {
        super(props);
        this.HandleSubmitMethod = this.handleSubmit.bind(this)
        this.state =
            {
                Weather: []
            };
    }

    handleSubmit(event) {
        let city = event.target.city.value;
        let self = this;
        axios.get(`http://localhost:8080/weather/${city}`)
            .then(function (response) {
                self.setState({Weather: response.data});
                console.log(response.data);
            })
            .catch(exception => console.log(exception));
        event.preventDefault();
    }

    render() {
        return (
            <div>
                <WeatherForm submitFunction={this.HandleSubmitMethod} ></WeatherForm>
                <WeatherData weatherData={this.state.Weather}></WeatherData>
            </div>
        );
    }
}

export default App;

import './App.css';

function WeatherData(props) {
    const weatherData = (typeof(props.weatherData.data) !== 'undefined' && props.weatherData.data !== null && Array.isArray(props.weatherData.data))? props.weatherData.data : [];

    return (
        <div>
            <table>
                {weatherData.map((item, index) =>
                    <ul key={index}>
                        <li><img src={item.imgSrc}/></li>
                        <li>Miasto: {item.city}</li>
                        <li>Kraj: {item.countryCode}</li>
                        <li>Wilgotność: {item.humidity}%</li>
                        <li>Zachmurzenie: {item.couldCoverage}%</li>
                        <li>Ciśnienie: {item.pressure} hPa</li>
                        <li>Temperatura: {item.temp}</li>
                    </ul>
                )}
            </table>
        </div>
    )
};

export default WeatherData;

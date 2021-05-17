import './App.css';

function WeatherForm(props) {
    const submitFunction = props.submitFunction;

    return (
        <div>
            <form onSubmit={ (event)=>{submitFunction(event)} }>
                <label>
                    Miasto:
                    <input type="text" name="city"/>
                </label>
                <input type="submit" value="Wyślij"/>
            </form>
        </div>
    )
}

export default WeatherForm;

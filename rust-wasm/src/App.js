import React from "react";

import "./App.css";

export default class App extends React.Component {

    state = {
        wasm: undefined,
        number: 0,
        result: undefined
    };

    componentDidMount() {
        import("fibonacci").then(module => {
            this.setState({
                wasm: module
            })
        });
    }

    calculateFibonacci = () => {
        if (this.state.number) {
            const result = this.state.wasm.fib(this.state.number);
            this.setState({
                result: result
            })
        }
    };

    reset = () => {
      this.setState({
          number: 0,
          result: undefined
      })
    };

    render() {
        return (
            <div>
                {this.renderResult()}
                <div className="row">
                    <label htmlFor="number-input">Number:</label>
                    <input id="number-input" value={this.state.number} type="number"
                           onChange={(event) => this.setState({number: event.target.value})}/>
                </div>
                <button onClick={this.calculateFibonacci}>Calculate</button>
                <button onClick={this.reset}>Clear</button>
            </div>
        )
    }

    renderResult() {
        if (this.state.result) {
            return (
                <div className="row">
                    <span>Result: {this.state.result}</span>
                </div>
            )
        }
        return null;
    }
}
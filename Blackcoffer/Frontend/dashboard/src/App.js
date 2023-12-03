import './App.css';
import BarChart from "./Components/BarChart";
import LineChart from './Components/LineChart';
import NavBar from './Components/NavBar';
import PolarAreaChart from './Components/PolarAreaChart';
import RadarChart from './Components/RadarChart';
// import DoughtnutChart from "./Components/DoughtnutChart";
// import HorizontalChart from './Components/BarChart';

function App() {
  return (
    <div className="App">
      <NavBar/>
      <BarChart/>
      <LineChart/>
      <PolarAreaChart/>
      <RadarChart/>
    </div>
  );
}

export default App;

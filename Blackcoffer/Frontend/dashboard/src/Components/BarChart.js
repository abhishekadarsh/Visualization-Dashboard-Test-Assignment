import { useEffect, useState } from 'react';
import {
  Chart as ChartJS,
  CategoryScale,
  LinearScale,
  BarElement,
  Title,
  Tooltip,
  Legend,
} from 'chart.js';

import { Bar } from 'react-chartjs-2';
ChartJS.register(
  CategoryScale,
  LinearScale,
  BarElement,
  Title,
  Tooltip,
  Legend
);
const options = {
  indexAxis: 'x',
  responsive: true,
  plugins: {
    legend: {
      position: 'top',
    },
    title: {
      display: true,
      text: 'Bar Chart Presentation',
    },
  },
};

const BarChart = () => {
const [data, setData] = useState({
    labels: [],
    datasets: [],
  });
  useEffect(() => {
    const fetchData = async () => {
      const url = 'http://localhost:8080/api/data/all'
      const labelSet = []
      const dataSet1 = [];
      const dataSet2 = [];
      const dataSet3 = [];
      await fetch(url).then((data) => {
        console.log("Api data", data)
        const res = data.json();
        return res
      }).then((res) => {
        //  console.log("ressss", res)
        for (const val of res) {
          dataSet1.push(val.intensity);
          dataSet2.push(val.relevance)
          dataSet3.push(val.likelihood);
          labelSet.push(val.sector)
        }
        setData({
          labels: labelSet,
          datasets: [
            {
              label: 'Intensity',
              data: dataSet1,
              backgroundColor: 'red',
            },
            {
              label: 'Relevance',
              data: dataSet2,
              backgroundColor: 'green',
            },
            {
              label: 'Likelihood',
              data: dataSet2,
              backgroundColor: 'blue',
            },
          ],
        })
        // console.log("arrData", dataSet1, dataSet2)
      }).catch(e => {
        console.log("error", e)
      })
    }

    fetchData();
  }, [])

  return (
    <div style={{
      padding: "0px 50px 0px 50px",
      borderRadius: "5%",
      margin: "auto",
      marginTop: "50px",
    }}>
      <div style={{
        width: "80%",
        border: "2px solid black",
        padding: "10px",
        borderRadius: "5%",
        margin: "15px auto"
      }}>
        <Bar data={data} options={options} />
      </div>
    </div>)
}
export default BarChart;
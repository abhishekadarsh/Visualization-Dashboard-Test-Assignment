import { useEffect, useState } from 'react';
import React from 'react';
import {
  Chart as ChartJS,
  RadialLinearScale,
  PointElement,
  LineElement,
  Filler,
  Tooltip,
  Legend,
} from 'chart.js';
import { Radar } from 'react-chartjs-2';

ChartJS.register(
  RadialLinearScale,
  PointElement,
  LineElement,
  Filler,
  Tooltip,
  Legend
);

const options = {
    responsive: true,
    plugins: {
      legend: {
        position: 'top',
      },
      title: {
        display: true,
        text: 'Radar Chart Presentation',
      },
    },
  };

const RadarChart = () => {
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
              backgroundColor:'red',
              borderColor: "rgb(255, 99, 132)",
              borderWidth: 1,
            },
            {
              label: 'Relevance',
              data: dataSet2,
              backgroundColor: 'green',
              borderColor: "rgb(75, 192, 192)",
              borderWidth: 1,
            },
            {
              label: 'Likelihood',
              data: dataSet2,
              backgroundColor: 'blue',
              borderColor: "rgb(201, 203, 207)",
              borderWidth: 1,
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
        <Radar data={data} options={options}/>
      </div>
    </div>)
}
export default RadarChart;
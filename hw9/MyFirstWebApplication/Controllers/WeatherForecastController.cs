using Microsoft.AspNetCore.Mvc;
using MyFirstWebApplication.Models;

namespace MyFirstWebApplication.Controllers
{
    [Route("weather")]
    [ApiController]
    public class WeatherForecastController : ControllerBase
    {
        private WeatherForecastModel _weatherForecastModel;

        public WeatherForecastController(WeatherForecastModel weatherForecastModel)
        {
            _weatherForecastModel = weatherForecastModel;
        }

        [HttpPost("add")]
        public IActionResult Add(DateTime date, int temtemperatureC)
        {
            _weatherForecastModel.Add(date, temtemperatureC);
            return Ok();
        }

        [HttpPut("update")]
        public IActionResult Update(DateTime date, int temtemperatureC)
        {
            _weatherForecastModel.Update(date, temtemperatureC);
            return Ok();
        }

        [HttpDelete("delete")]
        public IActionResult Delete(DateTime date) 
        {
            _weatherForecastModel.Delete(date);
            return Ok();
        }

        [HttpGet("getall")]
        public ActionResult<List<WeatherForecast>> GetAll(DateTime dateFrom, DateTime dateTo)
        {
            List< WeatherForecast> listByDate=_weatherForecastModel.GetAll(dateFrom, dateTo);
            return Ok(listByDate);
        }
    }
}
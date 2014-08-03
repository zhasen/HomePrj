using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;


namespace EssentialWCF02
{
    [ServiceContract]
    public interface IStockService
    {
        [OperationContract]
        double GetPrice(string ticker);
    }

    public class StockService : IStockService
    {
        public double GetPrice(string ticker)
        {
            return 94.43;
        }
    }


    public class Program
    {
        public static void Main(string[] args)
        {
            ServiceHost serviceHost = new ServiceHost(typeof(StockService));
            
            serviceHost.Open();
            
            Console.WriteLine("Press <ENTER> to terminate. \n \n");
            Console.ReadLine();

            serviceHost.Close();
        }
    }
}

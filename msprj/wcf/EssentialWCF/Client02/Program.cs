using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Client02
{
    class Program
    {
        static void Main(string[] args)
        {
            WCFClient.StockServiceClient temp = new WCFClient.StockServiceClient();
            double p = temp.GetPrice("fdsa");
            Console.WriteLine(p);
            temp.Close();
            Console.Read();
            
        }
    }
}

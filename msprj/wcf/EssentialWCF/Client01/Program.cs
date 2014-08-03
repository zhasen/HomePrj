using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ServiceModel;
using EssentialWCF;

namespace Client01
{
    class Program
    {
        static void Main(string[] args)
        {
            ChannelFactory<IStockService> myChannelFactory = new ChannelFactory<IStockService>(
                new BasicHttpBinding(),
                new EndpointAddress("http://localhost:8000/EssentialWCF")
                );
            IStockService wcfClient = myChannelFactory.CreateChannel();
            double p = wcfClient.GetPrice("fdsa");
            Console.WriteLine(p);
            Console.Read();
        }
    }
}

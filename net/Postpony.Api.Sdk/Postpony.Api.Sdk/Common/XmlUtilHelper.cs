using System;
using System.IO;
using System.Text;
using System.Xml;
using System.Xml.Serialization;

namespace Postpony.Api.Sdk.Common
{


    public class XmlUtilHelper
    {

        /// <summary>
        /// 对象反序列化
        /// </summary>
        /// <typeparam name="T"></typeparam>
        /// <param name="xmlContent"></param>
        /// <returns></returns>
        public static T DeSerializedEntity<T>(string xmlContent) where T : class
        {
            var stringReader = new StringReader(xmlContent);
            var xmlSerializer = new XmlSerializer(typeof(T));
            return xmlSerializer.Deserialize(stringReader) as T;
        }

        public static string SerializedEntity<T>(T obj)
        {
            return SerializedEntity(obj,Encoding.UTF8);
        }

        /// <summary>
        /// 对象序列化
        /// </summary>
        /// <typeparam name="T"></typeparam>
        /// <param name="obj"></param>
        /// <param name="encode"></param>
        /// <returns></returns>
        public static string SerializedEntity<T>(T obj, Encoding encode)
        {
            String xmlizedString;
            using (var memoryStream = new MemoryStream())
            {
                var xs = new XmlSerializer(typeof(T));
                var xmlTextWriter = new XmlTextWriter(memoryStream, encode);
                xs.Serialize(xmlTextWriter, obj);
                xmlizedString = Utf8ByteArrayToString(((MemoryStream)xmlTextWriter.BaseStream).ToArray()).Trim();
                xmlTextWriter.Close();
            }
            return xmlizedString;
        }

        private static String Utf8ByteArrayToString(Byte[] characters)
        {

            var encoding = new UTF8Encoding();
            var constructedString = encoding.GetString(characters);
            return (constructedString);
        }
    }
}

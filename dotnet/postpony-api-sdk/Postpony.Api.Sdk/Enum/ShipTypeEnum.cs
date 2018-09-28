using Postpony.Api.Sdk.Common;

namespace Postpony.Api.Sdk.Enum
{
    public enum ShipTypeEnum
    {
        [EnumDescription("None")]
        None = 0,

        [EnumDescription("USPS Priority Mail(Normal)")]
        UspsPriorityMail = 1,

        [EnumDescription("USPS Priority Mail Express")]
        UspsPriorityMailExpress = 2,

        [EnumDescription("USPS Priority Mail International")]
        UspsPriorityMailInternational = 3,

        [EnumDescription("USPS Priority Mail Express International")]
        UspsPriorityMailExpressInternational = 4,

        [EnumDescription("Usps First Class International Service")]
        UspsFirstClassPackageInternationalService = 5,

        [EnumDescription("FedEx Priority Overnight")]
        FedExPriorityOvernight = 6,

        [EnumDescription("FedEx Standard Overnight")]
        FedExStandardOvernight = 7,

        [EnumDescription("FedEx 2Day A.M.")]
        FedEx2DayAM = 8,

        [EnumDescription("FedEx 2Day")]
        FedEx2Day = 9,

        [EnumDescription("FedEx Express Saver")]
        FedExExpressSaver = 10,

        [EnumDescription("FedEx Ground")]
        FedExGround = 11,

        [EnumDescription("FedEx Home Delivery")]
        FedExHomeDelivery = 12,

        [EnumDescription("FedEx SmartPost")]
        FedExSmartPost = 13,

        [EnumDescription("FedEx International Priority")]
        FedExInternationalPriority = 14,

        [EnumDescription("FedEx International Economy")]
        FedExInternationalEconomy = 15,

        [EnumDescription("FedEx International Priority")]
        FedExInternationalPriorityFreight = 16,

        [EnumDescription("FedEx International Economy")]
        FedExInternationalEconomyFreight = 17,

        [EnumDescription("USPS Media Mail")]
        UspsMediaMail = 25,

        [EnumDescription("USPS First-Class Mail")]
        UspsFirstClassMail = 26,

        [EnumDescription("USPS Priority Mail Cubic")]
        UspsPriorityMailCubic = 27,

        [EnumDescription("Priority Mail Flat Rate Envelope")]
        UspsPriorityMailFlatRateEnvelope = 28,

        [EnumDescription("Priority Mail Legal Flat Rate Envelope")]
        UspsPriorityMailLegalFlatRateEnvelope = 29,

        [EnumDescription("Priority Mail Flat Rate Padded Envelope")]
        UspsPriorityMailFlatRatePaddedEnvelope = 30,

        [EnumDescription("Priority Mail Small Flat Rate Box")]
        UspsPriorityMailSmallFlatRateBox = 31,

        [EnumDescription("Priority Mail Medium Flat Rate Box")]
        UspsPriorityMailMediumFlatRateBox = 32,

        [EnumDescription("Priority Mail Large Flat Rate Box")]
        UspsPriorityMailLargeFlatRateBox = 33,

        [EnumDescription("Priority Mail Regional Rate Box A")]
        UspsPriorityMailRegionalRateBoxA = 34,

        [EnumDescription("Priority Mail Regional Rate Box B")]
        UspsPriorityMailRegionalRateBoxB = 35,

        [EnumDescription("Priority Mail Regional Rate Box C")]
        UspsPriorityMailRegionalRateBoxC = 36,

        [EnumDescription("Priority Mail International Flat Rate Envelope")]
        UspsPriorityMailInternationalFlatRateEnvelope = 37,

        [EnumDescription("Priority Mail International Flat Rate Legal Envelope")]
        UspsPriorityMailInternationalFlatRateLegalEnvelope = 38,

        [EnumDescription("Priority Mail International Flat Rate Padded Envelope")]
        UspsPriorityMailInternationalFlatRatePaddedEnvelope = 39,

        [EnumDescription("Priority Mail International Small Flat Rate Box")]
        UspsPriorityMailInternationalSmallFlatRateBox = 40,

        [EnumDescription("Priority Mail International Medium Flat Rate Box")]
        UspsPriorityMailInternationalMediumFlatRateBox = 41,

        [EnumDescription("Priority Mail International Large Flat Rate Box")]
        UspsPriorityMailInternationalLargeFlatRateBox = 42,

        [EnumDescription("Priority Mail International Regional Rate Box A")]
        UspsPriorityMailInternationalRegionalRateBoxA = 43,

        [EnumDescription("Priority Mail International Regional Rate Box B")]
        UspsPriorityMailInternationalRegionalRateBoxB = 44,

        [EnumDescription("Priority Mail International Regional Rate Box C")]
        UspsPriorityMailInternationalRegionalRateBoxC = 45,
        //[EnumDescription("Priority Mail Small Flat Rate Box")]
        //PriorityMailSmallFlatRateBox=46

        [EnumDescription("Usps First Class Mail International")]
        UspsFirstClassInternationalLargeEnvFlat = 58,



        [EnumDescription("Ups Next Day Air ")]
        UpsNextDayAir = 70,

        [EnumDescription("Ups 2nd Day Air")]
        Ups2NdDayAir = 71,


        [EnumDescription("Ups Ground")]
        UpsGround = 72,


        [EnumDescription("Ups 3 Day Select ")]
        Ups3DaySelect = 73,

        [EnumDescription("Ups Next Day Air Saver")]
        UpsNextDayAirSaver = 74,

        [EnumDescription("UPS Next Day Air Early")]
        UpsNextDayAirEarly = 75,

        [EnumDescription("Ups 2nd Day Air A.M.")]
        Ups2NdDayAirAm = 76,

        [EnumDescription("Ups Worldwide Express")]
        UpsExpress = 80,

        [EnumDescription("Ups Worldwide Expedited ")]
        UpsExpedited = 81,

        [EnumDescription("Ups Worldwide ExpressPlus")]
        UpsExpressPlus = 82,

        [EnumDescription("Ups Saver")]
        UpsSaver = 83,

        [EnumDescription("PostPony Priority")]
        UpsPmi = 84,


        [EnumDescription("PostPony Express")]
        UPSPMEI = 85,


        [EnumDescription("Ups SurePost")]
        UpsSurePost = 86,

        [EnumDescription("UPS Ground Freight Pricing")]
        UpsGroundFreghtPricing = 87,

        [EnumDescription("DHL SM Parcel Expedited")]
        DhlSmParcelExpedited = 111,

        [EnumDescription("DHL SM Parcel Ground")]
        DhlSmParcelGround = 112,

        [EnumDescription("DHL SM Parcel Expedited Plus")]
        DhlSmParcelExpeditedPlus = 113,

        [EnumDescription("DHL SM Parcel Ground Plus")]
        DhlSmParcelGroundPlus = 114,


        [EnumDescription("DHL SM Parcel Expedited Max")]
        DhlSmparcelExpeditedMax = 115,

    }
}

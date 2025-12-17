package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Verified: ImageVector
    get() {
        if (_Verified != null) return _Verified!!
        
        _Verified = ImageVector.Builder(
            name = "verified",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.335f, 2.06526f)
                lineTo(11.4114f, 2.21783f)
                lineTo(11.9879f, 3.75081f)
                curveTo(12.0332f, 3.87153f, 12.1284f, 3.96679f, 12.2492f, 4.01208f)
                lineTo(13.7292f, 4.56735f)
                curveTo(14.3787f, 4.81102f, 14.7278f, 5.50506f, 14.5547f, 6.16172f)
                lineTo(14.5131f, 6.2924f)
                lineTo(13.8245f, 7.81523f)
                curveTo(13.7712f, 7.93262f, 13.7712f, 8.06733f, 13.8245f, 8.18472f)
                lineTo(14.4784f, 9.62393f)
                curveTo(14.7654f, 10.2555f, 14.5214f, 10.9931f, 13.9347f, 11.335f)
                lineTo(13.7822f, 11.4114f)
                lineTo(12.2492f, 11.9879f)
                curveTo(12.1284f, 12.0332f, 12.0332f, 12.1284f, 11.9879f, 12.2491f)
                lineTo(11.4326f, 13.7292f)
                curveTo(11.189f, 14.3787f, 10.4949f, 14.7277f, 9.83826f, 14.5547f)
                lineTo(9.70758f, 14.513f)
                lineTo(8.18475f, 13.8245f)
                curveTo(8.06736f, 13.7711f, 7.93265f, 13.7711f, 7.81526f, 13.8245f)
                lineTo(6.37605f, 14.4784f)
                curveTo(5.74448f, 14.7654f, 5.00693f, 14.5214f, 4.66498f, 13.9347f)
                lineTo(4.58856f, 13.7821f)
                lineTo(4.01211f, 12.2491f)
                curveTo(3.96682f, 12.1284f, 3.87156f, 12.0332f, 3.75084f, 11.9879f)
                lineTo(2.27076f, 11.4326f)
                curveTo(1.62126f, 11.1889f, 1.27224f, 10.4949f, 1.44531f, 9.83823f)
                lineTo(1.48695f, 9.70755f)
                lineTo(2.17552f, 8.18472f)
                curveTo(2.22886f, 8.06733f, 2.22886f, 7.93262f, 2.17552f, 7.81523f)
                lineTo(1.52159f, 6.37602f)
                curveTo(1.23462f, 5.74445f, 1.47858f, 5.0069f, 2.06529f, 4.66495f)
                lineTo(2.21786f, 4.58853f)
                lineTo(3.75084f, 4.01208f)
                curveTo(3.87156f, 3.96679f, 3.96682f, 3.87153f, 4.01211f, 3.75081f)
                lineTo(4.56738f, 2.27073f)
                curveTo(4.81105f, 1.62123f, 5.50509f, 1.27221f, 6.16175f, 1.44528f)
                lineTo(6.29243f, 1.48692f)
                lineTo(7.81526f, 2.17549f)
                curveTo(7.93265f, 2.22883f, 8.06736f, 2.22883f, 8.18475f, 2.17549f)
                lineTo(9.62396f, 1.52156f)
                curveTo(10.2555f, 1.23459f, 10.9931f, 1.47855f, 11.335f, 2.06526f)
                close()
                moveTo(5.40367f, 2.58448f)
                lineTo(4.84839f, 4.06455f)
                curveTo(4.71252f, 4.42672f, 4.42675f, 4.71249f, 4.06458f, 4.84836f)
                lineTo(2.58451f, 5.40364f)
                lineTo(2.48653f, 5.45494f)
                curveTo(2.31249f, 5.57555f, 2.24409f, 5.80692f, 2.33479f, 6.00653f)
                lineTo(2.98872f, 7.44574f)
                curveTo(3.14873f, 7.7979f, 3.14873f, 8.20204f, 2.98872f, 8.55421f)
                lineTo(2.32878f, 10.0073f)
                lineTo(2.30178f, 10.099f)
                curveTo(2.264f, 10.3073f, 2.37924f, 10.5193f, 2.58451f, 10.5963f)
                lineTo(4.06458f, 11.1516f)
                curveTo(4.42675f, 11.2875f, 4.71252f, 11.5732f, 4.84839f, 11.9354f)
                lineTo(5.40367f, 13.4155f)
                lineTo(5.45497f, 13.5135f)
                curveTo(5.57558f, 13.6875f, 5.80695f, 13.7559f, 6.00656f, 13.6652f)
                lineTo(7.44577f, 13.0113f)
                curveTo(7.79793f, 12.8512f, 8.20207f, 12.8512f, 8.55424f, 13.0113f)
                lineTo(10.0073f, 13.6712f)
                lineTo(10.099f, 13.6982f)
                curveTo(10.3074f, 13.736f, 10.5193f, 13.6207f, 10.5963f, 13.4155f)
                lineTo(11.1516f, 11.9354f)
                curveTo(11.2875f, 11.5732f, 11.5733f, 11.2875f, 11.9354f, 11.1516f)
                lineTo(13.4155f, 10.5963f)
                lineTo(13.5135f, 10.545f)
                curveTo(13.6875f, 10.4244f, 13.7559f, 10.193f, 13.6652f, 9.99342f)
                lineTo(13.0113f, 8.55421f)
                curveTo(12.8513f, 8.20204f, 12.8513f, 7.7979f, 13.0113f, 7.44574f)
                lineTo(13.6712f, 5.99269f)
                lineTo(13.6982f, 5.90097f)
                curveTo(13.736f, 5.69262f, 13.6208f, 5.48065f, 13.4155f, 5.40364f)
                lineTo(11.9354f, 4.84836f)
                curveTo(11.5733f, 4.71249f, 11.2875f, 4.42672f, 11.1516f, 4.06455f)
                lineTo(10.5963f, 2.58448f)
                lineTo(10.545f, 2.4865f)
                curveTo(10.4244f, 2.31246f, 10.1931f, 2.24406f, 9.99345f, 2.33476f)
                lineTo(8.55424f, 2.98869f)
                curveTo(8.20207f, 3.1487f, 7.79793f, 3.1487f, 7.44577f, 2.98869f)
                lineTo(6.00656f, 2.33476f)
                lineTo(5.97869f, 2.32321f)
                curveTo(5.74775f, 2.23657f, 5.49031f, 2.35355f, 5.40367f, 2.58448f)
                close()
                moveTo(6.97825f, 9.34663f)
                lineTo(10.1639f, 5.70588f)
                curveTo(10.3263f, 5.52026f, 10.6085f, 5.50145f, 10.7941f, 5.66387f)
                curveTo(10.9565f, 5.80599f, 10.9912f, 6.03977f, 10.8885f, 6.22035f)
                lineTo(10.8361f, 6.29406f)
                lineTo(7.33611f, 10.2941f)
                curveTo(7.18725f, 10.4642f, 6.93964f, 10.4931f, 6.75769f, 10.3753f)
                lineTo(6.68421f, 10.3158f)
                lineTo(5.18421f, 8.81577f)
                curveTo(5.0098f, 8.64136f, 5.0098f, 8.35859f, 5.18421f, 8.18418f)
                curveTo(5.33682f, 8.03157f, 5.57239f, 8.0125f, 5.74574f, 8.12695f)
                lineTo(5.8158f, 8.18418f)
                lineTo(6.97825f, 9.34663f)
                lineTo(10.1639f, 5.70588f)
                lineTo(6.97825f, 9.34663f)
                close()
            }
        }.build()
        
        return _Verified!!
    }

private var _Verified: ImageVector? = null


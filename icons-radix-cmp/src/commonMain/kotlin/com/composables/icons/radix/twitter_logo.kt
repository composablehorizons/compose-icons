package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.TwitterLogo: ImageVector
    get() {
        if (_TwitterLogo != null) return _TwitterLogo!!
        
        _TwitterLogo = ImageVector.Builder(
            name = "twitter-logo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.3603f, 1.56857f)
                curveTo(11.3726f, 1.56868f, 12.1792f, 2.04883f, 12.7217f, 2.74338f)
                curveTo(13.3056f, 2.62435f, 13.855f, 2.41008f, 14.3515f, 2.11545f)
                curveTo(14.1558f, 2.72714f, 13.7404f, 3.23976f, 13.2002f, 3.56467f)
                curveTo(13.2006f, 3.56561f, 13.2008f, 3.56665f, 13.2012f, 3.5676f)
                curveTo(13.7312f, 3.50361f, 14.2356f, 3.36351f, 14.7051f, 3.15549f)
                lineTo(14.7041f, 3.15744f)
                curveTo(14.3667f, 3.66272f, 13.9408f, 4.10673f, 13.4531f, 4.46994f)
                curveTo(13.4794f, 4.64675f, 13.4961f, 4.82424f, 13.4961f, 5.00119f)
                curveTo(13.4959f, 8.68736f, 10.6872f, 12.9747f, 5.52146f, 12.9748f)
                curveTo(4.0381f, 12.9748f, 2.64973f, 12.5673f, 1.45994f, 11.8606f)
                lineTo(1.22557f, 11.7151f)
                lineTo(1.14549f, 11.6526f)
                curveTo(0.978975f, 11.4903f, 0.943913f, 11.228f, 1.0742f, 11.0246f)
                curveTo(1.08745f, 11.004f, 1.10252f, 10.985f, 1.11814f, 10.967f)
                curveTo(1.19175f, 10.8454f, 1.31979f, 10.7624f, 1.46482f, 10.7502f)
                lineTo(1.55564f, 10.7522f)
                lineTo(1.79588f, 10.7756f)
                curveTo(2.62975f, 10.8387f, 3.45483f, 10.7158f, 4.19041f, 10.3947f)
                curveTo(3.46411f, 10.0737f, 2.88525f, 9.48026f, 2.58396f, 8.74435f)
                lineTo(2.50193f, 8.51974f)
                curveTo(2.45359f, 8.36869f, 2.48868f, 8.20302f, 2.59373f, 8.0842f)
                curveTo(2.59748f, 8.07996f, 2.60156f, 8.07558f, 2.60545f, 8.0715f)
                curveTo(1.96466f, 7.5076f, 1.55955f, 6.68166f, 1.55955f, 5.76096f)
                verticalLineTo(5.72775f)
                curveTo(1.55964f, 5.56846f, 1.64397f, 5.41992f, 1.78123f, 5.33908f)
                curveTo(1.82689f, 5.31225f, 1.8772f, 5.29675f, 1.92771f, 5.28732f)
                curveTo(1.70714f, 4.86273f, 1.58104f, 4.38054f, 1.58103f, 3.86935f)
                curveTo(1.58104f, 3.4015f, 1.58372f, 2.81147f, 1.91307f, 2.28049f)
                curveTo(1.98613f, 2.16285f, 2.10507f, 2.09173f, 2.2324f, 2.07346f)
                curveTo(2.39179f, 2.022f, 2.5697f, 2.05335f, 2.70213f, 2.16135f)
                lineTo(2.77439f, 2.23264f)
                lineTo(3.00779f, 2.5051f)
                curveTo(4.08476f, 3.69614f, 5.5655f, 4.50969f, 7.23435f, 4.73654f)
                curveTo(7.23419f, 4.72321f, 7.23338f, 4.70987f, 7.23338f, 4.6965f)
                curveTo(7.23338f, 2.96907f, 8.63376f, 1.56861f, 10.3603f, 1.56857f)
                close()
                moveTo(10.3603f, 2.56857f)
                curveTo(9.18632f, 2.56861f, 8.23338f, 3.52108f, 8.23338f, 4.6965f)
                curveTo(8.23339f, 4.86293f, 8.25214f, 5.02527f, 8.28807f, 5.18283f)
                curveTo(8.32288f, 5.33548f, 8.28425f, 5.49554f, 8.18357f, 5.61545f)
                curveTo(8.10812f, 5.70523f, 8.0046f, 5.76455f, 7.89158f, 5.78537f)
                lineTo(7.77635f, 5.79318f)
                curveTo(5.7091f, 5.68908f, 3.8518f, 4.79824f, 2.49412f, 3.41623f)
                curveTo(2.48398f, 3.55192f, 2.48143f, 3.70159f, 2.48143f, 3.86935f)
                curveTo(2.48143f, 4.62437f, 2.86582f, 5.29116f, 3.45018f, 5.68185f)
                lineTo(3.50779f, 5.72775f)
                curveTo(3.6329f, 5.84505f, 3.68155f, 6.02618f, 3.62791f, 6.19357f)
                curveTo(3.56643f, 6.38484f, 3.38534f, 6.51262f, 3.18455f, 6.50607f)
                curveTo(2.97133f, 6.49907f, 2.76381f, 6.46843f, 2.56346f, 6.42014f)
                curveTo(2.8004f, 7.16641f, 3.42715f, 7.73936f, 4.20603f, 7.89572f)
                curveTo(4.41054f, 7.93692f, 4.56037f, 8.11398f, 4.56736f, 8.32248f)
                curveTo(4.5741f, 8.53102f, 4.43577f, 8.71718f, 4.23435f, 8.7717f)
                curveTo(4.05423f, 8.82038f, 3.86801f, 8.85105f, 3.67771f, 8.86642f)
                curveTo(4.06681f, 9.39585f, 4.68916f, 9.74361f, 5.39256f, 9.75607f)
                curveTo(5.58291f, 9.75946f, 5.7509f, 9.88225f, 5.8115f, 10.0627f)
                curveTo(5.87201f, 10.2432f, 5.81189f, 10.4423f, 5.66209f, 10.5598f)
                curveTo(4.95354f, 11.1151f, 4.13125f, 11.4529f, 3.27439f, 11.6018f)
                curveTo(3.97935f, 11.8428f, 4.73463f, 11.9748f, 5.52146f, 11.9748f)
                curveTo(10.0201f, 11.9747f, 12.4959f, 8.25734f, 12.4961f, 5.00119f)
                curveTo(12.4961f, 3.7126f, 11.5945f, 2.56878f, 10.3603f, 2.56857f)
                close()
            }
        }.build()
        
        return _TwitterLogo!!
    }

private var _TwitterLogo: ImageVector? = null


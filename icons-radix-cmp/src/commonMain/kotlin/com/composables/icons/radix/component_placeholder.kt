package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ComponentPlaceholder: ImageVector
    get() {
        if (_ComponentPlaceholder != null) return _ComponentPlaceholder!!
        
        _ComponentPlaceholder = ImageVector.Builder(
            name = "component-placeholder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.2249f, 12.7395f)
                curveTo(7.41898f, 12.6113f, 7.68295f, 12.6321f, 7.85381f, 12.803f)
                curveTo(8.0489f, 12.9981f, 8.04875f, 13.3147f, 7.85381f, 13.51f)
                curveTo(7.65857f, 13.7052f, 7.34204f, 13.7052f, 7.14677f, 13.51f)
                curveTo(6.95151f, 13.3147f, 6.95151f, 12.9982f, 7.14677f, 12.803f)
                curveTo(7.17106f, 12.7787f, 7.19733f, 12.7577f, 7.2249f, 12.7395f)
                close()
                moveTo(5.73174f, 11.3889f)
                curveTo(5.92692f, 11.1937f, 6.24348f, 11.1939f, 6.43877f, 11.3889f)
                curveTo(6.63403f, 11.5842f, 6.63403f, 11.9007f, 6.43877f, 12.0959f)
                curveTo(6.24349f, 12.291f, 5.92694f, 12.2911f, 5.73174f, 12.0959f)
                curveTo(5.53678f, 11.9007f, 5.53674f, 11.5841f, 5.73174f, 11.3889f)
                close()
                moveTo(8.56084f, 11.3889f)
                curveTo(8.75611f, 11.1938f, 9.07266f, 11.1937f, 9.26787f, 11.3889f)
                curveTo(9.46299f, 11.5841f, 9.46295f, 11.9007f, 9.26787f, 12.0959f)
                curveTo(9.07264f, 12.2912f, 8.75611f, 12.2911f, 8.56084f, 12.0959f)
                curveTo(8.36557f, 11.9007f, 8.36557f, 11.5842f, 8.56084f, 11.3889f)
                close()
                moveTo(4.31767f, 9.97483f)
                curveTo(4.5129f, 9.7796f, 4.82943f, 9.77968f, 5.0247f, 9.97483f)
                curveTo(5.21997f, 10.1701f, 5.21997f, 10.4866f, 5.0247f, 10.6819f)
                curveTo(4.82943f, 10.8769f, 4.51287f, 10.8771f, 4.31767f, 10.6819f)
                curveTo(4.12258f, 10.4867f, 4.12264f, 10.1701f, 4.31767f, 9.97483f)
                close()
                moveTo(9.9749f, 9.97483f)
                curveTo(10.1702f, 9.77957f, 10.4867f, 9.77957f, 10.6819f, 9.97483f)
                curveTo(10.8771f, 10.1701f, 10.8772f, 10.4866f, 10.6819f, 10.6819f)
                curveTo(10.4867f, 10.8771f, 10.1702f, 10.877f, 9.9749f, 10.6819f)
                curveTo(9.77964f, 10.4866f, 9.77965f, 10.1701f, 9.9749f, 9.97483f)
                close()
                moveTo(2.90361f, 8.56077f)
                curveTo(3.09887f, 8.36551f, 3.41538f, 8.36551f, 3.61064f, 8.56077f)
                curveTo(3.80584f, 8.75604f, 3.80588f, 9.07256f, 3.61064f, 9.2678f)
                curveTo(3.41539f, 9.46286f, 3.09882f, 9.46294f, 2.90361f, 9.2678f)
                curveTo(2.70841f, 9.0726f, 2.70853f, 8.75605f, 2.90361f, 8.56077f)
                close()
                moveTo(11.389f, 8.56077f)
                curveTo(11.5842f, 8.36551f, 11.9007f, 8.36551f, 12.096f, 8.56077f)
                curveTo(12.2912f, 8.75604f, 12.2912f, 9.07257f, 12.096f, 9.2678f)
                curveTo(11.9007f, 9.46288f, 11.5842f, 9.46292f, 11.389f, 9.2678f)
                curveTo(11.1938f, 9.07259f, 11.1939f, 8.75604f, 11.389f, 8.56077f)
                close()
                moveTo(1.48955f, 7.14671f)
                curveTo(1.71053f, 6.92572f, 2.09066f, 6.9668f, 2.26103f, 7.22483f)
                curveTo(2.38899f, 7.41888f, 2.36736f, 7.68295f, 2.19658f, 7.85374f)
                curveTo(2.00137f, 8.04874f, 1.68476f, 8.04874f, 1.48955f, 7.85374f)
                curveTo(1.29435f, 7.65854f, 1.29448f, 7.34198f, 1.48955f, 7.14671f)
                close()
                moveTo(12.803f, 7.14671f)
                curveTo(12.9983f, 6.95144f, 13.3148f, 6.95144f, 13.5101f, 7.14671f)
                curveTo(13.7052f, 7.34197f, 13.7053f, 7.6585f, 13.5101f, 7.85374f)
                curveTo(13.3148f, 8.04865f, 12.9982f, 8.04882f, 12.803f, 7.85374f)
                curveTo(12.6079f, 7.65858f, 12.6081f, 7.34199f, 12.803f, 7.14671f)
                close()
                moveTo(2.90361f, 5.73167f)
                curveTo(3.09879f, 5.53665f, 3.41541f, 5.53673f, 3.61064f, 5.73167f)
                curveTo(3.80585f, 5.92688f, 3.80575f, 6.24342f, 3.61064f, 6.4387f)
                curveTo(3.41538f, 6.63396f, 3.09887f, 6.63396f, 2.90361f, 6.4387f)
                curveTo(2.70862f, 6.24341f, 2.70844f, 5.92684f, 2.90361f, 5.73167f)
                close()
                moveTo(11.389f, 5.73167f)
                curveTo(11.5842f, 5.53667f, 11.9008f, 5.53671f, 12.096f, 5.73167f)
                curveTo(12.2912f, 5.92687f, 12.2911f, 6.24342f, 12.096f, 6.4387f)
                curveTo(11.9007f, 6.63396f, 11.5842f, 6.63396f, 11.389f, 6.4387f)
                curveTo(11.1939f, 6.24342f, 11.1938f, 5.92685f, 11.389f, 5.73167f)
                close()
                moveTo(4.31767f, 4.3176f)
                curveTo(4.51284f, 4.12244f, 4.82942f, 4.12263f, 5.0247f, 4.3176f)
                curveTo(5.21997f, 4.51287f, 5.21997f, 4.82937f, 5.0247f, 5.02464f)
                curveTo(4.82944f, 5.21988f, 4.51293f, 5.21989f, 4.31767f, 5.02464f)
                curveTo(4.12271f, 4.82936f, 4.12252f, 4.51277f, 4.31767f, 4.3176f)
                close()
                moveTo(9.9749f, 4.3176f)
                curveTo(10.1701f, 4.12255f, 10.4867f, 4.1225f, 10.6819f, 4.3176f)
                curveTo(10.8771f, 4.51281f, 10.877f, 4.82936f, 10.6819f, 5.02464f)
                curveTo(10.4867f, 5.2199f, 10.1702f, 5.2199f, 9.9749f, 5.02464f)
                curveTo(9.77974f, 4.82936f, 9.77967f, 4.51283f, 9.9749f, 4.3176f)
                close()
                moveTo(5.73174f, 2.90354f)
                curveTo(5.92691f, 2.70837f, 6.24348f, 2.70855f, 6.43877f, 2.90354f)
                curveTo(6.63403f, 3.0988f, 6.63403f, 3.41531f, 6.43877f, 3.61057f)
                curveTo(6.24349f, 3.80568f, 5.92695f, 3.80578f, 5.73174f, 3.61057f)
                curveTo(5.5368f, 3.41534f, 5.53672f, 3.09872f, 5.73174f, 2.90354f)
                close()
                moveTo(8.56084f, 2.90354f)
                curveTo(8.75611f, 2.70846f, 9.07267f, 2.70834f, 9.26787f, 2.90354f)
                curveTo(9.46301f, 3.09875f, 9.46293f, 3.41532f, 9.26787f, 3.61057f)
                curveTo(9.07263f, 3.80581f, 8.7561f, 3.80578f, 8.56084f, 3.61057f)
                curveTo(8.36557f, 3.41531f, 8.36557f, 3.0988f, 8.56084f, 2.90354f)
                close()
                moveTo(7.14677f, 1.48948f)
                curveTo(7.34205f, 1.2944f, 7.65861f, 1.29428f, 7.85381f, 1.48948f)
                curveTo(8.04882f, 1.6847f, 8.04882f, 2.00129f, 7.85381f, 2.19651f)
                curveTo(7.6586f, 2.39171f, 7.34205f, 2.39159f, 7.14677f, 2.19651f)
                curveTo(6.95151f, 2.00125f, 6.95151f, 1.68474f, 7.14677f, 1.48948f)
                close()
            }
        }.build()
        
        return _ComponentPlaceholder!!
    }

private var _ComponentPlaceholder: ImageVector? = null


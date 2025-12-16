package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.InstagramLogo: ImageVector
    get() {
        if (_InstagramLogo != null) return _InstagramLogo!!
        
        _InstagramLogo = ImageVector.Builder(
            name = "instagram-logo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 1f)
                curveTo(9.26509f, 1f, 9.4867f, 1.00731f, 10.1797f, 1.03906f)
                curveTo(10.8715f, 1.07051f, 11.3444f, 1.18027f, 11.7578f, 1.34082f)
                curveTo(12.1915f, 1.50406f, 12.5845f, 1.76013f, 12.9092f, 2.09082f)
                curveTo(13.2398f, 2.41549f, 13.496f, 2.80847f, 13.6592f, 3.24219f)
                curveTo(13.8199f, 3.65563f, 13.9294f, 4.12846f, 13.9609f, 4.82031f)
                curveTo(13.9926f, 5.51332f, 14f, 5.73492f, 14f, 7.5f)
                curveTo(14f, 9.26507f, 13.9926f, 9.48659f, 13.9609f, 10.1797f)
                curveTo(13.9294f, 10.8715f, 13.8199f, 11.3444f, 13.6592f, 11.7578f)
                curveTo(13.4922f, 12.1896f, 13.2365f, 12.5818f, 12.9092f, 12.9092f)
                curveTo(12.5818f, 13.2365f, 12.1896f, 13.4922f, 11.7578f, 13.6592f)
                curveTo(11.3444f, 13.8198f, 10.8715f, 13.9294f, 10.1797f, 13.9609f)
                curveTo(9.48678f, 13.9926f, 9.26498f, 14f, 7.5f, 14f)
                curveTo(5.73493f, 14f, 5.51349f, 13.9926f, 4.82031f, 13.9609f)
                curveTo(4.12846f, 13.9294f, 3.65566f, 13.8199f, 3.24219f, 13.6592f)
                curveTo(2.80849f, 13.496f, 2.41548f, 13.2398f, 2.09082f, 12.9092f)
                curveTo(1.76025f, 12.5846f, 1.505f, 12.1914f, 1.3418f, 11.7578f)
                curveTo(1.1811f, 11.3444f, 1.07064f, 10.8716f, 1.03906f, 10.1797f)
                curveTo(1.00731f, 9.4867f, 1f, 9.26508f, 1f, 7.5f)
                curveTo(1f, 5.7349f, 1.00731f, 5.51332f, 1.03906f, 4.82031f)
                curveTo(1.07051f, 4.12846f, 1.18027f, 3.65565f, 1.34082f, 3.24219f)
                curveTo(1.50409f, 2.80847f, 1.76011f, 2.41546f, 2.09082f, 2.09082f)
                curveTo(2.41549f, 1.76016f, 2.80847f, 1.50403f, 3.24219f, 1.34082f)
                curveTo(3.65563f, 1.18013f, 4.12845f, 1.07064f, 4.82031f, 1.03906f)
                curveTo(5.51335f, 1.00744f, 5.7349f, 1f, 7.5f, 1f)
                close()
                moveTo(7.5f, 2f)
                curveTo(6.00634f, 2f, 5.817f, 1.99668f, 5.23047f, 2.02344f)
                curveTo(4.76956f, 2.04447f, 4.23873f, 2.07184f, 3.81641f, 2.19922f)
                curveTo(3.39409f, 2.3266f, 3.06249f, 2.50001f, 2.71875f, 2.88281f)
                curveTo(2.37502f, 3.26561f, 2.26965f, 3.58288f, 2.17578f, 3.89453f)
                curveTo(2.07813f, 4.21875f, 2.04614f, 4.64896f, 2.01953f, 5.23438f)
                curveTo(2.00609f, 5.52775f, 2.00153f, 5.72077f, 2f, 6.02734f)
                verticalLineTo(8.97266f)
                curveTo(2.00154f, 9.27916f, 2.00609f, 9.47226f, 2.01953f, 9.76562f)
                curveTo(2.04614f, 10.351f, 2.07813f, 10.7813f, 2.17578f, 11.1055f)
                curveTo(2.26965f, 11.4171f, 2.37503f, 11.7344f, 2.71875f, 12.1172f)
                curveTo(3.06248f, 12.5f, 3.39409f, 12.6734f, 3.81641f, 12.8008f)
                curveTo(4.23873f, 12.9282f, 4.76956f, 12.9555f, 5.23047f, 12.9766f)
                curveTo(5.817f, 13.0033f, 6.00634f, 13f, 7.5f, 13f)
                curveTo(8.99363f, 13f, 9.17916f, 13.0064f, 9.76562f, 12.9795f)
                curveTo(10.3511f, 12.9529f, 10.7812f, 12.9209f, 11.1055f, 12.8232f)
                curveTo(11.4171f, 12.7294f, 11.7344f, 12.624f, 12.1172f, 12.2803f)
                curveTo(12.4999f, 11.9366f, 12.6734f, 11.6049f, 12.8008f, 11.1826f)
                curveTo(12.9281f, 10.7603f, 12.9555f, 10.2293f, 12.9766f, 9.76855f)
                curveTo(13.0033f, 9.18237f, 13f, 8.99332f, 13f, 7.5f)
                curveTo(13f, 6.00665f, 13.0033f, 5.81696f, 12.9766f, 5.23047f)
                curveTo(12.9555f, 4.76964f, 12.9281f, 4.23863f, 12.8008f, 3.81641f)
                curveTo(12.6734f, 3.39424f, 12.4999f, 3.0624f, 12.1172f, 2.71875f)
                curveTo(11.7345f, 2.37517f, 11.4171f, 2.26964f, 11.1055f, 2.17578f)
                curveTo(10.7813f, 2.07817f, 10.3509f, 2.04614f, 9.76562f, 2.01953f)
                curveTo(9.17916f, 1.99266f, 8.99363f, 2f, 7.5f, 2f)
                close()
                moveTo(7.5f, 4.25f)
                curveTo(9.29471f, 4.25009f, 10.7499f, 5.70529f, 10.75f, 7.5f)
                curveTo(10.7499f, 9.29471f, 9.29471f, 10.7499f, 7.5f, 10.75f)
                curveTo(5.70527f, 10.7499f, 4.25009f, 9.29472f, 4.25f, 7.5f)
                curveTo(4.25008f, 5.70527f, 5.70527f, 4.25007f, 7.5f, 4.25f)
                close()
                moveTo(7.5f, 5.25f)
                curveTo(6.25756f, 5.25007f, 5.25008f, 6.25756f, 5.25f, 7.5f)
                curveTo(5.25009f, 8.74244f, 6.25756f, 9.74993f, 7.5f, 9.75f)
                curveTo(8.74242f, 9.74991f, 9.74991f, 8.74242f, 9.75f, 7.5f)
                curveTo(9.74992f, 6.25757f, 8.74243f, 5.25009f, 7.5f, 5.25f)
                close()
                moveTo(10.9697f, 3.28027f)
                curveTo(11.3839f, 3.28027f, 11.7197f, 3.61607f, 11.7197f, 4.03027f)
                curveTo(11.7197f, 4.44449f, 11.3839f, 4.78027f, 10.9697f, 4.78027f)
                curveTo(10.5555f, 4.78027f, 10.2197f, 4.44449f, 10.2197f, 4.03027f)
                curveTo(10.2197f, 3.61607f, 10.5555f, 3.28027f, 10.9697f, 3.28027f)
                close()
            }
        }.build()
        
        return _InstagramLogo!!
    }

private var _InstagramLogo: ImageVector? = null


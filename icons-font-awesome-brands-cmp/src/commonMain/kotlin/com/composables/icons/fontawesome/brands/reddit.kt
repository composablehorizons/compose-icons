package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Reddit: ImageVector
    get() {
        if (_Reddit != null) return _Reddit!!
        
        _Reddit = ImageVector.Builder(
            name = "reddit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(201.5f, 305.5f)
                curveToRelative(-13.8f, 0f, -24.9f, -11.1f, -24.9f, -24.6f)
                curveToRelative(0f, -13.8f, 11.1f, -24.9f, 24.9f, -24.9f)
                curveToRelative(13.6f, 0f, 24.6f, 11.1f, 24.6f, 24.9f)
                curveToRelative(0f, 13.6f, -11.1f, 24.6f, -24.6f, 24.6f)
                close()
                moveTo(504f, 256f)
                curveToRelative(0f, 137f, -111f, 248f, -248f, 248f)
                reflectiveCurveTo(8f, 393f, 8f, 256f)
                reflectiveCurveTo(119f, 8f, 256f, 8f)
                reflectiveCurveToRelative(248f, 111f, 248f, 248f)
                close()
                moveToRelative(-132.3f, -41.2f)
                curveToRelative(-9.4f, 0f, -17.7f, 3.9f, -23.8f, 10f)
                curveToRelative(-22.4f, -15.5f, -52.6f, -25.5f, -86.1f, -26.6f)
                lineToRelative(17.4f, -78.3f)
                lineToRelative(55.4f, 12.5f)
                curveToRelative(0f, 13.6f, 11.1f, 24.6f, 24.6f, 24.6f)
                curveToRelative(13.8f, 0f, 24.9f, -11.3f, 24.9f, -24.9f)
                reflectiveCurveToRelative(-11.1f, -24.9f, -24.9f, -24.9f)
                curveToRelative(-9.7f, 0f, -18f, 5.8f, -22.1f, 13.8f)
                lineToRelative(-61.2f, -13.6f)
                curveToRelative(-3f, -0.8f, -6.1f, 1.4f, -6.9f, 4.4f)
                lineToRelative(-19.1f, 86.4f)
                curveToRelative(-33.2f, 1.4f, -63.1f, 11.3f, -85.5f, 26.8f)
                curveToRelative(-6.1f, -6.4f, -14.7f, -10.2f, -24.1f, -10.2f)
                curveToRelative(-34.9f, 0f, -46.3f, 46.9f, -14.4f, 62.8f)
                curveToRelative(-1.1f, 5f, -1.7f, 10.2f, -1.7f, 15.5f)
                curveToRelative(0f, 52.6f, 59.2f, 95.2f, 132f, 95.2f)
                curveToRelative(73.1f, 0f, 132.3f, -42.6f, 132.3f, -95.2f)
                curveToRelative(0f, -5.3f, -0.6f, -10.8f, -1.9f, -15.8f)
                curveToRelative(31.3f, -16f, 19.8f, -62.5f, -14.9f, -62.5f)
                close()
                moveTo(302.8f, 331f)
                curveToRelative(-18.2f, 18.2f, -76.1f, 17.9f, -93.6f, 0f)
                curveToRelative(-2.2f, -2.2f, -6.1f, -2.2f, -8.3f, 0f)
                curveToRelative(-2.5f, 2.5f, -2.5f, 6.4f, 0f, 8.6f)
                curveToRelative(22.8f, 22.8f, 87.3f, 22.8f, 110.2f, 0f)
                curveToRelative(2.5f, -2.2f, 2.5f, -6.1f, 0f, -8.6f)
                curveToRelative(-2.2f, -2.2f, -6.1f, -2.2f, -8.3f, 0f)
                close()
                moveToRelative(7.7f, -75f)
                curveToRelative(-13.6f, 0f, -24.6f, 11.1f, -24.6f, 24.9f)
                curveToRelative(0f, 13.6f, 11.1f, 24.6f, 24.6f, 24.6f)
                curveToRelative(13.8f, 0f, 24.9f, -11.1f, 24.9f, -24.6f)
                curveToRelative(0f, -13.8f, -11f, -24.9f, -24.9f, -24.9f)
                close()
            }
        }.build()
        
        return _Reddit!!
    }

private var _Reddit: ImageVector? = null


package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Diaspora: ImageVector
    get() {
        if (_Diaspora != null) return _Diaspora!!
        
        _Diaspora = ImageVector.Builder(
            name = "diaspora",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(251.64f, 354.55f)
                curveToRelative(-1.4f, 0f, -88f, 119.9f, -88.7f, 119.9f)
                reflectiveCurveTo(76.34f, 414f, 76f, 413.25f)
                reflectiveCurveToRelative(86.6f, -125.7f, 86.6f, -127.4f)
                curveToRelative(0f, -2.2f, -129.6f, -44f, -137.6f, -47.1f)
                curveToRelative(-1.3f, -0.5f, 31.4f, -101.8f, 31.7f, -102.1f)
                curveToRelative(0.6f, -0.7f, 144.4f, 47f, 145.5f, 47f)
                curveToRelative(0.4f, 0f, 0.9f, -0.6f, 1f, -1.3f)
                curveToRelative(0.4f, -2f, 1f, -148.6f, 1.7f, -149.6f)
                curveToRelative(0.8f, -1.2f, 104.5f, -0.7f, 105.1f, -0.3f)
                curveToRelative(1.5f, 1f, 3.5f, 156.1f, 6.1f, 156.1f)
                curveToRelative(1.4f, 0f, 138.7f, -47f, 139.3f, -46.3f)
                curveToRelative(0.8f, 0.9f, 31.9f, 102.2f, 31.5f, 102.6f)
                curveToRelative(-0.9f, 0.9f, -140.2f, 47.1f, -140.6f, 48.8f)
                curveToRelative(-0.3f, 1.4f, 82.8f, 122.1f, 82.5f, 122.9f)
                reflectiveCurveToRelative(-85.5f, 63.5f, -86.3f, 63.5f)
                curveToRelative(-1f, -0.2f, -89f, -125.5f, -90.9f, -125.5f)
                close()
            }
        }.build()
        
        return _Diaspora!!
    }

private var _Diaspora: ImageVector? = null


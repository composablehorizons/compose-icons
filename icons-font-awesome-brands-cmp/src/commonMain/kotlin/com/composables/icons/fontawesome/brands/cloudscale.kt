package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Cloudscale: ImageVector
    get() {
        if (_Cloudscale != null) return _Cloudscale!!
        
        _Cloudscale = ImageVector.Builder(
            name = "cloudscale",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(318.1f, 154f)
                lineToRelative(-9.4f, 7.6f)
                curveToRelative(-22.5f, -19.3f, -51.5f, -33.6f, -83.3f, -33.6f)
                curveTo(153.8f, 128f, 96f, 188.8f, 96f, 260.3f)
                curveToRelative(0f, 6.6f, 0.4f, 13.1f, 1.4f, 19.4f)
                curveToRelative(-2f, -56f, 41.8f, -97.4f, 92.6f, -97.4f)
                curveToRelative(24.2f, 0f, 46.2f, 9.4f, 62.6f, 24.7f)
                lineToRelative(-25.2f, 20.4f)
                curveToRelative(-8.3f, -0.9f, -16.8f, 1.8f, -23.1f, 8.1f)
                curveToRelative(-11.1f, 11f, -11.1f, 28.9f, 0f, 40f)
                curveToRelative(11.1f, 11f, 28.9f, 11f, 40f, 0f)
                curveToRelative(6.3f, -6.3f, 9f, -14.9f, 8.1f, -23.1f)
                lineToRelative(75.2f, -88.8f)
                curveToRelative(6.3f, -6.5f, -3.3f, -15.9f, -9.5f, -9.6f)
                close()
                moveToRelative(-83.8f, 111.5f)
                curveToRelative(-5.6f, 5.5f, -14.6f, 5.5f, -20.2f, 0f)
                curveToRelative(-5.6f, -5.6f, -5.6f, -14.6f, 0f, -20.2f)
                reflectiveCurveToRelative(14.6f, -5.6f, 20.2f, 0f)
                reflectiveCurveToRelative(5.6f, 14.7f, 0f, 20.2f)
                close()
                moveTo(224f, 32f)
                curveTo(100.5f, 32f, 0f, 132.5f, 0f, 256f)
                reflectiveCurveToRelative(100.5f, 224f, 224f, 224f)
                reflectiveCurveToRelative(224f, -100.5f, 224f, -224f)
                reflectiveCurveTo(347.5f, 32f, 224f, 32f)
                close()
                moveToRelative(0f, 384f)
                curveToRelative(-88.2f, 0f, -160f, -71.8f, -160f, -160f)
                reflectiveCurveTo(135.8f, 96f, 224f, 96f)
                reflectiveCurveToRelative(160f, 71.8f, 160f, 160f)
                reflectiveCurveToRelative(-71.8f, 160f, -160f, 160f)
                close()
            }
        }.build()
        
        return _Cloudscale!!
    }

private var _Cloudscale: ImageVector? = null


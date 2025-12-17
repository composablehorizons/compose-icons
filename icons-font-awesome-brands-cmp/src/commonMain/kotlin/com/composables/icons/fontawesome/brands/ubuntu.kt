package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Ubuntu: ImageVector
    get() {
        if (_Ubuntu != null) return _Ubuntu!!
        
        _Ubuntu = ImageVector.Builder(
            name = "ubuntu",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 8f)
                curveTo(111f, 8f, 0f, 119f, 0f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(385f, 8f, 248f, 8f)
                close()
                moveToRelative(52.7f, 93f)
                curveToRelative(8.8f, -15.2f, 28.3f, -20.5f, 43.5f, -11.7f)
                curveToRelative(15.3f, 8.8f, 20.5f, 28.3f, 11.7f, 43.6f)
                curveToRelative(-8.8f, 15.2f, -28.3f, 20.5f, -43.5f, 11.7f)
                curveToRelative(-15.3f, -8.9f, -20.5f, -28.4f, -11.7f, -43.6f)
                close()
                moveTo(87.4f, 287.9f)
                curveToRelative(-17.6f, 0f, -31.9f, -14.3f, -31.9f, -31.9f)
                curveToRelative(0f, -17.6f, 14.3f, -31.9f, 31.9f, -31.9f)
                curveToRelative(17.6f, 0f, 31.9f, 14.3f, 31.9f, 31.9f)
                curveToRelative(0f, 17.6f, -14.3f, 31.9f, -31.9f, 31.9f)
                close()
                moveToRelative(28.1f, 3.1f)
                curveToRelative(22.3f, -17.9f, 22.4f, -51.9f, 0f, -69.9f)
                curveToRelative(8.6f, -32.8f, 29.1f, -60.7f, 56.5f, -79.1f)
                lineToRelative(23.7f, 39.6f)
                curveToRelative(-51.5f, 36.3f, -51.5f, 112.5f, 0f, 148.8f)
                lineTo(172f, 370f)
                curveToRelative(-27.4f, -18.3f, -47.8f, -46.3f, -56.5f, -79f)
                close()
                moveToRelative(228.7f, 131.7f)
                curveToRelative(-15.3f, 8.8f, -34.7f, 3.6f, -43.5f, -11.7f)
                curveToRelative(-8.8f, -15.3f, -3.6f, -34.8f, 11.7f, -43.6f)
                curveToRelative(15.2f, -8.8f, 34.7f, -3.6f, 43.5f, 11.7f)
                curveToRelative(8.8f, 15.3f, 3.6f, 34.8f, -11.7f, 43.6f)
                close()
                moveToRelative(0.3f, -69.5f)
                curveToRelative(-26.7f, -10.3f, -56.1f, 6.6f, -60.5f, 35f)
                curveToRelative(-5.2f, 1.4f, -48.9f, 14.3f, -96.7f, -9.4f)
                lineToRelative(22.5f, -40.3f)
                curveToRelative(57f, 26.5f, 123.4f, -11.7f, 128.9f, -74.4f)
                lineToRelative(46.1f, 0.7f)
                curveToRelative(-2.3f, 34.5f, -17.3f, 65.5f, -40.3f, 88.4f)
                close()
                moveToRelative(-5.9f, -105.3f)
                curveToRelative(-5.4f, -62f, -71.3f, -101.2f, -128.9f, -74.4f)
                lineToRelative(-22.5f, -40.3f)
                curveToRelative(47.9f, -23.7f, 91.5f, -10.8f, 96.7f, -9.4f)
                curveToRelative(4.4f, 28.3f, 33.8f, 45.3f, 60.5f, 35f)
                curveToRelative(23.1f, 22.9f, 38f, 53.9f, 40.2f, 88.5f)
                lineToRelative(-46f, 0.6f)
                close()
            }
        }.build()
        
        return _Ubuntu!!
    }

private var _Ubuntu: ImageVector? = null


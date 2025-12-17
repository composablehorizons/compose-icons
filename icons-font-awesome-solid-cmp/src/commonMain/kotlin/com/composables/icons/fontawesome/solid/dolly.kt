package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Dolly: ImageVector
    get() {
        if (_Dolly != null) return _Dolly!!
        
        _Dolly = ImageVector.Builder(
            name = "dolly",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(294.2f, 277.7f)
                curveToRelative(18f, 5f, 34.7f, 13.4f, 49.5f, 24.7f)
                lineToRelative(161.5f, -53.8f)
                curveToRelative(8.4f, -2.8f, 12.9f, -11.9f, 10.1f, -20.2f)
                lineTo(454.9f, 47.2f)
                curveToRelative(-2.8f, -8.4f, -11.9f, -12.9f, -20.2f, -10.1f)
                lineToRelative(-61.1f, 20.4f)
                lineToRelative(33.1f, 99.4f)
                lineTo(346f, 177f)
                lineToRelative(-33.1f, -99.4f)
                lineToRelative(-61.6f, 20.5f)
                curveToRelative(-8.4f, 2.8f, -12.9f, 11.9f, -10.1f, 20.2f)
                lineToRelative(53f, 159.4f)
                close()
                moveToRelative(281f, 48.7f)
                lineTo(565f, 296f)
                curveToRelative(-2.8f, -8.4f, -11.9f, -12.9f, -20.2f, -10.1f)
                lineToRelative(-213.5f, 71.2f)
                curveToRelative(-17.2f, -22f, -43.6f, -36.4f, -73.5f, -37f)
                lineTo(158.4f, 21.9f)
                curveTo(154f, 8.8f, 141.8f, 0f, 128f, 0f)
                horizontalLineTo(16f)
                curveTo(7.2f, 0f, 0f, 7.2f, 0f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(88.9f)
                lineToRelative(92.2f, 276.7f)
                curveToRelative(-26.1f, 20.4f, -41.7f, 53.6f, -36f, 90.5f)
                curveToRelative(6.1f, 39.4f, 37.9f, 72.3f, 77.3f, 79.2f)
                curveToRelative(60.2f, 10.7f, 112.3f, -34.8f, 113.4f, -92.6f)
                lineToRelative(213.3f, -71.2f)
                curveToRelative(8.3f, -2.8f, 12.9f, -11.8f, 10.1f, -20.2f)
                close()
                moveTo(256f, 464f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                reflectiveCurveToRelative(21.5f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.5f, 48f, 48f)
                reflectiveCurveToRelative(-21.5f, 48f, -48f, 48f)
                close()
            }
        }.build()
        
        return _Dolly!!
    }

private var _Dolly: ImageVector? = null


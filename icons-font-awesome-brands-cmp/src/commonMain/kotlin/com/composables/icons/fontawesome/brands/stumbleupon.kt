package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Stumbleupon: ImageVector
    get() {
        if (_Stumbleupon != null) return _Stumbleupon!!
        
        _Stumbleupon = ImageVector.Builder(
            name = "stumbleupon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(502.9f, 266f)
                verticalLineToRelative(69.7f)
                curveToRelative(0f, 62.1f, -50.3f, 112.4f, -112.4f, 112.4f)
                curveToRelative(-61.8f, 0f, -112.4f, -49.8f, -112.4f, -111.3f)
                verticalLineToRelative(-70.2f)
                lineToRelative(34.3f, 16f)
                lineToRelative(51.1f, -15.2f)
                verticalLineTo(338f)
                curveToRelative(0f, 14.7f, 12f, 26.5f, 26.7f, 26.5f)
                reflectiveCurveTo(417f, 352.7f, 417f, 338f)
                verticalLineToRelative(-72f)
                horizontalLineToRelative(85.9f)
                close()
                moveToRelative(-224.7f, -58.2f)
                lineToRelative(34.3f, 16f)
                lineToRelative(51.1f, -15.2f)
                verticalLineTo(173f)
                curveToRelative(0f, -60.5f, -51.1f, -109f, -112.1f, -109f)
                curveToRelative(-60.8f, 0f, -112.1f, 48.2f, -112.1f, 108.2f)
                verticalLineToRelative(162.4f)
                curveToRelative(0f, 14.9f, -12f, 26.7f, -26.7f, 26.7f)
                reflectiveCurveTo(86f, 349.5f, 86f, 334.6f)
                verticalLineTo(266f)
                horizontalLineTo(0f)
                verticalLineToRelative(69.7f)
                curveTo(0f, 397.7f, 50.3f, 448f, 112.4f, 448f)
                curveToRelative(61.6f, 0f, 112.4f, -49.5f, 112.4f, -110.8f)
                verticalLineTo(176.9f)
                curveToRelative(0f, -14.7f, 12f, -26.7f, 26.7f, -26.7f)
                reflectiveCurveToRelative(26.7f, 12f, 26.7f, 26.7f)
                verticalLineToRelative(30.9f)
                close()
            }
        }.build()
        
        return _Stumbleupon!!
    }

private var _Stumbleupon: ImageVector? = null


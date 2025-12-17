package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Mic_external_off: ImageVector
    get() {
        if (_Mic_external_off != null) return _Mic_external_off!!
        
        _Mic_external_off = ImageVector.Builder(
            name = "mic_external_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(5.17f, 8f)
                horizontalLineTo(4f)
                lineToRelative(1f, 10f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-1.17f)
                lineToRelative(5.78f, 5.78f)
                lineToRelative(1.41f, -1.42f)
                close()
                moveTo(12f, 18f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(1f)
                lineToRelative(0.56f, -5.61f)
                lineTo(12f, 14.83f)
                verticalLineTo(18f)
                close()
                moveToRelative(2f, -12f)
                verticalLineToRelative(5.17f)
                lineToRelative(-2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(11.17f)
                lineToRelative(-2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveToRelative(-4f, -1f)
                curveToRelative(0f, 0.62f, -0.2f, 1.18f, -0.52f, 1.66f)
                lineTo(5.33f, 2.51f)
                curveTo(5.81f, 2.19f, 6.38f, 2f, 7f, 2f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                close()
            }
        }.build()
        
        return _Mic_external_off!!
    }

private var _Mic_external_off: ImageVector? = null


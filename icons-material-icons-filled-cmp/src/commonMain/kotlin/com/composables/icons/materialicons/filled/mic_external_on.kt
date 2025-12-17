package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Mic_external_on: ImageVector
    get() {
        if (_Mic_external_on != null) return _Mic_external_on!!
        
        _Mic_external_on = ImageVector.Builder(
            name = "mic_external_on",
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
                moveTo(9.22f, 7f)
                horizontalLineTo(4.78f)
                curveTo(4.3f, 6.47f, 4f, 5.77f, 4f, 5f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                curveToRelative(0f, 0.77f, -0.3f, 1.47f, -0.78f, 2f)
                close()
                moveTo(16f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                horizontalLineTo(5f)
                lineTo(4f, 8f)
                horizontalLineToRelative(6f)
                lineTo(9f, 18f)
                horizontalLineTo(8f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                close()
            }
        }.build()
        
        return _Mic_external_on!!
    }

private var _Mic_external_on: ImageVector? = null


package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Offline_pin: ImageVector
    get() {
        if (_Offline_pin != null) return _Offline_pin!!
        
        _Offline_pin = ImageVector.Builder(
            name = "offline_pin",
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
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                reflectiveCurveToRelative(4.5f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.5f, 10f, -10f)
                reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                close()
                moveToRelative(4f, 16f)
                horizontalLineTo(8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveToRelative(-6.41f, -4.71f)
                lineTo(7.7f, 11.4f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.01f, 0f, -1.4f)
                curveToRelative(0.39f, -0.39f, 1.01f, -0.39f, 1.4f, 0f)
                lineToRelative(1.2f, 1.2f)
                lineToRelative(4.6f, -4.6f)
                curveToRelative(0.39f, -0.39f, 1.01f, -0.39f, 1.4f, 0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.01f, 0f, 1.4f)
                lineToRelative(-5.29f, 5.29f)
                curveToRelative(-0.39f, 0.39f, -1.03f, 0.39f, -1.42f, 0f)
                close()
            }
        }.build()
        
        return _Offline_pin!!
    }

private var _Offline_pin: ImageVector? = null


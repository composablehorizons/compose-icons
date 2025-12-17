package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Offline_pin: ImageVector
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
                moveToRelative(5f, 16f)
                horizontalLineTo(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(-6.7f, -4f)
                lineTo(7f, 10.7f)
                lineToRelative(1.4f, -1.4f)
                lineToRelative(1.9f, 1.9f)
                lineToRelative(5.3f, -5.3f)
                lineTo(17f, 7.3f)
                lineTo(10.3f, 14f)
                close()
            }
        }.build()
        
        return _Offline_pin!!
    }

private var _Offline_pin: ImageVector? = null


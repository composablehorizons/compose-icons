package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Access_alarms: ImageVector
    get() {
        if (_Access_alarms != null) return _Access_alarms!!
        
        _Access_alarms = ImageVector.Builder(
            name = "access_alarms",
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 5.7f)
                lineToRelative(-4.6f, -3.9f)
                lineToRelative(-1.3f, 1.5f)
                lineToRelative(4.6f, 3.9f)
                lineTo(22f, 5.7f)
                close()
                moveTo(7.9f, 3.4f)
                lineTo(6.6f, 1.9f)
                lineTo(2f, 5.7f)
                lineToRelative(1.3f, 1.5f)
                lineToRelative(4.6f, -3.8f)
                close()
                moveTo(12.5f, 8f)
                horizontalLineTo(11f)
                verticalLineToRelative(6f)
                lineToRelative(4.7f, 2.9f)
                lineToRelative(0.8f, -1.2f)
                lineToRelative(-4f, -2.4f)
                verticalLineTo(8f)
                close()
                moveTo(12f, 4f)
                curveToRelative(-5f, 0f, -9f, 4f, -9f, 9f)
                reflectiveCurveToRelative(4f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4f, 9f, -9f)
                reflectiveCurveToRelative(-4f, -9f, -9f, -9f)
                close()
                moveToRelative(0f, 16f)
                curveToRelative(-3.9f, 0f, -7f, -3.1f, -7f, -7f)
                reflectiveCurveToRelative(3.1f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.1f, 7f, 7f)
                reflectiveCurveToRelative(-3.1f, 7f, -7f, 7f)
                close()
            }
        }.build()
        
        return _Access_alarms!!
    }

private var _Access_alarms: ImageVector? = null


package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Alarm_on: ImageVector
    get() {
        if (_Alarm_on != null) return _Alarm_on!!
        
        _Alarm_on = ImageVector.Builder(
            name = "alarm_on",
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
                moveTo(22f, 5.72f)
                lineToRelative(-4.6f, -3.86f)
                lineToRelative(-1.29f, 1.53f)
                lineToRelative(4.6f, 3.86f)
                lineTo(22f, 5.72f)
                close()
                moveTo(7.88f, 3.39f)
                lineTo(6.6f, 1.86f)
                lineTo(2f, 5.71f)
                lineToRelative(1.29f, 1.53f)
                lineToRelative(4.59f, -3.85f)
                close()
                moveTo(12f, 4f)
                curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
                reflectiveCurveToRelative(4.02f, 9f, 9f, 9f)
                curveToRelative(4.97f, 0f, 9f, -4.03f, 9f, -9f)
                reflectiveCurveToRelative(-4.03f, -9f, -9f, -9f)
                close()
                moveToRelative(0f, 16f)
                curveToRelative(-3.87f, 0f, -7f, -3.13f, -7f, -7f)
                reflectiveCurveToRelative(3.13f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.13f, 7f, 7f)
                reflectiveCurveToRelative(-3.13f, 7f, -7f, 7f)
                close()
                moveToRelative(-1.46f, -5.47f)
                lineTo(8.41f, 12.4f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(3.18f, 3.18f)
                lineToRelative(6f, -6f)
                lineToRelative(-1.06f, -1.06f)
                lineToRelative(-4.93f, 4.95f)
                close()
            }
        }.build()
        
        return _Alarm_on!!
    }

private var _Alarm_on: ImageVector? = null


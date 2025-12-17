package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Snooze: ImageVector
    get() {
        if (_Snooze != null) return _Snooze!!
        
        _Snooze = ImageVector.Builder(
            name = "snooze",
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
                moveTo(9f, 11f)
                horizontalLineToRelative(3.63f)
                lineTo(9f, 15.2f)
                verticalLineTo(17f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.63f)
                lineTo(15f, 10.8f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(7.056f, -7.654f)
                lineToRelative(1.282f, -1.535f)
                lineToRelative(4.607f, 3.85f)
                lineToRelative(-1.28f, 1.54f)
                close()
                moveTo(3.336f, 7.19f)
                lineToRelative(-1.28f, -1.536f)
                lineTo(6.662f, 1.81f)
                lineToRelative(1.28f, 1.536f)
                close()
                moveTo(12f, 6f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                moveToRelative(0f, -2f)
                curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
                reflectiveCurveToRelative(4.03f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.03f, 9f, -9f)
                reflectiveCurveToRelative(-4.03f, -9f, -9f, -9f)
                close()
            }
        }.build()
        
        return _Snooze!!
    }

private var _Snooze: ImageVector? = null


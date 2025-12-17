package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Alarm: ImageVector
    get() {
        if (_Alarm != null) return _Alarm!!
        
        _Alarm = ImageVector.Builder(
            name = "alarm",
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
                moveTo(12.5f, 8f)
                horizontalLineTo(11f)
                verticalLineToRelative(6f)
                lineToRelative(4.75f, 2.85f)
                lineToRelative(0.75f, -1.23f)
                lineToRelative(-4f, -2.37f)
                close()
                moveToRelative(4.837f, -6.19f)
                lineToRelative(4.607f, 3.845f)
                lineToRelative(-1.28f, 1.535f)
                lineToRelative(-4.61f, -3.843f)
                close()
                moveToRelative(-10.674f, 0f)
                lineToRelative(1.282f, 1.536f)
                lineTo(3.337f, 7.19f)
                lineToRelative(-1.28f, -1.536f)
                close()
                moveTo(12f, 4f)
                curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
                reflectiveCurveToRelative(4.03f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.03f, 9f, -9f)
                reflectiveCurveToRelative(-4.03f, -9f, -9f, -9f)
                close()
                moveToRelative(0f, 16f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                close()
            }
        }.build()
        
        return _Alarm!!
    }

private var _Alarm: ImageVector? = null


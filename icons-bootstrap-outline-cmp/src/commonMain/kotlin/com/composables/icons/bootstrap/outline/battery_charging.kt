package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BatteryCharging: ImageVector
    get() {
        if (_BatteryCharging != null) return _BatteryCharging!!
        
        _BatteryCharging = ImageVector.Builder(
            name = "battery-charging",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.585f, 2.568f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.226f, 0.58f)
                lineTo(8.677f, 6.832f)
                horizontalLineToRelative(1.99f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.364f, 0.843f)
                lineToRelative(-5.334f, 5.667f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.842f, -0.49f)
                lineTo(5.99f, 9.167f)
                horizontalLineTo(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.364f, -0.843f)
                lineToRelative(5.333f, -5.667f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.616f, -0.09f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 4f)
                horizontalLineToRelative(4.332f)
                lineToRelative(-0.94f, 1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2.38f)
                lineToRelative(-0.308f, 1f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 6f)
                horizontalLineToRelative(2.45f)
                lineTo(2.908f, 7.639f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.313f, 10f)
                horizontalLineTo(2f)
                close()
                moveToRelative(8.595f, -2f)
                lineToRelative(-0.308f, 1f)
                horizontalLineTo(12f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(9.276f)
                lineToRelative(-0.942f, 1f)
                horizontalLineTo(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 10f)
                horizontalLineToRelative(-1.783f)
                lineToRelative(1.542f, -1.639f)
                quadToRelative(0.146f, -0.156f, 0.241f, -0.34f)
                close()
                moveToRelative(0f, -3.354f)
                verticalLineTo(6f)
                horizontalLineToRelative(-0.646f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.646f, 0.646f)
                moveTo(16f, 8f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                verticalLineToRelative(-3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 8f)
            }
        }.build()
        
        return _BatteryCharging!!
    }

private var _BatteryCharging: ImageVector? = null


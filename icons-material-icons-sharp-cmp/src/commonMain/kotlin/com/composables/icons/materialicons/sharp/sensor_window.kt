package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Sensor_window: ImageVector
    get() {
        if (_Sensor_window != null) return _Sensor_window!!
        
        _Sensor_window = ImageVector.Builder(
            name = "sensor_window",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(18f, 4f)
                    verticalLineToRelative(16f)
                    horizontalLineTo(6f)
                    verticalLineTo(4f)
                    horizontalLineTo(18f)
                    moveTo(4f, 2f)
                    verticalLineToRelative(20f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(2f)
                    horizontalLineTo(4f)
                    close()
                    moveTo(7f, 19f)
                    horizontalLineToRelative(10f)
                    verticalLineToRelative(-6f)
                    horizontalLineTo(7f)
                    verticalLineTo(19f)
                    close()
                    moveTo(10f, 10f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(5f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(10f)
                    close()
                }
            }
        }.build()
        
        return _Sensor_window!!
    }

private var _Sensor_window: ImageVector? = null


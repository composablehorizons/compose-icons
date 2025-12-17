package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Gear: ImageVector
    get() {
        if (_Gear != null) return _Gear!!
        
        _Gear = ImageVector.Builder(
            name = "gear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.405f, 1.05f)
                curveToRelative(-0.413f, -1.4f, -2.397f, -1.4f, -2.81f, 0f)
                lineToRelative(-0.1f, 0.34f)
                arcToRelative(1.464f, 1.464f, 0f, false, true, -2.105f, 0.872f)
                lineToRelative(-0.31f, -0.17f)
                curveToRelative(-1.283f, -0.698f, -2.686f, 0.705f, -1.987f, 1.987f)
                lineToRelative(0.169f, 0.311f)
                curveToRelative(0.446f, 0.82f, 0.023f, 1.841f, -0.872f, 2.105f)
                lineToRelative(-0.34f, 0.1f)
                curveToRelative(-1.4f, 0.413f, -1.4f, 2.397f, 0f, 2.81f)
                lineToRelative(0.34f, 0.1f)
                arcToRelative(1.464f, 1.464f, 0f, false, true, 0.872f, 2.105f)
                lineToRelative(-0.17f, 0.31f)
                curveToRelative(-0.698f, 1.283f, 0.705f, 2.686f, 1.987f, 1.987f)
                lineToRelative(0.311f, -0.169f)
                arcToRelative(1.464f, 1.464f, 0f, false, true, 2.105f, 0.872f)
                lineToRelative(0.1f, 0.34f)
                curveToRelative(0.413f, 1.4f, 2.397f, 1.4f, 2.81f, 0f)
                lineToRelative(0.1f, -0.34f)
                arcToRelative(1.464f, 1.464f, 0f, false, true, 2.105f, -0.872f)
                lineToRelative(0.31f, 0.17f)
                curveToRelative(1.283f, 0.698f, 2.686f, -0.705f, 1.987f, -1.987f)
                lineToRelative(-0.169f, -0.311f)
                arcToRelative(1.464f, 1.464f, 0f, false, true, 0.872f, -2.105f)
                lineToRelative(0.34f, -0.1f)
                curveToRelative(1.4f, -0.413f, 1.4f, -2.397f, 0f, -2.81f)
                lineToRelative(-0.34f, -0.1f)
                arcToRelative(1.464f, 1.464f, 0f, false, true, -0.872f, -2.105f)
                lineToRelative(0.17f, -0.31f)
                curveToRelative(0.698f, -1.283f, -0.705f, -2.686f, -1.987f, -1.987f)
                lineToRelative(-0.311f, 0.169f)
                arcToRelative(1.464f, 1.464f, 0f, false, true, -2.105f, -0.872f)
                close()
                moveTo(8f, 10.93f)
                arcToRelative(2.929f, 2.929f, 0f, true, true, 0f, -5.86f)
                arcToRelative(2.929f, 2.929f, 0f, false, true, 0f, 5.858f)
                close()
            }
        }.build()
        
        return _Gear!!
    }

private var _Gear: ImageVector? = null


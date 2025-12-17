package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CloudRain: ImageVector
    get() {
        if (_CloudRain != null) return _CloudRain!!
        
        _CloudRain = ImageVector.Builder(
            name = "cloud-rain",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.158f, 12.025f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.316f, 0.633f)
                lineToRelative(-0.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.948f, -0.316f)
                lineToRelative(0.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.632f, -0.317f)
                moveToRelative(3f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.316f, 0.633f)
                lineToRelative(-1f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.948f, -0.316f)
                lineToRelative(1f, -3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.632f, -0.317f)
                moveToRelative(3f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.316f, 0.633f)
                lineToRelative(-0.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.948f, -0.316f)
                lineToRelative(0.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.632f, -0.317f)
                moveToRelative(3f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.316f, 0.633f)
                lineToRelative(-1f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.948f, -0.316f)
                lineToRelative(1f, -3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.632f, -0.317f)
                moveToRelative(0.247f, -6.998f)
                arcToRelative(5.001f, 5.001f, 0f, false, false, -9.499f, -1.004f)
                arcTo(3.5f, 3.5f, 0f, true, false, 3.5f, 11f)
                horizontalLineTo(13f)
                arcToRelative(3f, 3f, 0f, false, false, 0.405f, -5.973f)
            }
        }.build()
        
        return _CloudRain!!
    }

private var _CloudRain: ImageVector? = null


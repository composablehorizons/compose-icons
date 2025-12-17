package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.LightbulbOff: ImageVector
    get() {
        if (_LightbulbOff != null) return _LightbulbOff!!
        
        _LightbulbOff = ImageVector.Builder(
            name = "lightbulb-off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 6f)
                curveToRelative(0f, -0.572f, 0.08f, -1.125f, 0.23f, -1.65f)
                lineToRelative(8.558f, 8.559f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10.5f, 13f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.46f, -0.302f)
                lineToRelative(-0.761f, -1.77f)
                arcToRelative(2f, 2f, 0f, false, false, -0.453f, -0.618f)
                arcTo(5.98f, 5.98f, 0f, false, true, 2f, 6f)
                moveToRelative(10.303f, 4.181f)
                lineTo(3.818f, 1.697f)
                arcToRelative(6f, 6f, 0f, false, true, 8.484f, 8.484f)
                close()
                moveTo(5f, 14.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                lineToRelative(-0.224f, 0.447f)
                arcToRelative(1f, 1f, 0f, false, true, -0.894f, 0.553f)
                horizontalLineTo(6.618f)
                arcToRelative(1f, 1f, 0f, false, true, -0.894f, -0.553f)
                lineTo(5.5f, 15f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveTo(2.354f, 1.646f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, 0.708f)
                lineToRelative(12f, 12f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.708f)
                close()
            }
        }.build()
        
        return _LightbulbOff!!
    }

private var _LightbulbOff: ImageVector? = null


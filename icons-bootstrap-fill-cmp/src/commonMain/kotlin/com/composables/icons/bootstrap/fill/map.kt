package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Map: ImageVector
    get() {
        if (_Map != null) return _Map!!
        
        _Map = ImageVector.Builder(
            name = "map",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.598f, -0.49f)
                lineTo(10.5f, 0.99f)
                lineTo(5.598f, 0.01f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.196f, 0f)
                lineToRelative(-5f, 1f)
                arcTo(0.5f, 0.5f, 0f, false, false, 0f, 1.5f)
                verticalLineToRelative(14f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.598f, 0.49f)
                lineToRelative(4.902f, -0.98f)
                lineToRelative(4.902f, 0.98f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.196f, 0f)
                lineToRelative(5f, -1f)
                arcTo(0.5f, 0.5f, 0f, false, false, 16f, 14.5f)
                close()
                moveTo(5f, 14.09f)
                verticalLineTo(1.11f)
                lineToRelative(0.5f, -0.1f)
                lineToRelative(0.5f, 0.1f)
                verticalLineToRelative(12.98f)
                lineToRelative(-0.402f, -0.08f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.196f, 0f)
                close()
                moveToRelative(5f, 0.8f)
                verticalLineTo(1.91f)
                lineToRelative(0.402f, 0.08f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.196f, 0f)
                lineTo(11f, 1.91f)
                verticalLineToRelative(12.98f)
                lineToRelative(-0.5f, 0.1f)
                close()
            }
        }.build()
        
        return _Map!!
    }

private var _Map: ImageVector? = null


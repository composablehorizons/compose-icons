package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Box: ImageVector
    get() {
        if (_Box != null) return _Box!!
        
        _Box = ImageVector.Builder(
            name = "box",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.528f, 2.973f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.472f, 0.696f)
                verticalLineToRelative(8.662f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.472f, 0.696f)
                lineToRelative(-7.25f, 2.9f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.557f, 0f)
                lineToRelative(-7.25f, -2.9f)
                arcTo(0.75f, 0.75f, 0f, false, true, 0f, 12.331f)
                verticalLineTo(3.669f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.471f, -0.696f)
                lineTo(7.443f, 0.184f)
                lineToRelative(0.004f, -0.001f)
                lineToRelative(0.274f, -0.11f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.558f, 0f)
                lineToRelative(0.274f, 0.11f)
                lineToRelative(0.004f, 0.001f)
                close()
                moveToRelative(-1.374f, 0.527f)
                lineTo(8f, 5.962f)
                lineTo(1.846f, 3.5f)
                lineTo(1f, 3.839f)
                verticalLineToRelative(0.4f)
                lineToRelative(6.5f, 2.6f)
                verticalLineToRelative(7.922f)
                lineToRelative(0.5f, 0.2f)
                lineToRelative(0.5f, -0.2f)
                verticalLineTo(6.84f)
                lineToRelative(6.5f, -2.6f)
                verticalLineToRelative(-0.4f)
                lineToRelative(-0.846f, -0.339f)
                close()
            }
        }.build()
        
        return _Box!!
    }

private var _Box: ImageVector? = null


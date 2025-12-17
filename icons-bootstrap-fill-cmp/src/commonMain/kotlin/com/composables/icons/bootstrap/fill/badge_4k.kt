package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Badge4k: ImageVector
    get() {
        if (_Badge4k != null) return _Badge4k!!
        
        _Badge4k = ImageVector.Builder(
            name = "badge-4k",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.577f, 8.9f)
                verticalLineToRelative(0.03f)
                horizontalLineToRelative(1.828f)
                verticalLineTo(5.898f)
                horizontalLineToRelative(-0.062f)
                arcToRelative(47f, 47f, 0f, false, false, -1.766f, 3.001f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(2.372f, 3.715f)
                lineToRelative(0.435f, -0.714f)
                horizontalLineToRelative(1.71f)
                verticalLineToRelative(3.93f)
                horizontalLineToRelative(0.733f)
                verticalLineToRelative(0.957f)
                horizontalLineToRelative(-0.733f)
                verticalLineTo(11f)
                horizontalLineTo(5.405f)
                verticalLineTo(9.888f)
                horizontalLineTo(2.5f)
                verticalLineToRelative(-0.971f)
                curveToRelative(0.574f, -1.077f, 1.225f, -2.142f, 1.872f, -3.202f)
                moveToRelative(7.73f, -0.714f)
                horizontalLineToRelative(1.306f)
                lineToRelative(-2.14f, 2.584f)
                lineTo(13.5f, 11f)
                horizontalLineToRelative(-1.428f)
                lineToRelative(-1.679f, -2.624f)
                lineToRelative(-0.615f, 0.7f)
                verticalLineTo(11f)
                horizontalLineTo(8.59f)
                verticalLineTo(5.001f)
                horizontalLineToRelative(1.187f)
                verticalLineToRelative(2.686f)
                horizontalLineToRelative(0.057f)
                lineTo(12.102f, 5f)
                close()
            }
        }.build()
        
        return _Badge4k!!
    }

private var _Badge4k: ImageVector? = null


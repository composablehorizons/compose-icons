package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Badge4k: ImageVector
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
                moveTo(4.807f, 5.001f)
                curveTo(4.021f, 6.298f, 3.203f, 7.6f, 2.5f, 8.917f)
                verticalLineToRelative(0.971f)
                horizontalLineToRelative(2.905f)
                verticalLineTo(11f)
                horizontalLineToRelative(1.112f)
                verticalLineTo(9.888f)
                horizontalLineToRelative(0.733f)
                verticalLineTo(8.93f)
                horizontalLineToRelative(-0.733f)
                verticalLineTo(5.001f)
                close()
                moveToRelative(-1.23f, 3.93f)
                verticalLineToRelative(-0.032f)
                arcToRelative(47f, 47f, 0f, false, true, 1.766f, -3.001f)
                horizontalLineToRelative(0.062f)
                verticalLineTo(8.93f)
                close()
                moveToRelative(9.831f, -3.93f)
                horizontalLineToRelative(-1.306f)
                lineTo(9.835f, 7.687f)
                horizontalLineToRelative(-0.057f)
                verticalLineTo(5f)
                horizontalLineTo(8.59f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.187f)
                verticalLineTo(9.075f)
                lineToRelative(0.615f, -0.699f)
                lineTo(12.072f, 11f)
                horizontalLineTo(13.5f)
                lineToRelative(-2.232f, -3.415f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
        }.build()
        
        return _Badge4k!!
    }

private var _Badge4k: ImageVector? = null


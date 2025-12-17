package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.PlayPause: ImageVector
    get() {
        if (_PlayPause != null) return _PlayPause!!
        
        _PlayPause = ImageVector.Builder(
            name = "play-pause",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 4.804f)
                arcToRelative(1f, 1f, 0f, false, true, 1.53f, -0.848f)
                lineToRelative(5.113f, 3.196f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.696f)
                lineTo(2.53f, 12.044f)
                arcTo(1f, 1f, 0f, false, true, 1f, 11.196f)
                verticalLineTo(4.804f)
                close()
                moveTo(13.5f, 4.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 4f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(14f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-7f)
                close()
                moveTo(10.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-7f)
                arcTo(0.5f, 0.5f, 0f, false, false, 11f, 4f)
                horizontalLineToRelative(-0.5f)
                close()
            }
        }.build()
        
        return _PlayPause!!
    }

private var _PlayPause: ImageVector? = null


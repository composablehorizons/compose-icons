package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.PlayPause: ImageVector
    get() {
        if (_PlayPause != null) return _PlayPause!!
        
        _PlayPause = ImageVector.Builder(
            name = "play-pause",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineTo(18f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, 0.75f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineTo(7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(15f)
                close()
                moveTo(20.25f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineTo(18f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineTo(7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-0.75f)
                close()
                moveTo(5.055f, 7.06f)
                curveTo(3.805f, 6.347f, 2.25f, 7.25f, 2.25f, 8.69f)
                verticalLineToRelative(8.122f)
                curveToRelative(0f, 1.44f, 1.555f, 2.343f, 2.805f, 1.628f)
                lineToRelative(7.108f, -4.061f)
                curveToRelative(1.26f, -0.72f, 1.26f, -2.536f, 0f, -3.256f)
                lineTo(5.055f, 7.061f)
                close()
            }
        }.build()
        
        return _PlayPause!!
    }

private var _PlayPause: ImageVector? = null


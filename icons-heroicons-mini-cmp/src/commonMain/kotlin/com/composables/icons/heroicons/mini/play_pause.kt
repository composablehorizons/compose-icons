package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.PlayPause: ImageVector
    get() {
        if (_PlayPause != null) return _PlayPause!!
        
        _PlayPause = ImageVector.Builder(
            name = "play-pause",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.75f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineTo(4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-0.5f)
                close()
                moveTo(17.75f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineTo(4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-0.5f)
                close()
                moveTo(3.288f, 4.819f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1f, 6.095f)
                verticalLineToRelative(7.81f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 2.288f, 1.277f)
                lineToRelative(6.323f, -3.906f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, -2.552f)
                lineTo(3.288f, 4.819f)
                close()
            }
        }.build()
        
        return _PlayPause!!
    }

private var _PlayPause: ImageVector? = null


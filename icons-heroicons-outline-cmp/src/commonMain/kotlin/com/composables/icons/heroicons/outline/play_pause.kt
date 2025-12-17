package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.PlayPause: ImageVector
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
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(21f, 7.5f)
                verticalLineTo(18f)
                moveTo(15f, 7.5f)
                verticalLineTo(18f)
                moveTo(3f, 16.811f)
                verticalLineTo(8.69f)
                curveToRelative(0f, -0.864f, 0.933f, -1.406f, 1.683f, -0.977f)
                lineToRelative(7.108f, 4.061f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, 0f, 1.954f)
                lineToRelative(-7.108f, 4.061f)
                arcTo(1.125f, 1.125f, 0f, false, true, 3f, 16.811f)
                close()
            }
        }.build()
        
        return _PlayPause!!
    }

private var _PlayPause: ImageVector? = null


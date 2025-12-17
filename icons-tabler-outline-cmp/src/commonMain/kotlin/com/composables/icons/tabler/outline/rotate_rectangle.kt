package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.RotateRectangle: ImageVector
    get() {
        if (_RotateRectangle != null) return _RotateRectangle!!
        
        _RotateRectangle = ImageVector.Builder(
            name = "rotate-rectangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.09f, 4.01f)
                lineToRelative(0.496f, -0.495f)
                arcToRelative(2f, 2f, 0f, false, true, 2.828f, 0f)
                lineToRelative(7.071f, 7.07f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 2.83f)
                lineToRelative(-7.07f, 7.07f)
                arcToRelative(2f, 2f, 0f, false, true, -2.83f, 0f)
                lineToRelative(-7.07f, -7.07f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -2.83f)
                lineToRelative(3.535f, -3.535f)
                horizontalLineToRelative(-3.988f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.05f, 11.038f)
                verticalLineToRelative(-3.988f)
            }
        }.build()
        
        return _RotateRectangle!!
    }

private var _RotateRectangle: ImageVector? = null


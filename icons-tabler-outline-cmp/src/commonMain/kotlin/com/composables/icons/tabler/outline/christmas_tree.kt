package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ChristmasTree: ImageVector
    get() {
        if (_ChristmasTree != null) return _ChristmasTree!!
        
        _ChristmasTree = ImageVector.Builder(
            name = "christmas-tree",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                lineToRelative(4f, 4f)
                lineToRelative(-2f, 1f)
                lineToRelative(4f, 4f)
                lineToRelative(-3f, 1f)
                lineToRelative(4f, 4f)
                horizontalLineToRelative(-14f)
                lineToRelative(4f, -4f)
                lineToRelative(-3f, -1f)
                lineToRelative(4f, -4f)
                lineToRelative(-2f, -1f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 17f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-3f)
            }
        }.build()
        
        return _ChristmasTree!!
    }

private var _ChristmasTree: ImageVector? = null


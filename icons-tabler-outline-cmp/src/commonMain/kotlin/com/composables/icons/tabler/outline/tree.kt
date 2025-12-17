package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Tree: ImageVector
    get() {
        if (_Tree != null) return _Tree!!
        
        _Tree = ImageVector.Builder(
            name = "tree",
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
                moveTo(12f, 13f)
                lineToRelative(-2f, -2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                lineToRelative(2f, -2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 21f)
                verticalLineToRelative(-13f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.824f, 16f)
                arcToRelative(3f, 3f, 0f, false, true, -2.743f, -3.69f)
                arcToRelative(3f, 3f, 0f, false, true, 0.304f, -4.833f)
                arcToRelative(3f, 3f, 0f, false, true, 4.615f, -3.707f)
                arcToRelative(3f, 3f, 0f, false, true, 4.614f, 3.707f)
                arcToRelative(3f, 3f, 0f, false, true, 0.305f, 4.833f)
                arcToRelative(3f, 3f, 0f, false, true, -2.919f, 3.695f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.build()
        
        return _Tree!!
    }

private var _Tree: ImageVector? = null


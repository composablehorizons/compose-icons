package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Strikethrough: ImageVector
    get() {
        if (_Strikethrough != null) return _Strikethrough!!
        
        _Strikethrough = ImageVector.Builder(
            name = "strikethrough",
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
                moveTo(5f, 12f)
                lineToRelative(14f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 6.5f)
                arcToRelative(4f, 2f, 0f, false, false, -4f, -1.5f)
                horizontalLineToRelative(-1f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 0f, 7f)
                horizontalLineToRelative(2f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, 7f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(4f, 2f, 0f, false, true, -4f, -1.5f)
            }
        }.build()
        
        return _Strikethrough!!
    }

private var _Strikethrough: ImageVector? = null


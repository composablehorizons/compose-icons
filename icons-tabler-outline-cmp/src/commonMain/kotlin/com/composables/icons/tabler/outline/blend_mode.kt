package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BlendMode: ImageVector
    get() {
        if (_BlendMode != null) return _BlendMode!!
        
        _BlendMode = ImageVector.Builder(
            name = "blend-mode",
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
                moveTo(14.5f, 9.5f)
                moveToRelative(-6.5f, 0f)
                arcToRelative(6.5f, 6.5f, 0f, true, false, 13f, 0f)
                arcToRelative(6.5f, 6.5f, 0f, true, false, -13f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 14.5f)
                moveToRelative(-6.5f, 0f)
                arcToRelative(6.5f, 6.5f, 0f, true, false, 13f, 0f)
                arcToRelative(6.5f, 6.5f, 0f, true, false, -13f, 0f)
            }
        }.build()
        
        return _BlendMode!!
    }

private var _BlendMode: ImageVector? = null


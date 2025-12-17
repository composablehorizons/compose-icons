package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.SkewX: ImageVector
    get() {
        if (_SkewX != null) return _SkewX!!
        
        _SkewX = ImageVector.Builder(
            name = "skew-x",
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
                moveTo(4f, 5.205f)
                verticalLineToRelative(13.59f)
                arcToRelative(1f, 1f, 0f, false, false, 1.184f, 0.983f)
                lineToRelative(14f, -2.625f)
                arcToRelative(1f, 1f, 0f, false, false, 0.816f, -0.983f)
                verticalLineToRelative(-8.34f)
                arcToRelative(1f, 1f, 0f, false, false, -0.816f, -0.983f)
                lineToRelative(-14f, -2.625f)
                arcToRelative(1f, 1f, 0f, false, false, -1.184f, 0.983f)
                close()
            }
        }.build()
        
        return _SkewX!!
    }

private var _SkewX: ImageVector? = null


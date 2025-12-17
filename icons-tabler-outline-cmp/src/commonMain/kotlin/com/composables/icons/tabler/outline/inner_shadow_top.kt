package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.InnerShadowTop: ImageVector
    get() {
        if (_InnerShadowTop != null) return _InnerShadowTop!!
        
        _InnerShadowTop = ImageVector.Builder(
            name = "inner-shadow-top",
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
                moveTo(5.636f, 5.636f)
                arcToRelative(9f, 9f, 0f, true, false, 12.728f, 12.728f)
                arcToRelative(9f, 9f, 0f, false, false, -12.728f, -12.728f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.243f, 7.757f)
                arcToRelative(6f, 6f, 0f, false, false, -8.486f, 0f)
            }
        }.build()
        
        return _InnerShadowTop!!
    }

private var _InnerShadowTop: ImageVector? = null


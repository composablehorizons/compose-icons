package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.InnerShadowLeft: ImageVector
    get() {
        if (_InnerShadowLeft != null) return _InnerShadowLeft!!
        
        _InnerShadowLeft = ImageVector.Builder(
            name = "inner-shadow-left",
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
                arcToRelative(9f, 9f, 0f, true, true, 12.728f, 12.728f)
                arcToRelative(9f, 9f, 0f, false, true, -12.728f, -12.728f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.757f, 16.243f)
                arcToRelative(6f, 6f, 0f, false, true, 0f, -8.486f)
            }
        }.build()
        
        return _InnerShadowLeft!!
    }

private var _InnerShadowLeft: ImageVector? = null


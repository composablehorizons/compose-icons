package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.InnerShadowBottom: ImageVector
    get() {
        if (_InnerShadowBottom != null) return _InnerShadowBottom!!
        
        _InnerShadowBottom = ImageVector.Builder(
            name = "inner-shadow-bottom",
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
                moveTo(18.364f, 18.364f)
                arcToRelative(9f, 9f, 0f, true, false, -12.728f, -12.728f)
                arcToRelative(9f, 9f, 0f, false, false, 12.728f, 12.728f)
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
                arcToRelative(6f, 6f, 0f, false, false, 8.486f, 0f)
            }
        }.build()
        
        return _InnerShadowBottom!!
    }

private var _InnerShadowBottom: ImageVector? = null


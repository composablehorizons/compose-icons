package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Axe: ImageVector
    get() {
        if (_Axe != null) return _Axe!!
        
        _Axe = ImageVector.Builder(
            name = "axe",
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
                moveTo(13f, 9f)
                lineToRelative(7.383f, 7.418f)
                curveToRelative(0.823f, 0.82f, 0.823f, 2.148f, 0f, 2.967f)
                arcToRelative(2.11f, 2.11f, 0f, false, true, -2.976f, 0f)
                lineToRelative(-7.407f, -7.385f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.66f, 15.66f)
                lineToRelative(-3.32f, -3.32f)
                arcToRelative(1.25f, 1.25f, 0f, false, true, 0.42f, -2.044f)
                lineToRelative(3.24f, -1.296f)
                lineToRelative(6f, -6f)
                lineToRelative(3f, 3f)
                lineToRelative(-6f, 6f)
                lineToRelative(-1.296f, 3.24f)
                arcToRelative(1.25f, 1.25f, 0f, false, true, -2.044f, 0.42f)
                close()
            }
        }.build()
        
        return _Axe!!
    }

private var _Axe: ImageVector? = null


package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Baguette: ImageVector
    get() {
        if (_Baguette != null) return _Baguette!!
        
        _Baguette = ImageVector.Builder(
            name = "baguette",
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
                moveTo(5.628f, 11.283f)
                lineToRelative(5.644f, -5.637f)
                curveToRelative(2.665f, -2.663f, 5.924f, -3.747f, 8.663f, -1.205f)
                lineToRelative(0.188f, 0.181f)
                arcToRelative(2.987f, 2.987f, 0f, false, true, 0f, 4.228f)
                lineToRelative(-11.287f, 11.274f)
                arcToRelative(3f, 3f, 0f, false, true, -4.089f, 0.135f)
                lineToRelative(-0.143f, -0.135f)
                curveToRelative(-2.728f, -2.724f, -1.704f, -6.117f, 1.024f, -8.841f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 7.5f)
                lineToRelative(1.5f, 3.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.5f, 10.5f)
                lineToRelative(1.5f, 3.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.5f, 4.5f)
                lineToRelative(1.5f, 3.5f)
            }
        }.build()
        
        return _Baguette!!
    }

private var _Baguette: ImageVector? = null


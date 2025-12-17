package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Butterfly: ImageVector
    get() {
        if (_Butterfly != null) return _Butterfly!!
        
        _Butterfly = ImageVector.Builder(
            name = "butterfly",
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
                moveTo(12f, 18.176f)
                arcToRelative(3f, 3f, 0f, true, true, -4.953f, -2.449f)
                lineToRelative(-0.025f, 0.023f)
                arcToRelative(4.502f, 4.502f, 0f, false, true, 1.483f, -8.75f)
                curveToRelative(1.414f, 0f, 2.675f, 0.652f, 3.5f, 1.671f)
                arcToRelative(4.5f, 4.5f, 0f, true, true, 4.983f, 7.079f)
                arcToRelative(3f, 3f, 0f, true, true, -4.983f, 2.25f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 19f)
                verticalLineToRelative(-10f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 3f)
                lineToRelative(3f, 2f)
                lineToRelative(3f, -2f)
            }
        }.build()
        
        return _Butterfly!!
    }

private var _Butterfly: ImageVector? = null


package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Alien: ImageVector
    get() {
        if (_Alien != null) return _Alien!!
        
        _Alien = ImageVector.Builder(
            name = "alien",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 17f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                curveToRelative(-4.664f, 0f, -7.396f, 2.331f, -7.862f, 5.595f)
                arcToRelative(11.816f, 11.816f, 0f, false, false, 2f, 8.592f)
                arcToRelative(10.777f, 10.777f, 0f, false, false, 3.199f, 3.064f)
                curveToRelative(1.666f, 1f, 3.664f, 1f, 5.33f, 0f)
                arcToRelative(10.777f, 10.777f, 0f, false, false, 3.199f, -3.064f)
                arcToRelative(11.89f, 11.89f, 0f, false, false, 2f, -8.592f)
                curveToRelative(-0.466f, -3.265f, -3.198f, -5.595f, -7.862f, -5.595f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 11f)
                lineToRelative(2f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 11f)
                lineToRelative(-2f, 2f)
            }
        }.build()
        
        return _Alien!!
    }

private var _Alien: ImageVector? = null


package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Plant2Off: ImageVector
    get() {
        if (_Plant2Off != null) return _Plant2Off!!
        
        _Plant2Off = ImageVector.Builder(
            name = "plant-2-off",
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
                moveTo(2f, 9f)
                curveToRelative(0f, 5.523f, 4.477f, 10f, 10f, 10f)
                arcToRelative(9.953f, 9.953f, 0f, false, false, 5.418f, -1.593f)
                moveToRelative(2.137f, -1.855f)
                arcToRelative(9.961f, 9.961f, 0f, false, false, 2.445f, -6.552f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 19f)
                curveToRelative(0f, -1.988f, 0.58f, -3.84f, 1.58f, -5.397f)
                moveToRelative(1.878f, -2.167f)
                arcToRelative(9.961f, 9.961f, 0f, false, true, 6.542f, -2.436f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 9f)
                arcToRelative(10f, 10f, 0f, false, true, 10f, 10f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 4f)
                arcToRelative(9.7f, 9.7f, 0f, false, true, 3f, 7.013f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.01f, 11.5f)
                arcToRelative(9.696f, 9.696f, 0f, false, true, 0.163f, -2.318f)
                moveToRelative(1.082f, -2.942f)
                arcToRelative(9.696f, 9.696f, 0f, false, true, 1.745f, -2.24f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _Plant2Off!!
    }

private var _Plant2Off: ImageVector? = null


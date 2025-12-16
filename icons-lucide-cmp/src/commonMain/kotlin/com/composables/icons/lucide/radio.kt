package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Radio: ImageVector
    get() {
        if (_Radio != null) return _Radio!!
        
        _Radio = ImageVector.Builder(
            name = "radio",
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
                moveTo(16.247f, 7.761f)
                arcToRelative(6f, 6f, 0f, false, true, 0f, 8.478f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.075f, 4.933f)
                arcToRelative(10f, 10f, 0f, false, true, 0f, 14.134f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.925f, 19.067f)
                arcToRelative(10f, 10f, 0f, false, true, 0f, -14.134f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.753f, 16.239f)
                arcToRelative(6f, 6f, 0f, false, true, 0f, -8.478f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 12f)
                arcTo(2f, 2f, 0f, false, true, 12f, 14f)
                arcTo(2f, 2f, 0f, false, true, 10f, 12f)
                arcTo(2f, 2f, 0f, false, true, 14f, 12f)
                close()
            }
        }.build()
        
        return _Radio!!
    }

private var _Radio: ImageVector? = null


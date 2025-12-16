package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CandyOff: ImageVector
    get() {
        if (_CandyOff != null) return _CandyOff!!
        
        _CandyOff = ImageVector.Builder(
            name = "candy-off",
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
                moveTo(10f, 10f)
                verticalLineToRelative(7.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.802f, 6.145f)
                arcToRelative(5f, 5f, 0f, false, true, 6.053f, 6.053f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 6.1f)
                verticalLineToRelative(2.243f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.5f, 15.571f)
                lineToRelative(-0.964f, 0.964f)
                arcToRelative(5f, 5f, 0f, false, true, -7.071f, 0f)
                arcToRelative(5f, 5f, 0f, false, true, 0f, -7.07f)
                lineToRelative(0.964f, -0.965f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 7f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1.707f, -0.707f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2.152f, 0.717f)
                arcToRelative(1f, 1f, 0f, false, true, 1.131f, 1.131f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0.717f, 2.152f)
                arcTo(1f, 1f, 0f, false, true, 21f, 8f)
                horizontalLineToRelative(-4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                lineToRelative(20f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 17f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1.707f, 0.707f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.152f, -0.717f)
                arcToRelative(1f, 1f, 0f, false, true, -1.131f, -1.131f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -0.717f, -2.152f)
                arcTo(1f, 1f, 0f, false, true, 3f, 16f)
                horizontalLineToRelative(4f)
            }
        }.build()
        
        return _CandyOff!!
    }

private var _CandyOff: ImageVector? = null


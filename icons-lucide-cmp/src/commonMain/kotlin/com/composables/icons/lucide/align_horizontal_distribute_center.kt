package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.AlignHorizontalDistributeCenter: ImageVector
    get() {
        if (_AlignHorizontalDistributeCenter != null) return _AlignHorizontalDistributeCenter!!
        
        _AlignHorizontalDistributeCenter = ImageVector.Builder(
            name = "align-horizontal-distribute-center",
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
                moveTo(6f, 5f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 10f, 7f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, false, true, 8f, 19f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, false, true, 4f, 17f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, false, true, 6f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 7f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, false, true, 20f, 9f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, false, true, 18f, 17f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 14f, 15f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, false, true, 16f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 22f)
                verticalLineToRelative(-5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 7f)
                verticalLineTo(2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 22f)
                verticalLineToRelative(-3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 5f)
                verticalLineTo(2f)
            }
        }.build()
        
        return _AlignHorizontalDistributeCenter!!
    }

private var _AlignHorizontalDistributeCenter: ImageVector? = null


package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.AlignHorizontalDistributeStart: ImageVector
    get() {
        if (_AlignHorizontalDistributeStart != null) return _AlignHorizontalDistributeStart!!
        
        _AlignHorizontalDistributeStart = ImageVector.Builder(
            name = "align-horizontal-distribute-start",
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
                moveTo(4f, 2f)
                verticalLineToRelative(20f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 2f)
                verticalLineToRelative(20f)
            }
        }.build()
        
        return _AlignHorizontalDistributeStart!!
    }

private var _AlignHorizontalDistributeStart: ImageVector? = null


package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.AlignHorizontalDistributeEnd: ImageVector
    get() {
        if (_AlignHorizontalDistributeEnd != null) return _AlignHorizontalDistributeEnd!!
        
        _AlignHorizontalDistributeEnd = ImageVector.Builder(
            name = "align-horizontal-distribute-end",
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 2f)
                verticalLineToRelative(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 2f)
                verticalLineToRelative(20f)
            }
        }.build()
        
        return _AlignHorizontalDistributeEnd!!
    }

private var _AlignHorizontalDistributeEnd: ImageVector? = null


package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.AlignHorizontalSpaceBetween: ImageVector
    get() {
        if (_AlignHorizontalSpaceBetween != null) return _AlignHorizontalSpaceBetween!!
        
        _AlignHorizontalSpaceBetween = ImageVector.Builder(
            name = "align-horizontal-space-between",
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
                moveTo(5f, 5f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, false, true, 9f, 7f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, false, true, 7f, 19f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, false, true, 3f, 17f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, false, true, 5f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 7f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, false, true, 21f, 9f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, false, true, 19f, 17f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, false, true, 15f, 15f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, false, true, 17f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 2f)
                verticalLineToRelative(20f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 2f)
                verticalLineToRelative(20f)
            }
        }.build()
        
        return _AlignHorizontalSpaceBetween!!
    }

private var _AlignHorizontalSpaceBetween: ImageVector? = null


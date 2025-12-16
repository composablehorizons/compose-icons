package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.AlignVerticalSpaceBetween: ImageVector
    get() {
        if (_AlignVerticalSpaceBetween != null) return _AlignVerticalSpaceBetween!!
        
        _AlignVerticalSpaceBetween = ImageVector.Builder(
            name = "align-vertical-space-between",
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
                moveTo(7f, 15f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, false, true, 19f, 17f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, false, true, 17f, 21f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, false, true, 5f, 19f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, false, true, 7f, 15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 3f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, false, true, 17f, 5f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, false, true, 15f, 9f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, false, true, 7f, 7f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, false, true, 9f, 3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 21f)
                horizontalLineToRelative(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 3f)
                horizontalLineToRelative(20f)
            }
        }.build()
        
        return _AlignVerticalSpaceBetween!!
    }

private var _AlignVerticalSpaceBetween: ImageVector? = null


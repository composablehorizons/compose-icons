package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.AlignVerticalDistributeCenter: ImageVector
    get() {
        if (_AlignVerticalDistributeCenter != null) return _AlignVerticalDistributeCenter!!
        
        _AlignVerticalDistributeCenter = ImageVector.Builder(
            name = "align-vertical-distribute-center",
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
                moveTo(22f, 17f)
                horizontalLineToRelative(-3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 7f)
                horizontalLineToRelative(-5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 17f)
                horizontalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 7f)
                horizontalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 14f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, false, true, 19f, 16f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, false, true, 17f, 20f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, false, true, 5f, 18f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 7f, 14f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 4f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, false, true, 17f, 6f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 15f, 10f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, false, true, 7f, 8f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, false, true, 9f, 4f)
                close()
            }
        }.build()
        
        return _AlignVerticalDistributeCenter!!
    }

private var _AlignVerticalDistributeCenter: ImageVector? = null


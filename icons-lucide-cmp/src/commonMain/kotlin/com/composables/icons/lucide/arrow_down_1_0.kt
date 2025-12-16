package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowDown10: ImageVector
    get() {
        if (_ArrowDown10 != null) return _ArrowDown10!!
        
        _ArrowDown10 = ImageVector.Builder(
            name = "arrow-down-1-0",
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
                moveTo(3f, 16f)
                lineToRelative(4f, 4f)
                lineToRelative(4f, -4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 20f)
                verticalLineTo(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 10f)
                verticalLineTo(4f)
                horizontalLineToRelative(-2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 10f)
                horizontalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 14f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, false, true, 19f, 16f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, false, true, 17f, 20f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, false, true, 15f, 18f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 17f, 14f)
                close()
            }
        }.build()
        
        return _ArrowDown10!!
    }

private var _ArrowDown10: ImageVector? = null


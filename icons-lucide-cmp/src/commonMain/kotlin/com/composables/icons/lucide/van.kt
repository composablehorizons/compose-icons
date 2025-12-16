package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Van: ImageVector
    get() {
        if (_Van != null) return _Van!!
        
        _Van = ImageVector.Builder(
            name = "van",
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
                moveTo(13f, 6f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(6.102f)
                arcToRelative(1f, 1f, 0f, false, true, 0.712f, 0.298f)
                lineToRelative(0.898f, 0.91f)
                arcToRelative(1f, 1f, 0f, false, true, 0.288f, 0.702f)
                verticalLineTo(17f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 18f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2.1f, 0.8f, 2.4f, 1.8f)
                lineToRelative(1.176f, 4.2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 18f)
                horizontalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 18f)
                arcTo(2f, 2f, 0f, false, true, 16f, 20f)
                arcTo(2f, 2f, 0f, false, true, 14f, 18f)
                arcTo(2f, 2f, 0f, false, true, 18f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 18f)
                arcTo(2f, 2f, 0f, false, true, 7f, 20f)
                arcTo(2f, 2f, 0f, false, true, 5f, 18f)
                arcTo(2f, 2f, 0f, false, true, 9f, 18f)
                close()
            }
        }.build()
        
        return _Van!!
    }

private var _Van: ImageVector? = null


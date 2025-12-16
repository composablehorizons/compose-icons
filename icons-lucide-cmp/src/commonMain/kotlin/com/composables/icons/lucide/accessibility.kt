package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Accessibility: ImageVector
    get() {
        if (_Accessibility != null) return _Accessibility!!
        
        _Accessibility = ImageVector.Builder(
            name = "accessibility",
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
                moveTo(17f, 4f)
                arcTo(1f, 1f, 0f, false, true, 16f, 5f)
                arcTo(1f, 1f, 0f, false, true, 15f, 4f)
                arcTo(1f, 1f, 0f, false, true, 17f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 19f)
                lineToRelative(1f, -7f)
                lineToRelative(-6f, 1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 8f)
                lineToRelative(3f, -3f)
                lineToRelative(5.5f, 3f)
                lineToRelative(-2.36f, 3.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.24f, 14.5f)
                arcToRelative(5f, 5f, 0f, false, false, 6.88f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.76f, 17.5f)
                arcToRelative(5f, 5f, 0f, false, false, -6.88f, -6f)
            }
        }.build()
        
        return _Accessibility!!
    }

private var _Accessibility: ImageVector? = null


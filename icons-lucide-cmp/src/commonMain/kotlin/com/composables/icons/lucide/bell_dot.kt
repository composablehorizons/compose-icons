package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BellDot: ImageVector
    get() {
        if (_BellDot != null) return _BellDot!!
        
        _BellDot = ImageVector.Builder(
            name = "bell-dot",
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
                moveTo(10.268f, 21f)
                arcToRelative(2f, 2f, 0f, false, false, 3.464f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.916f, 2.314f)
                arcTo(6f, 6f, 0f, false, false, 6f, 8f)
                curveToRelative(0f, 4.499f, -1.411f, 5.956f, -2.74f, 7.327f)
                arcTo(1f, 1f, 0f, false, false, 4f, 17f)
                horizontalLineToRelative(16f)
                arcToRelative(1f, 1f, 0f, false, false, 0.74f, -1.673f)
                arcToRelative(9f, 9f, 0f, false, true, -0.585f, -0.665f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 8f)
                arcTo(3f, 3f, 0f, false, true, 18f, 11f)
                arcTo(3f, 3f, 0f, false, true, 15f, 8f)
                arcTo(3f, 3f, 0f, false, true, 21f, 8f)
                close()
            }
        }.build()
        
        return _BellDot!!
    }

private var _BellDot: ImageVector? = null


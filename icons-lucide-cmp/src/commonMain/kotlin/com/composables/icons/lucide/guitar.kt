package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Guitar: ImageVector
    get() {
        if (_Guitar != null) return _Guitar!!
        
        _Guitar = ImageVector.Builder(
            name = "guitar",
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
                moveTo(11.9f, 12.1f)
                lineToRelative(4.514f, -4.514f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.1f, 2.3f)
                arcToRelative(1f, 1f, 0f, false, false, -1.4f, 0f)
                lineToRelative(-1.114f, 1.114f)
                arcTo(2f, 2f, 0f, false, false, 17f, 4.828f)
                verticalLineToRelative(1.344f)
                arcToRelative(2f, 2f, 0f, false, true, -0.586f, 1.414f)
                arcTo(2f, 2f, 0f, false, true, 17.828f, 7f)
                horizontalLineToRelative(1.344f)
                arcToRelative(2f, 2f, 0f, false, false, 1.414f, -0.586f)
                lineTo(21.7f, 5.3f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.4f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 16f)
                lineToRelative(2f, 2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.23f, 9.85f)
                arcTo(3f, 3f, 0f, false, true, 11f, 8f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, 5f)
                arcToRelative(3f, 3f, 0f, false, true, -1.85f, 2.77f)
                lineToRelative(-0.92f, 0.38f)
                arcTo(2f, 2f, 0f, false, false, 12f, 18f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, -6f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, 1.85f, -1.23f)
                close()
            }
        }.build()
        
        return _Guitar!!
    }

private var _Guitar: ImageVector? = null


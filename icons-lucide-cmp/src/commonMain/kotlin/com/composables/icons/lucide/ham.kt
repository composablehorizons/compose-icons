package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Ham: ImageVector
    get() {
        if (_Ham != null) return _Ham!!
        
        _Ham = ImageVector.Builder(
            name = "ham",
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
                moveTo(13.144f, 21.144f)
                arcTo(7.274f, 10.445f, 45f, true, false, 2.856f, 10.856f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.144f, 21.144f)
                arcTo(7.274f, 4.365f, 45f, false, false, 2.856f, 10.856f)
                arcToRelative(7.274f, 4.365f, 45f, false, false, 10.288f, 10.288f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.565f, 10.435f)
                lineTo(18.6f, 8.4f)
                arcToRelative(2.501f, 2.501f, 0f, true, false, 1.65f, -4.65f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -4.66f, 1.66f)
                lineToRelative(-2.024f, 2.025f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 16.5f)
                lineToRelative(-1f, -1f)
            }
        }.build()
        
        return _Ham!!
    }

private var _Ham: ImageVector? = null


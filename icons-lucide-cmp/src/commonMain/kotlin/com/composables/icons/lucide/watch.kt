package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Watch: ImageVector
    get() {
        if (_Watch != null) return _Watch!!
        
        _Watch = ImageVector.Builder(
            name = "watch",
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
                moveTo(12f, 10f)
                verticalLineToRelative(2.2f)
                lineToRelative(1.6f, 1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.13f, 7.66f)
                lineToRelative(-0.81f, -4.05f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -1.61f)
                horizontalLineToRelative(-2.68f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 1.61f)
                lineToRelative(-0.78f, 4.05f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.88f, 16.36f)
                lineToRelative(0.8f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 1.61f)
                horizontalLineToRelative(2.72f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -1.61f)
                lineToRelative(0.81f, -4.05f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 12f)
                arcTo(6f, 6f, 0f, false, true, 12f, 18f)
                arcTo(6f, 6f, 0f, false, true, 6f, 12f)
                arcTo(6f, 6f, 0f, false, true, 18f, 12f)
                close()
            }
        }.build()
        
        return _Watch!!
    }

private var _Watch: ImageVector? = null


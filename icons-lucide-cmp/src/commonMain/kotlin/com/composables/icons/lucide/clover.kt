package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Clover: ImageVector
    get() {
        if (_Clover != null) return _Clover!!
        
        _Clover = ImageVector.Builder(
            name = "clover",
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
                moveTo(16.17f, 7.83f)
                lineTo(2f, 22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.02f, 12f)
                arcToRelative(2.827f, 2.827f, 0f, true, true, 3.81f, -4.17f)
                arcTo(2.827f, 2.827f, 0f, true, true, 12f, 4.02f)
                arcToRelative(2.827f, 2.827f, 0f, true, true, 4.17f, 3.81f)
                arcTo(2.827f, 2.827f, 0f, true, true, 19.98f, 12f)
                arcToRelative(2.827f, 2.827f, 0f, true, true, -3.81f, 4.17f)
                arcTo(2.827f, 2.827f, 0f, true, true, 12f, 19.98f)
                arcToRelative(2.827f, 2.827f, 0f, true, true, -4.17f, -3.81f)
                arcTo(1f, 1f, 0f, true, true, 4f, 12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.83f, 7.83f)
                lineToRelative(8.34f, 8.34f)
            }
        }.build()
        
        return _Clover!!
    }

private var _Clover: ImageVector? = null


package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FishingHook: ImageVector
    get() {
        if (_FishingHook != null) return _FishingHook!!
        
        _FishingHook = ImageVector.Builder(
            name = "fishing-hook",
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
                moveTo(17.586f, 11.414f)
                lineToRelative(-5.93f, 5.93f)
                arcToRelative(1f, 1f, 0f, false, true, -8f, -8f)
                lineToRelative(3.137f, -3.137f)
                arcToRelative(0.707f, 0.707f, 0f, false, true, 1.207f, 0.5f)
                verticalLineTo(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.414f, 8.586f)
                lineTo(22f, 7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 10f)
                arcTo(2f, 2f, 0f, false, true, 19f, 12f)
                arcTo(2f, 2f, 0f, false, true, 17f, 10f)
                arcTo(2f, 2f, 0f, false, true, 21f, 10f)
                close()
            }
        }.build()
        
        return _FishingHook!!
    }

private var _FishingHook: ImageVector? = null


package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Palette: ImageVector
    get() {
        if (_Palette != null) return _Palette!!
        
        _Palette = ImageVector.Builder(
            name = "palette",
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
                moveTo(12f, 22f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -20f)
                arcToRelative(10f, 9f, 0f, false, true, 10f, 9f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, 5f)
                horizontalLineToRelative(-2.25f)
                arcToRelative(1.75f, 1.75f, 0f, false, false, -1.4f, 2.8f)
                lineToRelative(0.3f, 0.4f)
                arcToRelative(1.75f, 1.75f, 0f, false, true, -1.4f, 2.8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 6.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13.5f, 7f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13f, 6.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 6.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 10.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 17.5f, 11f)
                arcTo(0.5f, 0.5f, 0f, false, true, 17f, 10.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 18f, 10.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 12.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6.5f, 13f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6f, 12.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 12.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 8f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 7.5f)
                close()
            }
        }.build()
        
        return _Palette!!
    }

private var _Palette: ImageVector? = null


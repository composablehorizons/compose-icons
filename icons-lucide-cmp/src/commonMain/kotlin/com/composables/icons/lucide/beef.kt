package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Beef: ImageVector
    get() {
        if (_Beef != null) return _Beef!!
        
        _Beef = ImageVector.Builder(
            name = "beef",
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
                moveTo(16.4f, 13.7f)
                arcTo(6.5f, 6.5f, 0f, true, false, 6.28f, 6.6f)
                curveToRelative(-1.1f, 3.13f, -0.78f, 3.9f, -3.18f, 6.08f)
                arcTo(3f, 3f, 0f, false, false, 5f, 18f)
                curveToRelative(4f, 0f, 8.4f, -1.8f, 11.4f, -4.3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 6f)
                lineToRelative(2.19f, 4.5f)
                arcToRelative(6.48f, 6.48f, 0f, false, true, -2.29f, 7.2f)
                curveTo(15.4f, 20.2f, 11f, 22f, 7f, 22f)
                arcToRelative(3f, 3f, 0f, false, true, -2.68f, -1.66f)
                lineTo(2.4f, 16.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 8.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 12.5f, 11f)
                arcTo(2.5f, 2.5f, 0f, false, true, 10f, 8.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 15f, 8.5f)
                close()
            }
        }.build()
        
        return _Beef!!
    }

private var _Beef: ImageVector? = null


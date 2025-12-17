package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MapPinCheck: ImageVector
    get() {
        if (_MapPinCheck != null) return _MapPinCheck!!
        
        _MapPinCheck = ImageVector.Builder(
            name = "map-pin-check",
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
                moveTo(19.43f, 12.935f)
                curveToRelative(0.357f, -0.967f, 0.57f, -1.955f, 0.57f, -2.935f)
                arcToRelative(8f, 8f, 0f, false, false, -16f, 0f)
                curveToRelative(0f, 4.993f, 5.539f, 10.193f, 7.399f, 11.799f)
                arcToRelative(1f, 1f, 0f, false, false, 1.202f, 0f)
                arcToRelative(32.197f, 32.197f, 0f, false, false, 0.813f, -0.728f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 10f)
                arcTo(3f, 3f, 0f, false, true, 12f, 13f)
                arcTo(3f, 3f, 0f, false, true, 9f, 10f)
                arcTo(3f, 3f, 0f, false, true, 15f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 18f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
        }.build()
        
        return _MapPinCheck!!
    }

private var _MapPinCheck: ImageVector? = null


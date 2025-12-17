package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MapPinMinus: ImageVector
    get() {
        if (_MapPinMinus != null) return _MapPinMinus!!
        
        _MapPinMinus = ImageVector.Builder(
            name = "map-pin-minus",
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
                moveTo(18.977f, 14f)
                curveTo(19.6f, 12.701f, 20f, 11.343f, 20f, 10f)
                arcToRelative(8f, 8f, 0f, false, false, -16f, 0f)
                curveToRelative(0f, 4.993f, 5.539f, 10.193f, 7.399f, 11.799f)
                arcToRelative(1f, 1f, 0f, false, false, 1.202f, 0f)
                arcToRelative(32f, 32f, 0f, false, false, 0.824f, -0.738f)
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
                horizontalLineToRelative(6f)
            }
        }.build()
        
        return _MapPinMinus!!
    }

private var _MapPinMinus: ImageVector? = null


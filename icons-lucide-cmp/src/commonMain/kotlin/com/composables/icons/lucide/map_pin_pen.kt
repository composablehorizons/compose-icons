package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MapPinPen: ImageVector
    get() {
        if (_MapPinPen != null) return _MapPinPen!!
        
        _MapPinPen = ImageVector.Builder(
            name = "map-pin-pen",
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
                moveTo(17.97f, 9.304f)
                arcTo(8f, 8f, 0f, false, false, 2f, 10f)
                curveToRelative(0f, 4.69f, 4.887f, 9.562f, 7.022f, 11.468f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.378f, 16.626f)
                arcToRelative(1f, 1f, 0f, false, false, -3.004f, -3.004f)
                lineToRelative(-4.01f, 4.012f)
                arcToRelative(2f, 2f, 0f, false, false, -0.506f, 0.854f)
                lineToRelative(-0.837f, 2.87f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.62f, 0.62f)
                lineToRelative(2.87f, -0.837f)
                arcToRelative(2f, 2f, 0f, false, false, 0.854f, -0.506f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 10f)
                arcTo(3f, 3f, 0f, false, true, 10f, 13f)
                arcTo(3f, 3f, 0f, false, true, 7f, 10f)
                arcTo(3f, 3f, 0f, false, true, 13f, 10f)
                close()
            }
        }.build()
        
        return _MapPinPen!!
    }

private var _MapPinPen: ImageVector? = null


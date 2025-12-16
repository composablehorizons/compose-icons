package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Banana: ImageVector
    get() {
        if (_Banana != null) return _Banana!!
        
        _Banana = ImageVector.Builder(
            name = "banana",
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
                moveTo(4f, 13f)
                curveToRelative(3.5f, -2f, 8f, -2f, 10f, 2f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 8f, 5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.15f, 17.89f)
                curveToRelative(5.52f, -1.52f, 8.65f, -6.89f, 7f, -12f)
                curveTo(11.55f, 4f, 11.5f, 2f, 13f, 2f)
                curveToRelative(3.22f, 0f, 5f, 5.5f, 5f, 8f)
                curveToRelative(0f, 6.5f, -4.2f, 12f, -10.49f, 12f)
                curveTo(5.11f, 22f, 2f, 22f, 2f, 20f)
                curveToRelative(0f, -1.5f, 1.14f, -1.55f, 3.15f, -2.11f)
                close()
            }
        }.build()
        
        return _Banana!!
    }

private var _Banana: ImageVector? = null


package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Droplets: ImageVector
    get() {
        if (_Droplets != null) return _Droplets!!
        
        _Droplets = ImageVector.Builder(
            name = "droplets",
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
                moveTo(7f, 16.3f)
                curveToRelative(2.2f, 0f, 4f, -1.83f, 4f, -4.05f)
                curveToRelative(0f, -1.16f, -0.57f, -2.26f, -1.71f, -3.19f)
                reflectiveCurveTo(7.29f, 6.75f, 7f, 5.3f)
                curveToRelative(-0.29f, 1.45f, -1.14f, 2.84f, -2.29f, 3.76f)
                reflectiveCurveTo(3f, 11.1f, 3f, 12.25f)
                curveToRelative(0f, 2.22f, 1.8f, 4.05f, 4f, 4.05f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.56f, 6.6f)
                arcTo(10.97f, 10.97f, 0f, false, false, 14f, 3.02f)
                curveToRelative(0.5f, 2.5f, 2f, 4.9f, 4f, 6.5f)
                reflectiveCurveToRelative(3f, 3.5f, 3f, 5.5f)
                arcToRelative(6.98f, 6.98f, 0f, false, true, -11.91f, 4.97f)
            }
        }.build()
        
        return _Droplets!!
    }

private var _Droplets: ImageVector? = null


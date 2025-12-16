package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.DropletOff: ImageVector
    get() {
        if (_DropletOff != null) return _DropletOff!!
        
        _DropletOff = ImageVector.Builder(
            name = "droplet-off",
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
                moveTo(18.715f, 13.186f)
                curveTo(18.29f, 11.858f, 17.384f, 10.607f, 16f, 9.5f)
                curveToRelative(-2f, -1.6f, -3.5f, -4f, -4f, -6.5f)
                arcToRelative(10.7f, 10.7f, 0f, false, true, -0.884f, 2.586f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                lineToRelative(20f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.795f, 8.797f)
                arcTo(11f, 11f, 0f, false, true, 8f, 9.5f)
                curveTo(6f, 11.1f, 5f, 13f, 5f, 15f)
                arcToRelative(7f, 7f, 0f, false, false, 13.222f, 3.208f)
            }
        }.build()
        
        return _DropletOff!!
    }

private var _DropletOff: ImageVector? = null


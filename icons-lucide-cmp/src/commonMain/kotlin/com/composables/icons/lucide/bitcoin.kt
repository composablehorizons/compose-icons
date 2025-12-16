package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Bitcoin: ImageVector
    get() {
        if (_Bitcoin != null) return _Bitcoin!!
        
        _Bitcoin = ImageVector.Builder(
            name = "bitcoin",
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
                moveTo(11.767f, 19.089f)
                curveToRelative(4.924f, 0.868f, 6.14f, -6.025f, 1.216f, -6.894f)
                moveToRelative(-1.216f, 6.894f)
                lineTo(5.86f, 18.047f)
                moveToRelative(5.908f, 1.042f)
                lineToRelative(-0.347f, 1.97f)
                moveToRelative(1.563f, -8.864f)
                curveToRelative(4.924f, 0.869f, 6.14f, -6.025f, 1.215f, -6.893f)
                moveToRelative(-1.215f, 6.893f)
                lineToRelative(-3.94f, -0.694f)
                moveToRelative(5.155f, -6.2f)
                lineTo(8.29f, 4.26f)
                moveToRelative(5.908f, 1.042f)
                lineToRelative(0.348f, -1.97f)
                moveTo(7.48f, 20.364f)
                lineToRelative(3.126f, -17.727f)
            }
        }.build()
        
        return _Bitcoin!!
    }

private var _Bitcoin: ImageVector? = null


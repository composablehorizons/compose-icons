package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Planet: ImageVector
    get() {
        if (_Planet != null) return _Planet!!
        
        _Planet = ImageVector.Builder(
            name = "planet",
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
                moveTo(18.816f, 13.58f)
                curveToRelative(2.292f, 2.138f, 3.546f, 4f, 3.092f, 4.9f)
                curveToRelative(-0.745f, 1.46f, -5.783f, -0.259f, -11.255f, -3.838f)
                curveToRelative(-5.47f, -3.579f, -9.304f, -7.664f, -8.56f, -9.123f)
                curveToRelative(0.464f, -0.91f, 2.926f, -0.444f, 5.803f, 0.805f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                moveToRelative(-7f, 0f)
                arcToRelative(7f, 7f, 0f, true, false, 14f, 0f)
                arcToRelative(7f, 7f, 0f, true, false, -14f, 0f)
            }
        }.build()
        
        return _Planet!!
    }

private var _Planet: ImageVector? = null


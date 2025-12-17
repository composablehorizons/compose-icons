package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Horseshoe: ImageVector
    get() {
        if (_Horseshoe != null) return _Horseshoe!!
        
        _Horseshoe = ImageVector.Builder(
            name = "horseshoe",
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
                moveTo(19f, 17f)
                curveToRelative(0.5f, -1.242f, 2f, -2f, 2f, -5f)
                reflectiveCurveToRelative(-1f, -9f, -9f, -9f)
                reflectiveCurveToRelative(-9f, 6f, -9f, 9f)
                reflectiveCurveToRelative(1.495f, 3.749f, 2f, 5f)
                lineToRelative(-2f, 1f)
                lineToRelative(2f, 3f)
                lineToRelative(2.406f, -1.147f)
                curveToRelative(1.25f, -0.714f, 1.778f, -2.08f, 1.203f, -3.363f)
                curveToRelative(-1.078f, -2.407f, -1.609f, -8.49f, 3.391f, -8.49f)
                reflectiveCurveToRelative(4.469f, 6.083f, 3.39f, 8.49f)
                curveToRelative(-0.574f, 1.284f, -0.045f, 2.649f, 1.204f, 3.363f)
                lineToRelative(2.406f, 1.147f)
                lineToRelative(2f, -3f)
                lineToRelative(-2f, -1f)
                close()
            }
        }.build()
        
        return _Horseshoe!!
    }

private var _Horseshoe: ImageVector? = null


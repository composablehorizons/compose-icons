package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Twitter: ImageVector
    get() {
        if (_Twitter != null) return _Twitter!!
        
        _Twitter = ImageVector.Builder(
            name = "twitter",
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
                moveTo(22f, 4f)
                reflectiveCurveToRelative(-0.7f, 2.1f, -2f, 3.4f)
                curveToRelative(1.6f, 10f, -9.4f, 17.3f, -18f, 11.6f)
                curveToRelative(2.2f, 0.1f, 4.4f, -0.6f, 6f, -2f)
                curveTo(3f, 15.5f, 0.5f, 9.6f, 3f, 5f)
                curveToRelative(2.2f, 2.6f, 5.6f, 4.1f, 9f, 4f)
                curveToRelative(-0.9f, -4.2f, 4f, -6.6f, 7f, -3.8f)
                curveToRelative(1.1f, 0f, 3f, -1.2f, 3f, -1.2f)
                close()
            }
        }.build()
        
        return _Twitter!!
    }

private var _Twitter: ImageVector? = null


package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Twitter: ImageVector
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
                moveTo(23f, 3f)
                arcToRelative(10.9f, 10.9f, 0f, false, true, -3.14f, 1.53f)
                arcToRelative(4.48f, 4.48f, 0f, false, false, -7.86f, 3f)
                verticalLineToRelative(1f)
                arcTo(10.66f, 10.66f, 0f, false, true, 3f, 4f)
                reflectiveCurveToRelative(-4f, 9f, 5f, 13f)
                arcToRelative(11.64f, 11.64f, 0f, false, true, -7f, 2f)
                curveToRelative(9f, 5f, 20f, 0f, 20f, -11.5f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -0.08f, -0.83f)
                arcTo(7.72f, 7.72f, 0f, false, false, 23f, 3f)
                close()
            }
        }.build()
        
        return _Twitter!!
    }

private var _Twitter: ImageVector? = null


package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Youtube: ImageVector
    get() {
        if (_Youtube != null) return _Youtube!!
        
        _Youtube = ImageVector.Builder(
            name = "youtube",
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
                moveTo(22.54f, 6.42f)
                arcToRelative(2.78f, 2.78f, 0f, false, false, -1.94f, -2f)
                curveTo(18.88f, 4f, 12f, 4f, 12f, 4f)
                reflectiveCurveToRelative(-6.88f, 0f, -8.6f, 0.46f)
                arcToRelative(2.78f, 2.78f, 0f, false, false, -1.94f, 2f)
                arcTo(29f, 29f, 0f, false, false, 1f, 11.75f)
                arcToRelative(29f, 29f, 0f, false, false, 0.46f, 5.33f)
                arcTo(2.78f, 2.78f, 0f, false, false, 3.4f, 19f)
                curveToRelative(1.72f, 0.46f, 8.6f, 0.46f, 8.6f, 0.46f)
                reflectiveCurveToRelative(6.88f, 0f, 8.6f, -0.46f)
                arcToRelative(2.78f, 2.78f, 0f, false, false, 1.94f, -2f)
                arcToRelative(29f, 29f, 0f, false, false, 0.46f, -5.25f)
                arcToRelative(29f, 29f, 0f, false, false, -0.46f, -5.33f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.75f, 15.02f)
                lineTo(15.5f, 11.75f)
                lineTo(9.75f, 8.48f)
                lineTo(9.75f, 15.02f)
                close()
            }
        }.build()
        
        return _Youtube!!
    }

private var _Youtube: ImageVector? = null


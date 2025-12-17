package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Zeppelin: ImageVector
    get() {
        if (_Zeppelin != null) return _Zeppelin!!
        
        _Zeppelin = ImageVector.Builder(
            name = "zeppelin",
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
                moveTo(13.5f, 4f)
                curveToRelative(4.694f, 0f, 8.5f, 2.686f, 8.5f, 6f)
                reflectiveCurveToRelative(-3.806f, 6f, -8.5f, 6f)
                curveToRelative(-2.13f, 0f, -4.584f, -0.926f, -7.364f, -2.777f)
                lineToRelative(-2.136f, 1.777f)
                verticalLineToRelative(-3.33f)
                arcToRelative(46.07f, 46.07f, 0f, false, true, -2f, -1.67f)
                arcToRelative(46.07f, 46.07f, 0f, false, true, 2f, -1.67f)
                verticalLineToRelative(-3.33f)
                lineToRelative(2.135f, 1.778f)
                curveToRelative(2.78f, -1.852f, 5.235f, -2.778f, 7.365f, -2.778f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 15.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4f)
            }
        }.build()
        
        return _Zeppelin!!
    }

private var _Zeppelin: ImageVector? = null


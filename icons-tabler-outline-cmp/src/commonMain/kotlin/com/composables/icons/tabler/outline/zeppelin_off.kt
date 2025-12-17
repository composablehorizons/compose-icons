package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ZeppelinOff: ImageVector
    get() {
        if (_ZeppelinOff != null) return _ZeppelinOff!!
        
        _ZeppelinOff = ImageVector.Builder(
            name = "zeppelin-off",
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
                moveTo(15.773f, 15.783f)
                curveToRelative(-0.723f, 0.141f, -1.486f, 0.217f, -2.273f, 0.217f)
                curveToRelative(-2.13f, 0f, -4.584f, -0.926f, -7.364f, -2.777f)
                lineToRelative(-2.136f, 1.777f)
                verticalLineToRelative(-3.33f)
                arcToRelative(46.07f, 46.07f, 0f, false, true, -2f, -1.67f)
                arcToRelative(46.07f, 46.07f, 0f, false, true, 2f, -1.67f)
                verticalLineToRelative(-3.33f)
                lineToRelative(2.135f, 1.778f)
                curveToRelative(0.13f, -0.087f, 0.261f, -0.172f, 0.39f, -0.256f)
                moveToRelative(2.564f, -1.42f)
                curveToRelative(1.601f, -0.735f, 3.071f, -1.102f, 4.411f, -1.102f)
                curveToRelative(4.694f, 0f, 8.5f, 2.686f, 8.5f, 6f)
                curveToRelative(0f, 1.919f, -1.276f, 3.627f, -3.261f, 4.725f)
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
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _ZeppelinOff!!
    }

private var _ZeppelinOff: ImageVector? = null


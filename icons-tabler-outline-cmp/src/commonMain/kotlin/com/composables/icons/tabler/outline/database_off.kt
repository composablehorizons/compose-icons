package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.DatabaseOff: ImageVector
    get() {
        if (_DatabaseOff != null) return _DatabaseOff!!
        
        _DatabaseOff = ImageVector.Builder(
            name = "database-off",
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
                moveTo(12.983f, 8.978f)
                curveToRelative(3.955f, -0.182f, 7.017f, -1.446f, 7.017f, -2.978f)
                curveToRelative(0f, -1.657f, -3.582f, -3f, -8f, -3f)
                curveToRelative(-1.661f, 0f, -3.204f, 0.19f, -4.483f, 0.515f)
                moveToRelative(-2.783f, 1.228f)
                curveToRelative(-0.471f, 0.382f, -0.734f, 0.808f, -0.734f, 1.257f)
                curveToRelative(0f, 1.22f, 1.944f, 2.271f, 4.734f, 2.74f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 6f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.657f, 3.582f, 3f, 8f, 3f)
                curveToRelative(0.986f, 0f, 1.93f, -0.067f, 2.802f, -0.19f)
                moveToRelative(3.187f, -0.82f)
                curveToRelative(1.251f, -0.53f, 2.011f, -1.228f, 2.011f, -1.99f)
                verticalLineToRelative(-6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 12f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.657f, 3.582f, 3f, 8f, 3f)
                curveToRelative(3.217f, 0f, 5.991f, -0.712f, 7.261f, -1.74f)
                moveToRelative(0.739f, -3.26f)
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
        
        return _DatabaseOff!!
    }

private var _DatabaseOff: ImageVector? = null


package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.WheatOff: ImageVector
    get() {
        if (_WheatOff != null) return _WheatOff!!
        
        _WheatOff = ImageVector.Builder(
            name = "wheat-off",
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
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 21.5f)
                verticalLineToRelative(-3.75f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.916f, 9.49f)
                lineToRelative(-0.43f, 1.604f)
                curveToRelative(-0.712f, 2.659f, 0.866f, 5.392f, 3.524f, 6.104f)
                curveToRelative(0.997f, 0.268f, 1.994f, 0.535f, 2.99f, 0.802f)
                verticalLineToRelative(-3.44f)
                curveToRelative(-0.164f, -2.105f, -1.637f, -3.879f, -3.677f, -4.426f)
                lineToRelative(-2.407f, -0.644f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.249f, 4.251f)
                curveToRelative(0.007f, -0.007f, 0.014f, -0.014f, 0.021f, -0.021f)
                lineToRelative(1.73f, -1.73f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.27f, 11.15f)
                curveToRelative(-0.589f, -0.589f, -1.017f, -1.318f, -1.246f, -2.118f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.988f, 8.988f)
                curveToRelative(0.229f, -0.834f, 0.234f, -1.713f, 0.013f, -2.549f)
                curveToRelative(-0.221f, -0.836f, -0.659f, -1.598f, -1.271f, -2.209f)
                lineToRelative(-1.73f, -1.73f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.038f, 10.037f)
                lineToRelative(2.046f, -0.547f)
                lineToRelative(0.431f, 1.604f)
                curveToRelative(0.142f, 0.53f, 0.193f, 1.063f, 0.162f, 1.583f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.506f, 16.505f)
                curveToRelative(-0.45f, 0.307f, -0.959f, 0.544f, -1.516f, 0.694f)
                curveToRelative(-0.997f, 0.268f, -1.994f, 0.535f, -2.99f, 0.801f)
                verticalLineToRelative(-3.44f)
                curveToRelative(0.055f, -0.708f, 0.259f, -1.379f, 0.582f, -1.978f)
            }
        }.build()
        
        return _WheatOff!!
    }

private var _WheatOff: ImageVector? = null


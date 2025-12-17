package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.NeedleThread: ImageVector
    get() {
        if (_NeedleThread != null) return _NeedleThread!!
        
        _NeedleThread = ImageVector.Builder(
            name = "needle-thread",
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
                moveTo(3f, 21f)
                curveToRelative(-0.667f, -0.667f, 3.262f, -6.236f, 11.785f, -16.709f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, 5.078f, 4.791f)
                curveToRelative(-10.575f, 8.612f, -16.196f, 12.585f, -16.863f, 11.918f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 6.5f)
                lineToRelative(-1f, 1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 7f)
                curveToRelative(-2.333f, -2.667f, -3.5f, -4f, -5f, -4f)
                reflectiveCurveToRelative(-2f, 1f, -2f, 2f)
                curveToRelative(0f, 4f, 8.161f, 8.406f, 6f, 11f)
                curveToRelative(-1.056f, 1.268f, -3.363f, 1.285f, -5.75f, 0.808f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.739f, 15.425f)
                curveToRelative(-1.393f, -0.565f, -3.739f, -1.925f, -3.739f, -3.425f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.5f, 9.5f)
                lineToRelative(1.5f, 1.5f)
            }
        }.build()
        
        return _NeedleThread!!
    }

private var _NeedleThread: ImageVector? = null


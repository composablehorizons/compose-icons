package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.WandOff: ImageVector
    get() {
        if (_WandOff != null) return _WandOff!!
        
        _WandOff = ImageVector.Builder(
            name = "wand-off",
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
                moveTo(10.5f, 10.5f)
                lineToRelative(-7.5f, 7.5f)
                lineToRelative(3f, 3f)
                lineToRelative(7.5f, -7.5f)
                moveToRelative(2f, -2f)
                lineToRelative(5.5f, -5.5f)
                lineToRelative(-3f, -3f)
                lineToRelative(-5.5f, 5.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 6f)
                lineToRelative(3f, 3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.433f, 4.395f)
                curveToRelative(0.35f, -0.36f, 0.567f, -0.852f, 0.567f, -1.395f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                curveToRelative(-0.554f, 0f, -1.055f, 0.225f, -1.417f, 0.589f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.418f, 14.41f)
                curveToRelative(0.36f, -0.36f, 0.582f, -0.86f, 0.582f, -1.41f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                curveToRelative(-0.555f, 0f, -1.056f, 0.226f, -1.419f, 0.59f)
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
        
        return _WandOff!!
    }

private var _WandOff: ImageVector? = null


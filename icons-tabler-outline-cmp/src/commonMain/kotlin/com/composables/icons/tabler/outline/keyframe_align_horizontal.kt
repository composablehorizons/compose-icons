package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.KeyframeAlignHorizontal: ImageVector
    get() {
        if (_KeyframeAlignHorizontal != null) return _KeyframeAlignHorizontal!!
        
        _KeyframeAlignHorizontal = ImageVector.Builder(
            name = "keyframe-align-horizontal",
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
                moveTo(12.816f, 16.58f)
                curveToRelative(-0.207f, 0.267f, -0.504f, 0.42f, -0.816f, 0.42f)
                curveToRelative(-0.312f, 0f, -0.61f, -0.153f, -0.816f, -0.42f)
                lineToRelative(-2.908f, -3.748f)
                arcToRelative(1.39f, 1.39f, 0f, false, true, 0f, -1.664f)
                lineToRelative(2.908f, -3.748f)
                curveToRelative(0.207f, -0.267f, 0.504f, -0.42f, 0.816f, -0.42f)
                curveToRelative(0.312f, 0f, 0.61f, 0.153f, 0.816f, 0.42f)
                lineToRelative(2.908f, 3.748f)
                arcToRelative(1.39f, 1.39f, 0f, false, true, 0f, 1.664f)
                lineToRelative(-2.908f, 3.748f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 12f)
                horizontalLineToRelative(2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 12f)
                horizontalLineToRelative(2f)
            }
        }.build()
        
        return _KeyframeAlignHorizontal!!
    }

private var _KeyframeAlignHorizontal: ImageVector? = null


package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.KeyframeAlignVertical: ImageVector
    get() {
        if (_KeyframeAlignVertical != null) return _KeyframeAlignVertical!!
        
        _KeyframeAlignVertical = ImageVector.Builder(
            name = "keyframe-align-vertical",
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
                moveTo(12f, 2f)
                verticalLineToRelative(2f)
            }
            path(
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 20f)
                verticalLineToRelative(2f)
            }
        }.build()
        
        return _KeyframeAlignVertical!!
    }

private var _KeyframeAlignVertical: ImageVector? = null


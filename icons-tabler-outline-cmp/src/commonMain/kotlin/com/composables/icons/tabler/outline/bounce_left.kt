package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BounceLeft: ImageVector
    get() {
        if (_BounceLeft != null) return _BounceLeft!!
        
        _BounceLeft = ImageVector.Builder(
            name = "bounce-left",
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
                moveTo(20f, 15.5f)
                curveToRelative(-3f, -1f, -5.5f, -0.5f, -8f, 4.5f)
                curveToRelative(-0.5f, -3f, -1.5f, -5.5f, -3f, -8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 9f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 4f)
                close()
            }
        }.build()
        
        return _BounceLeft!!
    }

private var _BounceLeft: ImageVector? = null


package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Signature: ImageVector
    get() {
        if (_Signature != null) return _Signature!!
        
        _Signature = ImageVector.Builder(
            name = "signature",
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
                moveTo(3f, 17f)
                curveToRelative(3.333f, -3.333f, 5f, -6f, 5f, -8f)
                curveToRelative(0f, -3f, -1f, -3f, -2f, -3f)
                reflectiveCurveToRelative(-2.032f, 1.085f, -2f, 3f)
                curveToRelative(0.034f, 2.048f, 1.658f, 4.877f, 2.5f, 6f)
                curveToRelative(1.5f, 2f, 2.5f, 2.5f, 3.5f, 1f)
                lineToRelative(2f, -3f)
                curveToRelative(0.333f, 2.667f, 1.333f, 4f, 3f, 4f)
                curveToRelative(0.53f, 0f, 2.639f, -2f, 3f, -2f)
                curveToRelative(0.517f, 0f, 1.517f, 0.667f, 3f, 2f)
            }
        }.build()
        
        return _Signature!!
    }

private var _Signature: ImageVector? = null


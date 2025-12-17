package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.SignatureOff: ImageVector
    get() {
        if (_SignatureOff != null) return _SignatureOff!!
        
        _SignatureOff = ImageVector.Builder(
            name = "signature-off",
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
                moveTo(3f, 17f)
                curveToRelative(3.333f, -3.333f, 5f, -6f, 5f, -8f)
                curveToRelative(0f, -0.394f, -0.017f, -0.735f, -0.05f, -1.033f)
                moveToRelative(-1.95f, -1.967f)
                curveToRelative(-1f, 0f, -2.032f, 1.085f, -2f, 3f)
                curveToRelative(0.034f, 2.048f, 1.658f, 4.877f, 2.5f, 6f)
                curveToRelative(1.5f, 2f, 2.5f, 2.5f, 3.5f, 1f)
                lineToRelative(2f, -3f)
                curveToRelative(0.333f, 2.667f, 1.333f, 4f, 3f, 4f)
                curveToRelative(0.219f, 0f, 0.708f, -0.341f, 1.231f, -0.742f)
                moveToRelative(3.769f, -0.258f)
                curveToRelative(0.303f, 0.245f, 0.64f, 0.677f, 1f, 1f)
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
        
        return _SignatureOff!!
    }

private var _SignatureOff: ImageVector? = null


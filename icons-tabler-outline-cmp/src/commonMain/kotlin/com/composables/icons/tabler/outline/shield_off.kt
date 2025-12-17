package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ShieldOff: ImageVector
    get() {
        if (_ShieldOff != null) return _ShieldOff!!
        
        _ShieldOff = ImageVector.Builder(
            name = "shield-off",
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
                moveTo(17.67f, 17.667f)
                arcToRelative(12f, 12f, 0f, false, true, -5.67f, 3.333f)
                arcToRelative(12f, 12f, 0f, false, true, -8.5f, -15f)
                curveToRelative(0.794f, 0.036f, 1.583f, -0.006f, 2.357f, -0.124f)
                moveToRelative(3.128f, -0.926f)
                arcToRelative(11.997f, 11.997f, 0f, false, false, 3.015f, -1.95f)
                arcToRelative(12f, 12f, 0f, false, false, 8.5f, 3f)
                arcToRelative(12f, 12f, 0f, false, true, -1.116f, 9.376f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _ShieldOff!!
    }

private var _ShieldOff: ImageVector? = null


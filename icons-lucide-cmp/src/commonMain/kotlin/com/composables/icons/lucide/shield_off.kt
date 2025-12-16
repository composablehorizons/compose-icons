package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ShieldOff: ImageVector
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
                moveTo(2f, 2f)
                lineToRelative(20f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 5f, 3.5f, 7.5f, 7.67f, 8.94f)
                arcToRelative(1f, 1f, 0f, false, false, 0.67f, 0.01f)
                curveToRelative(2.35f, -0.82f, 4.48f, -1.97f, 5.9f, -3.71f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.309f, 3.652f)
                arcTo(12.252f, 12.252f, 0f, false, false, 11.24f, 2.28f)
                arcToRelative(1.17f, 1.17f, 0f, false, true, 1.52f, 0f)
                curveTo(14.51f, 3.81f, 17f, 5f, 19f, 5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(7f)
                arcToRelative(9.784f, 9.784f, 0f, false, true, -0.08f, 1.264f)
            }
        }.build()
        
        return _ShieldOff!!
    }

private var _ShieldOff: ImageVector? = null


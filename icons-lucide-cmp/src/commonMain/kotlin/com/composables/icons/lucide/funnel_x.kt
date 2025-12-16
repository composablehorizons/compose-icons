package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FunnelX: ImageVector
    get() {
        if (_FunnelX != null) return _FunnelX!!
        
        _FunnelX = ImageVector.Builder(
            name = "funnel-x",
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
                moveTo(12.531f, 3f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -0.742f, 1.67f)
                lineToRelative(7.225f, 7.989f)
                arcTo(2f, 2f, 0f, false, true, 10f, 14f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 0.553f, 0.895f)
                lineToRelative(2f, 1f)
                arcTo(1f, 1f, 0f, false, false, 14f, 21f)
                verticalLineToRelative(-7f)
                arcToRelative(2f, 2f, 0f, false, true, 0.517f, -1.341f)
                lineToRelative(0.427f, -0.473f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 3.5f)
                lineToRelative(5f, 5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.5f, 3.5f)
                lineToRelative(-5f, 5f)
            }
        }.build()
        
        return _FunnelX!!
    }

private var _FunnelX: ImageVector? = null


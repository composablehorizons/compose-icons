package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SendHorizontal: ImageVector
    get() {
        if (_SendHorizontal != null) return _SendHorizontal!!
        
        _SendHorizontal = ImageVector.Builder(
            name = "send-horizontal",
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
                moveTo(3.714f, 3.048f)
                arcToRelative(0.498f, 0.498f, 0f, false, false, -0.683f, 0.627f)
                lineToRelative(2.843f, 7.627f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 1.396f)
                lineToRelative(-2.842f, 7.627f)
                arcToRelative(0.498f, 0.498f, 0f, false, false, 0.682f, 0.627f)
                lineToRelative(18f, -8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.904f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                horizontalLineToRelative(16f)
            }
        }.build()
        
        return _SendHorizontal!!
    }

private var _SendHorizontal: ImageVector? = null


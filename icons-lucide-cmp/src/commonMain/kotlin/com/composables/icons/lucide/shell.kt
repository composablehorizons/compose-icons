package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Shell: ImageVector
    get() {
        if (_Shell != null) return _Shell!!
        
        _Shell = ImageVector.Builder(
            name = "shell",
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
                moveTo(14f, 11f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, 8f, 0f)
                arcToRelative(6f, 6f, 0f, false, true, -12f, 0f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                arcToRelative(10f, 10f, 0f, true, true, -20f, 0f)
                arcToRelative(11.93f, 11.93f, 0f, false, true, 2.42f, -7.22f)
                arcToRelative(2f, 2f, 0f, true, true, 3.16f, 2.44f)
            }
        }.build()
        
        return _Shell!!
    }

private var _Shell: ImageVector? = null


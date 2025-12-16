package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Wrench: ImageVector
    get() {
        if (_Wrench != null) return _Wrench!!
        
        _Wrench = ImageVector.Builder(
            name = "wrench",
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
                moveTo(14.7f, 6.3f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.4f)
                lineToRelative(1.6f, 1.6f)
                arcToRelative(1f, 1f, 0f, false, false, 1.4f, 0f)
                lineToRelative(3.106f, -3.105f)
                curveToRelative(0.32f, -0.322f, 0.863f, -0.22f, 0.983f, 0.218f)
                arcToRelative(6f, 6f, 0f, false, true, -8.259f, 7.057f)
                lineToRelative(-7.91f, 7.91f)
                arcToRelative(1f, 1f, 0f, false, true, -2.999f, -3f)
                lineToRelative(7.91f, -7.91f)
                arcToRelative(6f, 6f, 0f, false, true, 7.057f, -8.259f)
                curveToRelative(0.438f, 0.12f, 0.54f, 0.662f, 0.219f, 0.984f)
                close()
            }
        }.build()
        
        return _Wrench!!
    }

private var _Wrench: ImageVector? = null


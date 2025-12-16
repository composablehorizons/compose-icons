package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Omega: ImageVector
    get() {
        if (_Omega != null) return _Omega!!
        
        _Omega = ImageVector.Builder(
            name = "omega",
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
                moveTo(3f, 20f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-0.282f)
                arcToRelative(0.52f, 0.52f, 0f, false, false, -0.247f, -0.437f)
                arcToRelative(8f, 8f, 0f, true, true, 8.494f, -0.001f)
                arcToRelative(0.52f, 0.52f, 0f, false, false, -0.247f, 0.438f)
                verticalLineToRelative(0.282f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineTo(21f)
            }
        }.build()
        
        return _Omega!!
    }

private var _Omega: ImageVector? = null


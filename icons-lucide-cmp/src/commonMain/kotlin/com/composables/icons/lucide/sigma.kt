package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Sigma: ImageVector
    get() {
        if (_Sigma != null) return _Sigma!!
        
        _Sigma = ImageVector.Builder(
            name = "sigma",
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
                moveTo(18f, 7f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(6.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.4f, 0.8f)
                lineToRelative(4.5f, 6f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 2.4f)
                lineToRelative(-4.5f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.4f, 0.8f)
                horizontalLineTo(17f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-2f)
            }
        }.build()
        
        return _Sigma!!
    }

private var _Sigma: ImageVector? = null


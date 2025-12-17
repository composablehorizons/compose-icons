package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Space: ImageVector
    get() {
        if (_Space != null) return _Space!!
        
        _Space = ImageVector.Builder(
            name = "space",
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
                moveTo(22f, 17f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.5f, -0.5f, 1f, -1f, 1f)
                horizontalLineTo(3f)
                curveToRelative(-0.5f, 0f, -1f, -0.5f, -1f, -1f)
                verticalLineToRelative(-1f)
            }
        }.build()
        
        return _Space!!
    }

private var _Space: ImageVector? = null


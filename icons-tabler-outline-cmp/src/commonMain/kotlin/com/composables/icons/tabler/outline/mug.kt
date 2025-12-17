package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Mug: ImageVector
    get() {
        if (_Mug != null) return _Mug!!
        
        _Mug = ImageVector.Builder(
            name = "mug",
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
                moveTo(4.083f, 5f)
                horizontalLineToRelative(10.834f)
                arcToRelative(1.08f, 1.08f, 0f, false, true, 1.083f, 1.077f)
                verticalLineToRelative(8.615f)
                curveToRelative(0f, 2.38f, -1.94f, 4.308f, -4.333f, 4.308f)
                horizontalLineToRelative(-4.334f)
                curveToRelative(-2.393f, 0f, -4.333f, -1.929f, -4.333f, -4.308f)
                verticalLineToRelative(-8.615f)
                arcToRelative(1.08f, 1.08f, 0f, false, true, 1.083f, -1.077f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 8f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.045f, 2.5f, 2.333f)
                verticalLineToRelative(2.334f)
                curveToRelative(0f, 1.288f, -1.12f, 2.333f, -2.5f, 2.333f)
                horizontalLineToRelative(-2.5f)
            }
        }.build()
        
        return _Mug!!
    }

private var _Mug: ImageVector? = null


package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Spiral: ImageVector
    get() {
        if (_Spiral != null) return _Spiral!!
        
        _Spiral = ImageVector.Builder(
            name = "spiral",
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
                moveTo(10f, 12.057f)
                arcToRelative(1.9f, 1.9f, 0f, false, false, 0.614f, 0.743f)
                curveToRelative(1.06f, 0.713f, 2.472f, 0.112f, 3.043f, -0.919f)
                curveToRelative(0.839f, -1.513f, -0.022f, -3.368f, -1.525f, -4.08f)
                curveToRelative(-2f, -0.95f, -4.371f, 0.154f, -5.24f, 2.086f)
                curveToRelative(-1.095f, 2.432f, 0.29f, 5.248f, 2.71f, 6.246f)
                curveToRelative(2.931f, 1.208f, 6.283f, -0.418f, 7.438f, -3.255f)
                curveToRelative(1.36f, -3.343f, -0.557f, -7.134f, -3.896f, -8.41f)
                curveToRelative(-3.855f, -1.474f, -8.2f, 0.68f, -9.636f, 4.422f)
                curveToRelative(-1.63f, 4.253f, 0.823f, 9.024f, 5.082f, 10.576f)
                curveToRelative(4.778f, 1.74f, 10.118f, -0.941f, 11.833f, -5.59f)
                arcToRelative(9.354f, 9.354f, 0f, false, false, 0.577f, -2.813f)
            }
        }.build()
        
        return _Spiral!!
    }

private var _Spiral: ImageVector? = null


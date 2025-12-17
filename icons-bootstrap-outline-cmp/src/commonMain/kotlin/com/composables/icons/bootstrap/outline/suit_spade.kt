package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SuitSpade: ImageVector
    get() {
        if (_SuitSpade != null) return _SuitSpade!!
        
        _SuitSpade = ImageVector.Builder(
            name = "suit-spade",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.429f, 0.243f)
                curveToRelative(1.359f, 2.265f, 2.925f, 3.682f, 4.25f, 4.882f)
                quadToRelative(0.144f, 0.128f, 0.282f, 0.255f)
                curveTo(14.308f, 6.604f, 15.5f, 7.747f, 15.5f, 9.5f)
                arcToRelative(4f, 4f, 0f, false, true, -5.406f, 3.746f)
                curveToRelative(0.235f, 0.39f, 0.491f, 0.782f, 0.722f, 1.131f)
                curveToRelative(0.434f, 0.659f, -0.01f, 1.623f, -0.856f, 1.623f)
                horizontalLineTo(6.04f)
                curveToRelative(-0.845f, 0f, -1.29f, -0.964f, -0.856f, -1.623f)
                curveToRelative(0.263f, -0.397f, 0.51f, -0.777f, 0.728f, -1.134f)
                arcTo(4f, 4f, 0f, false, true, 0.5f, 9.5f)
                curveToRelative(0f, -1.753f, 1.192f, -2.896f, 2.539f, -4.12f)
                lineToRelative(0.281f, -0.255f)
                curveToRelative(1.326f, -1.2f, 2.892f, -2.617f, 4.251f, -4.882f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 0f)
                moveTo(3.711f, 6.12f)
                curveTo(2.308f, 7.396f, 1.5f, 8.253f, 1.5f, 9.5f)
                arcToRelative(3f, 3f, 0f, false, false, 5.275f, 1.956f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.868f, 0.43f)
                curveToRelative(-0.094f, 0.438f, -0.33f, 0.932f, -0.611f, 1.428f)
                arcToRelative(29f, 29f, 0f, false, true, -1.013f, 1.614f)
                arcToRelative(0.03f, 0.03f, 0f, false, false, -0.005f, 0.018f)
                arcToRelative(0.07f, 0.07f, 0f, false, false, 0.024f, 0.054f)
                horizontalLineToRelative(3.924f)
                arcToRelative(0.07f, 0.07f, 0f, false, false, 0.024f, -0.054f)
                arcToRelative(0.03f, 0.03f, 0f, false, false, -0.005f, -0.018f)
                curveToRelative(-0.3f, -0.455f, -0.658f, -1.005f, -0.96f, -1.535f)
                curveToRelative(-0.294f, -0.514f, -0.57f, -1.064f, -0.664f, -1.507f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.868f, -0.43f)
                arcTo(3f, 3f, 0f, false, false, 14.5f, 9.5f)
                curveToRelative(0f, -1.247f, -0.808f, -2.104f, -2.211f, -3.38f)
                lineTo(12f, 5.86f)
                curveToRelative(-1.196f, -1.084f, -2.668f, -2.416f, -4f, -4.424f)
                curveToRelative(-1.332f, 2.008f, -2.804f, 3.34f, -4f, 4.422f)
                lineToRelative(-0.289f, 0.261f)
                close()
            }
        }.build()
        
        return _SuitSpade!!
    }

private var _SuitSpade: ImageVector? = null


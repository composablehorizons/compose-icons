package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SuitClub: ImageVector
    get() {
        if (_SuitClub != null) return _SuitClub!!
        
        _SuitClub = ImageVector.Builder(
            name = "suit-club",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(3.25f, 3.25f, 0f, false, false, -3.25f, 3.25f)
                curveToRelative(0f, 0.186f, 0f, 0.29f, 0.016f, 0.41f)
                curveToRelative(0.014f, 0.12f, 0.045f, 0.27f, 0.12f, 0.527f)
                lineToRelative(0.19f, 0.665f)
                lineToRelative(-0.692f, -0.028f)
                arcToRelative(3.25f, 3.25f, 0f, true, false, 2.357f, 5.334f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.844f, 0.518f)
                lineToRelative(-0.003f, 0.005f)
                lineToRelative(-0.006f, 0.015f)
                lineToRelative(-0.024f, 0.055f)
                arcToRelative(22f, 22f, 0f, false, true, -0.438f, 0.92f)
                arcToRelative(22f, 22f, 0f, false, true, -1.266f, 2.197f)
                curveToRelative(-0.013f, 0.018f, -0.02f, 0.05f, 0.001f, 0.09f)
                quadToRelative(0.016f, 0.029f, 0.03f, 0.036f)
                arcTo(0.04f, 0.04f, 0f, false, false, 5.9f, 15f)
                horizontalLineToRelative(4.2f)
                quadToRelative(0.014f, 0f, 0.022f, -0.006f)
                arcToRelative(0.1f, 0.1f, 0f, false, false, 0.029f, -0.035f)
                curveToRelative(0.02f, -0.04f, 0.014f, -0.073f, 0.001f, -0.091f)
                arcToRelative(23f, 23f, 0f, false, true, -1.704f, -3.117f)
                lineToRelative(-0.024f, -0.054f)
                lineToRelative(-0.006f, -0.015f)
                lineToRelative(-0.002f, -0.004f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.838f, -0.524f)
                curveToRelative(0.601f, 0.7f, 1.516f, 1.168f, 2.496f, 1.168f)
                arcToRelative(3.25f, 3.25f, 0f, true, false, -0.139f, -6.498f)
                lineToRelative(-0.699f, 0.03f)
                lineToRelative(0.199f, -0.671f)
                curveToRelative(0.14f, -0.47f, 0.14f, -0.745f, 0.139f, -0.927f)
                verticalLineTo(4.25f)
                arcTo(3.25f, 3.25f, 0f, false, false, 8f, 1f)
                moveToRelative(2.207f, 12.024f)
                curveToRelative(0.225f, 0.405f, 0.487f, 0.848f, 0.78f, 1.294f)
                curveTo(11.437f, 15f, 10.975f, 16f, 10.1f, 16f)
                horizontalLineTo(5.9f)
                curveToRelative(-0.876f, 0f, -1.338f, -1f, -0.887f, -1.683f)
                curveToRelative(0.291f, -0.442f, 0.552f, -0.88f, 0.776f, -1.283f)
                arcToRelative(4.25f, 4.25f, 0f, true, true, -2.007f, -8.187f)
                lineToRelative(-0.009f, -0.064f)
                curveToRelative(-0.023f, -0.187f, -0.023f, -0.348f, -0.023f, -0.52f)
                verticalLineTo(4.25f)
                arcToRelative(4.25f, 4.25f, 0f, false, true, 8.5f, 0f)
                curveToRelative(0f, 0.14f, 0f, 0.333f, -0.04f, 0.596f)
                arcToRelative(4.25f, 4.25f, 0f, false, true, -0.46f, 8.476f)
                arcToRelative(4.2f, 4.2f, 0f, false, true, -1.543f, -0.298f)
            }
        }.build()
        
        return _SuitClub!!
    }

private var _SuitClub: ImageVector? = null


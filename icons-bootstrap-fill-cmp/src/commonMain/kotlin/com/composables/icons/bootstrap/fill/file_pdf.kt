package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FilePdf: ImageVector
    get() {
        if (_FilePdf != null) return _FilePdf!!
        
        _FilePdf = ImageVector.Builder(
            name = "file-pdf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.523f, 10.424f)
                quadToRelative(0.21f, -0.124f, 0.459f, -0.238f)
                arcToRelative(8f, 8f, 0f, false, true, -0.45f, 0.606f)
                curveToRelative(-0.28f, 0.337f, -0.498f, 0.516f, -0.635f, 0.572f)
                lineToRelative(-0.035f, 0.012f)
                arcToRelative(0.3f, 0.3f, 0f, false, true, -0.026f, -0.044f)
                curveToRelative(-0.056f, -0.11f, -0.054f, -0.216f, 0.04f, -0.36f)
                curveToRelative(0.106f, -0.165f, 0.319f, -0.354f, 0.647f, -0.548f)
                moveToRelative(2.455f, -1.647f)
                quadToRelative(-0.178f, 0.037f, -0.356f, 0.078f)
                arcToRelative(21f, 21f, 0f, false, false, 0.5f, -1.05f)
                arcToRelative(12f, 12f, 0f, false, false, 0.51f, 0.858f)
                quadToRelative(-0.326f, 0.048f, -0.654f, 0.114f)
                moveToRelative(2.525f, 0.939f)
                arcToRelative(4f, 4f, 0f, false, true, -0.435f, -0.41f)
                quadToRelative(0.344f, 0.007f, 0.612f, 0.054f)
                curveToRelative(0.317f, 0.057f, 0.466f, 0.147f, 0.518f, 0.209f)
                arcToRelative(0.1f, 0.1f, 0f, false, true, 0.026f, 0.064f)
                arcToRelative(0.44f, 0.44f, 0f, false, true, -0.06f, 0.2f)
                arcToRelative(0.3f, 0.3f, 0f, false, true, -0.094f, 0.124f)
                arcToRelative(0.1f, 0.1f, 0f, false, true, -0.069f, 0.015f)
                curveToRelative(-0.09f, -0.003f, -0.258f, -0.066f, -0.498f, -0.256f)
                moveTo(8.278f, 4.97f)
                curveToRelative(-0.04f, 0.244f, -0.108f, 0.524f, -0.2f, 0.829f)
                arcToRelative(5f, 5f, 0f, false, true, -0.089f, -0.346f)
                curveToRelative(-0.076f, -0.353f, -0.087f, -0.63f, -0.046f, -0.822f)
                curveToRelative(0.038f, -0.177f, 0.11f, -0.248f, 0.196f, -0.283f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.145f, -0.04f)
                curveToRelative(0.013f, 0.03f, 0.028f, 0.092f, 0.032f, 0.198f)
                quadToRelative(0.008f, 0.183f, -0.038f, 0.465f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 0f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                moveToRelative(0.165f, 11.668f)
                curveToRelative(0.09f, 0.18f, 0.23f, 0.343f, 0.438f, 0.419f)
                curveToRelative(0.207f, 0.075f, 0.412f, 0.04f, 0.58f, -0.03f)
                curveToRelative(0.318f, -0.13f, 0.635f, -0.436f, 0.926f, -0.786f)
                curveToRelative(0.333f, -0.401f, 0.683f, -0.927f, 1.021f, -1.51f)
                arcToRelative(11.6f, 11.6f, 0f, false, true, 1.997f, -0.406f)
                curveToRelative(0.3f, 0.383f, 0.61f, 0.713f, 0.91f, 0.95f)
                curveToRelative(0.28f, 0.22f, 0.603f, 0.403f, 0.934f, 0.417f)
                arcToRelative(0.86f, 0.86f, 0f, false, false, 0.51f, -0.138f)
                curveToRelative(0.155f, -0.101f, 0.27f, -0.247f, 0.354f, -0.416f)
                curveToRelative(0.09f, -0.181f, 0.145f, -0.37f, 0.138f, -0.563f)
                arcToRelative(0.84f, 0.84f, 0f, false, false, -0.2f, -0.518f)
                curveToRelative(-0.226f, -0.27f, -0.596f, -0.4f, -0.96f, -0.465f)
                arcToRelative(5.8f, 5.8f, 0f, false, false, -1.335f, -0.05f)
                arcToRelative(11f, 11f, 0f, false, true, -0.98f, -1.686f)
                curveToRelative(0.25f, -0.66f, 0.437f, -1.284f, 0.52f, -1.794f)
                curveToRelative(0.036f, -0.218f, 0.055f, -0.426f, 0.048f, -0.614f)
                arcToRelative(1.24f, 1.24f, 0f, false, false, -0.127f, -0.538f)
                arcToRelative(0.7f, 0.7f, 0f, false, false, -0.477f, -0.365f)
                curveToRelative(-0.202f, -0.043f, -0.41f, 0f, -0.601f, 0.077f)
                curveToRelative(-0.377f, 0.15f, -0.576f, 0.47f, -0.651f, 0.823f)
                curveToRelative(-0.073f, 0.34f, -0.04f, 0.736f, 0.046f, 1.136f)
                curveToRelative(0.088f, 0.406f, 0.238f, 0.848f, 0.43f, 1.295f)
                arcToRelative(20f, 20f, 0f, false, true, -1.062f, 2.227f)
                arcToRelative(7.7f, 7.7f, 0f, false, false, -1.482f, 0.645f)
                curveToRelative(-0.37f, 0.22f, -0.699f, 0.48f, -0.897f, 0.787f)
                curveToRelative(-0.21f, 0.326f, -0.275f, 0.714f, -0.08f, 1.103f)
            }
        }.build()
        
        return _FilePdf!!
    }

private var _FilePdf: ImageVector? = null


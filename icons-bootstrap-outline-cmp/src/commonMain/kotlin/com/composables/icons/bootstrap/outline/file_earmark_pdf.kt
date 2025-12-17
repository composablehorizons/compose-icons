package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FileEarmarkPdf: ImageVector
    get() {
        if (_FileEarmarkPdf != null) return _FileEarmarkPdf!!
        
        _FileEarmarkPdf = ImageVector.Builder(
            name = "file-earmark-pdf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 14f)
                verticalLineTo(4.5f)
                lineTo(9.5f, 0f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                moveTo(9.5f, 3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11f, 4.5f)
                horizontalLineToRelative(2f)
                verticalLineTo(14f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(5.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.603f, 14.087f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.438f, -0.42f)
                curveToRelative(-0.195f, -0.388f, -0.13f, -0.776f, 0.08f, -1.102f)
                curveToRelative(0.198f, -0.307f, 0.526f, -0.568f, 0.897f, -0.787f)
                arcToRelative(7.7f, 7.7f, 0f, false, true, 1.482f, -0.645f)
                arcToRelative(20f, 20f, 0f, false, false, 1.062f, -2.227f)
                arcToRelative(7.3f, 7.3f, 0f, false, true, -0.43f, -1.295f)
                curveToRelative(-0.086f, -0.4f, -0.119f, -0.796f, -0.046f, -1.136f)
                curveToRelative(0.075f, -0.354f, 0.274f, -0.672f, 0.65f, -0.823f)
                curveToRelative(0.192f, -0.077f, 0.4f, -0.12f, 0.602f, -0.077f)
                arcToRelative(0.7f, 0.7f, 0f, false, true, 0.477f, 0.365f)
                curveToRelative(0.088f, 0.164f, 0.12f, 0.356f, 0.127f, 0.538f)
                curveToRelative(0.007f, 0.188f, -0.012f, 0.396f, -0.047f, 0.614f)
                curveToRelative(-0.084f, 0.51f, -0.27f, 1.134f, -0.52f, 1.794f)
                arcToRelative(11f, 11f, 0f, false, false, 0.98f, 1.686f)
                arcToRelative(5.8f, 5.8f, 0f, false, true, 1.334f, 0.05f)
                curveToRelative(0.364f, 0.066f, 0.734f, 0.195f, 0.96f, 0.465f)
                curveToRelative(0.12f, 0.144f, 0.193f, 0.32f, 0.2f, 0.518f)
                curveToRelative(0.007f, 0.192f, -0.047f, 0.382f, -0.138f, 0.563f)
                arcToRelative(1.04f, 1.04f, 0f, false, true, -0.354f, 0.416f)
                arcToRelative(0.86f, 0.86f, 0f, false, true, -0.51f, 0.138f)
                curveToRelative(-0.331f, -0.014f, -0.654f, -0.196f, -0.933f, -0.417f)
                arcToRelative(5.7f, 5.7f, 0f, false, true, -0.911f, -0.95f)
                arcToRelative(11.7f, 11.7f, 0f, false, false, -1.997f, 0.406f)
                arcToRelative(11.3f, 11.3f, 0f, false, true, -1.02f, 1.51f)
                curveToRelative(-0.292f, 0.35f, -0.609f, 0.656f, -0.927f, 0.787f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.58f, 0.029f)
                moveToRelative(1.379f, -1.901f)
                quadToRelative(-0.25f, 0.115f, -0.459f, 0.238f)
                curveToRelative(-0.328f, 0.194f, -0.541f, 0.383f, -0.647f, 0.547f)
                curveToRelative(-0.094f, 0.145f, -0.096f, 0.25f, -0.04f, 0.361f)
                quadToRelative(0.016f, 0.032f, 0.026f, 0.044f)
                lineToRelative(0.035f, -0.012f)
                curveToRelative(0.137f, -0.056f, 0.355f, -0.235f, 0.635f, -0.572f)
                arcToRelative(8f, 8f, 0f, false, false, 0.45f, -0.606f)
                moveToRelative(1.64f, -1.33f)
                arcToRelative(13f, 13f, 0f, false, true, 1.01f, -0.193f)
                arcToRelative(12f, 12f, 0f, false, true, -0.51f, -0.858f)
                arcToRelative(21f, 21f, 0f, false, true, -0.5f, 1.05f)
                close()
                moveToRelative(2.446f, 0.45f)
                quadToRelative(0.226f, 0.245f, 0.435f, 0.41f)
                curveToRelative(0.24f, 0.19f, 0.407f, 0.253f, 0.498f, 0.256f)
                arcToRelative(0.1f, 0.1f, 0f, false, false, 0.07f, -0.015f)
                arcToRelative(0.3f, 0.3f, 0f, false, false, 0.094f, -0.125f)
                arcToRelative(0.44f, 0.44f, 0f, false, false, 0.059f, -0.2f)
                arcToRelative(0.1f, 0.1f, 0f, false, false, -0.026f, -0.063f)
                curveToRelative(-0.052f, -0.062f, -0.2f, -0.152f, -0.518f, -0.209f)
                arcToRelative(4f, 4f, 0f, false, false, -0.612f, -0.053f)
                close()
                moveTo(8.078f, 7.8f)
                arcToRelative(7f, 7f, 0f, false, false, 0.2f, -0.828f)
                quadToRelative(0.046f, -0.282f, 0.038f, -0.465f)
                arcToRelative(0.6f, 0.6f, 0f, false, false, -0.032f, -0.198f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.145f, 0.04f)
                curveToRelative(-0.087f, 0.035f, -0.158f, 0.106f, -0.196f, 0.283f)
                curveToRelative(-0.04f, 0.192f, -0.03f, 0.469f, 0.046f, 0.822f)
                quadToRelative(0.036f, 0.167f, 0.09f, 0.346f)
                close()
            }
        }.build()
        
        return _FileEarmarkPdf!!
    }

private var _FileEarmarkPdf: ImageVector? = null


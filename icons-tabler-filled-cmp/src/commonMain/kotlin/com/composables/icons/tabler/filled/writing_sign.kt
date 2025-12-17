package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.WritingSign: ImageVector
    get() {
        if (_WritingSign != null) return _WritingSign!!
        
        _WritingSign = ImageVector.Builder(
            name = "writing-sign",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 11f)
                curveToRelative(-0.483f, 0f, -1.021f, 0.725f, -1f, 1.983f)
                curveToRelative(0.013f, 0.783f, 0.29f, 1.3f, 1.035f, 2.07f)
                lineToRelative(0.107f, 0.107f)
                lineToRelative(0.101f, -0.134f)
                curveToRelative(0.466f, -0.643f, 0.714f, -1.266f, 0.752f, -1.864f)
                lineToRelative(0.005f, -0.162f)
                lineToRelative(-0.003f, -0.563f)
                curveToRelative(-0.017f, -1.284f, -0.13f, -1.422f, -0.807f, -1.436f)
                close()
                moveToRelative(12f, -9f)
                curveToRelative(1.673f, 0f, 3f, 1.327f, 3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.673f, 1.327f, -3f, 3f, -3f)
                moveToRelative(2.707f, 15.707f)
                lineToRelative(-2f, 2f)
                lineToRelative(-0.08f, 0.071f)
                lineToRelative(-0.043f, 0.034f)
                lineToRelative(-0.084f, 0.054f)
                lineToRelative(-0.103f, 0.052f)
                lineToRelative(-0.084f, 0.032f)
                lineToRelative(-0.08f, 0.023f)
                lineToRelative(-0.143f, 0.023f)
                lineToRelative(-0.071f, 0.004f)
                horizontalLineToRelative(-2.519f)
                curveToRelative(-1.616f, 0f, -2.954f, -0.83f, -4.004f, -2.393f)
                lineToRelative(-0.026f, -0.04f)
                lineToRelative(-0.273f, 0.431f)
                lineToRelative(-0.365f, 0.557f)
                curveToRelative(-1.356f, 2.034f, -2.942f, 1.691f, -4.7f, -0.41f)
                lineToRelative(-0.064f, -0.076f)
                lineToRelative(-0.176f, 0.147f)
                quadToRelative(-0.897f, 0.727f, -2.045f, 1.438f)
                lineToRelative(-0.332f, 0.203f)
                arcToRelative(1f, 1f, 0f, true, true, -1.03f, -1.714f)
                arcToRelative(19f, 19f, 0f, false, false, 2.17f, -1.498f)
                lineToRelative(0.078f, -0.065f)
                lineToRelative(-0.147f, -0.15f)
                curveToRelative(-0.998f, -1.033f, -1.498f, -1.904f, -1.576f, -3.157f)
                lineToRelative(-0.01f, -0.256f)
                curveToRelative(-0.038f, -2.273f, 1.257f, -4.017f, 3f, -4.017f)
                curveToRelative(2.052f, 0f, 3f, 0.948f, 3f, 4f)
                curveToRelative(0f, 1.218f, -0.47f, 2.392f, -1.392f, 3.532f)
                lineToRelative(-0.11f, 0.13f)
                lineToRelative(0.28f, 0.36f)
                curveToRelative(0.784f, 0.985f, 0.994f, 0.992f, 1.343f, 0.492f)
                lineToRelative(0.047f, -0.069f)
                quadToRelative(0.97f, -1.456f, 1.437f, -2.392f)
                arcToRelative(1f, 1f, 0f, false, true, 1.814f, 0.053f)
                curveToRelative(0.858f, 2.002f, 1.878f, 2.894f, 3.081f, 2.894f)
                lineToRelative(0.085f, -0.001f)
                lineToRelative(-0.292f, -0.292f)
                arcToRelative(1f, 1f, 0f, false, true, -0.293f, -0.707f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(9f)
                arcToRelative(1f, 1f, 0f, false, true, -0.293f, 0.707f)
            }
        }.build()
        
        return _WritingSign!!
    }

private var _WritingSign: ImageVector? = null


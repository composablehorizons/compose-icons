package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.DocumentCurrencyDollar: ImageVector
    get() {
        if (_DocumentCurrencyDollar != null) return _DocumentCurrencyDollar!!
        
        _DocumentCurrencyDollar = ImageVector.Builder(
            name = "document-currency-dollar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.621f, 6.584f)
                curveToRelative(0.208f, -0.026f, 0.418f, -0.046f, 0.629f, -0.06f)
                verticalLineToRelative(1.034f)
                lineToRelative(-0.598f, -0.138f)
                arcToRelative(0.227f, 0.227f, 0f, false, true, -0.116f, -0.065f)
                arcToRelative(0.094f, 0.094f, 0f, false, true, -0.028f, -0.06f)
                arcToRelative(5.345f, 5.345f, 0f, false, true, 0.002f, -0.616f)
                arcToRelative(0.082f, 0.082f, 0f, false, true, 0.025f, -0.055f)
                arcToRelative(0.144f, 0.144f, 0f, false, true, 0.086f, -0.04f)
                close()
                moveTo(8.75f, 10.475f)
                verticalLineTo(9.443f)
                lineToRelative(0.594f, 0.137f)
                arcToRelative(0.227f, 0.227f, 0f, false, true, 0.116f, 0.065f)
                arcToRelative(0.094f, 0.094f, 0f, false, true, 0.028f, 0.06f)
                arcToRelative(5.355f, 5.355f, 0f, false, true, -0.002f, 0.616f)
                arcToRelative(0.082f, 0.082f, 0f, false, true, -0.025f, 0.055f)
                arcToRelative(0.144f, 0.144f, 0f, false, true, -0.086f, 0.04f)
                curveToRelative(-0.207f, 0.026f, -0.415f, 0.045f, -0.625f, 0.06f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4f, 2f)
                horizontalLineToRelative(4.879f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.06f, 0.44f)
                lineToRelative(3.122f, 3.12f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.439f, 1.061f)
                verticalLineTo(12.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 12f, 14f)
                horizontalLineTo(4f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-9f)
                close()
                moveToRelative(6.25f, 1.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(0.272f)
                curveToRelative(-0.273f, 0.016f, -0.543f, 0.04f, -0.81f, 0.073f)
                curveToRelative(-0.748f, 0.09f, -1.38f, 0.689f, -1.428f, 1.494f)
                arcToRelative(6.836f, 6.836f, 0f, false, false, -0.002f, 0.789f)
                curveToRelative(0.044f, 0.785f, 0.635f, 1.348f, 1.305f, 1.503f)
                lineToRelative(0.935f, 0.216f)
                verticalLineToRelative(1.379f)
                arcToRelative(11.27f, 11.27f, 0f, false, true, -1.36f, -0.173f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -0.28f, 1.474f)
                curveToRelative(0.536f, 0.102f, 1.084f, 0.17f, 1.64f, 0.202f)
                verticalLineToRelative(0.271f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-0.272f)
                curveToRelative(0.271f, -0.016f, 0.54f, -0.04f, 0.807f, -0.073f)
                curveToRelative(0.747f, -0.09f, 1.378f, -0.689f, 1.427f, -1.494f)
                arcToRelative(6.843f, 6.843f, 0f, false, false, 0.002f, -0.789f)
                curveToRelative(-0.044f, -0.785f, -0.635f, -1.348f, -1.305f, -1.503f)
                lineToRelative(-0.931f, -0.215f)
                verticalLineToRelative(-1.38f)
                curveToRelative(0.46f, 0.03f, 0.913f, 0.089f, 1.356f, 0.173f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.28f, -1.474f)
                arcToRelative(12.767f, 12.767f, 0f, false, false, -1.636f, -0.201f)
                verticalLineTo(4.75f)
                close()
            }
        }.build()
        
        return _DocumentCurrencyDollar!!
    }

private var _DocumentCurrencyDollar: ImageVector? = null


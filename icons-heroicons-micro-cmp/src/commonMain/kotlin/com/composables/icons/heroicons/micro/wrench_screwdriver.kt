package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.WrenchScrewdriver: ImageVector
    get() {
        if (_WrenchScrewdriver != null) return _WrenchScrewdriver!!
        
        _WrenchScrewdriver = ImageVector.Builder(
            name = "wrench-screwdriver",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 4.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 11.435f, 8f)
                curveToRelative(-0.99f, -0.019f, -2.093f, 0.132f, -2.7f, 0.913f)
                lineToRelative(-4.13f, 5.31f)
                arcToRelative(2.015f, 2.015f, 0f, true, true, -2.827f, -2.828f)
                lineToRelative(5.309f, -4.13f)
                curveToRelative(0.78f, -0.607f, 0.932f, -1.71f, 0.914f, -2.7f)
                lineTo(8f, 4.5f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 4.477f, -3.362f)
                curveToRelative(0.325f, 0.094f, 0.39f, 0.497f, 0.15f, 0.736f)
                lineTo(10.6f, 3.902f)
                arcToRelative(0.48f, 0.48f, 0f, false, false, -0.033f, 0.653f)
                curveToRelative(0.271f, 0.314f, 0.565f, 0.608f, 0.879f, 0.879f)
                arcToRelative(0.48f, 0.48f, 0f, false, false, 0.653f, -0.033f)
                lineToRelative(2.027f, -2.027f)
                curveToRelative(0.239f, -0.24f, 0.642f, -0.175f, 0.736f, 0.15f)
                curveToRelative(0.09f, 0.31f, 0.138f, 0.637f, 0.138f, 0.976f)
                close()
                moveTo(3.75f, 13f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 9.5f)
                curveToRelative(0.313f, 0f, 0.62f, -0.029f, 0.917f, -0.084f)
                lineToRelative(1.962f, 1.962f)
                arcToRelative(2.121f, 2.121f, 0f, false, true, -3f, 3f)
                lineToRelative(-2.81f, -2.81f)
                lineToRelative(1.35f, -1.734f)
                curveToRelative(0.05f, -0.064f, 0.158f, -0.158f, 0.426f, -0.233f)
                curveToRelative(0.278f, -0.078f, 0.639f, -0.11f, 1.062f, -0.102f)
                lineToRelative(0.093f, 0.001f)
                close()
                moveTo(5f, 4f)
                lineToRelative(1.446f, 1.445f)
                arcToRelative(2.256f, 2.256f, 0f, false, true, -0.047f, 0.21f)
                curveToRelative(-0.075f, 0.268f, -0.169f, 0.377f, -0.233f, 0.427f)
                lineToRelative(-0.61f, 0.474f)
                lineTo(4f, 5f)
                horizontalLineTo(2.655f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.224f, -0.139f)
                lineToRelative(-1.35f, -2.7f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.047f, -0.289f)
                lineToRelative(0.745f, -0.745f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.289f, -0.047f)
                lineToRelative(2.7f, 1.35f)
                arcTo(0.25f, 0.25f, 0f, false, true, 5f, 2.654f)
                verticalLineTo(4f)
                close()
            }
        }.build()
        
        return _WrenchScrewdriver!!
    }

private var _WrenchScrewdriver: ImageVector? = null


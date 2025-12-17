package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BrowserEdge: ImageVector
    get() {
        if (_BrowserEdge != null) return _BrowserEdge!!
        
        _BrowserEdge = ImageVector.Builder(
            name = "browser-edge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.482f, 9.341f)
                curveToRelative(-0.069f, 0.062f, -0.17f, 0.153f, -0.17f, 0.309f)
                curveToRelative(0f, 0.162f, 0.107f, 0.325f, 0.3f, 0.456f)
                curveToRelative(0.877f, 0.613f, 2.521f, 0.54f, 2.592f, 0.538f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.667f, 0f, 1.32f, -0.18f, 1.894f, -0.519f)
                arcTo(3.84f, 3.84f, 0f, false, false, 16f, 6.819f)
                curveToRelative(0.018f, -1.316f, -0.44f, -2.218f, -0.666f, -2.664f)
                lineToRelative(-0.04f, -0.08f)
                curveTo(13.963f, 1.487f, 11.106f, 0f, 8f, 0f)
                arcTo(8f, 8f, 0f, false, false, 0.473f, 5.29f)
                curveTo(1.488f, 4.048f, 3.183f, 3.262f, 5f, 3.262f)
                curveToRelative(2.83f, 0f, 5.01f, 1.885f, 5.01f, 4.797f)
                horizontalLineToRelative(-0.004f)
                verticalLineToRelative(0.002f)
                curveToRelative(0f, 0.338f, -0.168f, 0.832f, -0.487f, 1.244f)
                lineToRelative(0.006f, -0.006f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.01f, 7.753f)
                arcToRelative(8.14f, 8.14f, 0f, false, false, 0.753f, 3.641f)
                arcToRelative(8f, 8f, 0f, false, false, 6.495f, 4.564f)
                arcToRelative(5f, 5f, 0f, false, true, -0.785f, -0.377f)
                horizontalLineToRelative(-0.01f)
                lineToRelative(-0.12f, -0.075f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, -1.56f, -1.463f)
                arcTo(5.543f, 5.543f, 0f, false, true, 6.81f, 5.8f)
                lineToRelative(0.01f, -0.004f)
                lineToRelative(0.025f, -0.012f)
                curveToRelative(0.208f, -0.098f, 0.62f, -0.292f, 1.167f, -0.285f)
                quadToRelative(0.194f, 0.001f, 0.384f, 0.033f)
                arcToRelative(4f, 4f, 0f, false, false, -0.993f, -0.698f)
                lineToRelative(-0.01f, -0.005f)
                curveTo(6.348f, 4.282f, 5.199f, 4.263f, 5f, 4.263f)
                curveToRelative(-2.44f, 0f, -4.824f, 1.634f, -4.99f, 3.49f)
                moveToRelative(10.263f, 7.912f)
                quadToRelative(0.133f, -0.04f, 0.265f, -0.084f)
                quadToRelative(-0.153f, 0.047f, -0.307f, 0.086f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.228f, 15.667f)
                arcToRelative(5f, 5f, 0f, false, false, 0.303f, -0.086f)
                lineToRelative(0.082f, -0.025f)
                arcToRelative(8.02f, 8.02f, 0f, false, false, 4.162f, -3.3f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.331f, -0.35f)
                quadToRelative(-0.322f, 0.168f, -0.663f, 0.294f)
                arcToRelative(6.4f, 6.4f, 0f, false, true, -2.243f, 0.4f)
                curveToRelative(-2.957f, 0f, -5.532f, -2.031f, -5.532f, -4.644f)
                quadToRelative(0.003f, -0.203f, 0.046f, -0.399f)
                arcToRelative(4.54f, 4.54f, 0f, false, false, -0.46f, 5.898f)
                lineToRelative(0.003f, 0.005f)
                curveToRelative(0.315f, 0.441f, 0.707f, 0.821f, 1.158f, 1.121f)
                horizontalLineToRelative(0.003f)
                lineToRelative(0.144f, 0.09f)
                curveToRelative(0.877f, 0.55f, 1.721f, 1.078f, 3.328f, 0.996f)
            }
        }.build()
        
        return _BrowserEdge!!
    }

private var _BrowserEdge: ImageVector? = null


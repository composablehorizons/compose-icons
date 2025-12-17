package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SessionInProgress: ImageVector
    get() {
        if (_SessionInProgress != null) return _SessionInProgress!!
        
        _SessionInProgress = ImageVector.Builder(
            name = "session-in-progress",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 8f)
                curveTo(15f, 8.454f, 14.956f, 8.906f, 14.87f, 9.345f)
                curveTo(14.824f, 9.583f, 14.614f, 9.749f, 14.381f, 9.749f)
                curveTo(14.349f, 9.749f, 14.317f, 9.746f, 14.284f, 9.74f)
                curveTo(14.013f, 9.687f, 13.836f, 9.424f, 13.889f, 9.153f)
                curveTo(13.962f, 8.778f, 13.999f, 8.389f, 13.999f, 8f)
                curveTo(13.999f, 7.611f, 13.962f, 7.224f, 13.889f, 6.849f)
                curveTo(13.835f, 6.578f, 14.012f, 6.315f, 14.284f, 6.262f)
                curveTo(14.549f, 6.21f, 14.817f, 6.385f, 14.87f, 6.657f)
                curveTo(14.956f, 7.095f, 15f, 7.548f, 15f, 8.001f)
                verticalLineTo(8f)
                close()
                moveTo(11.223f, 2.938f)
                curveTo(11.949f, 3.401f, 12.579f, 4.029f, 13.046f, 4.752f)
                curveTo(13.142f, 4.9f, 13.302f, 4.981f, 13.466f, 4.981f)
                curveTo(13.56f, 4.981f, 13.654f, 4.955f, 13.737f, 4.901f)
                curveTo(13.968f, 4.752f, 14.036f, 4.442f, 13.885f, 4.21f)
                curveTo(13.341f, 3.366f, 12.606f, 2.635f, 11.759f, 2.095f)
                curveTo(11.53f, 1.948f, 11.218f, 2.013f, 11.069f, 2.247f)
                curveTo(10.921f, 2.48f, 10.989f, 2.789f, 11.222f, 2.937f)
                lineTo(11.223f, 2.938f)
                close()
                moveTo(7.99998f, 2f)
                curveTo(8.46898f, 2f, 8.93498f, 2.054f, 9.38498f, 2.161f)
                curveTo(9.65498f, 2.223f, 9.92398f, 2.058f, 9.98698f, 1.789f)
                curveTo(10.05f, 1.52f, 9.88398f, 1.251f, 9.61598f, 1.187f)
                curveTo(9.08998f, 1.063f, 8.54698f, 1f, 8.00098f, 1f)
                curveTo(4.14198f, 1f, 1.00098f, 4.14f, 1.00098f, 8f)
                curveTo(1.00098f, 11.86f, 4.14198f, 15f, 8.00098f, 15f)
                curveTo(8.54698f, 15f, 9.08998f, 14.937f, 9.61598f, 14.813f)
                curveTo(9.88498f, 14.749f, 10.051f, 14.48f, 9.98698f, 14.211f)
                curveTo(9.92498f, 13.942f, 9.65498f, 13.779f, 9.38498f, 13.839f)
                curveTo(8.93498f, 13.945f, 8.46898f, 14f, 7.99998f, 14f)
                curveTo(4.69098f, 14f, 1.99998f, 11.309f, 1.99998f, 8f)
                curveTo(1.99998f, 4.691f, 4.69098f, 2f, 7.99998f, 2f)
                close()
                moveTo(13.747f, 11.08f)
                curveTo(13.517f, 10.931f, 13.204f, 10.998f, 13.057f, 11.231f)
                curveTo(12.591f, 11.959f, 11.959f, 12.59f, 11.231f, 13.057f)
                curveTo(10.999f, 13.206f, 10.93f, 13.515f, 11.08f, 13.747f)
                curveTo(11.176f, 13.896f, 11.337f, 13.977f, 11.501f, 13.977f)
                curveTo(11.594f, 13.977f, 11.688f, 13.952f, 11.771f, 13.898f)
                curveTo(12.621f, 13.355f, 13.357f, 12.618f, 13.9f, 11.769f)
                curveTo(14.049f, 11.537f, 13.981f, 11.227f, 13.749f, 11.079f)
                lineTo(13.747f, 11.08f)
                close()
            }
        }.build()
        
        return _SessionInProgress!!
    }

private var _SessionInProgress: ImageVector? = null


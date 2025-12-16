package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.BracketDot: ImageVector
    get() {
        if (_BracketDot != null) return _BracketDot!!
        
        _BracketDot = ImageVector.Builder(
            name = "bracket-dot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 2.5f)
                curveTo(10.5f, 2.224f, 10.724f, 2f, 11f, 2f)
                curveTo(12.105f, 2f, 13f, 2.895f, 13f, 4f)
                verticalLineTo(6.005f)
                curveTo(13f, 6.535f, 13.008f, 6.799f, 13.089f, 7.002f)
                curveTo(13.152f, 7.158f, 13.284f, 7.333f, 13.723f, 7.553f)
                curveTo(13.892f, 7.638f, 13.999f, 7.811f, 13.999f, 8f)
                curveTo(13.999f, 8.189f, 13.892f, 8.363f, 13.723f, 8.447f)
                curveTo(13.284f, 8.667f, 13.151f, 8.841f, 13.089f, 8.998f)
                curveTo(13.072f, 9.041f, 13.058f, 9.088f, 13.046f, 9.139f)
                curveTo(12.729f, 9.053f, 12.397f, 9.005f, 12.055f, 9.001f)
                curveTo(12.079f, 8.872f, 12.112f, 8.747f, 12.16f, 8.627f)
                curveTo(12.257f, 8.384f, 12.403f, 8.18f, 12.598f, 8f)
                curveTo(12.402f, 7.821f, 12.257f, 7.616f, 12.16f, 7.374f)
                curveTo(11.998f, 6.971f, 11.999f, 6.51f, 11.999f, 6.063f)
                verticalLineTo(4f)
                curveTo(11.999f, 3.448f, 11.551f, 3f, 10.999f, 3f)
                curveTo(10.723f, 3f, 10.499f, 2.776f, 10.499f, 2.5f)
                horizontalLineTo(10.5f)
                close()
                moveTo(3.83898f, 7.374f)
                curveTo(4.00098f, 6.971f, 3.99998f, 6.51f, 3.99998f, 6.063f)
                verticalLineTo(4f)
                curveTo(3.99998f, 3.448f, 4.44798f, 3f, 4.99998f, 3f)
                curveTo(5.27598f, 3f, 5.49998f, 2.776f, 5.49998f, 2.5f)
                curveTo(5.49998f, 2.224f, 5.27598f, 2f, 4.99998f, 2f)
                curveTo(3.89498f, 2f, 2.99998f, 2.895f, 2.99998f, 4f)
                verticalLineTo(6.005f)
                curveTo(2.99998f, 6.535f, 2.99198f, 6.799f, 2.91098f, 7.002f)
                curveTo(2.84798f, 7.158f, 2.71598f, 7.333f, 2.27698f, 7.553f)
                curveTo(2.10798f, 7.638f, 2.00098f, 7.811f, 2.00098f, 8f)
                curveTo(2.00098f, 8.189f, 2.10798f, 8.363f, 2.27698f, 8.447f)
                curveTo(2.71598f, 8.667f, 2.84898f, 8.841f, 2.91098f, 8.998f)
                curveTo(2.99298f, 9.202f, 2.99998f, 9.467f, 2.99998f, 10f)
                verticalLineTo(12f)
                curveTo(2.99998f, 13.105f, 3.89498f, 14f, 4.99998f, 14f)
                curveTo(5.27598f, 14f, 5.49998f, 13.776f, 5.49998f, 13.5f)
                curveTo(5.49998f, 13.224f, 5.27598f, 13f, 4.99998f, 13f)
                curveTo(4.44798f, 13f, 3.99998f, 12.552f, 3.99998f, 12f)
                verticalLineTo(9.941f)
                curveTo(3.99998f, 9.492f, 3.99998f, 9.03f, 3.83898f, 8.626f)
                curveTo(3.74198f, 8.383f, 3.59598f, 8.179f, 3.39998f, 7.999f)
                curveTo(3.59598f, 7.82f, 3.74098f, 7.615f, 3.83798f, 7.373f)
                lineTo(3.83898f, 7.374f)
                close()
                moveTo(12f, 10f)
                curveTo(10.343f, 10f, 8.99998f, 11.343f, 8.99998f, 13f)
                curveTo(8.99998f, 14.657f, 10.343f, 16f, 12f, 16f)
                curveTo(13.657f, 16f, 15f, 14.657f, 15f, 13f)
                curveTo(15f, 11.343f, 13.657f, 10f, 12f, 10f)
                close()
            }
        }.build()
        
        return _BracketDot!!
    }

private var _BracketDot: ImageVector? = null


package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.WorkspaceTrusted: ImageVector
    get() {
        if (_WorkspaceTrusted != null) return _WorkspaceTrusted!!
        
        _WorkspaceTrusted = ImageVector.Builder(
            name = "workspace-trusted",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.4f, 3f)
                curveTo(11.563f, 3f, 9.91401f, 2.667f, 8.42601f, 1.176f)
                curveTo(8.30901f, 1.059f, 8.15501f, 1f, 8.00101f, 1f)
                curveTo(7.84801f, 1f, 7.69501f, 1.059f, 7.57801f, 1.176f)
                curveTo(6.08601f, 2.667f, 4.43601f, 3f, 2.60101f, 3f)
                curveTo(2.27001f, 3f, 2.00101f, 3.269f, 2.00101f, 3.6f)
                verticalLineTo(7.202f)
                curveTo(2.00101f, 11.064f, 3.97101f, 13.689f, 7.81101f, 14.97f)
                curveTo(7.87301f, 14.991f, 7.93701f, 15.001f, 8.00101f, 15.001f)
                curveTo(8.06501f, 15.001f, 8.12901f, 14.991f, 8.19101f, 14.97f)
                curveTo(12.032f, 13.69f, 14.001f, 11.064f, 14.001f, 7.202f)
                verticalLineTo(3.6f)
                curveTo(14.001f, 3.269f, 13.731f, 3f, 13.4f, 3f)
                close()
                moveTo(13f, 7.201f)
                curveTo(13f, 10.597f, 11.364f, 12.815f, 8.00001f, 13.977f)
                curveTo(4.63601f, 12.815f, 3.00001f, 10.597f, 3.00001f, 7.201f)
                verticalLineTo(3.995f)
                curveTo(4.57901f, 3.956f, 6.35201f, 3.646f, 8.00101f, 2.152f)
                curveTo(9.64701f, 3.645f, 11.421f, 3.955f, 13f, 3.995f)
                verticalLineTo(7.201f)
                close()
                moveTo(7.49901f, 8.793f)
                lineTo(10.145f, 6.147f)
                curveTo(10.243f, 6.049f, 10.371f, 6.001f, 10.499f, 6.001f)
                curveTo(10.775f, 6.001f, 10.999f, 6.225f, 10.999f, 6.501f)
                curveTo(10.999f, 6.629f, 10.95f, 6.757f, 10.853f, 6.855f)
                lineTo(7.85301f, 9.855f)
                curveTo(7.75501f, 9.953f, 7.62701f, 10.001f, 7.49901f, 10.001f)
                curveTo(7.37101f, 10.001f, 7.24301f, 9.952f, 7.14501f, 9.855f)
                lineTo(5.64501f, 8.355f)
                curveTo(5.54701f, 8.257f, 5.49901f, 8.129f, 5.49901f, 8.001f)
                curveTo(5.49901f, 7.725f, 5.72301f, 7.501f, 5.99901f, 7.501f)
                curveTo(6.12701f, 7.501f, 6.25501f, 7.55f, 6.35301f, 7.647f)
                lineTo(7.49901f, 8.793f)
                close()
            }
        }.build()
        
        return _WorkspaceTrusted!!
    }

private var _WorkspaceTrusted: ImageVector? = null


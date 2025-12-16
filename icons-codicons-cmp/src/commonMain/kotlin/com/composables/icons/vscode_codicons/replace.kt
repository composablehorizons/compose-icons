package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Replace: ImageVector
    get() {
        if (_Replace != null) return _Replace!!
        
        _Replace = ImageVector.Builder(
            name = "replace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 2.813f)
                curveTo(10.295f, 2.619f, 10.634f, 2.5f, 11f, 2.5f)
                curveTo(12.103f, 2.5f, 13f, 3.509f, 13f, 4.75f)
                curveTo(13f, 5.991f, 12.103f, 7f, 11f, 7f)
                curveTo(10.62f, 7f, 10.269f, 6.873f, 9.966f, 6.666f)
                curveTo(9.897f, 6.86f, 9.717f, 7f, 9.5f, 7f)
                curveTo(9.224f, 7f, 9f, 6.776f, 9f, 6.5f)
                verticalLineTo(1.5f)
                curveTo(9f, 1.224f, 9.224f, 1f, 9.5f, 1f)
                curveTo(9.776f, 1f, 10f, 1.224f, 10f, 1.5f)
                verticalLineTo(2.813f)
                close()
                moveTo(10f, 4.75f)
                curveTo(10f, 5.439f, 10.448f, 6f, 11f, 6f)
                curveTo(11.552f, 6f, 12f, 5.439f, 12f, 4.75f)
                curveTo(12f, 4.061f, 11.552f, 3.5f, 11f, 3.5f)
                curveTo(10.448f, 3.5f, 10f, 4.061f, 10f, 4.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 9f)
                horizontalLineTo(7f)
                curveTo(7.552f, 9f, 8f, 9.448f, 8f, 10f)
                verticalLineTo(15f)
                curveTo(8f, 15.552f, 7.552f, 16f, 7f, 16f)
                horizontalLineTo(2f)
                curveTo(1.448f, 16f, 1f, 15.552f, 1f, 15f)
                verticalLineTo(10f)
                curveTo(1f, 9.448f, 1.448f, 9f, 2f, 9f)
                close()
                moveTo(5.039f, 13.645f)
                curveTo(4.81f, 13.849f, 4.199f, 13.968f, 3.83f, 13.506f)
                curveTo(3.617f, 13.24f, 3.5f, 12.88f, 3.5f, 12.492f)
                curveTo(3.5f, 12.104f, 3.618f, 11.744f, 3.83f, 11.478f)
                curveTo(4.201f, 11.014f, 4.811f, 11.133f, 5.04f, 11.339f)
                curveTo(5.244f, 11.525f, 5.56f, 11.507f, 5.746f, 11.303f)
                curveTo(5.931f, 11.098f, 5.915f, 10.782f, 5.709f, 10.597f)
                curveTo(4.922f, 9.887f, 3.733f, 10.001f, 3.049f, 10.853f)
                curveTo(2.695f, 11.297f, 2.5f, 11.878f, 2.5f, 12.492f)
                curveTo(2.5f, 13.106f, 2.695f, 13.688f, 3.049f, 14.131f)
                curveTo(3.43f, 14.605f, 3.945f, 14.867f, 4.5f, 14.867f)
                curveTo(4.941f, 14.867f, 5.359f, 14.701f, 5.708f, 14.387f)
                curveTo(5.913f, 14.202f, 5.93f, 13.886f, 5.745f, 13.681f)
                curveTo(5.559f, 13.476f, 5.243f, 13.458f, 5.039f, 13.645f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.99998f, 4.5f)
                curveTo(3.99998f, 3.673f, 4.67298f, 3f, 5.49998f, 3f)
                horizontalLineTo(7.50198f)
                curveTo(7.77798f, 3f, 8.00198f, 3.224f, 8.00198f, 3.5f)
                curveTo(8.00198f, 3.776f, 7.77798f, 4f, 7.50198f, 4f)
                horizontalLineTo(5.50198f)
                curveTo(5.22598f, 4f, 5.00198f, 4.225f, 5.00198f, 4.5f)
                verticalLineTo(6.293f)
                lineTo(6.14798f, 5.147f)
                curveTo(6.34298f, 4.952f, 6.65998f, 4.952f, 6.85498f, 5.147f)
                curveTo(7.04998f, 5.342f, 7.04998f, 5.659f, 6.85498f, 5.854f)
                lineTo(4.85498f, 7.854f)
                curveTo(4.75698f, 7.951f, 4.62898f, 8f, 4.50098f, 8f)
                curveTo(4.37298f, 8f, 4.24498f, 7.952f, 4.14698f, 7.854f)
                lineTo(2.14698f, 5.854f)
                curveTo(1.95198f, 5.659f, 1.95198f, 5.342f, 2.14698f, 5.147f)
                curveTo(2.34198f, 4.952f, 2.65898f, 4.952f, 2.85398f, 5.147f)
                lineTo(3.99998f, 6.293f)
                verticalLineTo(4.5f)
                close()
            }
        }.build()
        
        return _Replace!!
    }

private var _Replace: ImageVector? = null


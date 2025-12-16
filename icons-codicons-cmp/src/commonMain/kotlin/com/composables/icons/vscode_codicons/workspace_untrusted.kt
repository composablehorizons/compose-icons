package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.WorkspaceUntrusted: ImageVector
    get() {
        if (_WorkspaceUntrusted != null) return _WorkspaceUntrusted!!
        
        _WorkspaceUntrusted = ImageVector.Builder(
            name = "workspace-untrusted",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.855f, 6.146f)
                lineTo(8.001f, 7.292f)
                lineTo(9.148f, 6.145f)
                curveTo(9.322f, 5.971f, 9.591f, 5.952f, 9.786f, 6.087f)
                lineTo(9.855f, 6.145f)
                curveTo(10.029f, 6.319f, 10.048f, 6.588f, 9.913f, 6.783f)
                lineTo(9.855f, 6.852f)
                lineTo(8.707f, 7.997f)
                lineTo(9.854f, 9.145f)
                curveTo(10.028f, 9.319f, 10.047f, 9.588f, 9.912f, 9.783f)
                lineTo(9.854f, 9.852f)
                curveTo(9.68f, 10.026f, 9.411f, 10.045f, 9.216f, 9.91f)
                lineTo(9.147f, 9.852f)
                lineTo(8.001f, 8.706f)
                lineTo(6.854f, 9.853f)
                curveTo(6.68f, 10.027f, 6.411f, 10.046f, 6.216f, 9.911f)
                lineTo(6.147f, 9.853f)
                curveTo(5.973f, 9.679f, 5.954f, 9.41f, 6.089f, 9.215f)
                lineTo(6.147f, 9.146f)
                lineTo(7.293f, 8f)
                lineTo(6.148f, 6.853f)
                curveTo(5.974f, 6.679f, 5.955f, 6.41f, 6.09f, 6.215f)
                lineTo(6.148f, 6.146f)
                curveTo(6.322f, 5.972f, 6.591f, 5.953f, 6.786f, 6.088f)
                lineTo(6.855f, 6.146f)
                close()
                moveTo(14f, 3.6f)
                verticalLineTo(7.202f)
                curveTo(14f, 11.064f, 12.03f, 13.689f, 8.19f, 14.97f)
                curveTo(8.128f, 14.991f, 8.064f, 15.001f, 8f, 15.001f)
                curveTo(7.936f, 15.001f, 7.872f, 14.991f, 7.81f, 14.97f)
                curveTo(3.969f, 13.69f, 2f, 11.064f, 2f, 7.202f)
                verticalLineTo(3.6f)
                curveTo(2f, 3.269f, 2.269f, 3f, 2.6f, 3f)
                curveTo(4.435f, 3f, 6.085f, 2.667f, 7.577f, 1.176f)
                curveTo(7.694f, 1.059f, 7.847f, 1.001f, 8f, 1f)
                curveTo(8.154f, 1f, 8.307f, 1.059f, 8.425f, 1.176f)
                curveTo(9.913f, 2.667f, 11.562f, 3f, 13.399f, 3f)
                curveTo(13.73f, 3f, 14f, 3.269f, 14f, 3.6f)
                close()
                moveTo(13f, 3.995f)
                curveTo(11.42f, 3.955f, 9.646f, 3.646f, 8.001f, 2.152f)
                curveTo(6.353f, 3.645f, 4.579f, 3.955f, 3f, 3.995f)
                verticalLineTo(7.201f)
                curveTo(3f, 10.597f, 4.636f, 12.815f, 8f, 13.977f)
                curveTo(11.364f, 12.815f, 13f, 10.597f, 13f, 7.201f)
                verticalLineTo(3.995f)
                close()
            }
        }.build()
        
        return _WorkspaceUntrusted!!
    }

private var _WorkspaceUntrusted: ImageVector? = null


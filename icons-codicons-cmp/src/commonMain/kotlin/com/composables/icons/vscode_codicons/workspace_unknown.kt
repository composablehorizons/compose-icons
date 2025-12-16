package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.WorkspaceUnknown: ImageVector
    get() {
        if (_WorkspaceUnknown != null) return _WorkspaceUnknown!!
        
        _WorkspaceUnknown = ImageVector.Builder(
            name = "workspace-unknown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.75f, 10.75f)
                curveTo(8.75f, 11.164f, 8.414f, 11.5f, 8f, 11.5f)
                curveTo(7.586f, 11.5f, 7.25f, 11.164f, 7.25f, 10.75f)
                curveTo(7.25f, 10.336f, 7.586f, 10f, 8f, 10f)
                curveTo(8.414f, 10f, 8.75f, 10.336f, 8.75f, 10.75f)
                close()
                moveTo(6.25f, 6.75f)
                curveTo(6.25f, 7.026f, 6.474f, 7.25f, 6.75f, 7.25f)
                curveTo(7.026f, 7.25f, 7.25f, 7.026f, 7.25f, 6.75f)
                curveTo(7.25f, 6.336f, 7.586f, 6f, 8f, 6f)
                curveTo(8.414f, 6f, 8.75f, 6.336f, 8.75f, 6.75f)
                curveTo(8.75f, 7.015f, 8.606f, 7.187f, 8.272f, 7.52f)
                lineTo(8.241f, 7.551f)
                curveTo(7.947f, 7.843f, 7.5f, 8.288f, 7.5f, 9f)
                curveTo(7.5f, 9.276f, 7.724f, 9.5f, 8f, 9.5f)
                curveTo(8.276f, 9.5f, 8.5f, 9.276f, 8.5f, 9f)
                curveTo(8.5f, 8.734f, 8.645f, 8.56f, 8.978f, 8.228f)
                lineTo(9.01f, 8.196f)
                curveTo(9.303f, 7.904f, 9.75f, 7.46f, 9.75f, 6.75f)
                curveTo(9.75f, 5.783f, 8.966f, 5f, 8f, 5f)
                curveTo(7.034f, 5f, 6.25f, 5.783f, 6.25f, 6.75f)
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
        
        return _WorkspaceUnknown!!
    }

private var _WorkspaceUnknown: ImageVector? = null


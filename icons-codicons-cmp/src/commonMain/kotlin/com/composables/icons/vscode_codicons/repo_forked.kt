package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.RepoForked: ImageVector
    get() {
        if (_RepoForked != null) return _RepoForked!!
        
        _RepoForked = ImageVector.Builder(
            name = "repo-forked",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 3.5f)
                curveTo(7f, 4.70948f, 6.14112f, 5.71836f, 5f, 5.94999f)
                verticalLineTo(6.5f)
                curveTo(5f, 6.89782f, 5.15804f, 7.27936f, 5.43934f, 7.56066f)
                curveTo(5.72064f, 7.84196f, 6.10218f, 8f, 6.5f, 8f)
                horizontalLineTo(9.5f)
                curveTo(9.89782f, 8f, 10.2794f, 7.84196f, 10.5607f, 7.56066f)
                curveTo(10.842f, 7.27936f, 11f, 6.89782f, 11f, 6.5f)
                verticalLineTo(5.94999f)
                curveTo(9.85888f, 5.71836f, 9f, 4.70948f, 9f, 3.5f)
                curveTo(9f, 2.11929f, 10.1193f, 1f, 11.5f, 1f)
                curveTo(12.8807f, 1f, 14f, 2.11929f, 14f, 3.5f)
                curveTo(14f, 4.70948f, 13.1411f, 5.71836f, 12f, 5.94999f)
                verticalLineTo(6.5f)
                curveTo(12f, 7.16304f, 11.7366f, 7.79893f, 11.2678f, 8.26777f)
                curveTo(10.7989f, 8.73661f, 10.163f, 9f, 9.5f, 9f)
                horizontalLineTo(8.5f)
                verticalLineTo(10.05f)
                curveTo(9.64112f, 10.2816f, 10.5f, 11.2905f, 10.5f, 12.5f)
                curveTo(10.5f, 13.8807f, 9.38071f, 15f, 8f, 15f)
                curveTo(6.61929f, 15f, 5.5f, 13.8807f, 5.5f, 12.5f)
                curveTo(5.5f, 11.2905f, 6.35888f, 10.2816f, 7.5f, 10.05f)
                verticalLineTo(9f)
                horizontalLineTo(6.5f)
                curveTo(5.83696f, 9f, 5.20107f, 8.73661f, 4.73223f, 8.26777f)
                curveTo(4.26339f, 7.79893f, 4f, 7.16304f, 4f, 6.5f)
                verticalLineTo(5.94999f)
                curveTo(2.85888f, 5.71836f, 2f, 4.70948f, 2f, 3.5f)
                curveTo(2f, 2.11929f, 3.11929f, 1f, 4.5f, 1f)
                curveTo(5.88071f, 1f, 7f, 2.11929f, 7f, 3.5f)
                close()
                moveTo(4.5f, 2f)
                curveTo(3.67157f, 2f, 3f, 2.67157f, 3f, 3.5f)
                curveTo(3f, 4.32843f, 3.67157f, 5f, 4.5f, 5f)
                curveTo(5.32843f, 5f, 6f, 4.32843f, 6f, 3.5f)
                curveTo(6f, 2.67157f, 5.32843f, 2f, 4.5f, 2f)
                close()
                moveTo(8f, 11f)
                curveTo(7.17157f, 11f, 6.5f, 11.6716f, 6.5f, 12.5f)
                curveTo(6.5f, 13.3284f, 7.17157f, 14f, 8f, 14f)
                curveTo(8.82843f, 14f, 9.5f, 13.3284f, 9.5f, 12.5f)
                curveTo(9.5f, 11.6716f, 8.82843f, 11f, 8f, 11f)
                close()
                moveTo(13f, 3.5f)
                curveTo(13f, 4.32843f, 12.3284f, 5f, 11.5f, 5f)
                curveTo(10.6716f, 5f, 10f, 4.32843f, 10f, 3.5f)
                curveTo(10f, 2.67157f, 10.6716f, 2f, 11.5f, 2f)
                curveTo(12.3284f, 2f, 13f, 2.67157f, 13f, 3.5f)
                close()
            }
        }.build()
        
        return _RepoForked!!
    }

private var _RepoForked: ImageVector? = null


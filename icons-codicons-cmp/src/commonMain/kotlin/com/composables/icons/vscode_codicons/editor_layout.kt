package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.EditorLayout: ImageVector
    get() {
        if (_EditorLayout != null) return _EditorLayout!!
        
        _EditorLayout = ImageVector.Builder(
            name = "editor-layout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 5f)
                horizontalLineTo(7.5f)
                curveTo(7.328f, 5f, 7.161f, 5.018f, 7f, 5.052f)
                verticalLineTo(2.5f)
                curveTo(7f, 1.673f, 6.327f, 1f, 5.5f, 1f)
                horizontalLineTo(2.5f)
                curveTo(1.673f, 1f, 1f, 1.673f, 1f, 2.5f)
                verticalLineTo(8.5f)
                curveTo(1f, 9.327f, 1.673f, 10f, 2.5f, 10f)
                horizontalLineTo(5f)
                verticalLineTo(12.5f)
                curveTo(5f, 13.881f, 6.119f, 15f, 7.5f, 15f)
                horizontalLineTo(12.5f)
                curveTo(13.881f, 15f, 15f, 13.881f, 15f, 12.5f)
                verticalLineTo(7.5f)
                curveTo(15f, 6.119f, 13.881f, 5f, 12.5f, 5f)
                close()
                moveTo(7.5f, 6f)
                horizontalLineTo(12.5f)
                curveTo(13.153f, 6f, 13.709f, 6.417f, 13.915f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(6.092f)
                curveTo(7.155f, 6.033f, 7.323f, 6f, 7.5f, 6f)
                close()
                moveTo(2.5f, 2f)
                horizontalLineTo(5.5f)
                curveTo(5.776f, 2f, 6f, 2.224f, 6f, 2.5f)
                verticalLineTo(3f)
                horizontalLineTo(2f)
                verticalLineTo(2.5f)
                curveTo(2f, 2.224f, 2.224f, 2f, 2.5f, 2f)
                close()
                moveTo(2f, 8.5f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(8.5f)
                curveTo(6f, 8.776f, 5.776f, 9f, 5.5f, 9f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 9f, 2f, 8.776f, 2f, 8.5f)
                close()
                moveTo(14f, 12.5f)
                curveTo(14f, 13.328f, 13.328f, 14f, 12.5f, 14f)
                horizontalLineTo(7.5f)
                curveTo(6.672f, 14f, 6f, 13.328f, 6f, 12.5f)
                verticalLineTo(9.914f)
                curveTo(6.582f, 9.708f, 7f, 9.152f, 7f, 8.5f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(12.5f)
                close()
            }
        }.build()
        
        return _EditorLayout!!
    }

private var _EditorLayout: ImageVector? = null


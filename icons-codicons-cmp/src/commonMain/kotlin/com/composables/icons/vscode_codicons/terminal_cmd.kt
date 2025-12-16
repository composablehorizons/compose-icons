package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.TerminalCmd: ImageVector
    get() {
        if (_TerminalCmd != null) return _TerminalCmd!!
        
        _TerminalCmd = ImageVector.Builder(
            name = "terminal-cmd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 1f)
                horizontalLineTo(3.5f)
                curveTo(2.119f, 1f, 1f, 2.119f, 1f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(1f, 13.881f, 2.119f, 15f, 3.5f, 15f)
                horizontalLineTo(12.5f)
                curveTo(13.881f, 15f, 15f, 13.881f, 15f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(15f, 2.119f, 13.881f, 1f, 12.5f, 1f)
                close()
                moveTo(14f, 12.5f)
                curveTo(14f, 13.328f, 13.328f, 14f, 12.5f, 14f)
                horizontalLineTo(3.5f)
                curveTo(2.672f, 14f, 2f, 13.328f, 2f, 12.5f)
                verticalLineTo(5f)
                horizontalLineTo(14f)
                verticalLineTo(12.5f)
                close()
                moveTo(14f, 4f)
                horizontalLineTo(2f)
                verticalLineTo(3.5f)
                curveTo(2f, 2.672f, 2.672f, 2f, 3.5f, 2f)
                horizontalLineTo(12.5f)
                curveTo(13.328f, 2f, 14f, 2.672f, 14f, 3.5f)
                verticalLineTo(4f)
                close()
                moveTo(4f, 10.508f)
                verticalLineTo(8.508f)
                curveTo(4f, 7.681f, 4.673f, 7.008f, 5.5f, 7.008f)
                curveTo(6.327f, 7.008f, 7f, 7.681f, 7f, 8.508f)
                curveTo(7f, 8.784f, 6.776f, 9.008f, 6.5f, 9.008f)
                curveTo(6.224f, 9.008f, 6f, 8.784f, 6f, 8.508f)
                curveTo(6f, 8.232f, 5.776f, 8.008f, 5.5f, 8.008f)
                curveTo(5.224f, 8.008f, 5f, 8.232f, 5f, 8.508f)
                verticalLineTo(10.508f)
                curveTo(5f, 10.783f, 5.224f, 11.008f, 5.5f, 11.008f)
                curveTo(5.776f, 11.008f, 6f, 10.783f, 6f, 10.508f)
                curveTo(6f, 10.233f, 6.224f, 10.008f, 6.5f, 10.008f)
                curveTo(6.776f, 10.008f, 7f, 10.232f, 7f, 10.508f)
                curveTo(7f, 11.335f, 6.327f, 12.008f, 5.5f, 12.008f)
                curveTo(4.673f, 12.008f, 4f, 11.335f, 4f, 10.508f)
                close()
                moveTo(8f, 8.5f)
                curveTo(8f, 8.224f, 8.224f, 8f, 8.5f, 8f)
                curveTo(8.776f, 8f, 9f, 8.224f, 9f, 8.5f)
                curveTo(9f, 8.776f, 8.776f, 9f, 8.5f, 9f)
                curveTo(8.224f, 9f, 8f, 8.776f, 8f, 8.5f)
                close()
                moveTo(8f, 10.5f)
                curveTo(8f, 10.224f, 8.224f, 10f, 8.5f, 10f)
                curveTo(8.776f, 10f, 9f, 10.224f, 9f, 10.5f)
                curveTo(9f, 10.776f, 8.776f, 11f, 8.5f, 11f)
                curveTo(8.224f, 11f, 8f, 10.776f, 8f, 10.5f)
                close()
                moveTo(9.532f, 7.676f)
                curveTo(9.434f, 7.417f, 9.565f, 7.129f, 9.824f, 7.032f)
                curveTo(10.08f, 6.936f, 10.371f, 7.066f, 10.468f, 7.324f)
                lineTo(11.968f, 11.324f)
                curveTo(12.066f, 11.583f, 11.935f, 11.871f, 11.676f, 11.968f)
                curveTo(11.618f, 11.99f, 11.559f, 12f, 11.5f, 12f)
                curveTo(11.298f, 12f, 11.107f, 11.876f, 11.032f, 11.676f)
                lineTo(9.532f, 7.676f)
                close()
            }
        }.build()
        
        return _TerminalCmd!!
    }

private var _TerminalCmd: ImageVector? = null


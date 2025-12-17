package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.NotebookTemplate: ImageVector
    get() {
        if (_NotebookTemplate != null) return _NotebookTemplate!!
        
        _NotebookTemplate = ImageVector.Builder(
            name = "notebook-template",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 1.5f)
                curveTo(4f, 1.776f, 3.776f, 2f, 3.5f, 2f)
                horizontalLineTo(3f)
                curveTo(2.449f, 2f, 2f, 2.449f, 2f, 3f)
                verticalLineTo(3.5f)
                curveTo(2f, 3.776f, 1.776f, 4f, 1.5f, 4f)
                curveTo(1.224f, 4f, 1f, 3.776f, 1f, 3.5f)
                verticalLineTo(3f)
                curveTo(1f, 1.897f, 1.897f, 1f, 3f, 1f)
                horizontalLineTo(3.5f)
                curveTo(3.776f, 1f, 4f, 1.224f, 4f, 1.5f)
                close()
                moveTo(1.5f, 8f)
                curveTo(1.776f, 8f, 2f, 7.776f, 2f, 7.5f)
                verticalLineTo(5.5f)
                curveTo(2f, 5.224f, 1.776f, 5f, 1.5f, 5f)
                curveTo(1.224f, 5f, 1f, 5.224f, 1f, 5.5f)
                verticalLineTo(7.5f)
                curveTo(1f, 7.776f, 1.224f, 8f, 1.5f, 8f)
                close()
                moveTo(1.5f, 12f)
                curveTo(1.776f, 12f, 2f, 11.776f, 2f, 11.5f)
                verticalLineTo(9.5f)
                curveTo(2f, 9.224f, 1.776f, 9f, 1.5f, 9f)
                curveTo(1.224f, 9f, 1f, 9.224f, 1f, 9.5f)
                verticalLineTo(11.5f)
                curveTo(1f, 11.776f, 1.224f, 12f, 1.5f, 12f)
                close()
                moveTo(3.5f, 15f)
                horizontalLineTo(3f)
                curveTo(2.449f, 15f, 2f, 14.551f, 2f, 14f)
                verticalLineTo(13.5f)
                curveTo(2f, 13.224f, 1.776f, 13f, 1.5f, 13f)
                curveTo(1.224f, 13f, 1f, 13.224f, 1f, 13.5f)
                verticalLineTo(14f)
                curveTo(1f, 15.103f, 1.897f, 16f, 3f, 16f)
                horizontalLineTo(3.5f)
                curveTo(3.776f, 16f, 4f, 15.776f, 4f, 15.5f)
                curveTo(4f, 15.224f, 3.776f, 15f, 3.5f, 15f)
                close()
                moveTo(10.5f, 2f)
                horizontalLineTo(11f)
                curveTo(11.551f, 2f, 12f, 2.449f, 12f, 3f)
                verticalLineTo(3.5f)
                curveTo(12f, 3.776f, 12.224f, 4f, 12.5f, 4f)
                curveTo(12.776f, 4f, 13f, 3.776f, 13f, 3.5f)
                verticalLineTo(3f)
                curveTo(13f, 1.897f, 12.103f, 1f, 11f, 1f)
                horizontalLineTo(10.5f)
                curveTo(10.224f, 1f, 10f, 1.224f, 10f, 1.5f)
                curveTo(10f, 1.776f, 10.224f, 2f, 10.5f, 2f)
                close()
                moveTo(5.5f, 2f)
                horizontalLineTo(8.5f)
                curveTo(8.776f, 2f, 9f, 1.776f, 9f, 1.5f)
                curveTo(9f, 1.224f, 8.776f, 1f, 8.5f, 1f)
                horizontalLineTo(5.5f)
                curveTo(5.224f, 1f, 5f, 1.224f, 5f, 1.5f)
                curveTo(5f, 1.776f, 5.224f, 2f, 5.5f, 2f)
                close()
                moveTo(14f, 7f)
                verticalLineTo(14f)
                curveTo(14f, 15.103f, 13.103f, 16f, 12f, 16f)
                horizontalLineTo(7f)
                curveTo(5.897f, 16f, 5f, 15.103f, 5f, 14f)
                verticalLineTo(7f)
                curveTo(5f, 5.897f, 5.897f, 5f, 7f, 5f)
                horizontalLineTo(12f)
                curveTo(13.103f, 5f, 14f, 5.897f, 14f, 7f)
                close()
                moveTo(13f, 7f)
                curveTo(13f, 6.449f, 12.551f, 6f, 12f, 6f)
                horizontalLineTo(7f)
                curveTo(6.449f, 6f, 6f, 6.449f, 6f, 7f)
                verticalLineTo(14f)
                curveTo(6f, 14.551f, 6.449f, 15f, 7f, 15f)
                horizontalLineTo(12f)
                curveTo(12.551f, 15f, 13f, 14.551f, 13f, 14f)
                verticalLineTo(7f)
                close()
                moveTo(11.5f, 8f)
                horizontalLineTo(7.5f)
                curveTo(7.224f, 8f, 7f, 8.224f, 7f, 8.5f)
                curveTo(7f, 8.776f, 7.224f, 9f, 7.5f, 9f)
                horizontalLineTo(11.5f)
                curveTo(11.776f, 9f, 12f, 8.776f, 12f, 8.5f)
                curveTo(12f, 8.224f, 11.776f, 8f, 11.5f, 8f)
                close()
                moveTo(15.5f, 7f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(15.5f)
                curveTo(15.776f, 9f, 16f, 8.776f, 16f, 8.5f)
                verticalLineTo(7.5f)
                curveTo(16f, 7.224f, 15.776f, 7f, 15.5f, 7f)
                close()
                moveTo(15.5f, 10f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(15.5f)
                curveTo(15.776f, 12f, 16f, 11.776f, 16f, 11.5f)
                verticalLineTo(10.5f)
                curveTo(16f, 10.224f, 15.776f, 10f, 15.5f, 10f)
                close()
                moveTo(15.5f, 13f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(15.5f)
                curveTo(15.776f, 15f, 16f, 14.776f, 16f, 14.5f)
                verticalLineTo(13.5f)
                curveTo(16f, 13.224f, 15.776f, 13f, 15.5f, 13f)
                close()
            }
        }.build()
        
        return _NotebookTemplate!!
    }

private var _NotebookTemplate: ImageVector? = null


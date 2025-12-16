package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.TypeHierarchySuper: ImageVector
    get() {
        if (_TypeHierarchySuper != null) return _TypeHierarchySuper!!
        
        _TypeHierarchySuper = ImageVector.Builder(
            name = "type-hierarchy-super",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 6f)
                horizontalLineTo(11.76f)
                lineTo(8.96f, 10f)
                horizontalLineTo(9f)
                curveTo(9.552f, 10f, 10f, 10.448f, 10f, 11f)
                verticalLineTo(14f)
                curveTo(10f, 14.552f, 9.552f, 15f, 9f, 15f)
                horizontalLineTo(6f)
                curveTo(5.448f, 15f, 5f, 14.552f, 5f, 14f)
                verticalLineTo(11f)
                curveTo(5f, 10.448f, 5.448f, 10f, 6f, 10f)
                horizontalLineTo(6.04f)
                lineTo(3.24f, 6f)
                horizontalLineTo(2f)
                curveTo(1.448f, 6f, 1f, 5.552f, 1f, 5f)
                verticalLineTo(2f)
                curveTo(1f, 1.448f, 1.448f, 1f, 2f, 1f)
                horizontalLineTo(5f)
                curveTo(5.552f, 1f, 6f, 1.448f, 6f, 2f)
                verticalLineTo(5f)
                curveTo(6f, 5.552f, 5.552f, 6f, 5f, 6f)
                horizontalLineTo(4.46f)
                lineTo(7.26f, 10f)
                horizontalLineTo(7.74f)
                lineTo(10.54f, 6f)
                horizontalLineTo(10f)
                curveTo(9.448f, 6f, 9f, 5.552f, 9f, 5f)
                verticalLineTo(2f)
                curveTo(9f, 1.448f, 9.448f, 1f, 10f, 1f)
                horizontalLineTo(13f)
                curveTo(13.552f, 1f, 14f, 1.448f, 14f, 2f)
                verticalLineTo(5f)
                curveTo(14f, 5.552f, 13.552f, 6f, 13f, 6f)
                close()
                moveTo(5.001f, 2f)
                horizontalLineTo(2.001f)
                verticalLineTo(5f)
                horizontalLineTo(5.001f)
                verticalLineTo(2f)
                close()
                moveTo(6f, 14f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                close()
                moveTo(13f, 2f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(2f)
                close()
            }
        }.build()
        
        return _TypeHierarchySuper!!
    }

private var _TypeHierarchySuper: ImageVector? = null


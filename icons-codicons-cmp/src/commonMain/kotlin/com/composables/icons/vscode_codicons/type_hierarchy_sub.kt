package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.TypeHierarchySub: ImageVector
    get() {
        if (_TypeHierarchySub != null) return _TypeHierarchySub!!
        
        _TypeHierarchySub = ImageVector.Builder(
            name = "type-hierarchy-sub",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 10f)
                horizontalLineTo(11.76f)
                lineTo(8.96f, 6f)
                horizontalLineTo(9f)
                curveTo(9.552f, 6f, 10f, 5.552f, 10f, 5f)
                verticalLineTo(2f)
                curveTo(10f, 1.448f, 9.552f, 1f, 9f, 1f)
                horizontalLineTo(6f)
                curveTo(5.448f, 1f, 5f, 1.448f, 5f, 2f)
                verticalLineTo(5f)
                curveTo(5f, 5.552f, 5.448f, 6f, 6f, 6f)
                horizontalLineTo(6.04f)
                lineTo(3.24f, 10f)
                horizontalLineTo(2f)
                curveTo(1.448f, 10f, 1f, 10.448f, 1f, 11f)
                verticalLineTo(14f)
                curveTo(1f, 14.552f, 1.448f, 15f, 2f, 15f)
                horizontalLineTo(5f)
                curveTo(5.552f, 15f, 6f, 14.552f, 6f, 14f)
                verticalLineTo(11f)
                curveTo(6f, 10.448f, 5.552f, 10f, 5f, 10f)
                horizontalLineTo(4.46f)
                lineTo(7.26f, 6f)
                horizontalLineTo(7.74f)
                lineTo(10.54f, 10f)
                horizontalLineTo(10f)
                curveTo(9.448f, 10f, 9f, 10.448f, 9f, 11f)
                verticalLineTo(14f)
                curveTo(9f, 14.552f, 9.448f, 15f, 10f, 15f)
                horizontalLineTo(13f)
                curveTo(13.552f, 15f, 14f, 14.552f, 14f, 14f)
                verticalLineTo(11f)
                curveTo(14f, 10.448f, 13.552f, 10f, 13f, 10f)
                close()
                moveTo(5.001f, 14f)
                horizontalLineTo(2.001f)
                verticalLineTo(11f)
                horizontalLineTo(5.001f)
                verticalLineTo(14f)
                close()
                moveTo(6f, 2f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                verticalLineTo(2f)
                close()
                moveTo(13f, 14f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                close()
            }
        }.build()
        
        return _TypeHierarchySub!!
    }

private var _TypeHierarchySub: ImageVector? = null


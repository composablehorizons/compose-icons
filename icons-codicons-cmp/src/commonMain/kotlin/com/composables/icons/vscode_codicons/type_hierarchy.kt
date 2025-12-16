package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.TypeHierarchy: ImageVector
    get() {
        if (_TypeHierarchy != null) return _TypeHierarchy!!
        
        _TypeHierarchy = ImageVector.Builder(
            name = "type-hierarchy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                curveTo(6.61929f, 1f, 5.5f, 2.11929f, 5.5f, 3.5f)
                curveTo(5.5f, 4.7093f, 6.35863f, 5.71806f, 7.4995f, 5.94989f)
                verticalLineTo(6.99994f)
                horizontalLineTo(5.36684f)
                curveTo(4.61209f, 6.99994f, 4.00024f, 7.61178f, 4.00024f, 8.36653f)
                verticalLineTo(10.05f)
                curveTo(2.859f, 10.2815f, 2f, 11.2904f, 2f, 12.5f)
                curveTo(2f, 13.8807f, 3.11929f, 15f, 4.5f, 15f)
                curveTo(5.88071f, 15f, 7f, 13.8807f, 7f, 12.5f)
                curveTo(7f, 11.2906f, 6.14124f, 10.2818f, 5.00024f, 10.0501f)
                verticalLineTo(8.36653f)
                curveTo(5.00024f, 8.16407f, 5.16437f, 7.99994f, 5.36684f, 7.99994f)
                horizontalLineTo(10.6337f)
                curveTo(10.8361f, 7.99994f, 11.0002f, 8.16407f, 11.0002f, 8.36653f)
                verticalLineTo(10.05f)
                curveTo(9.859f, 10.2815f, 9f, 11.2904f, 9f, 12.5f)
                curveTo(9f, 13.8807f, 10.1193f, 15f, 11.5f, 15f)
                curveTo(12.8807f, 15f, 14f, 13.8807f, 14f, 12.5f)
                curveTo(14f, 11.2906f, 13.1412f, 10.2818f, 12.0002f, 10.0501f)
                verticalLineTo(8.36653f)
                curveTo(12.0002f, 7.61178f, 11.3884f, 6.99994f, 10.6337f, 6.99994f)
                horizontalLineTo(8.4995f)
                verticalLineTo(5.95009f)
                curveTo(9.64087f, 5.71865f, 10.5f, 4.70966f, 10.5f, 3.5f)
                curveTo(10.5f, 2.11929f, 9.38071f, 1f, 8f, 1f)
                close()
                moveTo(6.5f, 3.5f)
                curveTo(6.5f, 2.67157f, 7.17157f, 2f, 8f, 2f)
                curveTo(8.82843f, 2f, 9.5f, 2.67157f, 9.5f, 3.5f)
                curveTo(9.5f, 4.32843f, 8.82843f, 5f, 8f, 5f)
                curveTo(7.17157f, 5f, 6.5f, 4.32843f, 6.5f, 3.5f)
                close()
                moveTo(3f, 12.5f)
                curveTo(3f, 11.6716f, 3.67157f, 11f, 4.5f, 11f)
                curveTo(5.32843f, 11f, 6f, 11.6716f, 6f, 12.5f)
                curveTo(6f, 13.3284f, 5.32843f, 14f, 4.5f, 14f)
                curveTo(3.67157f, 14f, 3f, 13.3284f, 3f, 12.5f)
                close()
                moveTo(11.5f, 11f)
                curveTo(12.3284f, 11f, 13f, 11.6716f, 13f, 12.5f)
                curveTo(13f, 13.3284f, 12.3284f, 14f, 11.5f, 14f)
                curveTo(10.6716f, 14f, 10f, 13.3284f, 10f, 12.5f)
                curveTo(10f, 11.6716f, 10.6716f, 11f, 11.5f, 11f)
                close()
            }
        }.build()
        
        return _TypeHierarchy!!
    }

private var _TypeHierarchy: ImageVector? = null


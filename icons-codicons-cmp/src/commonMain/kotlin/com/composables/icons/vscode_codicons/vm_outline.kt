package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.VmOutline: ImageVector
    get() {
        if (_VmOutline != null) return _VmOutline!!
        
        _VmOutline = ImageVector.Builder(
            name = "vm-outline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.607f, 14f)
                curveTo(6.79f, 14.357f, 7.007f, 14.693f, 7.261f, 15f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 15f, 3f, 14.776f, 3f, 14.5f)
                curveTo(3f, 14.224f, 3.224f, 14f, 3.5f, 14f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                curveTo(1.895f, 12f, 1f, 11.105f, 1f, 10f)
                verticalLineTo(3f)
                curveTo(1f, 1.895f, 1.895f, 1f, 3f, 1f)
                horizontalLineTo(13f)
                curveTo(14.105f, 1f, 15f, 1.895f, 15f, 3f)
                verticalLineTo(7.261f)
                curveTo(14.693f, 7.008f, 14.357f, 6.791f, 14f, 6.607f)
                verticalLineTo(3f)
                curveTo(14f, 2.448f, 13.552f, 2f, 13f, 2f)
                horizontalLineTo(3f)
                curveTo(2.448f, 2f, 2f, 2.448f, 2f, 3f)
                verticalLineTo(10f)
                curveTo(2f, 10.552f, 2.448f, 11f, 3f, 11f)
                horizontalLineTo(6.025f)
                curveTo(6.01f, 11.165f, 6f, 11.331f, 6f, 11.5f)
                curveTo(6f, 11.669f, 6.01f, 11.835f, 6.025f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(6.607f)
                close()
                moveTo(16f, 11.5f)
                curveTo(16f, 13.981f, 13.981f, 16f, 11.5f, 16f)
                curveTo(9.019f, 16f, 7f, 13.981f, 7f, 11.5f)
                curveTo(7f, 9.019f, 9.019f, 7f, 11.5f, 7f)
                curveTo(13.981f, 7f, 16f, 9.019f, 16f, 11.5f)
                close()
                moveTo(15f, 11.5f)
                curveTo(15f, 9.57f, 13.43f, 8f, 11.5f, 8f)
                curveTo(9.57f, 8f, 8f, 9.57f, 8f, 11.5f)
                curveTo(8f, 13.43f, 9.57f, 15f, 11.5f, 15f)
                curveTo(13.43f, 15f, 15f, 13.43f, 15f, 11.5f)
                close()
            }
        }.build()
        
        return _VmOutline!!
    }

private var _VmOutline: ImageVector? = null


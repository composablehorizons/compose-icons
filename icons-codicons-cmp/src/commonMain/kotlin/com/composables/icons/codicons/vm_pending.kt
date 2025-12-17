package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.VmPending: ImageVector
    get() {
        if (_VmPending != null) return _VmPending!!
        
        _VmPending = ImageVector.Builder(
            name = "vm-pending",
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
                curveTo(16f, 13.985f, 13.985f, 16f, 11.5f, 16f)
                curveTo(9.015f, 16f, 7f, 13.985f, 7f, 11.5f)
                curveTo(7f, 9.015f, 9.015f, 7f, 11.5f, 7f)
                curveTo(13.985f, 7f, 16f, 9.015f, 16f, 11.5f)
                close()
                moveTo(14f, 11.5f)
                curveTo(14f, 11.224f, 13.776f, 11f, 13.5f, 11f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                curveTo(12f, 8.724f, 11.776f, 8.5f, 11.5f, 8.5f)
                curveTo(11.224f, 8.5f, 11f, 8.724f, 11f, 9f)
                verticalLineTo(11.5f)
                curveTo(11f, 11.776f, 11.224f, 12f, 11.5f, 12f)
                horizontalLineTo(13.5f)
                curveTo(13.776f, 12f, 14f, 11.776f, 14f, 11.5f)
                close()
            }
        }.build()
        
        return _VmPending!!
    }

private var _VmPending: ImageVector? = null


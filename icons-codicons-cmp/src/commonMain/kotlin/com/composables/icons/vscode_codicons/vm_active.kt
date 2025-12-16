package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.VmActive: ImageVector
    get() {
        if (_VmActive != null) return _VmActive!!
        
        _VmActive = ImageVector.Builder(
            name = "vm-active",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 7f)
                curveTo(13.985f, 7f, 16f, 9.015f, 16f, 11.5f)
                curveTo(16f, 13.985f, 13.985f, 16f, 11.5f, 16f)
                curveTo(9.015f, 16f, 7f, 13.985f, 7f, 11.5f)
                curveTo(7f, 9.015f, 9.015f, 7f, 11.5f, 7f)
                close()
                moveTo(13.8535f, 10.1465f)
                curveTo(13.6583f, 9.95123f, 13.3417f, 9.95124f, 13.1465f, 10.1465f)
                lineTo(11f, 12.293f)
                lineTo(9.85352f, 11.1465f)
                curveTo(9.65826f, 10.9512f, 9.34175f, 10.9512f, 9.14648f, 11.1465f)
                curveTo(8.95122f, 11.3417f, 8.95122f, 11.6583f, 9.14648f, 11.8535f)
                lineTo(10.6465f, 13.3535f)
                curveTo(10.8417f, 13.5488f, 11.1583f, 13.5488f, 11.3535f, 13.3535f)
                lineTo(13.8535f, 10.8535f)
                curveTo(14.0488f, 10.6583f, 14.0488f, 10.3417f, 13.8535f, 10.1465f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 1f)
                curveTo(14.105f, 1f, 15f, 1.895f, 15f, 3f)
                verticalLineTo(7.26074f)
                curveTo(14.6931f, 7.00683f, 14.3569f, 6.79038f, 14f, 6.60742f)
                verticalLineTo(3f)
                curveTo(14f, 2.448f, 13.552f, 2f, 13f, 2f)
                horizontalLineTo(3f)
                curveTo(2.448f, 2f, 2f, 2.448f, 2f, 3f)
                verticalLineTo(10f)
                curveTo(2f, 10.552f, 2.448f, 11f, 3f, 11f)
                horizontalLineTo(6.02539f)
                curveTo(6.01039f, 11.165f, 6f, 11.331f, 6f, 11.5f)
                curveTo(6f, 11.669f, 6.01039f, 11.835f, 6.02539f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(6.60742f)
                curveTo(6.79038f, 14.3569f, 7.00683f, 14.6931f, 7.26074f, 15f)
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
                close()
            }
        }.build()
        
        return _VmActive!!
    }

private var _VmActive: ImageVector? = null


package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DiffMultiple: ImageVector
    get() {
        if (_DiffMultiple != null) return _DiffMultiple!!
        
        _DiffMultiple = ImageVector.Builder(
            name = "diff-multiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 12f)
                verticalLineTo(4.414f)
                curveTo(13f, 4.014f, 12.844f, 3.637f, 12.561f, 3.353f)
                lineTo(9.64602f, 0.439f)
                curveTo(9.36302f, 0.156f, 8.98602f, 0f, 8.58502f, 0f)
                horizontalLineTo(3.99902f)
                curveTo(2.89602f, 0f, 1.99902f, 0.897f, 1.99902f, 2f)
                verticalLineTo(12f)
                curveTo(1.99902f, 13.103f, 2.89602f, 14f, 3.99902f, 14f)
                horizontalLineTo(10.999f)
                curveTo(12.102f, 14f, 12.999f, 13.103f, 12.999f, 12f)
                horizontalLineTo(13f)
                close()
                moveTo(3.00002f, 12f)
                verticalLineTo(2f)
                curveTo(3.00002f, 1.449f, 3.44902f, 1f, 4.00002f, 1f)
                horizontalLineTo(8.58602f)
                curveTo(8.71702f, 1f, 8.84602f, 1.053f, 8.94002f, 1.146f)
                lineTo(11.854f, 4.06f)
                curveTo(11.947f, 4.153f, 12f, 4.282f, 12f, 4.414f)
                verticalLineTo(12f)
                curveTo(12f, 12.551f, 11.551f, 13f, 11f, 13f)
                horizontalLineTo(4.00002f)
                curveTo(3.44902f, 13f, 3.00002f, 12.551f, 3.00002f, 12f)
                close()
                moveTo(15f, 6.41f)
                verticalLineTo(12f)
                curveTo(15f, 14.21f, 13.21f, 16f, 11f, 16f)
                horizontalLineTo(6.00002f)
                curveTo(5.26002f, 16f, 4.62002f, 15.6f, 4.27002f, 15f)
                horizontalLineTo(11f)
                curveTo(12.65f, 15f, 14f, 13.65f, 14f, 12f)
                verticalLineTo(4.79f)
                lineTo(14.56f, 5.35f)
                curveTo(14.84f, 5.64f, 15f, 6.01f, 15f, 6.41f)
                close()
                moveTo(10f, 5.499f)
                curveTo(10f, 5.775f, 9.77602f, 5.999f, 9.50002f, 5.999f)
                horizontalLineTo(8.00002f)
                verticalLineTo(7.499f)
                curveTo(8.00002f, 7.775f, 7.77602f, 7.999f, 7.50002f, 7.999f)
                curveTo(7.22402f, 7.999f, 7.00002f, 7.775f, 7.00002f, 7.499f)
                verticalLineTo(5.999f)
                horizontalLineTo(5.50002f)
                curveTo(5.22402f, 5.999f, 5.00002f, 5.775f, 5.00002f, 5.499f)
                curveTo(5.00002f, 5.223f, 5.22402f, 4.999f, 5.50002f, 4.999f)
                horizontalLineTo(7.00002f)
                verticalLineTo(3.499f)
                curveTo(7.00002f, 3.223f, 7.22402f, 2.999f, 7.50002f, 2.999f)
                curveTo(7.77602f, 2.999f, 8.00002f, 3.223f, 8.00002f, 3.499f)
                verticalLineTo(4.999f)
                horizontalLineTo(9.50002f)
                curveTo(9.77602f, 4.999f, 10f, 5.223f, 10f, 5.499f)
                close()
                moveTo(10f, 10.499f)
                curveTo(10f, 10.775f, 9.77602f, 10.999f, 9.50002f, 10.999f)
                horizontalLineTo(5.50002f)
                curveTo(5.22402f, 10.999f, 5.00002f, 10.775f, 5.00002f, 10.499f)
                curveTo(5.00002f, 10.223f, 5.22402f, 9.999f, 5.50002f, 9.999f)
                horizontalLineTo(9.50002f)
                curveTo(9.77602f, 9.999f, 10f, 10.223f, 10f, 10.499f)
                close()
            }
        }.build()
        
        return _DiffMultiple!!
    }

private var _DiffMultiple: ImageVector? = null


package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileExcel: ImageVector
    get() {
        if (_FileExcel != null) return _FileExcel!!
        
        _FileExcel = ImageVector.Builder(
            name = "file-excel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 0f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                moveTo(5.884f, 4.68f)
                lineTo(8f, 7.219f)
                lineToRelative(2.116f, -2.54f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.768f, 0.641f)
                lineTo(8.651f, 8f)
                lineToRelative(2.233f, 2.68f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.768f, 0.64f)
                lineTo(8f, 8.781f)
                lineToRelative(-2.116f, 2.54f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.768f, -0.641f)
                lineTo(7.349f, 8f)
                lineTo(5.116f, 5.32f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.768f, -0.64f)
            }
        }.build()
        
        return _FileExcel!!
    }

private var _FileExcel: ImageVector? = null


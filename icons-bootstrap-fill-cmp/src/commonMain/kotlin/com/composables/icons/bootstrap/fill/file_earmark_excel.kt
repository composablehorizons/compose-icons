package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileEarmarkExcel: ImageVector
    get() {
        if (_FileEarmarkExcel != null) return _FileEarmarkExcel!!
        
        _FileEarmarkExcel = ImageVector.Builder(
            name = "file-earmark-excel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.293f, 0f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4.707f)
                arcTo(1f, 1f, 0f, false, false, 13.707f, 4f)
                lineTo(10f, 0.293f)
                arcTo(1f, 1f, 0f, false, false, 9.293f, 0f)
                moveTo(9.5f, 3.5f)
                verticalLineToRelative(-2f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                moveTo(5.884f, 6.68f)
                lineTo(8f, 9.219f)
                lineToRelative(2.116f, -2.54f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.768f, 0.641f)
                lineTo(8.651f, 10f)
                lineToRelative(2.233f, 2.68f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.768f, 0.64f)
                lineTo(8f, 10.781f)
                lineToRelative(-2.116f, 2.54f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.768f, -0.641f)
                lineTo(7.349f, 10f)
                lineTo(5.116f, 7.32f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.768f, -0.64f)
            }
        }.build()
        
        return _FileEarmarkExcel!!
    }

private var _FileEarmarkExcel: ImageVector? = null


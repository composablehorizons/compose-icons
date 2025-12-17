package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileEarmarkSpreadsheet: ImageVector
    get() {
        if (_FileEarmarkSpreadsheet != null) return _FileEarmarkSpreadsheet!!
        
        _FileEarmarkSpreadsheet = ImageVector.Builder(
            name = "file-earmark-spreadsheet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
            }
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
                moveTo(3f, 9f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                verticalLineToRelative(-2f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                close()
            }
        }.build()
        
        return _FileEarmarkSpreadsheet!!
    }

private var _FileEarmarkSpreadsheet: ImageVector? = null


package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileSpreadsheet: ImageVector
    get() {
        if (_FileSpreadsheet != null) return _FileSpreadsheet!!
        
        _FileSpreadsheet = ImageVector.Builder(
            name = "file-spreadsheet",
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
                verticalLineToRelative(4f)
                horizontalLineToRelative(12f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                moveToRelative(2f, 7f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                close()
                moveToRelative(0f, 3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                close()
                moveToRelative(0f, 3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                close()
                moveToRelative(-5f, 3f)
                verticalLineToRelative(-3f)
                horizontalLineTo(6f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(-4f, 0f)
                verticalLineToRelative(-3f)
                horizontalLineTo(2f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                close()
                moveToRelative(-3f, -4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineTo(2f)
                close()
                moveToRelative(0f, -3f)
                horizontalLineToRelative(3f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                close()
                moveToRelative(4f, 0f)
                verticalLineTo(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, 1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineTo(6f)
                close()
            }
        }.build()
        
        return _FileSpreadsheet!!
    }

private var _FileSpreadsheet: ImageVector? = null


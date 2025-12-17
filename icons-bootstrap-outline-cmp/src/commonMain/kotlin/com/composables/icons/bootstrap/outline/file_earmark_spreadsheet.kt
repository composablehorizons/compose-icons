package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FileEarmarkSpreadsheet: ImageVector
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
                moveTo(14f, 14f)
                verticalLineTo(4.5f)
                lineTo(9.5f, 0f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                moveTo(9.5f, 3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11f, 4.5f)
                horizontalLineToRelative(2f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(3f, 12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
                moveToRelative(3f, 2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(4f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                close()
                moveToRelative(3f, -3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                close()
                moveToRelative(-7f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _FileEarmarkSpreadsheet!!
    }

private var _FileEarmarkSpreadsheet: ImageVector? = null


package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FileMedical: ImageVector
    get() {
        if (_FileMedical != null) return _FileMedical!!
        
        _FileMedical = ImageVector.Builder(
            name = "file-medical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(0.634f)
                lineToRelative(-0.549f, -0.317f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.5f, 0.866f)
                lineTo(7f, 6f)
                lineToRelative(-0.549f, 0.317f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.5f, 0.866f)
                lineToRelative(0.549f, -0.317f)
                verticalLineTo(7.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                verticalLineToRelative(-0.634f)
                lineToRelative(0.549f, 0.317f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.5f, -0.866f)
                lineTo(9f, 6f)
                lineToRelative(0.549f, -0.317f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.5f, -0.866f)
                lineToRelative(-0.549f, 0.317f)
                close()
                moveTo(5.5f, 9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(0f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(10f, -1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
            }
        }.build()
        
        return _FileMedical!!
    }

private var _FileMedical: ImageVector? = null


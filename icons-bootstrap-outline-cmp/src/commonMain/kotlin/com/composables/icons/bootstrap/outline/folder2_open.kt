package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Folder2Open: ImageVector
    get() {
        if (_Folder2Open != null) return _Folder2Open!!
        
        _Folder2Open = ImageVector.Builder(
            name = "folder2-open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2.5f, 2f)
                horizontalLineToRelative(2.764f)
                curveToRelative(0.958f, 0f, 1.76f, 0.56f, 2.311f, 1.184f)
                curveTo(7.985f, 3.648f, 8.48f, 4f, 9f, 4f)
                horizontalLineToRelative(4.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 15f, 5.5f)
                verticalLineToRelative(0.64f)
                curveToRelative(0.57f, 0.265f, 0.94f, 0.876f, 0.856f, 1.546f)
                lineToRelative(-0.64f, 5.124f)
                arcTo(2.5f, 2.5f, 0f, false, true, 12.733f, 15f)
                horizontalLineTo(3.266f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.481f, -2.19f)
                lineToRelative(-0.64f, -5.124f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1f, 6.14f)
                close()
                moveTo(2f, 6f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(9f)
                curveToRelative(-0.964f, 0f, -1.71f, -0.629f, -2.174f, -1.154f)
                curveTo(6.374f, 3.334f, 5.82f, 3f, 5.264f, 3f)
                horizontalLineTo(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                close()
                moveToRelative(-0.367f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.496f, 0.562f)
                lineToRelative(0.64f, 5.124f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.266f, 14f)
                horizontalLineToRelative(9.468f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.489f, -1.314f)
                lineToRelative(0.64f, -5.124f)
                arcTo(0.5f, 0.5f, 0f, false, false, 14.367f, 7f)
                close()
            }
        }.build()
        
        return _Folder2Open!!
    }

private var _Folder2Open: ImageVector? = null


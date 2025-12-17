package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.FolderOpen: ImageVector
    get() {
        if (_FolderOpen != null) return _FolderOpen!!
        
        _FolderOpen = ImageVector.Builder(
            name = "folder-open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4.5f, 2f)
                horizontalLineToRelative(1.879f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.06f, 0.44f)
                lineToRelative(1.122f, 1.12f)
                arcTo(1.5f, 1.5f, 0f, false, false, 9.62f, 4f)
                horizontalLineTo(11.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 13f, 5.5f)
                verticalLineToRelative(1f)
                horizontalLineTo(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(3.081f, 8f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.423f, 1.974f)
                lineToRelative(1f, 3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4.081f, 14f)
                horizontalLineToRelative(7.838f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.423f, -1.026f)
                lineToRelative(1f, -3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 12.919f, 8f)
                horizontalLineTo(3.081f)
                close()
            }
        }.build()
        
        return _FolderOpen!!
    }

private var _FolderOpen: ImageVector? = null


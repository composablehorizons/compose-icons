package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FolderPlus: ImageVector
    get() {
        if (_FolderPlus != null) return _FolderPlus!!
        
        _FolderPlus = ImageVector.Builder(
            name = "folder-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(464f, 128f)
                horizontalLineTo(272f)
                lineTo(208f, 64f)
                horizontalLineTo(48f)
                arcTo(48f, 48f, 0f, false, false, 0f, 112f)
                verticalLineTo(400f)
                arcToRelative(48f, 48f, 0f, false, false, 48f, 48f)
                horizontalLineTo(464f)
                arcToRelative(48f, 48f, 0f, false, false, 48f, -48f)
                verticalLineTo(176f)
                arcTo(48f, 48f, 0f, false, false, 464f, 128f)
                close()
                moveTo(359.5f, 296f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, 16f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(64f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, 16f)
                horizontalLineToRelative(-16f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, -16f)
                verticalLineTo(312f)
                horizontalLineToRelative(-64f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, -16f)
                verticalLineTo(280f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, -16f)
                horizontalLineToRelative(64f)
                verticalLineTo(200f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, -16f)
                horizontalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, 16f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(64f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, 16f)
                close()
            }
        }.build()
        
        return _FolderPlus!!
    }

private var _FolderPlus: ImageVector? = null


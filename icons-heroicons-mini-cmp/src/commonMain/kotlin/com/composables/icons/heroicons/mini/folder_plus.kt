package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.FolderPlus: ImageVector
    get() {
        if (_FolderPlus != null) return _FolderPlus!!
        
        _FolderPlus = ImageVector.Builder(
            name = "folder-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.75f, 3f)
                arcTo(1.75f, 1.75f, 0f, false, false, 2f, 4.75f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(12.5f)
                arcTo(1.75f, 1.75f, 0f, false, false, 18f, 15.25f)
                verticalLineToRelative(-8.5f)
                arcTo(1.75f, 1.75f, 0f, false, false, 16.25f, 5f)
                horizontalLineToRelative(-4.836f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.177f, -0.073f)
                lineTo(9.823f, 3.513f)
                arcTo(1.75f, 1.75f, 0f, false, false, 8.586f, 3f)
                horizontalLineTo(3.75f)
                close()
                moveTo(10f, 8f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 10f, 8f)
                close()
            }
        }.build()
        
        return _FolderPlus!!
    }

private var _FolderPlus: ImageVector? = null


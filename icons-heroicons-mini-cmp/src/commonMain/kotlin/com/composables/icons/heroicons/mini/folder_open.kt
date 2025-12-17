package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.FolderOpen: ImageVector
    get() {
        if (_FolderOpen != null) return _FolderOpen!!
        
        _FolderOpen = ImageVector.Builder(
            name = "folder-open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.75f, 3f)
                arcTo(1.75f, 1.75f, 0f, false, false, 3f, 4.75f)
                verticalLineToRelative(2.752f)
                lineToRelative(0.104f, -0.002f)
                horizontalLineToRelative(13.792f)
                curveToRelative(0.035f, 0f, 0.07f, 0f, 0.104f, 0.002f)
                verticalLineTo(6.75f)
                arcTo(1.75f, 1.75f, 0f, false, false, 15.25f, 5f)
                horizontalLineToRelative(-3.836f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.177f, -0.073f)
                lineTo(9.823f, 3.513f)
                arcTo(1.75f, 1.75f, 0f, false, false, 8.586f, 3f)
                horizontalLineTo(4.75f)
                close()
                moveTo(3.104f, 9f)
                arcToRelative(1.75f, 1.75f, 0f, false, false, -1.673f, 2.265f)
                lineToRelative(1.385f, 4.5f)
                arcTo(1.75f, 1.75f, 0f, false, false, 4.488f, 17f)
                horizontalLineToRelative(11.023f)
                arcToRelative(1.75f, 1.75f, 0f, false, false, 1.673f, -1.235f)
                lineToRelative(1.384f, -4.5f)
                arcTo(1.75f, 1.75f, 0f, false, false, 16.896f, 9f)
                horizontalLineTo(3.104f)
                close()
            }
        }.build()
        
        return _FolderOpen!!
    }

private var _FolderOpen: ImageVector? = null


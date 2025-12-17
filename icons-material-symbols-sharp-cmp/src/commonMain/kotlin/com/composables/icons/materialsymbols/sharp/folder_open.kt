package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Folder_open: ImageVector
    get() {
        if (_Folder_open != null) return _Folder_open!!
        
        _Folder_open = ImageVector.Builder(
            name = "folder_open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(320f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(447f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                lineToRelative(96f, -320f)
                horizontalLineToRelative(684f)
                lineTo(820f, 800f)
                horizontalLineTo(80f)
                close()
                moveToRelative(164f, -80f)
                horizontalLineToRelative(516f)
                lineToRelative(72f, -240f)
                horizontalLineTo(316f)
                lineToRelative(-72f, 240f)
                close()
                moveToRelative(0f, 0f)
                lineToRelative(72f, -240f)
                lineToRelative(-72f, 240f)
                close()
                moveToRelative(-84f, -400f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Folder_open!!
    }

private var _Folder_open: ImageVector? = null


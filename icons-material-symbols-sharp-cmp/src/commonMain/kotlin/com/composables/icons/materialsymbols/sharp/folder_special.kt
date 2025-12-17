package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Folder_special: ImageVector
    get() {
        if (_Folder_special != null) return _Folder_special!!
        
        _Folder_special = ImageVector.Builder(
            name = "folder_special",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(504f, 668f)
                lineToRelative(92f, -70f)
                lineToRelative(92f, 70f)
                lineToRelative(-34f, -114f)
                lineToRelative(92f, -74f)
                horizontalLineTo(632f)
                lineToRelative(-36f, -112f)
                lineToRelative(-36f, 112f)
                horizontalLineTo(446f)
                lineToRelative(92f, 74f)
                lineToRelative(-34f, 114f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(320f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(560f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-400f)
                horizontalLineTo(447f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Folder_special!!
    }

private var _Folder_special: ImageVector? = null


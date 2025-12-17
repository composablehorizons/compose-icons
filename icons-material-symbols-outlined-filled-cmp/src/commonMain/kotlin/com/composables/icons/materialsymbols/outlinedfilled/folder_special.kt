package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Folder_special: ImageVector
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
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(240f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(344f, -132f)
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
            }
        }.build()
        
        return _Folder_special!!
    }

private var _Folder_special: ImageVector? = null


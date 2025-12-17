package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Folder_open: ImageVector
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
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                lineToRelative(96f, -320f)
                horizontalLineToRelative(684f)
                lineTo(837f, 743f)
                quadToRelative(-8f, 26f, -29.5f, 41.5f)
                reflectiveQuadTo(760f, 800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Folder_open!!
    }

private var _Folder_open: ImageVector? = null


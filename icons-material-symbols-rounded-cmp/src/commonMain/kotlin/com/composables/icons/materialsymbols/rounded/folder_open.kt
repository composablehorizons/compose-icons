package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Folder_open: ImageVector
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
                horizontalLineToRelative(207f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(57f, 57f)
                horizontalLineToRelative(360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 320f)
                horizontalLineTo(447f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                lineToRelative(79f, -263f)
                quadToRelative(8f, -26f, 29.5f, -41.5f)
                reflectiveQuadTo(316f, 400f)
                horizontalLineToRelative(516f)
                quadToRelative(41f, 0f, 64.5f, 32.5f)
                reflectiveQuadTo(909f, 503f)
                lineToRelative(-72f, 240f)
                quadToRelative(-8f, 26f, -29.5f, 41.5f)
                reflectiveQuadTo(760f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(84f, -80f)
                horizontalLineToRelative(516f)
                lineToRelative(72f, -240f)
                horizontalLineTo(316f)
                lineToRelative(-72f, 240f)
                close()
                moveToRelative(-84f, -262f)
                verticalLineToRelative(-218f)
                verticalLineToRelative(218f)
                close()
                moveToRelative(84f, 262f)
                lineToRelative(72f, -240f)
                lineToRelative(-72f, 240f)
                close()
            }
        }.build()
        
        return _Folder_open!!
    }

private var _Folder_open: ImageVector? = null


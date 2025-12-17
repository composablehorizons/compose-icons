package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Folder_supervised: ImageVector
    get() {
        if (_Folder_supervised != null) return _Folder_supervised!!
        
        _Folder_supervised = ImageVector.Builder(
            name = "folder_supervised",
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
                verticalLineToRelative(131f)
                quadToRelative(-35f, -25f, -76f, -38f)
                reflectiveQuadToRelative(-85f, -13f)
                quadToRelative(-118f, 0f, -198.5f, 82.5f)
                reflectiveQuadTo(440f, 679f)
                quadToRelative(0f, 32f, 7f, 62f)
                reflectiveQuadToRelative(21f, 59f)
                horizontalLineTo(160f)
                close()
                moveToRelative(400f, 0f)
                verticalLineToRelative(-22f)
                quadToRelative(0f, -45f, 44f, -71.5f)
                reflectiveQuadTo(720f, 680f)
                quadToRelative(72f, 0f, 116f, 26.5f)
                reflectiveQuadToRelative(44f, 71.5f)
                verticalLineToRelative(22f)
                horizontalLineTo(560f)
                close()
                moveToRelative(160f, -160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(640f, 560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 640f)
                close()
            }
        }.build()
        
        return _Folder_supervised!!
    }

private var _Folder_supervised: ImageVector? = null


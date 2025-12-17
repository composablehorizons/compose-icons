package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Folder_supervised: ImageVector
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
                moveTo(160f, 720f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(172f)
                verticalLineToRelative(-12f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(0f, 80f)
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
                quadToRelative(-18f, -13f, -38f, -22.5f)
                reflectiveQuadTo(800f, 412f)
                verticalLineToRelative(-92f)
                horizontalLineTo(447f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(283f)
                quadToRelative(3f, 21f, 9.5f, 41f)
                reflectiveQuadToRelative(15.5f, 39f)
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


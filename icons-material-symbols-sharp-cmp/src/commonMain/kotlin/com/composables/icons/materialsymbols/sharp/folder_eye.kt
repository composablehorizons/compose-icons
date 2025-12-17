package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Folder_eye: ImageVector
    get() {
        if (_Folder_eye != null) return _Folder_eye!!
        
        _Folder_eye = ImageVector.Builder(
            name = "folder_eye",
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
                verticalLineToRelative(322f)
                quadToRelative(-18f, -14f, -38f, -23f)
                reflectiveQuadToRelative(-42f, -19f)
                verticalLineToRelative(-200f)
                horizontalLineTo(447f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveTo(640f, 920f)
                quadToRelative(-91f, 0f, -168f, -48f)
                reflectiveQuadTo(360f, 740f)
                quadToRelative(35f, -84f, 112f, -132f)
                reflectiveQuadToRelative(168f, -48f)
                quadToRelative(91f, 0f, 168f, 48f)
                reflectiveQuadToRelative(112f, 132f)
                quadToRelative(-35f, 84f, -112f, 132f)
                reflectiveQuadTo(640f, 920f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(57f, 0f, 107.5f, -26f)
                reflectiveQuadToRelative(82.5f, -74f)
                quadToRelative(-32f, -48f, -82.5f, -74f)
                reflectiveQuadTo(640f, 640f)
                quadToRelative(-57f, 0f, -107.5f, 26f)
                reflectiveQuadTo(450f, 740f)
                quadToRelative(32f, 48f, 82.5f, 74f)
                reflectiveQuadTo(640f, 840f)
                close()
                moveToRelative(0f, -40f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(580f, 740f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(640f, 680f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(700f, 740f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(640f, 800f)
                close()
                moveToRelative(-480f, -80f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(277f)
                verticalLineToRelative(-37f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Folder_eye!!
    }

private var _Folder_eye: ImageVector? = null


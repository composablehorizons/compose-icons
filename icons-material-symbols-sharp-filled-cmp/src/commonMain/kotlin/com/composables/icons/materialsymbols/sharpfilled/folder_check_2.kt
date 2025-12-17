package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Folder_check_2: ImageVector
    get() {
        if (_Folder_check_2 != null) return _Folder_check_2!!
        
        _Folder_check_2 = ImageVector.Builder(
            name = "folder_check_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                close()
                moveTo(440f, 720f)
                quadToRelative(0f, 21f, 3f, 41f)
                reflectiveQuadToRelative(9f, 39f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(320f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(251f)
                quadToRelative(-35f, -25f, -76f, -38f)
                reflectiveQuadToRelative(-84f, -13f)
                quadToRelative(-116f, 0f, -198f, 82f)
                reflectiveQuadToRelative(-82f, 198f)
                close()
                moveToRelative(251f, 90f)
                lineToRelative(139f, -138f)
                lineToRelative(-42f, -42f)
                lineToRelative(-97f, 95f)
                lineToRelative(-39f, -39f)
                lineToRelative(-42f, 43f)
                lineToRelative(81f, 81f)
                close()
            }
        }.build()
        
        return _Folder_check_2!!
    }

private var _Folder_check_2: ImageVector? = null


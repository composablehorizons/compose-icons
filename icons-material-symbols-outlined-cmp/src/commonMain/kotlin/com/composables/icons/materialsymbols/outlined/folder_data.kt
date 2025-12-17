package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Folder_data: ImageVector
    get() {
        if (_Folder_data != null) return _Folder_data!!
        
        _Folder_data = ImageVector.Builder(
            name = "folder_data",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(520f, 840f)
                quadToRelative(0f, -23f, 11f, -41f)
                reflectiveQuadToRelative(29f, -29f)
                verticalLineToRelative(-221f)
                quadToRelative(-18f, -11f, -29f, -28.5f)
                reflectiveQuadTo(520f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(600f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, 23f, -11f, 40.5f)
                reflectiveQuadTo(640f, 549f)
                verticalLineToRelative(115f)
                lineToRelative(160f, -53f)
                verticalLineToRelative(-62f)
                quadToRelative(-18f, -11f, -29f, -28.5f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(840f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 480f)
                quadToRelative(0f, 23f, -11f, 40.5f)
                reflectiveQuadTo(880f, 549f)
                verticalLineToRelative(119f)
                lineToRelative(-240f, 80f)
                verticalLineToRelative(22f)
                quadToRelative(18f, 11f, 29f, 29f)
                reflectiveQuadToRelative(11f, 41f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 920f)
                close()
                moveTo(160f, 800f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, 0f)
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
                horizontalLineTo(447f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Folder_data!!
    }

private var _Folder_data: ImageVector? = null


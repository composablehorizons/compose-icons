package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Folder_data: ImageVector
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
                verticalLineToRelative(61f)
                quadToRelative(0f, 26f, -15f, 47f)
                reflectiveQuadToRelative(-40f, 29f)
                lineToRelative(-185f, 62f)
                verticalLineToRelative(22f)
                quadToRelative(18f, 11f, 29f, 29f)
                reflectiveQuadToRelative(11f, 41f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 920f)
                close()
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
                horizontalLineTo(600f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 31f, 10.5f, 58f)
                reflectiveQuadToRelative(29.5f, 48f)
                verticalLineToRelative(148f)
                quadToRelative(-13f, 14f, -21.5f, 30.5f)
                reflectiveQuadTo(445f, 800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Folder_data!!
    }

private var _Folder_data: ImageVector? = null


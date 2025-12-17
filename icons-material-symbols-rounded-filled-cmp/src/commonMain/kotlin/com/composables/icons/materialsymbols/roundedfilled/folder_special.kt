package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Folder_special: ImageVector
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
                horizontalLineToRelative(207f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(57f, 57f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(436f, -202f)
                lineToRelative(68f, 51f)
                quadToRelative(6f, 5f, 11.5f, 1f)
                reflectiveQuadToRelative(3.5f, -11f)
                lineToRelative(-25f, -85f)
                lineToRelative(70f, -56f)
                quadToRelative(5f, -5f, 3f, -11.5f)
                reflectiveQuadToRelative(-9f, -6.5f)
                horizontalLineToRelative(-86f)
                lineToRelative(-26f, -82f)
                quadToRelative(-2f, -7f, -10f, -7f)
                reflectiveQuadToRelative(-10f, 7f)
                lineToRelative(-26f, 82f)
                horizontalLineToRelative(-86f)
                quadToRelative(-7f, 0f, -9f, 6.5f)
                reflectiveQuadToRelative(3f, 11.5f)
                lineToRelative(70f, 56f)
                lineToRelative(-25f, 85f)
                quadToRelative(-2f, 7f, 3.5f, 11f)
                reflectiveQuadToRelative(11.5f, -1f)
                lineToRelative(68f, -51f)
                close()
            }
        }.build()
        
        return _Folder_special!!
    }

private var _Folder_special: ImageVector? = null


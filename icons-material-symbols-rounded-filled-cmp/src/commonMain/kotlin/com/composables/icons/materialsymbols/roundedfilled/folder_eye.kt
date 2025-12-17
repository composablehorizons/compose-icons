package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Folder_eye: ImageVector
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
                verticalLineToRelative(176f)
                quadToRelative(0f, 23f, -20.5f, 33.5f)
                reflectiveQuadTo(819f, 528f)
                quadToRelative(-42f, -23f, -86.5f, -35.5f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(-134f, 0f, -235.5f, 85f)
                reflectiveQuadTo(261f, 773f)
                quadToRelative(-4f, 12f, -14f, 19.5f)
                reflectiveQuadToRelative(-22f, 7.5f)
                horizontalLineToRelative(-65f)
                close()
                moveTo(640f, 920f)
                quadToRelative(-79f, 0f, -147.5f, -36f)
                reflectiveQuadTo(382f, 782f)
                quadToRelative(-6f, -9f, -9f, -19.5f)
                reflectiveQuadToRelative(-3f, -21.5f)
                quadToRelative(0f, -11f, 3f, -22f)
                reflectiveQuadToRelative(9f, -21f)
                quadToRelative(42f, -66f, 110.5f, -102f)
                reflectiveQuadTo(640f, 560f)
                quadToRelative(79f, 0f, 147.5f, 36f)
                reflectiveQuadTo(898f, 698f)
                quadToRelative(6f, 10f, 9f, 20.5f)
                reflectiveQuadToRelative(3f, 21.5f)
                quadToRelative(0f, 11f, -3f, 21.5f)
                reflectiveQuadToRelative(-9f, 20.5f)
                quadToRelative(-42f, 66f, -110.5f, 102f)
                reflectiveQuadTo(640f, 920f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
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
            }
        }.build()
        
        return _Folder_eye!!
    }

private var _Folder_eye: ImageVector? = null


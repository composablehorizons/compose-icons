package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Folder_supervised: ImageVector
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
                horizontalLineToRelative(207f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(57f, 57f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(76f)
                quadToRelative(0f, 18f, -15.5f, 27f)
                reflectiveQuadToRelative(-32.5f, 1f)
                quadToRelative(-26f, -12f, -55f, -18f)
                reflectiveQuadToRelative(-58f, -6f)
                quadToRelative(-118f, 0f, -198.5f, 82.5f)
                reflectiveQuadTo(440f, 679f)
                quadToRelative(0f, 19f, 2.5f, 37.5f)
                reflectiveQuadTo(450f, 753f)
                quadToRelative(5f, 18f, -5f, 32.5f)
                reflectiveQuadTo(418f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(440f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 760f)
                quadToRelative(0f, -31f, 44f, -55.5f)
                reflectiveQuadTo(720f, 680f)
                quadToRelative(72f, 0f, 116f, 24.5f)
                reflectiveQuadToRelative(44f, 55.5f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 800f)
                horizontalLineTo(600f)
                close()
                moveToRelative(120f, -160f)
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


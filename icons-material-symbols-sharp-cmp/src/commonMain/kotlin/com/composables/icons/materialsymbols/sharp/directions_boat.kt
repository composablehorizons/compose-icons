package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Directions_boat: ImageVector
    get() {
        if (_Directions_boat != null) return _Directions_boat!!
        
        _Directions_boat = ImageVector.Builder(
            name = "directions_boat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(479f, 542f)
                close()
                moveTo(158f, 760f)
                lineTo(71f, 455f)
                lineToRelative(89f, -31f)
                verticalLineToRelative(-264f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(264f)
                lineToRelative(89f, 31f)
                lineToRelative(-87f, 305f)
                quadToRelative(-50f, 0f, -91f, -23.5f)
                reflectiveQuadTo(640f, 680f)
                quadToRelative(-30f, 33f, -71f, 56.5f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(-48f, 0f, -89f, -23.5f)
                reflectiveQuadTo(320f, 680f)
                quadToRelative(-30f, 33f, -71f, 56.5f)
                reflectiveQuadTo(158f, 760f)
                close()
                moveTo(80f, 920f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                quadToRelative(42f, 0f, 83f, -13f)
                reflectiveQuadToRelative(77f, -39f)
                quadToRelative(36f, 26f, 77f, 38f)
                reflectiveQuadToRelative(83f, 12f)
                quadToRelative(42f, 0f, 83f, -12f)
                reflectiveQuadToRelative(77f, -38f)
                quadToRelative(36f, 26f, 77f, 39f)
                reflectiveQuadToRelative(83f, 13f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                quadToRelative(-42f, 0f, -82f, -10f)
                reflectiveQuadToRelative(-78f, -30f)
                quadToRelative(-38f, 20f, -78.5f, 30f)
                reflectiveQuadTo(480f, 920f)
                quadToRelative(-41f, 0f, -81.5f, -10f)
                reflectiveQuadTo(320f, 880f)
                quadToRelative(-38f, 20f, -78f, 30f)
                reflectiveQuadToRelative(-82f, 10f)
                horizontalLineTo(80f)
                close()
                moveToRelative(160f, -522f)
                lineToRelative(240f, -78f)
                lineToRelative(240f, 78f)
                verticalLineToRelative(-158f)
                horizontalLineTo(240f)
                verticalLineToRelative(158f)
                close()
                moveToRelative(240f, 282f)
                quadToRelative(47f, 0f, 79.5f, -33f)
                reflectiveQuadToRelative(80.5f, -89f)
                quadToRelative(48f, 54f, 65f, 74f)
                reflectiveQuadToRelative(41f, 34f)
                lineToRelative(44f, -160f)
                lineToRelative(-310f, -102f)
                lineToRelative(-312f, 102f)
                lineToRelative(46f, 158f)
                quadToRelative(24f, -14f, 41f, -32f)
                reflectiveQuadToRelative(65f, -74f)
                quadToRelative(50f, 57f, 81.5f, 89.5f)
                reflectiveQuadTo(480f, 680f)
                close()
            }
        }.build()
        
        return _Directions_boat!!
    }

private var _Directions_boat: ImageVector? = null


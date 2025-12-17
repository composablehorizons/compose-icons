package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Ent: ImageVector
    get() {
        if (_Ent != null) return _Ent!!
        
        _Ent = ImageVector.Builder(
            name = "ent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(469f, 640f)
                horizontalLineToRelative(91f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 600f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 560f)
                horizontalLineToRelative(-83f)
                lineToRelative(5f, -44f)
                quadToRelative(2f, -15f, 13f, -25.5f)
                reflectiveQuadToRelative(26f, -10.5f)
                horizontalLineToRelative(119f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 440f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 400f)
                horizontalLineTo(522f)
                quadToRelative(-47f, 0f, -81f, 31f)
                reflectiveQuadToRelative(-39f, 77f)
                lineToRelative(-34f, 328f)
                quadToRelative(-2f, 17f, 10f, 30.5f)
                reflectiveQuadTo(408f, 880f)
                quadToRelative(15f, 0f, 26.5f, -10.5f)
                reflectiveQuadTo(448f, 844f)
                lineToRelative(21f, -204f)
                close()
                moveToRelative(-229f, 68f)
                quadToRelative(-57f, -52f, -88.5f, -121.5f)
                reflectiveQuadTo(120f, 440f)
                quadToRelative(0f, -150f, 105f, -255f)
                reflectiveQuadToRelative(255f, -105f)
                quadToRelative(125f, 0f, 221.5f, 73.5f)
                reflectiveQuadTo(827f, 345f)
                lineToRelative(52f, 205f)
                quadToRelative(5f, 19f, -7f, 34.5f)
                reflectiveQuadTo(840f, 600f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 800f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 840f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 720f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 520f)
                horizontalLineToRelative(68f)
                lineToRelative(-38f, -155f)
                quadToRelative(-23f, -91f, -98f, -148f)
                reflectiveQuadToRelative(-172f, -57f)
                quadToRelative(-116f, 0f, -198f, 81f)
                reflectiveQuadToRelative(-82f, 197f)
                quadToRelative(0f, 60f, 24.5f, 114f)
                reflectiveQuadToRelative(69.5f, 96f)
                lineToRelative(26f, 24f)
                verticalLineToRelative(168f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 840f)
                verticalLineToRelative(-132f)
                close()
                moveToRelative(254f, -188f)
                close()
            }
        }.build()
        
        return _Ent!!
    }

private var _Ent: ImageVector? = null


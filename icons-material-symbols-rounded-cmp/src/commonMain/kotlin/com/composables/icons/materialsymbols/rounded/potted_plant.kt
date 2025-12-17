package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Potted_plant: ImageVector
    get() {
        if (_Potted_plant != null) return _Potted_plant!!
        
        _Potted_plant = ImageVector.Builder(
            name = "potted_plant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(342f, 800f)
                horizontalLineToRelative(276f)
                lineToRelative(40f, -160f)
                horizontalLineTo(302f)
                lineToRelative(40f, 160f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-28f, 0f, -49f, -17f)
                reflectiveQuadToRelative(-28f, -44f)
                lineToRelative(-45f, -179f)
                horizontalLineToRelative(520f)
                lineToRelative(-45f, 179f)
                quadToRelative(-7f, 27f, -28f, 44f)
                reflectiveQuadToRelative(-49f, 17f)
                horizontalLineTo(342f)
                close()
                moveTo(200f, 560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(280f, -240f)
                quadToRelative(0f, -90f, 61f, -156f)
                reflectiveQuadToRelative(152f, -80f)
                quadToRelative(5f, -1f, 9f, 1f)
                reflectiveQuadToRelative(8f, 5f)
                quadToRelative(4f, 3f, 5.5f, 7.5f)
                reflectiveQuadToRelative(0.5f, 9.5f)
                quadToRelative(-11f, 79f, -64.5f, 137.5f)
                reflectiveQuadTo(520f, 316f)
                verticalLineToRelative(84f)
                horizontalLineToRelative(280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 440f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 640f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 560f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 400f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-84f)
                quadToRelative(-78f, -13f, -131.5f, -71.5f)
                reflectiveQuadTo(244f, 107f)
                quadToRelative(-1f, -5f, 0.5f, -9.5f)
                reflectiveQuadToRelative(5.5f, -7.5f)
                quadToRelative(4f, -3f, 8f, -5f)
                reflectiveQuadToRelative(9f, -1f)
                quadToRelative(91f, 14f, 152f, 80f)
                reflectiveQuadToRelative(61f, 156f)
                close()
            }
        }.build()
        
        return _Potted_plant!!
    }

private var _Potted_plant: ImageVector? = null


package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Contact_phone: ImageVector
    get() {
        if (_Contact_phone != null) return _Contact_phone!!
        
        _Contact_phone = ImageVector.Builder(
            name = "contact_phone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(0f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(80f, 120f)
                horizontalLineToRelative(800f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(960f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(880f, 840f)
                horizontalLineTo(80f)
                close()
                moveToRelative(280f, -280f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(400f, 160f)
                lineToRelative(80f, -80f)
                lineToRelative(-60f, -80f)
                horizontalLineToRelative(-66f)
                quadToRelative(-6f, -18f, -10f, -38.5f)
                reflectiveQuadToRelative(-4f, -41.5f)
                quadToRelative(0f, -21f, 4f, -40.5f)
                reflectiveQuadToRelative(10f, -39.5f)
                horizontalLineToRelative(66f)
                lineToRelative(60f, -80f)
                lineToRelative(-80f, -80f)
                quadToRelative(-54f, 42f, -87f, 106.5f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(0f, 69f, 33f, 133.5f)
                reflectiveQuadTo(760f, 720f)
                close()
                moveTo(84f, 760f)
                horizontalLineToRelative(552f)
                quadToRelative(-42f, -75f, -116f, -117.5f)
                reflectiveQuadTo(360f, 600f)
                quadToRelative(-86f, 0f, -160f, 42.5f)
                reflectiveQuadTo(84f, 760f)
                close()
            }
        }.build()
        
        return _Contact_phone!!
    }

private var _Contact_phone: ImageVector? = null


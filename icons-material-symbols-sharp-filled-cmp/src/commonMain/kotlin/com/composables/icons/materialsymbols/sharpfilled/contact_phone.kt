package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Contact_phone: ImageVector
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
                moveTo(0f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(960f)
                verticalLineToRelative(720f)
                horizontalLineTo(0f)
                close()
                moveToRelative(360f, -280f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveTo(84f, 760f)
                horizontalLineToRelative(552f)
                quadToRelative(-42f, -75f, -116f, -117.5f)
                reflectiveQuadTo(360f, 600f)
                quadToRelative(-86f, 0f, -160f, 42.5f)
                reflectiveQuadTo(84f, 760f)
                close()
                moveToRelative(676f, -40f)
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
            }
        }.build()
        
        return _Contact_phone!!
    }

private var _Contact_phone: ImageVector? = null


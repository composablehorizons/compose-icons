package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Contact_emergency: ImageVector
    get() {
        if (_Contact_emergency != null) return _Contact_emergency!!
        
        _Contact_emergency = ImageVector.Builder(
            name = "contact_emergency",
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
                moveToRelative(606f, -348f)
                verticalLineToRelative(38f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(750f, 450f)
                verticalLineToRelative(-38f)
                lineToRelative(33f, 19f)
                quadToRelative(11f, 6f, 23f, 3f)
                reflectiveQuadToRelative(18f, -14f)
                quadToRelative(6f, -11f, 3f, -23f)
                reflectiveQuadToRelative(-14f, -18f)
                lineToRelative(-33f, -19f)
                lineToRelative(33f, -19f)
                quadToRelative(11f, -6f, 14f, -18f)
                reflectiveQuadToRelative(-3f, -23f)
                quadToRelative(-6f, -11f, -18f, -14f)
                reflectiveQuadToRelative(-23f, 3f)
                lineToRelative(-33f, 19f)
                verticalLineToRelative(-38f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(720f, 240f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(690f, 270f)
                verticalLineToRelative(38f)
                lineToRelative(-33f, -19f)
                quadToRelative(-11f, -6f, -23f, -3f)
                reflectiveQuadToRelative(-18f, 14f)
                quadToRelative(-6f, 11f, -3f, 23f)
                reflectiveQuadToRelative(14f, 18f)
                lineToRelative(33f, 19f)
                lineToRelative(-33f, 19f)
                quadToRelative(-11f, 6f, -14f, 18f)
                reflectiveQuadToRelative(3f, 23f)
                quadToRelative(6f, 11f, 18f, 14f)
                reflectiveQuadToRelative(23f, -3f)
                lineToRelative(33f, -19f)
                close()
            }
        }.build()
        
        return _Contact_emergency!!
    }

private var _Contact_emergency: ImageVector? = null


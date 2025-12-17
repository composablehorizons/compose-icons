package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Contact_mail: ImageVector
    get() {
        if (_Contact_mail != null) return _Contact_mail!!
        
        _Contact_mail = ImageVector.Builder(
            name = "contact_mail",
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
                moveTo(84f, 760f)
                horizontalLineToRelative(552f)
                quadToRelative(-42f, -75f, -116f, -117.5f)
                reflectiveQuadTo(360f, 600f)
                quadToRelative(-86f, 0f, -160f, 42.5f)
                reflectiveQuadTo(84f, 760f)
                close()
                moveToRelative(516f, -320f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(840f, 400f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(800f, 240f)
                horizontalLineTo(600f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(560f, 280f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(600f, 440f)
                close()
                moveToRelative(100f, -90f)
                lineToRelative(74f, -52f)
                quadToRelative(8f, -6f, 17f, -1.5f)
                reflectiveQuadToRelative(9f, 14.5f)
                quadToRelative(0f, 1f, -7f, 14f)
                lineToRelative(-70f, 49f)
                quadToRelative(-11f, 8f, -23f, 8f)
                reflectiveQuadToRelative(-23f, -8f)
                lineToRelative(-70f, -49f)
                quadToRelative(-1f, -1f, -7f, -14f)
                quadToRelative(0f, -10f, 9f, -14.5f)
                reflectiveQuadToRelative(17f, 1.5f)
                lineToRelative(74f, 52f)
                close()
            }
        }.build()
        
        return _Contact_mail!!
    }

private var _Contact_mail: ImageVector? = null


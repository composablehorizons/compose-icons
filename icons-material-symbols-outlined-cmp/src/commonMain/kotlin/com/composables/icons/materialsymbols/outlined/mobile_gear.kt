package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Mobile_gear: ImageVector
    get() {
        if (_Mobile_gear != null) return _Mobile_gear!!
        
        _Mobile_gear = ImageVector.Builder(
            name = "mobile_gear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(124f)
                quadToRelative(18f, 7f, 29f, 22f)
                reflectiveQuadToRelative(11f, 34f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 19f, -11f, 34f)
                reflectiveQuadToRelative(-29f, 22f)
                verticalLineToRelative(404f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-720f)
                horizontalLineTo(280f)
                verticalLineToRelative(720f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-720f)
                verticalLineToRelative(720f)
                close()
                moveToRelative(160f, -200f)
                horizontalLineToRelative(80f)
                lineToRelative(6f, -50f)
                quadToRelative(8f, -3f, 14f, -6.5f)
                reflectiveQuadToRelative(12f, -9.5f)
                lineToRelative(46f, 20f)
                lineToRelative(40f, -70f)
                lineToRelative(-40f, -30f)
                quadToRelative(2f, -8f, 2f, -15f)
                reflectiveQuadToRelative(-2f, -15f)
                lineToRelative(40f, -30f)
                lineToRelative(-42f, -68f)
                lineToRelative(-44f, 18f)
                quadToRelative(-6f, -5f, -12f, -8f)
                reflectiveQuadToRelative(-14f, -6f)
                lineToRelative(-6f, -50f)
                horizontalLineToRelative(-80f)
                lineToRelative(-6f, 50f)
                quadToRelative(-8f, 3f, -14f, 6f)
                reflectiveQuadToRelative(-12f, 8f)
                lineToRelative(-44f, -18f)
                lineToRelative(-42f, 68f)
                lineToRelative(40f, 30f)
                quadToRelative(-2f, 8f, -2f, 15f)
                reflectiveQuadToRelative(2f, 15f)
                lineToRelative(-40f, 30f)
                lineToRelative(40f, 70f)
                lineToRelative(46f, -20f)
                quadToRelative(6f, 6f, 12f, 9.5f)
                reflectiveQuadToRelative(14f, 6.5f)
                lineToRelative(6f, 50f)
                close()
                moveToRelative(40f, -100f)
                quadToRelative(-26f, 0f, -43f, -17f)
                reflectiveQuadToRelative(-17f, -43f)
                quadToRelative(0f, -26f, 17f, -43f)
                reflectiveQuadToRelative(43f, -17f)
                quadToRelative(26f, 0f, 43f, 17f)
                reflectiveQuadToRelative(17f, 43f)
                quadToRelative(0f, 26f, -17f, 43f)
                reflectiveQuadToRelative(-43f, 17f)
                close()
            }
        }.build()
        
        return _Mobile_gear!!
    }

private var _Mobile_gear: ImageVector? = null


package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Remember_me: ImageVector
    get() {
        if (_Remember_me != null) return _Remember_me!!
        
        _Remember_me = ImageVector.Builder(
            name = "remember_me",
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
                verticalLineToRelative(720f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -640f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(200f, 480f)
                quadToRelative(-54f, 0f, -105f, 15.5f)
                reflectiveQuadTo(280f, 700f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-20f)
                quadToRelative(-44f, -29f, -95f, -44.5f)
                reflectiveQuadTo(480f, 640f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(54f, 0f, 104.5f, 12.5f)
                reflectiveQuadTo(680f, 608f)
                verticalLineToRelative(-368f)
                horizontalLineTo(280f)
                verticalLineToRelative(368f)
                quadToRelative(45f, -23f, 95.5f, -35.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveToRelative(0f, -40f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 440f)
                close()
                moveToRelative(0f, 280f)
                horizontalLineToRelative(200f)
                horizontalLineToRelative(-400f)
                horizontalLineToRelative(200f)
                close()
                moveToRelative(0f, -320f)
                close()
                moveToRelative(0f, -240f)
                close()
                moveToRelative(0f, 640f)
                close()
            }
        }.build()
        
        return _Remember_me!!
    }

private var _Remember_me: ImageVector? = null


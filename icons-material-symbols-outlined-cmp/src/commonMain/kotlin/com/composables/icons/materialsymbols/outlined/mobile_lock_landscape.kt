package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Mobile_lock_landscape: ImageVector
    get() {
        if (_Mobile_lock_landscape != null) return _Mobile_lock_landscape!!
        
        _Mobile_lock_landscape = ImageVector.Builder(
            name = "mobile_lock_landscape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 760f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 200f)
                horizontalLineToRelative(124f)
                quadToRelative(7f, -18f, 22f, -29f)
                reflectiveQuadToRelative(34f, -11f)
                horizontalLineToRelative(80f)
                quadToRelative(19f, 0f, 34f, 11f)
                reflectiveQuadToRelative(22f, 29f)
                horizontalLineToRelative(404f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 760f)
                horizontalLineTo(120f)
                close()
                moveToRelative(720f, -80f)
                verticalLineToRelative(-400f)
                horizontalLineTo(120f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(720f)
                close()
                moveTo(120f, 280f)
                verticalLineToRelative(400f)
                verticalLineToRelative(-400f)
                close()
                moveToRelative(280f, 360f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 600f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 440f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 400f)
                verticalLineToRelative(40f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 480f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 640f)
                close()
                moveToRelative(40f, -200f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 400f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Mobile_lock_landscape!!
    }

private var _Mobile_lock_landscape: ImageVector? = null


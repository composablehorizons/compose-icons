package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Print_lock: ImageVector
    get() {
        if (_Print_lock != null) return _Print_lock!!
        
        _Print_lock = ImageVector.Builder(
            name = "print_lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 400f)
                horizontalLineToRelative(640f)
                horizontalLineToRelative(-640f)
                close()
                moveToRelative(80f, 440f)
                verticalLineToRelative(-160f)
                horizontalLineTo(80f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -51f, 35f, -85.5f)
                reflectiveQuadToRelative(85f, -34.5f)
                horizontalLineToRelative(560f)
                quadToRelative(51f, 0f, 85.5f, 34.5f)
                reflectiveQuadTo(880f, 440f)
                verticalLineToRelative(32f)
                quadToRelative(-18f, -10f, -38f, -17.5f)
                reflectiveQuadTo(800f, 444f)
                quadToRelative(0f, -17f, -11.5f, -30.5f)
                reflectiveQuadTo(760f, 400f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(160f, 440f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(342f)
                quadToRelative(-16f, 17f, -28f, 37f)
                reflectiveQuadToRelative(-20f, 43f)
                horizontalLineTo(320f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(214f)
                quadToRelative(7f, 22f, 20.5f, 42f)
                reflectiveQuadToRelative(27.5f, 38f)
                horizontalLineTo(240f)
                close()
                moveToRelative(400f, -520f)
                verticalLineToRelative(-120f)
                horizontalLineTo(320f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, 520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 800f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 640f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 600f)
                verticalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 680f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 840f)
                horizontalLineTo(680f)
                close()
                moveToRelative(40f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 560f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(720f, 600f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Print_lock!!
    }

private var _Print_lock: ImageVector? = null


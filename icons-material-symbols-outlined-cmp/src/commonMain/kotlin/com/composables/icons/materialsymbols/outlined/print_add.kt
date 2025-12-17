package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Print_add: ImageVector
    get() {
        if (_Print_add != null) return _Print_add!!
        
        _Print_add = ImageVector.Builder(
            name = "print_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 840f)
                verticalLineToRelative(-120f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(800f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
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
                quadToRelative(7f, 22f, 20f, 42f)
                reflectiveQuadToRelative(28f, 38f)
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
            }
        }.build()
        
        return _Print_add!!
    }

private var _Print_add: ImageVector? = null


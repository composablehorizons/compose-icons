package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Earbud_right: ImageVector
    get() {
        if (_Earbud_right != null) return _Earbud_right!!
        
        _Earbud_right = ImageVector.Builder(
            name = "earbud_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(480f, 800f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-160f)
                horizontalLineTo(400f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 240f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 480f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 880f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(360f, 560f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(-40f, -85f)
                verticalLineToRelative(-310f)
                quadToRelative(-54f, 14f, -87f, 57f)
                reflectiveQuadToRelative(-33f, 98f)
                quadToRelative(0f, 55f, 33f, 98f)
                reflectiveQuadToRelative(87f, 57f)
                close()
                moveToRelative(280f, -155f)
                close()
                moveToRelative(-280f, 0f)
                close()
            }
        }.build()
        
        return _Earbud_right!!
    }

private var _Earbud_right: ImageVector? = null


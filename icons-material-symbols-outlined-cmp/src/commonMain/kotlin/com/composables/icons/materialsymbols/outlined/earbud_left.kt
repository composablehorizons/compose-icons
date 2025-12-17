package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Earbud_left: ImageVector
    get() {
        if (_Earbud_left != null) return _Earbud_left!!
        
        _Earbud_left = ImageVector.Builder(
            name = "earbud_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 800f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 400f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 160f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(400f, 880f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(240f, -320f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(40f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(80f, -85f)
                quadToRelative(54f, -14f, 87f, -57f)
                reflectiveQuadToRelative(33f, -98f)
                quadToRelative(0f, -55f, -33f, -98f)
                reflectiveQuadToRelative(-87f, -57f)
                verticalLineToRelative(310f)
                close()
                moveTo(360f, 320f)
                close()
                moveToRelative(280f, 0f)
                close()
            }
        }.build()
        
        return _Earbud_left!!
    }

private var _Earbud_left: ImageVector? = null


package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Villa: ImageVector
    get() {
        if (_Villa != null) return _Villa!!
        
        _Villa = ImageVector.Builder(
            name = "villa",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 760f)
                verticalLineToRelative(-385f)
                quadToRelative(0f, -25f, 14f, -45.5f)
                reflectiveQuadToRelative(37f, -29.5f)
                lineToRelative(415f, -159f)
                quadToRelative(20f, -8f, 37f, 4f)
                reflectiveQuadToRelative(17f, 33f)
                verticalLineToRelative(302f)
                horizontalLineToRelative(40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(760f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 480f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(440f, 480f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-244f)
                lineTo(200f, 375f)
                verticalLineToRelative(385f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 640f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 680f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-200f)
                horizontalLineTo(440f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(-60f, -262f)
                close()
                moveToRelative(220f, 162f)
                close()
                moveToRelative(0f, 0f)
                close()
            }
        }.build()
        
        return _Villa!!
    }

private var _Villa: ImageVector? = null


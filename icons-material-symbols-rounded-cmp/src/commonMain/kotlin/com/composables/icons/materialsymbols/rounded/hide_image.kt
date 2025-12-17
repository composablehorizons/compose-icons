package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Hide_image: ImageVector
    get() {
        if (_Hide_image != null) return _Hide_image!!
        
        _Hide_image = ImageVector.Builder(
            name = "hide_image",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 200f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 20f, -12.5f, 30f)
                reflectiveQuadTo(800f, 680f)
                quadToRelative(-15f, 0f, -27.5f, -10.5f)
                reflectiveQuadTo(760f, 639f)
                verticalLineToRelative(-439f)
                horizontalLineTo(320f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(280f, 160f)
                quadToRelative(0f, -15f, 10f, -27.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                horizontalLineToRelative(440f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-528f)
                lineToRelative(-36f, -36f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-36f, -36f)
                horizontalLineTo(200f)
                close()
                moveToRelative(367f, -160f)
                horizontalLineTo(280f)
                quadToRelative(-12f, 0f, -18f, -11f)
                reflectiveQuadToRelative(2f, -21f)
                lineToRelative(80f, -107f)
                quadToRelative(6f, -8f, 16f, -8f)
                reflectiveQuadToRelative(16f, 8f)
                lineToRelative(74f, 99f)
                lineToRelative(33f, -44f)
                lineToRelative(-283f, -283f)
                verticalLineToRelative(447f)
                horizontalLineToRelative(447f)
                lineToRelative(-80f, -80f)
                close()
                moveToRelative(-30f, -257f)
                close()
                moveTo(424f, 536f)
                close()
            }
        }.build()
        
        return _Hide_image!!
    }

private var _Hide_image: ImageVector? = null


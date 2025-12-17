package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Screen_rotation_alt: ImageVector
    get() {
        if (_Screen_rotation_alt != null) return _Screen_rotation_alt!!
        
        _Screen_rotation_alt = ImageVector.Builder(
            name = "screen_rotation_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(487f, 856f)
                lineTo(219f, 589f)
                quadToRelative(-6f, -6f, -9f, -13f)
                reflectiveQuadToRelative(-3f, -15f)
                quadToRelative(0f, -16f, 11f, -28.5f)
                reflectiveQuadToRelative(29f, -12.5f)
                quadToRelative(8f, 0f, 15.5f, 3f)
                reflectiveQuadToRelative(13.5f, 9f)
                lineToRelative(268f, 268f)
                lineToRelative(200f, -200f)
                horizontalLineToRelative(-64f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 520f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 560f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 720f)
                verticalLineToRelative(-64f)
                lineTo(600f, 856f)
                quadToRelative(-11f, 11f, -25.5f, 17f)
                reflectiveQuadTo(544f, 879f)
                quadToRelative(-15f, 0f, -30f, -6f)
                reflectiveQuadToRelative(-27f, -17f)
                close()
                moveTo(120f, 440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 400f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 240f)
                verticalLineToRelative(64f)
                lineToRelative(200f, -200f)
                quadToRelative(12f, -12f, 27f, -17.5f)
                reflectiveQuadToRelative(30f, -5.5f)
                quadToRelative(16f, 0f, 30.5f, 5.5f)
                reflectiveQuadTo(473f, 104f)
                lineToRelative(268f, 267f)
                quadToRelative(6f, 6f, 9f, 13f)
                reflectiveQuadToRelative(3f, 15f)
                quadToRelative(0f, 16f, -11f, 28.5f)
                reflectiveQuadTo(713f, 440f)
                quadToRelative(-8f, 0f, -15.5f, -3f)
                reflectiveQuadToRelative(-13.5f, -9f)
                lineTo(416f, 160f)
                lineTo(216f, 360f)
                horizontalLineToRelative(64f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 440f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Screen_rotation_alt!!
    }

private var _Screen_rotation_alt: ImageVector? = null


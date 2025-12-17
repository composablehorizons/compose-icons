package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Lowercase: ImageVector
    get() {
        if (_Lowercase != null) return _Lowercase!!
        
        _Lowercase = ImageVector.Builder(
            name = "lowercase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(300f, 720f)
                quadToRelative(-51f, 0f, -81f, -27.5f)
                reflectiveQuadTo(189f, 620f)
                quadToRelative(0f, -44f, 34.5f, -72.5f)
                reflectiveQuadTo(312f, 519f)
                quadToRelative(23f, 0f, 45f, 4f)
                reflectiveQuadToRelative(38f, 11f)
                verticalLineToRelative(-12f)
                quadToRelative(0f, -29f, -20.5f, -47f)
                reflectiveQuadTo(320f, 457f)
                quadToRelative(-23f, 0f, -42f, 9.5f)
                reflectiveQuadTo(245f, 494f)
                lineToRelative(-47f, -35f)
                quadToRelative(24f, -29f, 54.5f, -43f)
                reflectiveQuadToRelative(68.5f, -14f)
                quadToRelative(69f, 0f, 103f, 32.5f)
                reflectiveQuadToRelative(34f, 97.5f)
                verticalLineToRelative(178f)
                horizontalLineToRelative(-63f)
                verticalLineToRelative(-37f)
                horizontalLineToRelative(-4f)
                quadToRelative(-14f, 23f, -38f, 35f)
                reflectiveQuadToRelative(-53f, 12f)
                close()
                moveToRelative(12f, -54f)
                quadToRelative(35f, 0f, 59.5f, -24f)
                reflectiveQuadToRelative(24.5f, -56f)
                quadToRelative(-14f, -8f, -33.5f, -12.5f)
                reflectiveQuadTo(324f, 569f)
                quadToRelative(-32f, 0f, -50f, 14f)
                reflectiveQuadToRelative(-18f, 37f)
                quadToRelative(0f, 20f, 16f, 33f)
                reflectiveQuadToRelative(40f, 13f)
                close()
                moveToRelative(388f, 54f)
                lineTo(540f, 560f)
                lineToRelative(56f, -56f)
                lineToRelative(64f, 64f)
                verticalLineToRelative(-248f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(248f)
                lineToRelative(64f, -64f)
                lineToRelative(56f, 56f)
                lineToRelative(-160f, 160f)
                close()
            }
        }.build()
        
        return _Lowercase!!
    }

private var _Lowercase: ImageVector? = null


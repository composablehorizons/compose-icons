package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Roofing: ImageVector
    get() {
        if (_Roofing != null) return _Roofing!!
        
        _Roofing = ImageVector.Builder(
            name = "roofing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(360f, 720f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(440f, 560f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(600f, 640f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(520f, 800f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveTo(120f, 496f)
                quadToRelative(-14f, 10f, -30f, 8f)
                reflectiveQuadToRelative(-26f, -16f)
                quadToRelative(-10f, -14f, -7.5f, -30f)
                reflectiveQuadTo(72f, 432f)
                lineToRelative(359f, -275f)
                quadToRelative(11f, -8f, 23.5f, -12f)
                reflectiveQuadToRelative(25.5f, -4f)
                quadToRelative(13f, 0f, 25.5f, 4f)
                reflectiveQuadToRelative(23.5f, 12f)
                lineToRelative(111f, 85f)
                verticalLineToRelative(-22f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(700f, 160f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(760f, 220f)
                verticalLineToRelative(114f)
                lineToRelative(129f, 98f)
                quadToRelative(13f, 10f, 15f, 26f)
                reflectiveQuadToRelative(-8f, 30f)
                quadToRelative(-10f, 14f, -26f, 16f)
                reflectiveQuadToRelative(-30f, -8f)
                lineTo(480f, 221f)
                lineTo(120f, 496f)
                close()
                moveToRelative(360f, 184f)
                close()
            }
        }.build()
        
        return _Roofing!!
    }

private var _Roofing: ImageVector? = null


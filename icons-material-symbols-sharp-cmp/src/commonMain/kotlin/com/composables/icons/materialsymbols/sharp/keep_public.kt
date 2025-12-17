package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Keep_public: ImageVector
    get() {
        if (_Keep_public != null) return _Keep_public!!
        
        _Keep_public = ImageVector.Builder(
            name = "keep_public",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(365f, 380f)
                close()
                moveToRelative(-5f, 540f)
                lineToRelative(-40f, -40f)
                verticalLineToRelative(-240f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                lineToRelative(80f, -80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(285f)
                quadToRelative(-18f, 17f, -32.5f, 37f)
                reflectiveQuadTo(387f, 200f)
                horizontalLineTo(280f)
                verticalLineToRelative(314f)
                lineToRelative(-46f, 46f)
                horizontalLineToRelative(263f)
                quadToRelative(24f, 14f, 49.5f, 23.5f)
                reflectiveQuadTo(600f, 597f)
                verticalLineToRelative(43f)
                horizontalLineTo(400f)
                verticalLineToRelative(240f)
                lineToRelative(-40f, 40f)
                close()
                moveToRelative(280f, -600f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(700f, 260f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(640f, 200f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(580f, 260f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(640f, 320f)
                close()
                moveToRelative(0f, 120f)
                quadToRelative(30f, 0f, 56f, -14f)
                reflectiveQuadToRelative(43f, -39f)
                quadToRelative(-23f, -14f, -48f, -20.5f)
                reflectiveQuadToRelative(-51f, -6.5f)
                quadToRelative(-26f, 0f, -51f, 6.5f)
                reflectiveQuadTo(541f, 387f)
                quadToRelative(17f, 25f, 43f, 39f)
                reflectiveQuadToRelative(56f, 14f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(440f, 320f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(640f, 120f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(840f, 320f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(640f, 520f)
                close()
            }
        }.build()
        
        return _Keep_public!!
    }

private var _Keep_public: ImageVector? = null


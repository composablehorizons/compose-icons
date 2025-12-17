package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Keep_public: ImageVector
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
                moveToRelative(-45f, 260f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 600f)
                verticalLineToRelative(-23f)
                quadToRelative(0f, -8f, 3f, -15.5f)
                reflectiveQuadToRelative(9f, -13.5f)
                lineToRelative(68f, -68f)
                verticalLineToRelative(-280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(180f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(420f, 160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(380f, 200f)
                horizontalLineTo(280f)
                verticalLineToRelative(281f)
                quadToRelative(0f, 16f, -6f, 30.5f)
                reflectiveQuadTo(257f, 537f)
                lineToRelative(-23f, 23f)
                horizontalLineToRelative(286f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 600f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 640f)
                horizontalLineTo(400f)
                verticalLineToRelative(223f)
                quadToRelative(0f, 8f, -3f, 15.5f)
                reflectiveQuadTo(388f, 892f)
                lineToRelative(-14f, 14f)
                quadToRelative(-6f, 6f, -14f, 6f)
                reflectiveQuadToRelative(-14f, -6f)
                lineToRelative(-14f, -14f)
                quadToRelative(-6f, -6f, -9f, -13.5f)
                reflectiveQuadTo(320f, 863f)
                verticalLineToRelative(-223f)
                close()
                moveToRelative(320f, -320f)
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
                quadToRelative(22f, 0f, 42f, -8f)
                reflectiveQuadToRelative(37f, -22f)
                quadToRelative(9f, -8f, 8f, -19f)
                reflectiveQuadToRelative(-11f, -16f)
                quadToRelative(-18f, -8f, -37f, -11.5f)
                reflectiveQuadToRelative(-39f, -3.5f)
                quadToRelative(-20f, 0f, -39f, 3.5f)
                reflectiveQuadTo(564f, 375f)
                quadToRelative(-10f, 5f, -10.5f, 15.5f)
                reflectiveQuadTo(561f, 409f)
                quadToRelative(17f, 15f, 37f, 23f)
                reflectiveQuadToRelative(42f, 8f)
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


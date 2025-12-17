package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Colors: ImageVector
    get() {
        if (_Colors != null) return _Colors!!
        
        _Colors = ImageVector.Builder(
            name = "colors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(346f, 820f)
                lineTo(100f, 574f)
                quadToRelative(-10f, -10f, -15f, -22f)
                reflectiveQuadToRelative(-5f, -25f)
                quadToRelative(0f, -13f, 5f, -25f)
                reflectiveQuadToRelative(15f, -22f)
                lineToRelative(230f, -229f)
                lineToRelative(-75f, -75f)
                quadToRelative(-13f, -13f, -13.5f, -31f)
                reflectiveQuadToRelative(12.5f, -32f)
                quadToRelative(13f, -14f, 32f, -14f)
                reflectiveQuadToRelative(33f, 14f)
                lineToRelative(367f, 367f)
                quadToRelative(10f, 10f, 14.5f, 22f)
                reflectiveQuadToRelative(4.5f, 25f)
                quadToRelative(0f, 13f, -4.5f, 25f)
                reflectiveQuadTo(686f, 574f)
                lineTo(440f, 820f)
                quadToRelative(-10f, 10f, -22f, 15f)
                reflectiveQuadToRelative(-25f, 5f)
                quadToRelative(-13f, 0f, -25f, -5f)
                reflectiveQuadToRelative(-22f, -15f)
                close()
                moveToRelative(47f, -506f)
                lineTo(179f, 528f)
                horizontalLineToRelative(428f)
                lineTo(393f, 314f)
                close()
                moveToRelative(399f, 526f)
                quadToRelative(-36f, 0f, -61f, -25.5f)
                reflectiveQuadTo(706f, 752f)
                quadToRelative(0f, -27f, 13.5f, -51f)
                reflectiveQuadToRelative(30.5f, -47f)
                lineToRelative(19f, -24f)
                quadToRelative(9f, -11f, 23.5f, -11.5f)
                reflectiveQuadTo(816f, 629f)
                lineToRelative(20f, 25f)
                quadToRelative(16f, 23f, 30f, 47f)
                reflectiveQuadToRelative(14f, 51f)
                quadToRelative(0f, 37f, -26f, 62.5f)
                reflectiveQuadTo(792f, 840f)
                close()
            }
        }.build()
        
        return _Colors!!
    }

private var _Colors: ImageVector? = null


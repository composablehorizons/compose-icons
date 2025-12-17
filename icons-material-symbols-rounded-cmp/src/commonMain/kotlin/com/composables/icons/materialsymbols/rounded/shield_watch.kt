package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Shield_watch: ImageVector
    get() {
        if (_Shield_watch != null) return _Shield_watch!!
        
        _Shield_watch = ImageVector.Builder(
            name = "shield_watch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 480f)
                close()
                moveToRelative(152f, 370f)
                lineToRelative(-15f, -62f)
                quadToRelative(-36f, -26f, -56.5f, -64.5f)
                reflectiveQuadTo(540f, 640f)
                quadToRelative(0f, -45f, 20.5f, -83.5f)
                reflectiveQuadTo(617f, 492f)
                lineToRelative(15f, -62f)
                quadToRelative(3f, -14f, 14f, -22f)
                reflectiveQuadToRelative(25f, -8f)
                horizontalLineToRelative(98f)
                quadToRelative(14f, 0f, 25f, 8f)
                reflectiveQuadToRelative(14f, 22f)
                lineToRelative(15f, 62f)
                quadToRelative(36f, 26f, 56.5f, 64.5f)
                reflectiveQuadTo(900f, 640f)
                quadToRelative(0f, 45f, -20.5f, 83.5f)
                reflectiveQuadTo(823f, 788f)
                lineToRelative(-15f, 62f)
                quadToRelative(-3f, 14f, -14f, 22f)
                reflectiveQuadToRelative(-25f, 8f)
                horizontalLineToRelative(-98f)
                quadToRelative(-14f, 0f, -25f, -8f)
                reflectiveQuadToRelative(-14f, -22f)
                close()
                moveToRelative(88f, -110f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveTo(160f, 444f)
                verticalLineToRelative(-189f)
                quadToRelative(0f, -25f, 14.5f, -45f)
                reflectiveQuadToRelative(37.5f, -29f)
                lineToRelative(240f, -90f)
                quadToRelative(14f, -5f, 28f, -5f)
                reflectiveQuadToRelative(28f, 5f)
                lineToRelative(240f, 90f)
                quadToRelative(23f, 9f, 37.5f, 29f)
                reflectiveQuadToRelative(14.5f, 45f)
                verticalLineToRelative(25f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 320f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 280f)
                verticalLineToRelative(-25f)
                lineToRelative(-240f, -90f)
                lineToRelative(-240f, 90f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 119f, 64f, 218f)
                reflectiveQuadToRelative(176f, 134f)
                quadToRelative(7f, -2f, 13f, -4f)
                reflectiveQuadToRelative(12f, -5f)
                quadToRelative(15f, -8f, 30.5f, -2.5f)
                reflectiveQuadTo(559f, 805f)
                quadToRelative(8f, 15f, 2.5f, 30.5f)
                reflectiveQuadTo(541f, 859f)
                quadToRelative(-8f, 4f, -15.5f, 7f)
                reflectiveQuadTo(510f, 871f)
                quadToRelative(-8f, 2f, -15f, 3.5f)
                reflectiveQuadTo(480f, 876f)
                quadToRelative(-8f, 0f, -15f, -1.5f)
                reflectiveQuadTo(450f, 871f)
                quadToRelative(-132f, -45f, -211f, -167f)
                reflectiveQuadToRelative(-79f, -260f)
                close()
            }
        }.build()
        
        return _Shield_watch!!
    }

private var _Shield_watch: ImageVector? = null


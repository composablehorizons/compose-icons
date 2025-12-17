package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Family_group: ImageVector
    get() {
        if (_Family_group != null) return _Family_group!!
        
        _Family_group = ImageVector.Builder(
            name = "family_group",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 640f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(320f, 560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(240f, 640f)
                close()
                moveToRelative(480f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(640f, 560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 640f)
                close()
                moveToRelative(-240f, -40f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
                moveTo(284f, 840f)
                quadToRelative(7f, -35f, 25f, -63.5f)
                reflectiveQuadToRelative(44f, -50.5f)
                quadToRelative(26f, -22f, 58.5f, -34f)
                reflectiveQuadToRelative(68.5f, -12f)
                quadToRelative(36f, 0f, 68.5f, 12f)
                reflectiveQuadToRelative(58.5f, 34f)
                quadToRelative(26f, 22f, 44f, 50.5f)
                reflectiveQuadToRelative(25f, 63.5f)
                horizontalLineTo(284f)
                close()
                moveToRelative(-153f, 0f)
                quadToRelative(-21f, 0f, -36f, -14f)
                reflectiveQuadToRelative(-15f, -32f)
                quadToRelative(0f, -39f, 47.5f, -76.5f)
                reflectiveQuadTo(237f, 680f)
                quadToRelative(17f, 0f, 33f, 3f)
                reflectiveQuadToRelative(31f, 9f)
                quadToRelative(-30f, 29f, -50f, 66.5f)
                reflectiveQuadTo(224f, 840f)
                horizontalLineToRelative(-93f)
                close()
                moveToRelative(605f, 0f)
                quadToRelative(-7f, -44f, -27f, -81.5f)
                reflectiveQuadTo(659f, 692f)
                quadToRelative(15f, -6f, 30.5f, -9f)
                reflectiveQuadToRelative(32.5f, -3f)
                quadToRelative(62f, 0f, 110f, 37.5f)
                reflectiveQuadToRelative(48f, 76.5f)
                quadToRelative(0f, 19f, -15f, 32.5f)
                reflectiveQuadTo(828f, 840f)
                horizontalLineToRelative(-92f)
                close()
                moveTo(64f, 448f)
                quadToRelative(-10f, -14f, -8f, -30f)
                reflectiveQuadToRelative(16f, -26f)
                lineToRelative(359f, -275f)
                quadToRelative(22f, -17f, 49f, -17f)
                reflectiveQuadToRelative(49f, 17f)
                lineToRelative(111f, 85f)
                verticalLineToRelative(-22f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(700f, 120f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(760f, 180f)
                verticalLineToRelative(114f)
                lineToRelative(128f, 98f)
                quadToRelative(13f, 10f, 15.5f, 26f)
                reflectiveQuadToRelative(-7.5f, 30f)
                quadToRelative(-10f, 14f, -26f, 16f)
                reflectiveQuadToRelative(-30f, -8f)
                lineTo(480f, 181f)
                lineTo(120f, 456f)
                quadToRelative(-14f, 10f, -30f, 8f)
                reflectiveQuadToRelative(-26f, -16f)
                close()
            }
        }.build()
        
        return _Family_group!!
    }

private var _Family_group: ImageVector? = null


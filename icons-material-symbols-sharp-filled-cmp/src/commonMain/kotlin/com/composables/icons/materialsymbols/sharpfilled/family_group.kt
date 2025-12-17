package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Family_group: ImageVector
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
                quadToRelative(14f, -69f, 68.5f, -114.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(73f, 0f, 127.5f, 45.5f)
                reflectiveQuadTo(676f, 840f)
                horizontalLineTo(284f)
                close()
                moveToRelative(-204f, 0f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(17f, 0f, 32f, 3f)
                reflectiveQuadToRelative(29f, 9f)
                quadToRelative(-30f, 29f, -50f, 66.5f)
                reflectiveQuadTo(224f, 840f)
                horizontalLineTo(80f)
                close()
                moveToRelative(656f, 0f)
                quadToRelative(-7f, -44f, -27f, -81.5f)
                reflectiveQuadTo(659f, 692f)
                quadToRelative(14f, -6f, 29f, -9f)
                reflectiveQuadToRelative(32f, -3f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                horizontalLineTo(736f)
                close()
                moveTo(88f, 480f)
                lineToRelative(-48f, -64f)
                lineToRelative(440f, -336f)
                lineToRelative(160f, 122f)
                verticalLineToRelative(-82f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(174f)
                lineToRelative(160f, 122f)
                lineToRelative(-48f, 64f)
                lineToRelative(-392f, -299f)
                lineTo(88f, 480f)
                close()
            }
        }.build()
        
        return _Family_group!!
    }

private var _Family_group: ImageVector? = null


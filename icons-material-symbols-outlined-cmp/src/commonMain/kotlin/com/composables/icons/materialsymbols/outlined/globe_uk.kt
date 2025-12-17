package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Globe_uk: ImageVector
    get() {
        if (_Globe_uk != null) return _Globe_uk!!
        
        _Globe_uk = ImageVector.Builder(
            name = "globe_uk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 800f)
                quadToRelative(18f, 0f, 34.5f, -2f)
                reflectiveQuadToRelative(33.5f, -6f)
                lineToRelative(-48f, -72f)
                horizontalLineTo(360f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(440f, 600f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-18f)
                quadToRelative(-26f, 0f, -44f, -17.5f)
                reflectiveQuadTo(320f, 299f)
                quadToRelative(0f, -9f, 2.5f, -18f)
                reflectiveQuadToRelative(7.5f, -17f)
                lineToRelative(62f, -91f)
                quadToRelative(-101f, 29f, -166.5f, 113f)
                reflectiveQuadTo(160f, 480f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 400f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 440f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 520f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(240f, 640f)
                horizontalLineToRelative(-37f)
                quadToRelative(42f, 72f, 115f, 116f)
                reflectiveQuadToRelative(162f, 44f)
                close()
                moveToRelative(304f, -222f)
                quadToRelative(8f, -23f, 12f, -47.5f)
                reflectiveQuadToRelative(4f, -50.5f)
                quadToRelative(0f, -112f, -68f, -197.5f)
                reflectiveQuadTo(560f, 170f)
                verticalLineToRelative(110f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 360f)
                verticalLineToRelative(80f)
                quadToRelative(19f, 0f, 34f, 4.5f)
                reflectiveQuadToRelative(29f, 18.5f)
                lineToRelative(81f, 115f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Globe_uk!!
    }

private var _Globe_uk: ImageVector? = null


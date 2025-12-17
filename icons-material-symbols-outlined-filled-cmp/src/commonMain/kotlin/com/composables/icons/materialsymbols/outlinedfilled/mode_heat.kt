package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mode_heat: ImageVector
    get() {
        if (_Mode_heat != null) return _Mode_heat!!
        
        _Mode_heat = ImageVector.Builder(
            name = "mode_heat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 560f)
                quadToRelative(0f, -105f, 50f, -187f)
                reflectiveQuadToRelative(110f, -138f)
                quadToRelative(60f, -56f, 110f, -85.5f)
                lineToRelative(50f, -29.5f)
                verticalLineToRelative(132f)
                quadToRelative(0f, 37f, 25f, 58.5f)
                reflectiveQuadToRelative(56f, 21.5f)
                quadToRelative(17f, 0f, 32.5f, -7f)
                reflectiveQuadToRelative(28.5f, -23f)
                lineToRelative(18f, -22f)
                quadToRelative(72f, 42f, 116f, 116.5f)
                reflectiveQuadTo(800f, 560f)
                quadToRelative(0f, 88f, -43f, 160.5f)
                reflectiveQuadTo(644f, 835f)
                quadToRelative(17f, -24f, 26.5f, -52.5f)
                reflectiveQuadTo(680f, 722f)
                quadToRelative(0f, -40f, -15f, -75.5f)
                reflectiveQuadTo(622f, 583f)
                lineTo(480f, 444f)
                lineTo(339f, 583f)
                quadToRelative(-29f, 29f, -44f, 64f)
                reflectiveQuadToRelative(-15f, 75f)
                quadToRelative(0f, 32f, 9.5f, 60.5f)
                reflectiveQuadTo(316f, 835f)
                quadToRelative(-70f, -42f, -113f, -114.5f)
                reflectiveQuadTo(160f, 560f)
                close()
                moveToRelative(320f, -4f)
                lineToRelative(85f, 83f)
                quadToRelative(17f, 17f, 26f, 38f)
                reflectiveQuadToRelative(9f, 45f)
                quadToRelative(0f, 49f, -35f, 83.5f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(-50f, 0f, -85f, -34.5f)
                reflectiveQuadTo(360f, 722f)
                quadToRelative(0f, -23f, 9f, -44.5f)
                reflectiveQuadToRelative(26f, -38.5f)
                lineToRelative(85f, -83f)
                close()
            }
        }.build()
        
        return _Mode_heat!!
    }

private var _Mode_heat: ImageVector? = null


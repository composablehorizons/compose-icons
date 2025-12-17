package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Vrpano: ImageVector
    get() {
        if (_Vrpano != null) return _Vrpano!!
        
        _Vrpano = ImageVector.Builder(
            name = "vrpano",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 706f)
                quadToRelative(78f, -23f, 158.5f, -34.5f)
                reflectiveQuadTo(480f, 660f)
                quadToRelative(81f, 0f, 161.5f, 11.5f)
                reflectiveQuadTo(800f, 706f)
                verticalLineToRelative(-451f)
                quadToRelative(-78f, 23f, -158.5f, 34f)
                reflectiveQuadTo(480f, 300f)
                quadToRelative(-81f, 0f, -161.5f, -11f)
                reflectiveQuadTo(160f, 255f)
                verticalLineToRelative(451f)
                close()
                moveTo(81f, 820f)
                verticalLineToRelative(-681f)
                quadToRelative(75f, 35f, 180f, 58f)
                reflectiveQuadToRelative(220f, 23f)
                quadToRelative(115f, 0f, 220f, -23f)
                reflectiveQuadToRelative(180f, -58f)
                verticalLineToRelative(681f)
                quadToRelative(-75f, -35f, -180f, -57.5f)
                reflectiveQuadTo(481f, 740f)
                quadToRelative(-115f, 0f, -220f, 22.5f)
                reflectiveQuadTo(81f, 820f)
                close()
                moveToRelative(399f, -340f)
                close()
                moveTo(220f, 616f)
                quadToRelative(65f, -8f, 129.5f, -12f)
                reflectiveQuadToRelative(130.5f, -4f)
                quadToRelative(66f, 0f, 130.5f, 4f)
                reflectiveQuadTo(740f, 616f)
                lineTo(560f, 400f)
                lineTo(446f, 536f)
                lineToRelative(-80f, -96f)
                lineToRelative(-146f, 176f)
                close()
            }
        }.build()
        
        return _Vrpano!!
    }

private var _Vrpano: ImageVector? = null


package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Rainy_heavy: ImageVector
    get() {
        if (_Rainy_heavy != null) return _Rainy_heavy!!
        
        _Rainy_heavy = ImageVector.Builder(
            name = "rainy_heavy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(338f, 756f)
                quadToRelative(-15f, 8f, -30.5f, 2.5f)
                reflectiveQuadTo(284f, 738f)
                lineTo(44f, 258f)
                quadToRelative(-8f, -15f, -2.5f, -30.5f)
                reflectiveQuadTo(62f, 204f)
                quadToRelative(15f, -8f, 30.5f, -2.5f)
                reflectiveQuadTo(116f, 222f)
                lineToRelative(240f, 480f)
                quadToRelative(8f, 15f, 2.5f, 30.5f)
                reflectiveQuadTo(338f, 756f)
                close()
                moveToRelative(187f, 0f)
                quadToRelative(-15f, 8f, -30.5f, 2.5f)
                reflectiveQuadTo(471f, 738f)
                lineTo(231f, 258f)
                quadToRelative(-8f, -15f, -2.5f, -30.5f)
                reflectiveQuadTo(249f, 204f)
                quadToRelative(15f, -8f, 30f, -2.5f)
                reflectiveQuadToRelative(23f, 20.5f)
                lineToRelative(241f, 480f)
                quadToRelative(8f, 15f, 2.5f, 30.5f)
                reflectiveQuadTo(525f, 756f)
                close()
                moveToRelative(187f, -1f)
                quadToRelative(-15f, 8f, -30.5f, 3f)
                reflectiveQuadTo(658f, 738f)
                lineTo(418f, 258f)
                quadToRelative(-8f, -15f, -2.5f, -30.5f)
                reflectiveQuadTo(436f, 204f)
                quadToRelative(15f, -8f, 30f, -2.5f)
                reflectiveQuadToRelative(23f, 20.5f)
                lineToRelative(241f, 480f)
                quadToRelative(8f, 15f, 2.5f, 30f)
                reflectiveQuadTo(712f, 755f)
                close()
                moveToRelative(186f, 1f)
                quadToRelative(-15f, 8f, -30.5f, 2.5f)
                reflectiveQuadTo(844f, 738f)
                lineTo(604f, 258f)
                quadToRelative(-8f, -15f, -2.5f, -30.5f)
                reflectiveQuadTo(622f, 204f)
                quadToRelative(15f, -8f, 30.5f, -2.5f)
                reflectiveQuadTo(676f, 222f)
                lineToRelative(240f, 480f)
                quadToRelative(8f, 15f, 2.5f, 30.5f)
                reflectiveQuadTo(898f, 756f)
                close()
            }
        }.build()
        
        return _Rainy_heavy!!
    }

private var _Rainy_heavy: ImageVector? = null


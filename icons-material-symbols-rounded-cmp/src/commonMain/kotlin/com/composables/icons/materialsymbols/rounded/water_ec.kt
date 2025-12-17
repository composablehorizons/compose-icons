package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Water_ec: ImageVector
    get() {
        if (_Water_ec != null) return _Water_ec!!
        
        _Water_ec = ImageVector.Builder(
            name = "water_ec",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 560f)
                verticalLineToRelative(154f)
                quadToRelative(0f, 15f, 14.5f, 19f)
                reflectiveQuadToRelative(22.5f, -8f)
                lineToRelative(142f, -214f)
                quadToRelative(7f, -10f, 1.5f, -20.5f)
                reflectiveQuadTo(603f, 480f)
                horizontalLineToRelative(-83f)
                verticalLineToRelative(-154f)
                quadToRelative(0f, -15f, -14.5f, -19f)
                reflectiveQuadToRelative(-22.5f, 8f)
                lineTo(341f, 529f)
                quadToRelative(-7f, 10f, -1.5f, 20.5f)
                reflectiveQuadTo(357f, 560f)
                horizontalLineToRelative(83f)
                close()
                moveToRelative(40f, 320f)
                quadToRelative(-137f, 0f, -228.5f, -94f)
                reflectiveQuadTo(160f, 552f)
                quadToRelative(0f, -62f, 28f, -124f)
                reflectiveQuadToRelative(70f, -119f)
                quadToRelative(42f, -57f, 91f, -107f)
                reflectiveQuadToRelative(91f, -87f)
                quadToRelative(8f, -8f, 18.5f, -11.5f)
                reflectiveQuadTo(480f, 100f)
                quadToRelative(11f, 0f, 21.5f, 3.5f)
                reflectiveQuadTo(520f, 115f)
                quadToRelative(42f, 37f, 91f, 87f)
                reflectiveQuadToRelative(91f, 107f)
                quadToRelative(42f, 57f, 70f, 119f)
                reflectiveQuadToRelative(28f, 124f)
                quadToRelative(0f, 140f, -91.5f, 234f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(104f, 0f, 172f, -70.5f)
                reflectiveQuadTo(720f, 552f)
                quadToRelative(0f, -73f, -60.5f, -165f)
                reflectiveQuadTo(480f, 186f)
                quadTo(361f, 295f, 300.5f, 387f)
                reflectiveQuadTo(240f, 552f)
                quadToRelative(0f, 107f, 68f, 177.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(0f, -320f)
                close()
            }
        }.build()
        
        return _Water_ec!!
    }

private var _Water_ec: ImageVector? = null


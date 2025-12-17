package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Lightning_stand: ImageVector
    get() {
        if (_Lightning_stand != null) return _Lightning_stand!!
        
        _Lightning_stand = ImageVector.Builder(
            name = "lightning_stand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-121f, 0f, -200.5f, -32.5f)
                reflectiveQuadTo(200f, 740f)
                quadToRelative(0f, -75f, 79.5f, -107.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(121f, 0f, 200.5f, 32.5f)
                reflectiveQuadTo(760f, 740f)
                quadToRelative(0f, 75f, -79.5f, 107.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-101f, 0f, -162f, -21f)
                reflectiveQuadToRelative(-74f, -59f)
                quadToRelative(-2f, 5f, -3f, 10f)
                reflectiveQuadToRelative(-1f, 10f)
                quadToRelative(0f, 45f, 65.5f, 72.5f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(109f, 0f, 174.5f, -27.5f)
                reflectiveQuadTo(720f, 740f)
                quadToRelative(0f, -5f, -1f, -10f)
                reflectiveQuadToRelative(-3f, -10f)
                quadToRelative(-13f, 38f, -74f, 59f)
                reflectiveQuadToRelative(-162f, 21f)
                close()
                moveToRelative(0f, -40f)
                quadToRelative(88f, 0f, 144f, -17f)
                reflectiveQuadToRelative(56f, -43f)
                quadToRelative(0f, -26f, -56f, -43f)
                reflectiveQuadToRelative(-144f, -17f)
                quadToRelative(-88f, 0f, -144f, 17f)
                reflectiveQuadToRelative(-56f, 43f)
                quadToRelative(0f, 26f, 56f, 43f)
                reflectiveQuadToRelative(144f, 17f)
                close()
                moveToRelative(-40f, -200f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                lineToRelative(160f, -280f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(80f)
                lineTo(440f, 560f)
                close()
                moveToRelative(40f, 200f)
                close()
                moveToRelative(0f, 80f)
                close()
                moveToRelative(0f, -40f)
                close()
            }
        }.build()
        
        return _Lightning_stand!!
    }

private var _Lightning_stand: ImageVector? = null


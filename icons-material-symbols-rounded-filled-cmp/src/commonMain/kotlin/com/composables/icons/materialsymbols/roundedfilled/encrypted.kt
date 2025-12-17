package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Encrypted: ImageVector
    get() {
        if (_Encrypted != null) return _Encrypted!!
        
        _Encrypted = ImageVector.Builder(
            name = "encrypted",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(444f, 600f)
                horizontalLineToRelative(72f)
                quadToRelative(9f, 0f, 15.5f, -7.5f)
                reflectiveQuadTo(536f, 576f)
                lineToRelative(-19f, -105f)
                quadToRelative(20f, -10f, 31.5f, -29f)
                reflectiveQuadToRelative(11.5f, -42f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 400f)
                quadToRelative(0f, 23f, 11.5f, 42f)
                reflectiveQuadToRelative(31.5f, 29f)
                lineToRelative(-19f, 105f)
                quadToRelative(-2f, 9f, 4.5f, 16.5f)
                reflectiveQuadTo(444f, 600f)
                close()
                moveToRelative(36f, 276f)
                quadToRelative(-7f, 0f, -13f, -1f)
                reflectiveQuadToRelative(-12f, -3f)
                quadToRelative(-135f, -45f, -215f, -166.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-189f)
                quadToRelative(0f, -25f, 14.5f, -45f)
                reflectiveQuadToRelative(37.5f, -29f)
                lineToRelative(240f, -90f)
                quadToRelative(14f, -5f, 28f, -5f)
                reflectiveQuadToRelative(28f, 5f)
                lineToRelative(240f, 90f)
                quadToRelative(23f, 9f, 37.5f, 29f)
                reflectiveQuadToRelative(14.5f, 45f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 140f, -80f, 261.5f)
                reflectiveQuadTo(505f, 872f)
                quadToRelative(-6f, 2f, -12f, 3f)
                reflectiveQuadToRelative(-13f, 1f)
                close()
            }
        }.build()
        
        return _Encrypted!!
    }

private var _Encrypted: ImageVector? = null


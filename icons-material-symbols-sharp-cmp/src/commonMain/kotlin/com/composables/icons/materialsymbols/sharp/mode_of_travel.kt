package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mode_of_travel: ImageVector
    get() {
        if (_Mode_of_travel != null) return _Mode_of_travel!!
        
        _Mode_of_travel = ImageVector.Builder(
            name = "mode_of_travel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadTo(319f, 743f, 239.5f, 625.5f)
                reflectiveQuadTo(160f, 408f)
                quadToRelative(0f, -150f, 96.5f, -239f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(127f, 0f, 223.5f, 89f)
                reflectiveQuadTo(800f, 408f)
                lineToRelative(84f, -84f)
                lineToRelative(56f, 56f)
                lineToRelative(-180f, 180f)
                lineToRelative(-180f, -180f)
                lineToRelative(56f, -56f)
                lineToRelative(84f, 84f)
                quadToRelative(0f, -109f, -69.5f, -178.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-101f, 0f, -170.5f, 69.5f)
                reflectiveQuadTo(240f, 408f)
                quadToRelative(0f, 71f, 59f, 162.5f)
                reflectiveQuadTo(480f, 774f)
                quadToRelative(20f, -18f, 37f, -35f)
                lineToRelative(34f, -34f)
                quadToRelative(-5f, -10f, -8f, -21.5f)
                reflectiveQuadToRelative(-3f, -23.5f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                quadToRelative(-8f, 0f, -14.5f, -1f)
                reflectiveQuadToRelative(-13.5f, -3f)
                quadToRelative(-29f, 30f, -61.5f, 61f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Mode_of_travel!!
    }

private var _Mode_of_travel: ImageVector? = null


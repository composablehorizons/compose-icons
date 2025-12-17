package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Sound_sampler: ImageVector
    get() {
        if (_Sound_sampler != null) return _Sound_sampler!!
        
        _Sound_sampler = ImageVector.Builder(
            name = "sound_sampler",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(169f, 733f)
                quadToRelative(-42f, -52f, -65.5f, -116.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -157f, 103.5f, -270f)
                reflectiveQuadTo(440f, 82f)
                verticalLineToRelative(80f)
                quadToRelative(-120f, 14f, -200f, 104f)
                reflectiveQuadToRelative(-80f, 214f)
                quadToRelative(0f, 56f, 17f, 105.5f)
                reflectiveQuadToRelative(49f, 90.5f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-73f, 0f, -138f, -24f)
                reflectiveQuadToRelative(-117f, -67f)
                lineToRelative(56f, -57f)
                quadToRelative(41f, 32f, 91.5f, 50f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(57f, 0f, 107.5f, -18f)
                reflectiveQuadToRelative(91.5f, -50f)
                lineToRelative(56f, 57f)
                quadToRelative(-52f, 43f, -117f, 67f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(311f, -147f)
                lineToRelative(-57f, -57f)
                quadToRelative(32f, -41f, 49f, -90.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -124f, -80f, -214f)
                reflectiveQuadTo(520f, 162f)
                verticalLineToRelative(-80f)
                quadToRelative(153f, 15f, 256.5f, 128f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 72f, -23.5f, 136.5f)
                reflectiveQuadTo(791f, 733f)
                close()
                moveToRelative(-411f, -73f)
                verticalLineToRelative(-360f)
                lineToRelative(280f, 180f)
                lineToRelative(-280f, 180f)
                close()
            }
        }.build()
        
        return _Sound_sampler!!
    }

private var _Sound_sampler: ImageVector? = null


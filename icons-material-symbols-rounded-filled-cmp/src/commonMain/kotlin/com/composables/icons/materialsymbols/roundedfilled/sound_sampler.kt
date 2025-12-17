package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Sound_sampler: ImageVector
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
                moveTo(80f, 480f)
                quadToRelative(0f, -144f, 88.5f, -252f)
                reflectiveQuadTo(392f, 90f)
                quadToRelative(20f, -5f, 34f, 4f)
                reflectiveQuadToRelative(14f, 28f)
                quadToRelative(0f, 20f, -13f, 31.5f)
                reflectiveQuadTo(394f, 171f)
                quadToRelative(-103f, 28f, -168.5f, 112.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 44f, 11f, 84.5f)
                reflectiveQuadToRelative(31f, 75.5f)
                quadToRelative(10f, 17f, 9.5f, 34f)
                reflectiveQuadTo(197f, 705f)
                quadToRelative(-13f, 13f, -28f, 11f)
                reflectiveQuadToRelative(-25f, -18f)
                quadToRelative(-31f, -48f, -47.5f, -102.5f)
                reflectiveQuadTo(80f, 480f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-61f, 0f, -116.5f, -17f)
                reflectiveQuadTo(260f, 815f)
                quadToRelative(-15f, -10f, -17f, -25.5f)
                reflectiveQuadToRelative(10f, -28.5f)
                quadToRelative(13f, -14f, 30f, -14f)
                reflectiveQuadToRelative(34f, 10f)
                quadToRelative(36f, 21f, 77f, 32f)
                reflectiveQuadToRelative(86f, 11f)
                quadToRelative(45f, 0f, 86f, -11f)
                reflectiveQuadToRelative(77f, -32f)
                quadToRelative(17f, -10f, 34f, -10.5f)
                reflectiveQuadToRelative(30f, 13.5f)
                quadToRelative(12f, 13f, 10f, 29f)
                reflectiveQuadToRelative(-17f, 26f)
                quadToRelative(-48f, 31f, -103.5f, 48f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(400f, -400f)
                quadToRelative(0f, 61f, -16.5f, 115.5f)
                reflectiveQuadTo(816f, 698f)
                quadToRelative(-10f, 16f, -25f, 18f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-14f, -14f, -14.5f, -31f)
                reflectiveQuadToRelative(9.5f, -34f)
                quadToRelative(20f, -35f, 31f, -75.5f)
                reflectiveQuadToRelative(11f, -84.5f)
                quadToRelative(0f, -112f, -65.5f, -196.5f)
                reflectiveQuadTo(566f, 171f)
                quadToRelative(-20f, -6f, -33f, -17.5f)
                reflectiveQuadTo(520f, 122f)
                quadToRelative(0f, -19f, 14f, -28f)
                reflectiveQuadToRelative(34f, -4f)
                quadToRelative(135f, 30f, 223.5f, 138f)
                reflectiveQuadTo(880f, 480f)
                close()
                moveTo(380f, 623f)
                verticalLineToRelative(-286f)
                quadToRelative(0f, -12f, 10.5f, -18f)
                reflectiveQuadToRelative(20.5f, 1f)
                lineToRelative(223f, 143f)
                quadToRelative(9f, 6f, 9f, 17f)
                reflectiveQuadToRelative(-9f, 17f)
                lineTo(411f, 640f)
                quadToRelative(-10f, 7f, -20.5f, 1f)
                reflectiveQuadTo(380f, 623f)
                close()
            }
        }.build()
        
        return _Sound_sampler!!
    }

private var _Sound_sampler: ImageVector? = null


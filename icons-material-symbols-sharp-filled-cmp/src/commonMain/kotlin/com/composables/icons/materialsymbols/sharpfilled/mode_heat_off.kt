package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mode_heat_off: ImageVector
    get() {
        if (_Mode_heat_off != null) return _Mode_heat_off!!
        
        _Mode_heat_off = ImageVector.Builder(
            name = "mode_heat_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(791f, 905f)
                lineTo(658f, 772f)
                lineToRelative(-62f, -62f)
                quadToRelative(-10f, 38f, -42f, 64f)
                reflectiveQuadToRelative(-74f, 26f)
                quadToRelative(-50f, 0f, -85f, -34.5f)
                reflectiveQuadTo(360f, 682f)
                quadToRelative(0f, -23f, 9f, -44.5f)
                reflectiveQuadToRelative(26f, -38.5f)
                lineToRelative(46f, -44f)
                lineToRelative(-57f, -57f)
                lineToRelative(-45f, 45f)
                quadToRelative(-29f, 29f, -44f, 64f)
                reflectiveQuadToRelative(-15f, 75f)
                quadToRelative(0f, 32f, 9.5f, 60.5f)
                reflectiveQuadTo(316f, 795f)
                quadToRelative(-70f, -42f, -113f, -114.5f)
                reflectiveQuadTo(160f, 520f)
                quadToRelative(0f, -55f, 14.5f, -103f)
                reflectiveQuadToRelative(38.5f, -90f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(-21f, -249f)
                lineTo(314f, 200f)
                quadToRelative(62f, -59f, 114f, -89.5f)
                lineToRelative(52f, -30.5f)
                verticalLineToRelative(132f)
                quadToRelative(0f, 37f, 25f, 58.5f)
                reflectiveQuadToRelative(56f, 21.5f)
                quadToRelative(17f, 0f, 32.5f, -7f)
                reflectiveQuadToRelative(28.5f, -23f)
                lineToRelative(18f, -22f)
                quadToRelative(72f, 42f, 116f, 116.5f)
                reflectiveQuadTo(800f, 520f)
                quadToRelative(0f, 37f, -8f, 71f)
                reflectiveQuadToRelative(-22f, 65f)
                close()
            }
        }.build()
        
        return _Mode_heat_off!!
    }

private var _Mode_heat_off: ImageVector? = null


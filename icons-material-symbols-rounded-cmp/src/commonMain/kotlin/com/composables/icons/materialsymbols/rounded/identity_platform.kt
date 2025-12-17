package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Identity_platform: ImageVector
    get() {
        if (_Identity_platform != null) return _Identity_platform!!
        
        _Identity_platform = ImageVector.Builder(
            name = "identity_platform",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 520f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 380f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 380f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 440f)
                close()
                moveTo(158f, 703f)
                quadToRelative(-18f, -11f, -28f, -29f)
                reflectiveQuadToRelative(-10f, -39f)
                verticalLineToRelative(-310f)
                quadToRelative(0f, -21f, 10f, -39f)
                reflectiveQuadToRelative(28f, -29f)
                lineToRelative(280f, -172f)
                quadToRelative(20f, -12f, 42f, -12f)
                reflectiveQuadToRelative(42f, 12f)
                lineToRelative(280f, 172f)
                quadToRelative(18f, 11f, 28f, 29f)
                reflectiveQuadToRelative(10f, 39f)
                verticalLineToRelative(310f)
                quadToRelative(0f, 21f, -10f, 39f)
                reflectiveQuadToRelative(-28f, 29f)
                lineTo(522f, 875f)
                quadToRelative(-20f, 12f, -42f, 12f)
                reflectiveQuadToRelative(-42f, -12f)
                lineTo(158f, 703f)
                close()
                moveToRelative(322f, -23f)
                quadToRelative(-38f, 0f, -75.5f, 9f)
                reflectiveQuadTo(333f, 716f)
                lineToRelative(147f, 91f)
                lineToRelative(147f, -91f)
                quadToRelative(-34f, -18f, -71.5f, -27f)
                reflectiveQuadToRelative(-75.5f, -9f)
                close()
                moveToRelative(-224f, -11f)
                quadToRelative(50f, -34f, 107f, -51.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(60f, 0f, 117f, 17.5f)
                reflectiveQuadTo(704f, 669f)
                lineToRelative(56f, -33f)
                verticalLineToRelative(-311f)
                lineTo(480f, 154f)
                lineTo(200f, 325f)
                verticalLineToRelative(311f)
                lineToRelative(56f, 33f)
                close()
                moveToRelative(224f, -189f)
                close()
            }
        }.build()
        
        return _Identity_platform!!
    }

private var _Identity_platform: ImageVector? = null


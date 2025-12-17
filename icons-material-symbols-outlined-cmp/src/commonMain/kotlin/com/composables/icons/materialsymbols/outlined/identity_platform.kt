package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Identity_platform: ImageVector
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
                moveToRelative(0f, 460f)
                lineTo(120f, 680f)
                verticalLineToRelative(-400f)
                lineToRelative(360f, -220f)
                lineToRelative(360f, 220f)
                verticalLineToRelative(400f)
                lineTo(480f, 900f)
                close()
                moveToRelative(0f, -93f)
                lineToRelative(147f, -91f)
                quadToRelative(-34f, -18f, -71.5f, -27f)
                reflectiveQuadToRelative(-75.5f, -9f)
                quadToRelative(-38f, 0f, -75.5f, 9f)
                reflectiveQuadTo(333f, 716f)
                lineToRelative(147f, 91f)
                close()
                moveTo(256f, 669f)
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


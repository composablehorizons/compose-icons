package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Encrypted_off: ImageVector
    get() {
        if (_Encrypted_off != null) return _Encrypted_off!!
        
        _Encrypted_off = ImageVector.Builder(
            name = "encrypted_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(430f, 542f)
                lineToRelative(-10f, 58f)
                horizontalLineToRelative(68f)
                lineToRelative(-58f, -58f)
                close()
                moveTo(792f, 904f)
                lineTo(662f, 774f)
                quadToRelative(-38f, 39f, -84.5f, 65.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-172f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(-38f, -262f)
                lineTo(551f, 438f)
                quadToRelative(5f, -8f, 7f, -17.5f)
                reflectiveQuadToRelative(2f, -20.5f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-11f, 0f, -20f, 2f)
                reflectiveQuadToRelative(-17f, 7f)
                lineTo(272f, 158f)
                lineToRelative(208f, -78f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(244f)
                quadToRelative(0f, 51f, -11.5f, 101f)
                reflectiveQuadTo(754f, 642f)
                close()
            }
        }.build()
        
        return _Encrypted_off!!
    }

private var _Encrypted_off: ImageVector? = null


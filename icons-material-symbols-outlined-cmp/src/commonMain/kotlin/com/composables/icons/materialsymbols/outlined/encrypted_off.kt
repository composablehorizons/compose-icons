package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Encrypted_off: ImageVector
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
                moveTo(551f, 437f)
                quadToRelative(5f, -8f, 7f, -17.5f)
                reflectiveQuadToRelative(2f, -19.5f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-10f, 0f, -19.5f, 2f)
                reflectiveQuadToRelative(-17.5f, 7f)
                lineToRelative(108f, 108f)
                close()
                moveToRelative(203f, 205f)
                lineToRelative(-60f, -62f)
                quadToRelative(12f, -32f, 19f, -66.5f)
                reflectiveQuadToRelative(7f, -69.5f)
                verticalLineToRelative(-189f)
                lineToRelative(-240f, -90f)
                lineToRelative(-146f, 55f)
                lineToRelative(-62f, -62f)
                lineToRelative(208f, -78f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(244f)
                quadToRelative(0f, 51f, -11.5f, 101f)
                reflectiveQuadTo(754f, 642f)
                close()
                moveToRelative(38f, 262f)
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
                moveTo(430f, 542f)
                close()
                moveToRelative(57f, -170f)
                close()
                moveToRelative(-7f, 424f)
                quadToRelative(35f, -11f, 67f, -31f)
                reflectiveQuadToRelative(59f, -47f)
                lineTo(488f, 600f)
                horizontalLineToRelative(-68f)
                lineToRelative(10f, -58f)
                lineToRelative(-190f, -190f)
                verticalLineToRelative(92f)
                quadToRelative(0f, 121f, 68f, 220f)
                reflectiveQuadToRelative(172f, 132f)
                close()
            }
        }.build()
        
        return _Encrypted_off!!
    }

private var _Encrypted_off: ImageVector? = null


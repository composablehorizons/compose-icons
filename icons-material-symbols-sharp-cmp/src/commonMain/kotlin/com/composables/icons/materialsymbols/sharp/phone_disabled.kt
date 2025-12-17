package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Phone_disabled: ImageVector
    get() {
        if (_Phone_disabled != null) return _Phone_disabled!!
        
        _Phone_disabled = ImageVector.Builder(
            name = "phone_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(719f, 360f)
                quadToRelative(15f, -36f, 25f, -75.5f)
                reflectiveQuadToRelative(15f, -84.5f)
                horizontalLineToRelative(-89f)
                lineToRelative(-17f, 94f)
                lineToRelative(66f, 66f)
                close()
                moveTo(200f, 758f)
                quadToRelative(40f, -3f, 80.5f, -13f)
                reflectiveQuadToRelative(80.5f, -27f)
                lineToRelative(-67f, -67f)
                lineToRelative(-94f, 19f)
                verticalLineToRelative(88f)
                close()
                moveToRelative(484f, -184f)
                lineToRelative(-58f, -58f)
                quadToRelative(9f, -11f, 29.5f, -40f)
                reflectiveQuadToRelative(25.5f, -40f)
                lineTo(567f, 321f)
                lineToRelative(37f, -201f)
                horizontalLineToRelative(236f)
                verticalLineToRelative(42f)
                quadToRelative(0f, 109f, -39f, 212f)
                reflectiveQuadTo(684f, 574f)
                close()
                moveTo(162f, 840f)
                horizontalLineToRelative(-42f)
                verticalLineToRelative(-235f)
                lineToRelative(200f, -41f)
                lineToRelative(116f, 116f)
                quadToRelative(29f, -18f, 45.5f, -29.5f)
                reflectiveQuadTo(512f, 628f)
                lineTo(56f, 172f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                lineToRelative(-222f, -222f)
                quadToRelative(-92f, 75f, -197f, 114.5f)
                reflectiveQuadTo(162f, 840f)
                close()
                moveToRelative(557f, -480f)
                close()
                moveTo(361f, 718f)
                close()
            }
        }.build()
        
        return _Phone_disabled!!
    }

private var _Phone_disabled: ImageVector? = null


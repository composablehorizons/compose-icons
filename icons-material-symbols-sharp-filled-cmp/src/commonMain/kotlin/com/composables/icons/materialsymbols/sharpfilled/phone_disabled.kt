package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Phone_disabled: ImageVector
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
                moveTo(684f, 574f)
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
            }
        }.build()
        
        return _Phone_disabled!!
    }

private var _Phone_disabled: ImageVector? = null


package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Phone_enabled: ImageVector
    get() {
        if (_Phone_enabled != null) return _Phone_enabled!!
        
        _Phone_enabled = ImageVector.Builder(
            name = "phone_enabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(162f, 840f)
                horizontalLineToRelative(-42f)
                verticalLineToRelative(-235f)
                lineToRelative(200f, -41f)
                lineToRelative(116f, 116f)
                quadToRelative(40f, -23f, 74.5f, -49.5f)
                reflectiveQuadTo(574f, 575f)
                quadToRelative(31f, -30f, 58f, -65f)
                reflectiveQuadToRelative(49f, -74f)
                lineTo(567f, 321f)
                lineToRelative(37f, -201f)
                horizontalLineToRelative(236f)
                verticalLineToRelative(42f)
                quadToRelative(0f, 126f, -54f, 248f)
                reflectiveQuadTo(632f, 632f)
                quadTo(532f, 732f, 409.5f, 786f)
                reflectiveQuadTo(162f, 840f)
                close()
            }
        }.build()
        
        return _Phone_enabled!!
    }

private var _Phone_enabled: ImageVector? = null


package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Wifi_calling: ImageVector
    get() {
        if (_Wifi_calling != null) return _Wifi_calling!!
        
        _Wifi_calling = ImageVector.Builder(
            name = "wifi_calling",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(798f, 840f)
                quadToRelative(-125f, 0f, -247.5f, -54f)
                reflectiveQuadTo(328f, 632f)
                quadTo(228f, 532f, 174f, 410f)
                reflectiveQuadToRelative(-54f, -248f)
                verticalLineToRelative(-42f)
                horizontalLineToRelative(236f)
                lineToRelative(37f, 201f)
                lineToRelative(-114f, 115f)
                quadToRelative(22f, 39f, 49f, 74f)
                reflectiveQuadToRelative(58f, 65f)
                quadToRelative(29f, 29f, 63.5f, 55.5f)
                reflectiveQuadTo(524f, 680f)
                lineToRelative(116f, -116f)
                lineToRelative(200f, 41f)
                verticalLineToRelative(235f)
                horizontalLineToRelative(-42f)
                close()
                moveTo(660f, 420f)
                lineTo(439f, 198f)
                quadToRelative(50f, -38f, 107f, -58f)
                reflectiveQuadToRelative(114f, -20f)
                quadToRelative(56f, 0f, 112.5f, 20.5f)
                reflectiveQuadTo(880f, 200f)
                lineTo(660f, 420f)
                close()
            }
        }.build()
        
        return _Wifi_calling!!
    }

private var _Wifi_calling: ImageVector? = null


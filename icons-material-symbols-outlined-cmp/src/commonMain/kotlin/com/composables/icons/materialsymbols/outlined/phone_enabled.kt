package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Phone_enabled: ImageVector
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
                quadToRelative(-18f, 0f, -30f, -12f)
                reflectiveQuadToRelative(-12f, -30f)
                verticalLineToRelative(-162f)
                quadToRelative(0f, -13f, 9f, -23.5f)
                reflectiveQuadToRelative(23f, -14.5f)
                lineToRelative(138f, -28f)
                quadToRelative(14f, -2f, 28.5f, 2.5f)
                reflectiveQuadTo(342f, 586f)
                lineToRelative(94f, 94f)
                quadToRelative(38f, -22f, 72f, -48.5f)
                reflectiveQuadToRelative(65f, -57.5f)
                quadToRelative(33f, -32f, 60.5f, -66.5f)
                reflectiveQuadTo(681f, 436f)
                lineToRelative(-97f, -98f)
                quadToRelative(-8f, -8f, -11f, -19f)
                reflectiveQuadToRelative(-1f, -27f)
                lineToRelative(26f, -140f)
                quadToRelative(2f, -13f, 13f, -22.5f)
                reflectiveQuadToRelative(25f, -9.5f)
                horizontalLineToRelative(162f)
                quadToRelative(18f, 0f, 30f, 12f)
                reflectiveQuadToRelative(12f, 30f)
                quadToRelative(0f, 125f, -54.5f, 247f)
                reflectiveQuadTo(631f, 631f)
                quadTo(531f, 731f, 409f, 785.5f)
                reflectiveQuadTo(162f, 840f)
                close()
                moveToRelative(556f, -480f)
                quadToRelative(17f, -39f, 26f, -79f)
                reflectiveQuadToRelative(14f, -81f)
                horizontalLineToRelative(-88f)
                lineToRelative(-18f, 94f)
                lineToRelative(66f, 66f)
                close()
                moveTo(360f, 716f)
                lineToRelative(-66f, -66f)
                lineToRelative(-94f, 20f)
                verticalLineToRelative(88f)
                quadToRelative(41f, -3f, 81f, -14f)
                reflectiveQuadToRelative(79f, -28f)
                close()
                moveToRelative(358f, -356f)
                close()
                moveTo(360f, 716f)
                close()
            }
        }.build()
        
        return _Phone_enabled!!
    }

private var _Phone_enabled: ImageVector? = null


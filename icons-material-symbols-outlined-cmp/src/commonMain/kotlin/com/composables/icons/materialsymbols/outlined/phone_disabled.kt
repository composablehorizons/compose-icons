package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Phone_disabled: ImageVector
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
                moveTo(792f, 908f)
                lineTo(570f, 686f)
                quadToRelative(-89f, 72f, -193.5f, 113f)
                reflectiveQuadTo(162f, 840f)
                quadToRelative(-24f, 0f, -33f, -12f)
                reflectiveQuadToRelative(-9f, -30f)
                verticalLineToRelative(-162f)
                quadToRelative(0f, -14f, 9f, -24.5f)
                reflectiveQuadToRelative(23f, -13.5f)
                lineToRelative(138f, -28f)
                quadToRelative(11f, -2f, 27.5f, 3f)
                reflectiveQuadToRelative(24.5f, 13f)
                lineToRelative(94f, 94f)
                quadToRelative(18f, -11f, 39f, -25f)
                reflectiveQuadToRelative(37f, -27f)
                lineTo(56f, 172f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(360f, 716f)
                lineToRelative(-66f, -66f)
                lineToRelative(-94f, 20f)
                verticalLineToRelative(88f)
                quadToRelative(41f, -3f, 81f, -14f)
                reflectiveQuadToRelative(79f, -28f)
                close()
                moveToRelative(322f, -144f)
                lineToRelative(-56f, -56f)
                quadToRelative(15f, -17f, 30.5f, -39f)
                reflectiveQuadToRelative(24.5f, -41f)
                lineToRelative(-97f, -98f)
                quadToRelative(-8f, -8f, -11f, -22.5f)
                reflectiveQuadToRelative(-1f, -23.5f)
                lineToRelative(26f, -140f)
                quadToRelative(3f, -14f, 13.5f, -23f)
                reflectiveQuadToRelative(24.5f, -9f)
                horizontalLineToRelative(162f)
                quadToRelative(18f, 0f, 30f, 12f)
                reflectiveQuadToRelative(12f, 30f)
                quadToRelative(0f, 110f, -42f, 214.5f)
                reflectiveQuadTo(682f, 572f)
                close()
                moveToRelative(36f, -212f)
                quadToRelative(17f, -39f, 26f, -79f)
                reflectiveQuadToRelative(14f, -81f)
                horizontalLineToRelative(-88f)
                lineToRelative(-18f, 94f)
                lineToRelative(66f, 66f)
                close()
                moveToRelative(0f, 0f)
                close()
                moveTo(360f, 716f)
                close()
            }
        }.build()
        
        return _Phone_disabled!!
    }

private var _Phone_disabled: ImageVector? = null


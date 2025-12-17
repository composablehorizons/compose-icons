package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Wallet: ImageVector
    get() {
        if (_Wallet != null) return _Wallet!!
        
        _Wallet = ImageVector.Builder(
            name = "wallet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 800f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(480f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -480f)
                horizontalLineToRelative(480f)
                quadToRelative(22f, 0f, 42f, 5f)
                reflectiveQuadToRelative(38f, 16f)
                verticalLineToRelative(-21f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(720f, 240f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(160f, 320f)
                verticalLineToRelative(21f)
                quadToRelative(18f, -11f, 38f, -16f)
                reflectiveQuadToRelative(42f, -5f)
                close()
                moveToRelative(-74f, 130f)
                lineToRelative(445f, 108f)
                quadToRelative(9f, 2f, 18f, 0f)
                reflectiveQuadToRelative(17f, -8f)
                lineToRelative(139f, -116f)
                quadToRelative(-11f, -15f, -28f, -24.5f)
                reflectiveQuadToRelative(-37f, -9.5f)
                horizontalLineTo(240f)
                quadToRelative(-26f, 0f, -45.5f, 13.5f)
                reflectiveQuadTo(166f, 450f)
                close()
            }
        }.build()
        
        return _Wallet!!
    }

private var _Wallet: ImageVector? = null


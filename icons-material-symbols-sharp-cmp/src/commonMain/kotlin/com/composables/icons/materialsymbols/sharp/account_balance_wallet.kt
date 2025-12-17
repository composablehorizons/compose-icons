package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Account_balance_wallet: ImageVector
    get() {
        if (_Account_balance_wallet != null) return _Account_balance_wallet!!
        
        _Account_balance_wallet = ImageVector.Builder(
            name = "account_balance_wallet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 760f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(640f, -460f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-100f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(180f)
                horizontalLineTo(120f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(180f)
                close()
                moveTo(440f, 680f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(400f)
                horizontalLineTo(440f)
                close()
                moveToRelative(200f, -140f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(700f, 480f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(640f, 420f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(580f, 480f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(640f, 540f)
                close()
                moveToRelative(160f, 60f)
                verticalLineToRelative(-240f)
                horizontalLineTo(520f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(280f)
                close()
            }
        }.build()
        
        return _Account_balance_wallet!!
    }

private var _Account_balance_wallet: ImageVector? = null


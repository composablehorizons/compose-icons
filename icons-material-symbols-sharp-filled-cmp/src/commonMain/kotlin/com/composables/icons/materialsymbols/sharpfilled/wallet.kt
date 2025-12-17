package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Wallet: ImageVector
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
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -480f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(471f, 243f)
                lineToRelative(169f, -142f)
                verticalLineToRelative(-21f)
                horizontalLineTo(160f)
                verticalLineToRelative(49f)
                lineToRelative(471f, 114f)
                close()
            }
        }.build()
        
        return _Wallet!!
    }

private var _Wallet: ImageVector? = null


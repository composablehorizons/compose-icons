package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Credit_card_off: ImageVector
    get() {
        if (_Credit_card_off != null) return _Credit_card_off!!
        
        _Credit_card_off = ImageVector.Builder(
            name = "credit_card_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(880f, 766f)
                lineTo(594f, 480f)
                horizontalLineToRelative(206f)
                verticalLineToRelative(-160f)
                horizontalLineTo(434f)
                lineTo(274f, 160f)
                horizontalLineToRelative(606f)
                verticalLineToRelative(606f)
                close()
                moveTo(160f, 480f)
                horizontalLineToRelative(206f)
                lineTo(206f, 320f)
                horizontalLineToRelative(-46f)
                verticalLineToRelative(160f)
                close()
                moveTo(818f, 932f)
                lineTo(686f, 800f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                lineToRelative(80f, 80f)
                horizontalLineTo(126f)
                lineTo(26f, 140f)
                lineToRelative(57f, -57f)
                lineTo(875f, 875f)
                lineToRelative(-57f, 57f)
                close()
            }
        }.build()
        
        return _Credit_card_off!!
    }

private var _Credit_card_off: ImageVector? = null


package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sd_card_alert: ImageVector
    get() {
        if (_Sd_card_alert != null) return _Sd_card_alert!!
        
        _Sd_card_alert = ImageVector.Builder(
            name = "sd_card_alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 680f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                close()
                moveTo(800f, 880f)
                horizontalLineTo(160f)
                verticalLineToRelative(-560f)
                lineToRelative(240f, -240f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(800f)
                close()
            }
        }.build()
        
        return _Sd_card_alert!!
    }

private var _Sd_card_alert: ImageVector? = null


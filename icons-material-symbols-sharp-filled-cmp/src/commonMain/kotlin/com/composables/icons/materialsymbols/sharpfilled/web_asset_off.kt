package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Web_asset_off: ImageVector
    get() {
        if (_Web_asset_off != null) return _Web_asset_off!!
        
        _Web_asset_off = ImageVector.Builder(
            name = "web_asset_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(818f, 932f)
                lineTo(686f, 800f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(114f)
                lineTo(26f, 140f)
                lineToRelative(57f, -57f)
                lineTo(875f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(160f, 720f)
                horizontalLineToRelative(446f)
                lineTo(206f, 320f)
                horizontalLineToRelative(-46f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(720f, 46f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-366f)
                horizontalLineTo(434f)
                lineTo(274f, 160f)
                horizontalLineToRelative(606f)
                verticalLineToRelative(606f)
                close()
            }
        }.build()
        
        return _Web_asset_off!!
    }

private var _Web_asset_off: ImageVector? = null


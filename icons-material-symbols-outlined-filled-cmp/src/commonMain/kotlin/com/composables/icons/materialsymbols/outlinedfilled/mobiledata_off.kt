package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mobiledata_off: ImageVector
    get() {
        if (_Mobiledata_off != null) return _Mobiledata_off!!
        
        _Mobiledata_off = ImageVector.Builder(
            name = "mobiledata_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(792f, 904f)
                lineTo(400f, 512f)
                verticalLineToRelative(174f)
                lineToRelative(62f, -62f)
                lineToRelative(58f, 56f)
                lineToRelative(-160f, 160f)
                lineToRelative(-160f, -160f)
                lineToRelative(58f, -56f)
                lineToRelative(62f, 62f)
                verticalLineToRelative(-254f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(640f, 526f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-174f)
                lineToRelative(-64f, 64f)
                lineToRelative(-56f, -56f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 56f)
                lineToRelative(-64f, -64f)
                verticalLineToRelative(254f)
                close()
            }
        }.build()
        
        return _Mobiledata_off!!
    }

private var _Mobiledata_off: ImageVector? = null


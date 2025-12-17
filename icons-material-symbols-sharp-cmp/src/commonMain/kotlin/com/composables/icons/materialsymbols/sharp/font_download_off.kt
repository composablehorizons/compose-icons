package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Font_download_off: ImageVector
    get() {
        if (_Font_download_off != null) return _Font_download_off!!
        
        _Font_download_off = ImageVector.Builder(
            name = "font_download_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(819f, 932f)
                lineToRelative(-52f, -52f)
                horizontalLineTo(80f)
                verticalLineToRelative(-687f)
                lineToRelative(-53f, -53f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(160f, 800f)
                horizontalLineToRelative(527f)
                lineTo(160f, 273f)
                verticalLineToRelative(527f)
                close()
                moveToRelative(720f, -35f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-525f)
                horizontalLineTo(275f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(685f)
                verticalLineToRelative(685f)
                close()
                moveTo(624f, 509f)
                lineTo(502f, 387f)
                lineToRelative(-20f, -57f)
                horizontalLineToRelative(-4f)
                lineToRelative(-9f, 24f)
                lineToRelative(-54f, -54f)
                lineToRelative(23f, -60f)
                horizontalLineToRelative(84f)
                lineToRelative(102f, 269f)
                close()
                moveToRelative(-200f, 27f)
                close()
                moveToRelative(114f, -114f)
                close()
                moveToRelative(82f, 298f)
                lineToRelative(-57f, -158f)
                lineToRelative(131f, 131f)
                lineToRelative(10f, 27f)
                horizontalLineToRelative(-84f)
                close()
                moveToRelative(-364f, 0f)
                lineToRelative(128f, -337f)
                lineToRelative(56f, 56f)
                lineToRelative(-32f, 89f)
                horizontalLineToRelative(121f)
                lineToRelative(70f, 70f)
                horizontalLineTo(384f)
                lineToRelative(-44f, 122f)
                horizontalLineToRelative(-84f)
                close()
            }
        }.build()
        
        return _Font_download_off!!
    }

private var _Font_download_off: ImageVector? = null


package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Font_download_off: ImageVector
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
                lineTo(485f, 598f)
                lineToRelative(78f, -36f)
                lineToRelative(275f, 275f)
                verticalLineToRelative(43f)
                horizontalLineTo(80f)
                verticalLineToRelative(-687f)
                lineToRelative(-53f, -53f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(61f, -167f)
                lineTo(624f, 509f)
                lineTo(522f, 240f)
                horizontalLineToRelative(-84f)
                lineToRelative(-23f, 60f)
                lineToRelative(-220f, -220f)
                horizontalLineToRelative(685f)
                verticalLineToRelative(685f)
                close()
                moveToRelative(-624f, -45f)
                horizontalLineToRelative(84f)
                lineToRelative(44f, -122f)
                horizontalLineToRelative(101f)
                lineToRelative(-74f, -74f)
                lineToRelative(-59f, -59f)
                lineToRelative(-96f, 255f)
                close()
                moveToRelative(222f, -390f)
                horizontalLineToRelative(4f)
                lineToRelative(20f, 57f)
                lineToRelative(-33f, -33f)
                lineToRelative(9f, -24f)
                close()
                moveToRelative(142f, 390f)
                horizontalLineToRelative(84f)
                lineToRelative(-10f, -27f)
                lineToRelative(-131f, -131f)
                lineToRelative(57f, 158f)
                close()
            }
        }.build()
        
        return _Font_download_off!!
    }

private var _Font_download_off: ImageVector? = null


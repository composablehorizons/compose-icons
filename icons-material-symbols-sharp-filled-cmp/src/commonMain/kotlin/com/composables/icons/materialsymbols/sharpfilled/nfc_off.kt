package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Nfc_off: ImageVector
    get() {
        if (_Nfc_off != null) return _Nfc_off!!
        
        _Nfc_off = ImageVector.Builder(
            name = "nfc_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-607f)
                lineToRelative(-93f, -93f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                lineToRelative(-92f, -92f)
                horizontalLineTo(120f)
                close()
                moveToRelative(160f, -160f)
                horizontalLineToRelative(287f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(360f)
                verticalLineToRelative(-127f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(287f)
                close()
                moveToRelative(560f, 46f)
                lineTo(680f, 566f)
                verticalLineToRelative(-286f)
                horizontalLineTo(445f)
                verticalLineToRelative(51f)
                lineTo(234f, 120f)
                horizontalLineToRelative(606f)
                verticalLineToRelative(606f)
                close()
                moveTo(600f, 486f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-46f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(126f)
                close()
            }
        }.build()
        
        return _Nfc_off!!
    }

private var _Nfc_off: ImageVector? = null


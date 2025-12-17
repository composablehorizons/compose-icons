package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Nfc_off: ImageVector
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
                verticalLineToRelative(-287f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(447f)
                horizontalLineToRelative(447f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(280f)
                close()
                moveToRelative(560f, 47f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-447f)
                horizontalLineTo(313f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(607f)
                verticalLineToRelative(607f)
                close()
                moveTo(360f, 600f)
                horizontalLineToRelative(127f)
                lineTo(360f, 473f)
                verticalLineToRelative(127f)
                close()
                moveToRelative(320f, -33f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-127f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(47f)
                lineToRelative(-75f, -75f)
                verticalLineToRelative(-52f)
                horizontalLineToRelative(235f)
                verticalLineToRelative(287f)
                close()
                moveToRelative(-257f, -30f)
                close()
                moveToRelative(114f, -114f)
                close()
            }
        }.build()
        
        return _Nfc_off!!
    }

private var _Nfc_off: ImageVector? = null


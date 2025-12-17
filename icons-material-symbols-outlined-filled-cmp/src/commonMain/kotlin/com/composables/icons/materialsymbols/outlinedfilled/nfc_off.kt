package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Nfc_off: ImageVector
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
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-527f)
                lineToRelative(-93f, -93f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                lineToRelative(-92f, -92f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, -447f)
                verticalLineToRelative(287f)
                horizontalLineToRelative(287f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(360f)
                verticalLineToRelative(-127f)
                lineToRelative(-80f, -80f)
                close()
                moveToRelative(320f, -33f)
                verticalLineToRelative(126f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-46f)
                horizontalLineToRelative(80f)
                close()
                moveToRelative(240f, -160f)
                verticalLineToRelative(526f)
                lineTo(680f, 566f)
                verticalLineToRelative(-286f)
                horizontalLineTo(520f)
                quadToRelative(-26f, 0f, -46f, 14f)
                reflectiveQuadToRelative(-29f, 37f)
                lineTo(234f, 120f)
                horizontalLineToRelative(526f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                close()
            }
        }.build()
        
        return _Nfc_off!!
    }

private var _Nfc_off: ImageVector? = null


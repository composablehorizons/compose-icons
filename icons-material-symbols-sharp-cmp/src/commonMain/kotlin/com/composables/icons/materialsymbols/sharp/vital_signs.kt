package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Vital_signs: ImageVector
    get() {
        if (_Vital_signs != null) return _Vital_signs!!
        
        _Vital_signs = ImageVector.Builder(
            name = "vital_signs",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(228f)
                lineToRelative(92f, 244f)
                lineToRelative(240f, -633f)
                lineToRelative(148f, 389f)
                horizontalLineToRelative(172f)
                verticalLineToRelative(80f)
                horizontalLineTo(692f)
                lineToRelative(-92f, -244f)
                lineTo(360f, 909f)
                lineTo(212f, 520f)
                horizontalLineTo(40f)
                close()
            }
        }.build()
        
        return _Vital_signs!!
    }

private var _Vital_signs: ImageVector? = null


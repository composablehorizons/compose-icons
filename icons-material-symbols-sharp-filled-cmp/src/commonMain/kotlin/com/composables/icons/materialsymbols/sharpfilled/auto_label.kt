package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Auto_label: ImageVector
    get() {
        if (_Auto_label != null) return _Auto_label!!
        
        _Auto_label = ImageVector.Builder(
            name = "auto_label",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 576f)
                lineTo(642f, 856f)
                horizontalLineTo(120f)
                verticalLineTo(296f)
                horizontalLineToRelative(522f)
                lineToRelative(198f, 280f)
                close()
                moveTo(421f, 736f)
                lineToRelative(50f, -110f)
                lineToRelative(110f, -50f)
                lineToRelative(-110f, -50f)
                lineToRelative(-50f, -110f)
                lineToRelative(-50f, 110f)
                lineToRelative(-110f, 50f)
                lineToRelative(110f, 50f)
                lineToRelative(50f, 110f)
                close()
            }
        }.build()
        
        return _Auto_label!!
    }

private var _Auto_label: ImageVector? = null


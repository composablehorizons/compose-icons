package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mobile_charge: ImageVector
    get() {
        if (_Mobile_charge != null) return _Mobile_charge!!
        
        _Mobile_charge = ImageVector.Builder(
            name = "mobile_charge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(460f, 680f)
                lineToRelative(120f, -240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                lineTo(380f, 520f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                close()
                moveTo(200f, 920f)
                verticalLineToRelative(-880f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(204f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(192f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(484f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Mobile_charge!!
    }

private var _Mobile_charge: ImageVector? = null


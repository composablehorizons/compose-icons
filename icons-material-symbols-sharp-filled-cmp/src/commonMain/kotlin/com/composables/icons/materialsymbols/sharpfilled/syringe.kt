package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Syringe: ImageVector
    get() {
        if (_Syringe != null) return _Syringe!!
        
        _Syringe = ImageVector.Builder(
            name = "syringe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(268f, 278f)
                lineToRelative(-43f, -43f)
                lineToRelative(-40f, 40f)
                lineToRelative(-56f, -57f)
                lineToRelative(136f, -136f)
                lineToRelative(58f, 57f)
                lineToRelative(-42f, 40f)
                lineToRelative(43f, 43f)
                lineToRelative(141f, -141f)
                lineToRelative(57f, 57f)
                lineToRelative(-56f, 55f)
                lineToRelative(62f, 62f)
                lineToRelative(-140f, 140f)
                lineToRelative(56f, 57f)
                lineToRelative(140f, -141f)
                lineToRelative(61f, 60f)
                lineToRelative(-141f, 141f)
                lineToRelative(55f, 56f)
                lineToRelative(141f, -141f)
                lineToRelative(117f, 117f)
                lineToRelative(-84f, 86f)
                lineToRelative(189f, 188f)
                horizontalLineTo(808f)
                lineTo(676f, 686f)
                lineToRelative(-84f, 86f)
                lineToRelative(-352f, -352f)
                lineToRelative(-55f, 54f)
                lineToRelative(-56f, -56f)
                lineToRelative(139f, -140f)
                close()
            }
        }.build()
        
        return _Syringe!!
    }

private var _Syringe: ImageVector? = null


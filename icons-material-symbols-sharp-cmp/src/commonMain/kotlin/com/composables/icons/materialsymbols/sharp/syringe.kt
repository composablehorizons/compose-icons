package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Syringe: ImageVector
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
                moveTo(185f, 275f)
                lineToRelative(-57f, -56f)
                lineToRelative(137f, -137f)
                lineToRelative(56f, 57f)
                lineToRelative(-40f, 40f)
                lineToRelative(43f, 43f)
                lineToRelative(141f, -141f)
                lineToRelative(57f, 57f)
                lineToRelative(-56f, 55f)
                lineToRelative(351f, 351f)
                lineToRelative(-84f, 86f)
                lineToRelative(189f, 188f)
                horizontalLineTo(808f)
                lineTo(676f, 686f)
                lineToRelative(-84f, 86f)
                lineToRelative(-352f, -352f)
                lineToRelative(-55f, 54f)
                lineToRelative(-56f, -56f)
                lineToRelative(139f, -140f)
                lineToRelative(-43f, -43f)
                lineToRelative(-40f, 40f)
                close()
                moveToRelative(111f, 89f)
                lineToRelative(295f, 295f)
                lineToRelative(113f, -114f)
                lineToRelative(-60f, -61f)
                lineToRelative(-85f, 84f)
                lineToRelative(-55f, -56f)
                lineToRelative(84f, -84f)
                lineToRelative(-60f, -60f)
                lineToRelative(-84f, 83f)
                lineToRelative(-56f, -56f)
                lineToRelative(83f, -84f)
                lineToRelative(-61f, -61f)
                lineToRelative(-114f, 114f)
                close()
                moveToRelative(0f, 0f)
                lineToRelative(114f, -114f)
                lineToRelative(-114f, 114f)
                close()
            }
        }.build()
        
        return _Syringe!!
    }

private var _Syringe: ImageVector? = null


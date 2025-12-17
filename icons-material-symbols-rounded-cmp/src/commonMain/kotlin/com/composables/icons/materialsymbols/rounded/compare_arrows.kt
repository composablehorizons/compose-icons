package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Compare_arrows: ImageVector
    get() {
        if (_Compare_arrows != null) return _Compare_arrows!!
        
        _Compare_arrows = ImageVector.Builder(
            name = "compare_arrows",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(367f, 640f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 600f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 560f)
                horizontalLineToRelative(247f)
                lineToRelative(-75f, -75f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(11f, -28.5f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(143f, 143f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(348f, 772f)
                quadToRelative(-12f, 12f, -28f, 11.5f)
                reflectiveQuadTo(292f, 771f)
                quadToRelative(-11f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                lineToRelative(75f, -75f)
                close()
                moveToRelative(226f, -240f)
                lineToRelative(75f, 75f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(668f, 531f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(611f, 531f)
                lineTo(468f, 388f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadToRelative(-2.5f, -15f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(144f, -144f)
                quadToRelative(12f, -12f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 12.5f)
                quadToRelative(11f, 12f, 11.5f, 28f)
                reflectiveQuadTo(668f, 245f)
                lineToRelative(-75f, 75f)
                horizontalLineToRelative(247f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 400f)
                horizontalLineTo(593f)
                close()
            }
        }.build()
        
        return _Compare_arrows!!
    }

private var _Compare_arrows: ImageVector? = null


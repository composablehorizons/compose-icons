package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Data_thresholding: ImageVector
    get() {
        if (_Data_thresholding != null) return _Data_thresholding!!
        
        _Data_thresholding = ImageVector.Builder(
            name = "data_thresholding",
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
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(227f, -400f)
                lineToRelative(52f, 52f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(147f, -148f)
                quadToRelative(11f, -11f, 11f, -28f)
                reflectiveQuadToRelative(-11f, -28f)
                quadToRelative(-12f, -12f, -28.5f, -11.5f)
                reflectiveQuadTo(626f, 288f)
                lineTo(507f, 407f)
                lineToRelative(-52f, -52f)
                quadToRelative(-12f, -12f, -28f, -12f)
                reflectiveQuadToRelative(-28f, 12f)
                lineTo(278f, 476f)
                quadToRelative(-11f, 11f, -11f, 28f)
                reflectiveQuadToRelative(11f, 28f)
                quadToRelative(12f, 12f, 28.5f, 11.5f)
                reflectiveQuadTo(334f, 532f)
                lineToRelative(93f, -92f)
                close()
                moveTo(269f, 640f)
                lineToRelative(-69f, 69f)
                verticalLineToRelative(51f)
                horizontalLineToRelative(34f)
                lineToRelative(120f, -120f)
                horizontalLineToRelative(-85f)
                close()
                moveToRelative(158f, 0f)
                lineTo(307f, 760f)
                horizontalLineToRelative(85f)
                lineToRelative(120f, -120f)
                horizontalLineToRelative(-85f)
                close()
                moveToRelative(149f, 0f)
                lineTo(456f, 760f)
                horizontalLineToRelative(85f)
                lineToRelative(120f, -120f)
                horizontalLineToRelative(-85f)
                close()
                moveToRelative(150f, 0f)
                lineTo(606f, 760f)
                horizontalLineToRelative(85f)
                lineToRelative(69f, -69f)
                verticalLineToRelative(-51f)
                horizontalLineToRelative(-34f)
                close()
            }
        }.build()
        
        return _Data_thresholding!!
    }

private var _Data_thresholding: ImageVector? = null


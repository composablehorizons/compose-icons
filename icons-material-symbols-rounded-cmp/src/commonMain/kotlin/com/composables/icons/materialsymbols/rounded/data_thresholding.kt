package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Data_thresholding: ImageVector
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
                moveToRelative(491f, -80f)
                horizontalLineToRelative(69f)
                verticalLineToRelative(-69f)
                lineToRelative(-69f, 69f)
                close()
                moveToRelative(-457f, 0f)
                horizontalLineToRelative(73f)
                lineToRelative(120f, -120f)
                horizontalLineToRelative(85f)
                lineTo(392f, 760f)
                horizontalLineToRelative(64f)
                lineToRelative(120f, -120f)
                horizontalLineToRelative(85f)
                lineTo(541f, 760f)
                horizontalLineToRelative(65f)
                lineToRelative(120f, -120f)
                horizontalLineToRelative(34f)
                verticalLineToRelative(-440f)
                horizontalLineTo(200f)
                verticalLineToRelative(509f)
                lineToRelative(69f, -69f)
                horizontalLineToRelative(85f)
                lineTo(234f, 760f)
                close()
                moveToRelative(193f, -320f)
                lineToRelative(-93f, 92f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(278f, 532f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(121f, -121f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(52f, 52f)
                lineToRelative(119f, -119f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(682f, 288f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(535f, 492f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-52f, -52f)
                close()
                moveTo(200f, 760f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Data_thresholding!!
    }

private var _Data_thresholding: ImageVector? = null


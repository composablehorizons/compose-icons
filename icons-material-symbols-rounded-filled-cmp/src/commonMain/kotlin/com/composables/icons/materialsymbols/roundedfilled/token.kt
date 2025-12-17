package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Token: ImageVector
    get() {
        if (_Token != null) return _Token!!
        
        _Token = ImageVector.Builder(
            name = "token",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(364f, 370f)
                quadToRelative(22f, -23f, 51.5f, -36.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(35f, 0f, 64.5f, 13.5f)
                reflectiveQuadTo(596f, 370f)
                lineToRelative(202f, -113f)
                lineToRelative(-279f, -155f)
                quadToRelative(-18f, -11f, -39f, -11f)
                reflectiveQuadToRelative(-39f, 11f)
                lineTo(162f, 257f)
                lineToRelative(202f, 113f)
                close()
                moveToRelative(76f, 488f)
                verticalLineToRelative(-223f)
                quadToRelative(-52f, -14f, -86f, -56.5f)
                reflectiveQuadTo(320f, 480f)
                quadToRelative(0f, -11f, 1f, -21f)
                reflectiveQuadToRelative(4f, -19f)
                lineTo(120f, 325f)
                verticalLineToRelative(308f)
                quadToRelative(0f, 22f, 11f, 40.5f)
                reflectiveQuadToRelative(30f, 29.5f)
                lineToRelative(279f, 155f)
                close()
                moveToRelative(40f, -298f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveToRelative(40f, 298f)
                lineToRelative(279f, -155f)
                quadToRelative(19f, -11f, 30f, -29.5f)
                reflectiveQuadToRelative(11f, -40.5f)
                verticalLineToRelative(-308f)
                lineTo(635f, 440f)
                quadToRelative(3f, 10f, 4f, 19.5f)
                reflectiveQuadToRelative(1f, 20.5f)
                quadToRelative(0f, 56f, -34f, 98.5f)
                reflectiveQuadTo(520f, 635f)
                verticalLineToRelative(223f)
                close()
            }
        }.build()
        
        return _Token!!
    }

private var _Token: ImageVector? = null


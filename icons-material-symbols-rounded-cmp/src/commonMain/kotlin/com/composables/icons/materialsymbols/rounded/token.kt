package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Token: ImageVector
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
                moveTo(480f, 868f)
                quadToRelative(-10f, 0f, -20f, -2.5f)
                reflectiveQuadToRelative(-19f, -7.5f)
                lineTo(161f, 703f)
                quadToRelative(-19f, -11f, -30f, -29.5f)
                reflectiveQuadTo(120f, 633f)
                verticalLineToRelative(-306f)
                quadToRelative(0f, -22f, 11f, -40.5f)
                reflectiveQuadToRelative(30f, -29.5f)
                lineToRelative(280f, -155f)
                quadToRelative(9f, -5f, 19f, -7.5f)
                reflectiveQuadToRelative(20f, -2.5f)
                quadToRelative(10f, 0f, 20f, 2.5f)
                reflectiveQuadToRelative(19f, 7.5f)
                lineToRelative(280f, 155f)
                quadToRelative(19f, 11f, 30f, 29.5f)
                reflectiveQuadToRelative(11f, 40.5f)
                verticalLineToRelative(306f)
                quadToRelative(0f, 22f, -11f, 40.5f)
                reflectiveQuadTo(799f, 703f)
                lineTo(519f, 858f)
                quadToRelative(-9f, 5f, -19f, 7.5f)
                reflectiveQuadTo(480f, 868f)
                close()
                moveTo(364f, 370f)
                quadToRelative(22f, -23f, 51.5f, -36.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(35f, 0f, 64.5f, 13.5f)
                reflectiveQuadTo(596f, 370f)
                lineToRelative(120f, -67f)
                lineToRelative(-236f, -131f)
                lineToRelative(-236f, 131f)
                lineToRelative(120f, 67f)
                close()
                moveToRelative(76f, 396f)
                verticalLineToRelative(-131f)
                quadToRelative(-52f, -14f, -86f, -56.5f)
                reflectiveQuadTo(320f, 480f)
                quadToRelative(0f, -11f, 1f, -21f)
                reflectiveQuadToRelative(4f, -19f)
                lineToRelative(-125f, -70f)
                verticalLineToRelative(263f)
                lineToRelative(240f, 133f)
                close()
                moveToRelative(40f, -206f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveToRelative(40f, 206f)
                lineToRelative(240f, -133f)
                verticalLineToRelative(-263f)
                lineToRelative(-125f, 70f)
                quadToRelative(3f, 10f, 4f, 19.5f)
                reflectiveQuadToRelative(1f, 20.5f)
                quadToRelative(0f, 56f, -34f, 98.5f)
                reflectiveQuadTo(520f, 635f)
                verticalLineToRelative(131f)
                close()
            }
        }.build()
        
        return _Token!!
    }

private var _Token: ImageVector? = null


package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Sensors_off: ImageVector
    get() {
        if (_Sensors_off != null) return _Sensors_off!!
        
        _Sensors_off = ImageVector.Builder(
            name = "sensors_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(791f, 905f)
                lineTo(325f, 439f)
                quadToRelative(-2f, 10f, -3.5f, 20f)
                reflectiveQuadToRelative(-1.5f, 21f)
                quadToRelative(0f, 33f, 12.5f, 62f)
                reflectiveQuadToRelative(34.5f, 51f)
                lineToRelative(-57f, 57f)
                quadToRelative(-32f, -33f, -51f, -76.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, -28f, 6f, -54f)
                reflectiveQuadToRelative(17f, -49f)
                lineToRelative(-59f, -59f)
                quadToRelative(-21f, 36f, -32.5f, 76.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 67f, 25f, 125f)
                reflectiveQuadToRelative(69f, 101f)
                lineToRelative(-57f, 57f)
                quadToRelative(-54f, -55f, -85.5f, -127.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -62f, 17.5f, -117f)
                reflectiveQuadTo(146f, 260f)
                lineToRelative(-91f, -91f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(23f, -205f)
                lineToRelative(-58f, -58f)
                quadToRelative(21f, -36f, 32.5f, -76.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -67f, -25f, -125f)
                reflectiveQuadToRelative(-69f, -101f)
                lineToRelative(57f, -57f)
                quadToRelative(54f, 54f, 85.5f, 126.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 61f, -17.5f, 116.5f)
                reflectiveQuadTo(814f, 700f)
                close()
                moveTo(697f, 583f)
                lineToRelative(-62f, -62f)
                quadToRelative(2f, -10f, 3.5f, -20f)
                reflectiveQuadToRelative(1.5f, -21f)
                quadToRelative(0f, -33f, -12.5f, -62f)
                reflectiveQuadTo(593f, 367f)
                lineToRelative(57f, -57f)
                quadToRelative(32f, 32f, 51f, 75.5f)
                reflectiveQuadToRelative(19f, 94.5f)
                quadToRelative(0f, 28f, -6f, 54f)
                reflectiveQuadToRelative(-17f, 49f)
                close()
            }
        }.build()
        
        return _Sensors_off!!
    }

private var _Sensors_off: ImageVector? = null


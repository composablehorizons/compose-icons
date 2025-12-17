package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Sensors: ImageVector
    get() {
        if (_Sensors != null) return _Sensors!!
        
        _Sensors = ImageVector.Builder(
            name = "sensors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(197f, 763f)
                quadToRelative(-54f, -55f, -85.5f, -127.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -84f, 31.5f, -156.5f)
                reflectiveQuadTo(197f, 197f)
                lineToRelative(57f, 57f)
                quadToRelative(-44f, 44f, -69f, 102f)
                reflectiveQuadToRelative(-25f, 124f)
                quadToRelative(0f, 67f, 25f, 125f)
                reflectiveQuadToRelative(69f, 101f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(113f, -113f)
                quadToRelative(-32f, -33f, -51f, -76.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, -51f, 19f, -94.5f)
                reflectiveQuadToRelative(51f, -75.5f)
                lineToRelative(57f, 57f)
                quadToRelative(-22f, 22f, -34.5f, 51f)
                reflectiveQuadTo(320f, 480f)
                quadToRelative(0f, 33f, 12.5f, 62f)
                reflectiveQuadToRelative(34.5f, 51f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(170f, -90f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveToRelative(170f, 90f)
                lineToRelative(-57f, -57f)
                quadToRelative(22f, -22f, 34.5f, -51f)
                reflectiveQuadToRelative(12.5f, -62f)
                quadToRelative(0f, -33f, -12.5f, -62f)
                reflectiveQuadTo(593f, 367f)
                lineToRelative(57f, -57f)
                quadToRelative(32f, 32f, 51f, 75.5f)
                reflectiveQuadToRelative(19f, 94.5f)
                quadToRelative(0f, 50f, -19f, 93.5f)
                reflectiveQuadTo(650f, 650f)
                close()
                moveToRelative(113f, 113f)
                lineToRelative(-57f, -57f)
                quadToRelative(44f, -44f, 69f, -102f)
                reflectiveQuadToRelative(25f, -124f)
                quadToRelative(0f, -67f, -25f, -125f)
                reflectiveQuadToRelative(-69f, -101f)
                lineToRelative(57f, -57f)
                quadToRelative(54f, 54f, 85.5f, 126.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 155.5f)
                reflectiveQuadTo(763f, 763f)
                close()
            }
        }.build()
        
        return _Sensors!!
    }

private var _Sensors: ImageVector? = null


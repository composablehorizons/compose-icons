package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Humidity_helper: ImageVector
    get() {
        if (_Humidity_helper != null) return _Humidity_helper!!
        
        _Humidity_helper = ImageVector.Builder(
            name = "humidity_helper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 880f)
                quadToRelative(-133f, 0f, -226.5f, -92f)
                reflectiveQuadTo(80f, 564f)
                quadToRelative(0f, -63f, 24.5f, -120.5f)
                reflectiveQuadTo(174f, 342f)
                lineToRelative(226f, -222f)
                lineToRelative(226f, 222f)
                quadToRelative(45f, 44f, 69.5f, 101.5f)
                reflectiveQuadTo(720f, 564f)
                quadToRelative(0f, 132f, -93.5f, 224f)
                reflectiveQuadTo(400f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(100f, 0f, 170f, -68.5f)
                reflectiveQuadTo(640f, 564f)
                quadToRelative(0f, -47f, -18f, -89.5f)
                reflectiveQuadTo(570f, 400f)
                lineTo(400f, 232f)
                lineTo(230f, 400f)
                quadToRelative(-34f, 32f, -52f, 74.5f)
                reflectiveQuadTo(160f, 564f)
                quadToRelative(0f, 99f, 70f, 167.5f)
                reflectiveQuadTo(400f, 800f)
                close()
                moveToRelative(340f, -400f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(560f, 220f)
                quadToRelative(75f, 0f, 127.5f, -52.5f)
                reflectiveQuadTo(740f, 40f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(920f, 220f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(740f, 400f)
                close()
                moveTo(400f, 564f)
                close()
            }
        }.build()
        
        return _Humidity_helper!!
    }

private var _Humidity_helper: ImageVector? = null


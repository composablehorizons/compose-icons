package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Ecg_heart: ImageVector
    get() {
        if (_Ecg_heart != null) return _Ecg_heart!!
        
        _Ecg_heart = ImageVector.Builder(
            name = "ecg_heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 480f)
                close()
                moveToRelative(0f, 360f)
                quadToRelative(-18f, 0f, -34.5f, -6.5f)
                reflectiveQuadTo(416f, 814f)
                lineTo(148f, 545f)
                quadToRelative(-35f, -35f, -51.5f, -80f)
                reflectiveQuadTo(80f, 371f)
                quadToRelative(0f, -103f, 67f, -177f)
                reflectiveQuadToRelative(167f, -74f)
                quadToRelative(48f, 0f, 90.5f, 19f)
                reflectiveQuadToRelative(75.5f, 53f)
                quadToRelative(32f, -34f, 74.5f, -53f)
                reflectiveQuadToRelative(90.5f, -19f)
                quadToRelative(100f, 0f, 167.5f, 74f)
                reflectiveQuadTo(880f, 370f)
                quadToRelative(0f, 49f, -17f, 94f)
                reflectiveQuadToRelative(-51f, 80f)
                lineTo(543f, 814f)
                quadToRelative(-13f, 13f, -29f, 19.5f)
                reflectiveQuadToRelative(-34f, 6.5f)
                close()
                moveToRelative(40f, -520f)
                quadToRelative(10f, 0f, 19f, 5f)
                reflectiveQuadToRelative(14f, 13f)
                lineToRelative(68f, 102f)
                horizontalLineToRelative(166f)
                quadToRelative(7f, -17f, 10.5f, -34.5f)
                reflectiveQuadTo(801f, 370f)
                quadToRelative(-2f, -69f, -46f, -118.5f)
                reflectiveQuadTo(645f, 202f)
                quadToRelative(-31f, 0f, -59.5f, 12f)
                reflectiveQuadTo(536f, 249f)
                lineToRelative(-27f, 29f)
                quadToRelative(-5f, 6f, -13f, 9.5f)
                reflectiveQuadToRelative(-16f, 3.5f)
                quadToRelative(-8f, 0f, -16f, -3.5f)
                reflectiveQuadToRelative(-14f, -9.5f)
                lineToRelative(-27f, -29f)
                quadToRelative(-21f, -23f, -49f, -36f)
                reflectiveQuadToRelative(-60f, -13f)
                quadToRelative(-66f, 0f, -110f, 50.5f)
                reflectiveQuadTo(160f, 370f)
                quadToRelative(0f, 18f, 3f, 35.5f)
                reflectiveQuadToRelative(10f, 34.5f)
                horizontalLineToRelative(187f)
                quadToRelative(10f, 0f, 19f, 5f)
                reflectiveQuadToRelative(14f, 13f)
                lineToRelative(35f, 52f)
                lineToRelative(54f, -162f)
                quadToRelative(4f, -12f, 14.5f, -20f)
                reflectiveQuadToRelative(23.5f, -8f)
                close()
                moveToRelative(12f, 130f)
                lineToRelative(-54f, 162f)
                quadToRelative(-4f, 12f, -15f, 20f)
                reflectiveQuadToRelative(-24f, 8f)
                quadToRelative(-10f, 0f, -19f, -5f)
                reflectiveQuadToRelative(-14f, -13f)
                lineToRelative(-68f, -102f)
                horizontalLineTo(236f)
                lineToRelative(237f, 237f)
                quadToRelative(2f, 2f, 3.5f, 2.5f)
                reflectiveQuadToRelative(3.5f, 0.5f)
                quadToRelative(2f, 0f, 3.5f, -0.5f)
                reflectiveQuadToRelative(3.5f, -2.5f)
                lineToRelative(236f, -237f)
                horizontalLineTo(600f)
                quadToRelative(-10f, 0f, -19f, -5f)
                reflectiveQuadToRelative(-15f, -13f)
                lineToRelative(-34f, -52f)
                close()
            }
        }.build()
        
        return _Ecg_heart!!
    }

private var _Ecg_heart: ImageVector? = null


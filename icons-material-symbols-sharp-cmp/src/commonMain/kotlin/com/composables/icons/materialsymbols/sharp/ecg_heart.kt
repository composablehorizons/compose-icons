package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Ecg_heart: ImageVector
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
                moveTo(148f, 545f)
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
                lineTo(479f, 878f)
                lineTo(148f, 545f)
                close()
                moveToRelative(166f, -345f)
                quadToRelative(-66f, 0f, -110f, 50.5f)
                reflectiveQuadTo(160f, 370f)
                quadToRelative(0f, 18f, 3f, 35.5f)
                reflectiveQuadToRelative(10f, 34.5f)
                horizontalLineToRelative(208f)
                lineToRelative(47f, 70f)
                lineToRelative(54f, -172f)
                horizontalLineToRelative(71f)
                lineToRelative(68f, 102f)
                horizontalLineToRelative(166f)
                quadToRelative(7f, -17f, 10.5f, -34.5f)
                reflectiveQuadTo(801f, 370f)
                quadToRelative(-2f, -69f, -46f, -118.5f)
                reflectiveQuadTo(645f, 202f)
                quadToRelative(-31f, 0f, -59.5f, 12f)
                reflectiveQuadTo(536f, 249f)
                lineToRelative(-42f, 45f)
                horizontalLineToRelative(-29f)
                lineToRelative(-42f, -45f)
                quadToRelative(-21f, -23f, -49f, -36f)
                reflectiveQuadToRelative(-60f, -13f)
                close()
                moveToRelative(166f, 564f)
                lineToRelative(243f, -244f)
                horizontalLineTo(578f)
                lineToRelative(-46f, -70f)
                lineToRelative(-54f, 173f)
                horizontalLineToRelative(-72f)
                lineToRelative(-68f, -103f)
                horizontalLineTo(236f)
                lineToRelative(244f, 244f)
                close()
                moveToRelative(0f, -282f)
                close()
            }
        }.build()
        
        return _Ecg_heart!!
    }

private var _Ecg_heart: ImageVector? = null


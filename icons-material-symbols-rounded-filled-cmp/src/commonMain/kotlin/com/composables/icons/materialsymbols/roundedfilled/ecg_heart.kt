package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Ecg_heart: ImageVector
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
                moveTo(645f, 120f)
                quadToRelative(100f, 0f, 167.5f, 74f)
                reflectiveQuadTo(880f, 370f)
                quadToRelative(0f, 18f, -2f, 35.5f)
                reflectiveQuadToRelative(-7f, 34.5f)
                horizontalLineTo(621f)
                lineToRelative(-68f, -102f)
                quadToRelative(-5f, -8f, -14f, -13f)
                reflectiveQuadToRelative(-19f, -5f)
                quadToRelative(-13f, 0f, -23.5f, 8f)
                reflectiveQuadTo(482f, 348f)
                lineToRelative(-54f, 162f)
                lineToRelative(-35f, -52f)
                quadToRelative(-5f, -8f, -14f, -13f)
                reflectiveQuadToRelative(-19f, -5f)
                horizontalLineTo(89f)
                quadToRelative(-5f, -17f, -7f, -34.5f)
                reflectiveQuadTo(80f, 371f)
                quadToRelative(0f, -103f, 67f, -177f)
                reflectiveQuadToRelative(167f, -74f)
                quadToRelative(48f, 0f, 90.5f, 19f)
                reflectiveQuadToRelative(75.5f, 53f)
                quadToRelative(32f, -34f, 74.5f, -53f)
                reflectiveQuadToRelative(90.5f, -19f)
                close()
                moveTo(480f, 840f)
                quadToRelative(-18f, 0f, -34.5f, -6.5f)
                reflectiveQuadTo(416f, 814f)
                lineTo(148f, 545f)
                quadToRelative(-6f, -6f, -11f, -12f)
                reflectiveQuadToRelative(-10f, -13f)
                horizontalLineToRelative(211f)
                lineToRelative(68f, 102f)
                quadToRelative(5f, 8f, 14f, 13f)
                reflectiveQuadToRelative(19f, 5f)
                quadToRelative(13f, 0f, 24f, -8f)
                reflectiveQuadToRelative(15f, -20f)
                lineToRelative(54f, -162f)
                lineToRelative(34f, 52f)
                quadToRelative(6f, 8f, 15f, 13f)
                reflectiveQuadToRelative(19f, 5f)
                horizontalLineToRelative(232f)
                lineToRelative(-10f, 12f)
                lineToRelative(-10f, 12f)
                lineToRelative(-269f, 270f)
                quadToRelative(-13f, 13f, -29f, 19.5f)
                reflectiveQuadToRelative(-34f, 6.5f)
                close()
            }
        }.build()
        
        return _Ecg_heart!!
    }

private var _Ecg_heart: ImageVector? = null


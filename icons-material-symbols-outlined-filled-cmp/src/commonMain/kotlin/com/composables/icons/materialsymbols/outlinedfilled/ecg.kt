package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Ecg: ImageVector
    get() {
        if (_Ecg != null) return _Ecg!!
        
        _Ecg = ImageVector.Builder(
            name = "ecg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 440f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(254f)
                quadToRelative(-17f, -7f, -34.5f, -10.5f)
                reflectiveQuadTo(810f, 480f)
                quadToRelative(-23f, 0f, -46f, 6f)
                reflectiveQuadToRelative(-44f, 17f)
                quadToRelative(-9f, -5f, -19f, -9f)
                reflectiveQuadToRelative(-21f, -7f)
                verticalLineToRelative(-47f)
                horizontalLineTo(545f)
                lineToRelative(-69f, -138f)
                quadToRelative(-5f, -10f, -15f, -15f)
                reflectiveQuadToRelative(-21f, -5f)
                quadToRelative(-11f, 0f, -21f, 5f)
                reflectiveQuadToRelative(-15f, 15f)
                lineTo(280f, 550f)
                lineToRelative(-44f, -88f)
                quadToRelative(-5f, -11f, -15f, -16.5f)
                reflectiveQuadToRelative(-21f, -5.5f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, 360f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(95f)
                lineToRelative(69f, 138f)
                quadToRelative(5f, 11f, 15f, 16.5f)
                reflectiveQuadToRelative(21f, 5.5f)
                quadToRelative(11f, 0f, 21f, -5.5f)
                reflectiveQuadToRelative(15f, -16.5f)
                lineToRelative(124f, -248f)
                lineToRelative(44f, 88f)
                quadToRelative(5f, 9f, 12.5f, 14.5f)
                reflectiveQuadTo(514f, 520f)
                quadToRelative(-34f, 26f, -54f, 65f)
                reflectiveQuadToRelative(-20f, 85f)
                quadToRelative(0f, 42f, 12.5f, 70.5f)
                reflectiveQuadTo(493f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(470f, -240f)
                quadToRelative(27f, 0f, 50f, 12f)
                reflectiveQuadToRelative(40f, 35f)
                quadToRelative(17f, -23f, 40f, -35f)
                reflectiveQuadToRelative(50f, -12f)
                quadToRelative(46f, 0f, 78f, 32f)
                reflectiveQuadToRelative(32f, 78f)
                quadToRelative(0f, 36f, -26f, 69.5f)
                reflectiveQuadTo(780f, 848f)
                lineToRelative(-60f, 52f)
                lineToRelative(-60f, -52f)
                quadToRelative(-88f, -75f, -114f, -108.5f)
                reflectiveQuadTo(520f, 670f)
                quadToRelative(0f, -46f, 32f, -78f)
                reflectiveQuadToRelative(78f, -32f)
                close()
            }
        }.build()
        
        return _Ecg!!
    }

private var _Ecg: ImageVector? = null


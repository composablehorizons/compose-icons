package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Ecg: ImageVector
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
                moveTo(480f, 480f)
                close()
                moveTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 440f)
                verticalLineToRelative(-200f)
                horizontalLineTo(160f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(120f, 360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 320f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                close()
                moveToRelative(0f, 640f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 600f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 640f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(360f, -130f)
                quadToRelative(0f, -45f, 32f, -77.5f)
                reflectiveQuadToRelative(78f, -32.5f)
                quadToRelative(26f, 0f, 49.5f, 12f)
                reflectiveQuadToRelative(40.5f, 35f)
                quadToRelative(16f, -23f, 39.5f, -35f)
                reflectiveQuadToRelative(50.5f, -12f)
                quadToRelative(45f, 0f, 77.5f, 32.5f)
                reflectiveQuadTo(920f, 670f)
                quadToRelative(0f, 36f, -26f, 69.5f)
                reflectiveQuadTo(780f, 848f)
                lineToRelative(-34f, 29f)
                quadToRelative(-5f, 5f, -12f, 7.5f)
                reflectiveQuadTo(720f, 887f)
                quadToRelative(-7f, 0f, -13.5f, -2f)
                reflectiveQuadTo(694f, 878f)
                lineToRelative(-35f, -30f)
                quadToRelative(-88f, -75f, -113.5f, -108.5f)
                reflectiveQuadTo(520f, 670f)
                close()
                moveToRelative(200f, 124f)
                lineToRelative(28f, -23f)
                quadToRelative(56f, -48f, 74f, -67.5f)
                reflectiveQuadToRelative(18f, -33.5f)
                quadToRelative(0f, -12f, -9f, -21f)
                reflectiveQuadToRelative(-21f, -9f)
                quadToRelative(-8f, 0f, -14.5f, 3.5f)
                reflectiveQuadTo(780f, 655f)
                lineToRelative(-60f, 57f)
                lineToRelative(-61f, -57f)
                quadToRelative(-9f, -8f, -15.5f, -11.5f)
                reflectiveQuadTo(630f, 640f)
                quadToRelative(-13f, 0f, -21.5f, 9f)
                reflectiveQuadToRelative(-8.5f, 21f)
                quadToRelative(0f, 14f, 17.5f, 33.5f)
                reflectiveQuadTo(691f, 771f)
                lineToRelative(29f, 23f)
                close()
                moveTo(280f, 680f)
                quadToRelative(-12f, 0f, -21.5f, -5.5f)
                reflectiveQuadTo(244f, 658f)
                lineToRelative(-69f, -138f)
                horizontalLineToRelative(-55f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 440f)
                horizontalLineToRelative(80f)
                quadToRelative(11f, 0f, 20.5f, 6f)
                reflectiveQuadToRelative(14.5f, 16f)
                lineToRelative(45f, 89f)
                lineToRelative(124f, -249f)
                quadToRelative(5f, -10f, 15f, -15f)
                reflectiveQuadToRelative(21f, -5f)
                quadToRelative(11f, 0f, 21f, 5f)
                reflectiveQuadToRelative(15f, 15f)
                lineToRelative(68f, 138f)
                horizontalLineToRelative(96f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 520f)
                horizontalLineTo(520f)
                quadToRelative(-12f, 0f, -21.5f, -5.5f)
                reflectiveQuadTo(484f, 498f)
                lineToRelative(-44f, -88f)
                lineToRelative(-125f, 248f)
                quadToRelative(-5f, 11f, -14.5f, 16.5f)
                reflectiveQuadTo(280f, 680f)
                close()
                moveToRelative(440f, 37f)
                close()
            }
        }.build()
        
        return _Ecg!!
    }

private var _Ecg: ImageVector? = null


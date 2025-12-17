package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Glucose: ImageVector
    get() {
        if (_Glucose != null) return _Glucose!!
        
        _Glucose = ImageVector.Builder(
            name = "glucose",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(576f, 880f)
                quadToRelative(-35f, 0f, -67f, -14.5f)
                reflectiveQuadTo(454f, 824f)
                lineTo(250f, 586f)
                quadToRelative(-11f, -14f, -9.5f, -30.5f)
                reflectiveQuadTo(256f, 528f)
                lineToRelative(18f, -13f)
                quadToRelative(20f, -15f, 45f, -16f)
                reflectiveQuadToRelative(46f, 13f)
                lineToRelative(55f, 35f)
                verticalLineToRelative(-387f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(460f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(500f, 160f)
                verticalLineToRelative(460f)
                quadToRelative(0f, 24f, -21f, 35f)
                reflectiveQuadToRelative(-41f, -2f)
                lineToRelative(-56f, -36f)
                lineToRelative(144f, 169f)
                quadToRelative(6f, 7f, 14f, 10.5f)
                reflectiveQuadToRelative(17f, 3.5f)
                horizontalLineToRelative(203f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(840f, 720f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(880f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 440f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(576f)
                close()
                moveToRelative(24f, -600f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 320f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 480f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 280f)
                close()
                moveToRelative(140f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(780f, 360f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(740f, 520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(700f, 480f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(740f, 320f)
                close()
                moveToRelative(-560f, 80f)
                quadToRelative(-59f, 0f, -99.5f, -40.5f)
                reflectiveQuadTo(40f, 262f)
                quadToRelative(0f, -34f, 13.5f, -59f)
                reflectiveQuadToRelative(63.5f, -82f)
                lineToRelative(33f, -37f)
                quadToRelative(12f, -14f, 30f, -14f)
                reflectiveQuadToRelative(30f, 14f)
                lineToRelative(33f, 38f)
                quadToRelative(51f, 59f, 64f, 83f)
                reflectiveQuadToRelative(13f, 57f)
                quadToRelative(0f, 57f, -41f, 97.5f)
                reflectiveQuadTo(180f, 400f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(25f, 0f, 42.5f, -17f)
                reflectiveQuadToRelative(17.5f, -41f)
                quadToRelative(0f, -17f, -8.5f, -30.5f)
                reflectiveQuadTo(185f, 176f)
                lineToRelative(-5f, -5f)
                lineToRelative(-5f, 5f)
                quadToRelative(-32f, 36f, -43.5f, 54f)
                reflectiveQuadTo(120f, 262f)
                quadToRelative(0f, 24f, 17f, 41f)
                reflectiveQuadToRelative(43f, 17f)
                close()
                moveToRelative(0f, -58f)
                close()
                moveToRelative(660f, 538f)
                horizontalLineTo(526f)
                horizontalLineToRelative(314f)
                close()
            }
        }.build()
        
        return _Glucose!!
    }

private var _Glucose: ImageVector? = null


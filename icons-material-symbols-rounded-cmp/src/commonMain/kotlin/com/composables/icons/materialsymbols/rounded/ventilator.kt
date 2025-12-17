package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Ventilator: ImageVector
    get() {
        if (_Ventilator != null) return _Ventilator!!
        
        _Ventilator = ImageVector.Builder(
            name = "ventilator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 280f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                close()
                moveTo(160f, 680f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(200f, 640f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(160f, 600f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(120f, 640f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(160f, 680f)
                close()
                moveToRelative(320f, 160f)
                quadToRelative(-76f, 0f, -144f, -24f)
                reflectiveQuadToRelative(-125f, -67f)
                quadToRelative(-11f, 5f, -24f, 8f)
                reflectiveQuadToRelative(-27f, 3f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -23f, 8f, -43f)
                reflectiveQuadToRelative(22f, -36f)
                quadToRelative(-7f, -18f, -12.5f, -37f)
                reflectiveQuadTo(48f, 485f)
                quadToRelative(-3f, -17f, 7f, -30f)
                reflectiveQuadToRelative(27f, -15f)
                quadToRelative(17f, -2f, 29.5f, 8.5f)
                reflectiveQuadTo(128f, 476f)
                quadToRelative(2f, 11f, 5.5f, 22.5f)
                reflectiveQuadTo(141f, 521f)
                quadToRelative(5f, -1f, 9.5f, -1f)
                horizontalLineToRelative(9.5f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 14f, -3f, 26.5f)
                reflectiveQuadToRelative(-8f, 24.5f)
                quadToRelative(37f, 27f, 80f, 44.5f)
                reflectiveQuadToRelative(91f, 22.5f)
                verticalLineToRelative(-198f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(520f, 120f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 200f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 280f)
                horizontalLineToRelative(-40f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 360f)
                horizontalLineTo(520f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(440f, 280f)
                horizontalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(320f, 360f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(400f, 440f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(198f)
                quadToRelative(87f, -10f, 158f, -57f)
                reflectiveQuadToRelative(113f, -120f)
                lineToRelative(-13f, -7f)
                quadToRelative(-7f, -4f, -12.5f, -10f)
                reflectiveQuadToRelative(-8f, -13.5f)
                quadToRelative(-2.5f, -7.5f, -2f, -15.5f)
                reflectiveQuadToRelative(4.5f, -15f)
                quadToRelative(4f, -8f, 10f, -13f)
                reflectiveQuadToRelative(13f, -7f)
                quadToRelative(7f, -2f, 15f, -1.5f)
                reflectiveQuadToRelative(15f, 4.5f)
                lineToRelative(11f, 5f)
                lineToRelative(4f, -16f)
                lineToRelative(4f, -16f)
                quadToRelative(4f, -17f, 16.5f, -27.5f)
                reflectiveQuadTo(878f, 440f)
                quadToRelative(17f, 2f, 27f, 15f)
                reflectiveQuadToRelative(7f, 30f)
                quadToRelative(-3f, 15f, -7f, 30f)
                reflectiveQuadToRelative(-9f, 29f)
                lineToRelative(6f, 3f)
                quadToRelative(8f, 4f, 13f, 10f)
                reflectiveQuadToRelative(7.5f, 13.5f)
                quadToRelative(2.5f, 7.5f, 2f, 15f)
                reflectiveQuadTo(920f, 601f)
                quadToRelative(-4f, 7f, -10f, 12f)
                reflectiveQuadToRelative(-13f, 7.5f)
                quadToRelative(-7f, 2.5f, -14.5f, 2f)
                reflectiveQuadTo(867f, 618f)
                lineToRelative(-3f, -1f)
                quadToRelative(-57f, 101f, -159f, 162f)
                reflectiveQuadToRelative(-225f, 61f)
                close()
                moveToRelative(40f, -560f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveTo(160f, 640f)
                close()
            }
        }.build()
        
        return _Ventilator!!
    }

private var _Ventilator: ImageVector? = null


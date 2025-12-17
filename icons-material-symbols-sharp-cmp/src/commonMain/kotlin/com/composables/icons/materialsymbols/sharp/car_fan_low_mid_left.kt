package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Car_fan_low_mid_left: ImageVector
    get() {
        if (_Car_fan_low_mid_left != null) return _Car_fan_low_mid_left!!
        
        _Car_fan_low_mid_left = ImageVector.Builder(
            name = "car_fan_low_mid_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 320f)
                lineTo(480f, 200f)
                lineToRelative(120f, -120f)
                lineToRelative(42f, 42f)
                lineToRelative(-47f, 48f)
                horizontalLineToRelative(125f)
                verticalLineToRelative(60f)
                horizontalLineTo(595f)
                lineToRelative(47f, 48f)
                lineToRelative(-42f, 42f)
                close()
                moveToRelative(160f, 240f)
                lineTo(640f, 440f)
                lineToRelative(42f, -42f)
                lineToRelative(48f, 47f)
                verticalLineToRelative(-125f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(125f)
                lineToRelative(48f, -47f)
                lineToRelative(42f, 42f)
                lineToRelative(-120f, 120f)
                close()
                moveTo(320f, 240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(400f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(320f, 240f)
                close()
                moveTo(731f, 880f)
                lineTo(615f, 680f)
                horizontalLineTo(300f)
                lineToRelative(-56f, -279f)
                quadToRelative(-9f, -48f, 21.5f, -84.5f)
                reflectiveQuadTo(344f, 280f)
                quadToRelative(34f, 0f, 61f, 22f)
                reflectiveQuadToRelative(37f, 57f)
                lineToRelative(58f, 201f)
                horizontalLineToRelative(139f)
                lineToRelative(161f, 280f)
                lineToRelative(-69f, 40f)
                close()
                moveToRelative(-129f, 0f)
                horizontalLineTo(161f)
                lineTo(50f, 448f)
                quadToRelative(-5f, -17f, -7f, -32.5f)
                reflectiveQuadTo(41f, 386f)
                quadToRelative(0f, -27f, 6.5f, -54f)
                reflectiveQuadTo(67f, 279f)
                quadToRelative(9f, -18f, 25.5f, -28.5f)
                reflectiveQuadTo(129f, 240f)
                quadToRelative(23f, 0f, 40f, 17f)
                reflectiveQuadToRelative(17f, 40f)
                quadToRelative(0f, 11f, -4f, 21f)
                reflectiveQuadToRelative(-12f, 18f)
                quadToRelative(-19f, 19f, -23f, 45.5f)
                reflectiveQuadToRelative(8f, 52.5f)
                lineToRelative(20f, 42f)
                quadToRelative(33f, 71f, 49.5f, 137.5f)
                reflectiveQuadTo(241f, 743f)
                verticalLineToRelative(44f)
                quadToRelative(20f, -14f, 39f, -20.5f)
                reflectiveQuadToRelative(37f, -6.5f)
                horizontalLineToRelative(204f)
                quadToRelative(34f, 0f, 57.5f, 23.5f)
                reflectiveQuadTo(602f, 840f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Car_fan_low_mid_left!!
    }

private var _Car_fan_low_mid_left: ImageVector? = null


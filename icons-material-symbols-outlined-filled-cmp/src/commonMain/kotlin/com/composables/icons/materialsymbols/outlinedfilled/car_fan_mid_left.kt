package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Car_fan_mid_left: ImageVector
    get() {
        if (_Car_fan_mid_left != null) return _Car_fan_mid_left!!
        
        _Car_fan_mid_left = ImageVector.Builder(
            name = "car_fan_mid_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                horizontalLineTo(366f)
                quadToRelative(-29f, 0f, -51.5f, -18f)
                reflectiveQuadTo(287f, 616f)
                lineToRelative(-43f, -215f)
                quadToRelative(-9f, -48f, 21.5f, -84.5f)
                reflectiveQuadTo(344f, 280f)
                quadToRelative(34f, 0f, 61f, 22f)
                reflectiveQuadToRelative(37f, 57f)
                lineToRelative(58f, 201f)
                horizontalLineToRelative(92f)
                quadToRelative(22f, 0f, 40.5f, 10.5f)
                reflectiveQuadTo(662f, 600f)
                lineToRelative(138f, 240f)
                lineToRelative(-69f, 40f)
                close()
                moveToRelative(-51f, -440f)
                lineTo(520f, 280f)
                lineToRelative(160f, -160f)
                lineToRelative(56f, 56f)
                lineToRelative(-63f, 64f)
                horizontalLineToRelative(167f)
                verticalLineToRelative(80f)
                horizontalLineTo(673f)
                lineToRelative(64f, 64f)
                lineToRelative(-57f, 56f)
                close()
                moveTo(223f, 880f)
                quadToRelative(-27f, 0f, -48f, -16.5f)
                reflectiveQuadTo(146f, 821f)
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
                horizontalLineTo(223f)
                close()
            }
        }.build()
        
        return _Car_fan_mid_left!!
    }

private var _Car_fan_mid_left: ImageVector? = null


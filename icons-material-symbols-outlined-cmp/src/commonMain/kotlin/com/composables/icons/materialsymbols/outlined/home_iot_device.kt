package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Home_iot_device: ImageVector
    get() {
        if (_Home_iot_device != null) return _Home_iot_device!!
        
        _Home_iot_device = ImageVector.Builder(
            name = "home_iot_device",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(221f, 720f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -24f, -11f, -47f)
                reflectiveQuadToRelative(-33f, -37f)
                lineToRelative(-36f, -24f)
                verticalLineToRelative(-252f)
                quadToRelative(0f, -9f, -5.5f, -14.5f)
                reflectiveQuadTo(221f, 240f)
                quadToRelative(-9f, 0f, -14.5f, 5.5f)
                reflectiveQuadTo(201f, 260f)
                verticalLineToRelative(252f)
                lineToRelative(-36f, 24f)
                quadToRelative(-22f, 15f, -33f, 37f)
                reflectiveQuadToRelative(-11f, 47f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-75f, 0f, -127.5f, -52f)
                reflectiveQuadTo(41f, 620f)
                quadToRelative(0f, -48f, 22f, -86f)
                reflectiveQuadToRelative(58f, -62f)
                verticalLineToRelative(-212f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                verticalLineToRelative(212f)
                quadToRelative(36f, 24f, 58f, 62f)
                reflectiveQuadToRelative(22f, 86f)
                quadToRelative(0f, 75f, -52.5f, 127.5f)
                reflectiveQuadTo(221f, 800f)
                close()
                moveToRelative(327f, -200f)
                quadToRelative(-48f, -33f, -78f, -85f)
                reflectiveQuadToRelative(-30f, -115f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 63f, -30f, 115f)
                reflectiveQuadToRelative(-78f, 85f)
                horizontalLineTo(548f)
                close()
                moveToRelative(28f, -80f)
                horizontalLineToRelative(212f)
                quadToRelative(27f, -24f, 39.5f, -54f)
                reflectiveQuadToRelative(12.5f, -66f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 36f, 14.5f, 66f)
                reflectiveQuadToRelative(41.5f, 54f)
                close()
                moveToRelative(104f, 280f)
                quadToRelative(-24f, 0f, -42f, -18f)
                reflectiveQuadToRelative(-18f, -42f)
                horizontalLineToRelative(120f)
                quadToRelative(0f, 24f, -18f, 42f)
                reflectiveQuadToRelative(-42f, 18f)
                close()
                moveToRelative(-120f, -80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                close()
                moveTo(221f, 620f)
                close()
                moveToRelative(459f, -240f)
                close()
            }
        }.build()
        
        return _Home_iot_device!!
    }

private var _Home_iot_device: ImageVector? = null


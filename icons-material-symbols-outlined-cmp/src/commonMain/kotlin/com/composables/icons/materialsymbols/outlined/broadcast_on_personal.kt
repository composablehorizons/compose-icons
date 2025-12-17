package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Broadcast_on_personal: ImageVector
    get() {
        if (_Broadcast_on_personal != null) return _Broadcast_on_personal!!
        
        _Broadcast_on_personal = ImageVector.Builder(
            name = "broadcast_on_personal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 450f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-480f)
                lineToRelative(320f, -240f)
                lineToRelative(270f, 201f)
                quadToRelative(-28f, 1f, -54f, 6f)
                reflectiveQuadToRelative(-51f, 15f)
                lineTo(400f, 180f)
                lineTo(160f, 360f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(224f)
                quadToRelative(9f, 22f, 21.5f, 42f)
                reflectiveQuadToRelative(26.5f, 38f)
                horizontalLineTo(80f)
                close()
                moveToRelative(416f, -16f)
                quadToRelative(-35f, -38f, -55.5f, -85.5f)
                reflectiveQuadTo(420f, 600f)
                quadToRelative(0f, -109f, 76f, -184.5f)
                reflectiveQuadTo(680f, 340f)
                quadToRelative(109f, 0f, 184.5f, 75.5f)
                reflectiveQuadTo(940f, 600f)
                quadToRelative(0f, 51f, -19f, 98.5f)
                reflectiveQuadTo(865f, 783f)
                lineToRelative(-43f, -43f)
                quadToRelative(29f, -29f, 43.5f, -65f)
                reflectiveQuadToRelative(14.5f, -75f)
                quadToRelative(0f, -84f, -58f, -142f)
                reflectiveQuadToRelative(-142f, -58f)
                quadToRelative(-83f, 0f, -141.5f, 58f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(0f, 39f, 15.5f, 75.5f)
                reflectiveQuadTo(539f, 741f)
                lineToRelative(-43f, 43f)
                close()
                moveToRelative(71f, -71f)
                quadToRelative(-22f, -23f, -34.5f, -52f)
                reflectiveQuadTo(520f, 600f)
                quadToRelative(0f, -67f, 47f, -113.5f)
                reflectiveQuadTo(680f, 440f)
                quadToRelative(67f, 0f, 113.5f, 46.5f)
                reflectiveQuadTo(840f, 600f)
                quadToRelative(0f, 31f, -11.5f, 60f)
                reflectiveQuadTo(794f, 712f)
                lineToRelative(-43f, -42f)
                quadToRelative(14f, -14f, 21.5f, -32f)
                reflectiveQuadToRelative(7.5f, -38f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 20f, 8f, 38f)
                reflectiveQuadToRelative(22f, 32f)
                lineToRelative(-43f, 43f)
                close()
                moveToRelative(83f, 127f)
                verticalLineToRelative(-200f)
                quadToRelative(-9f, -8f, -14.5f, -18.5f)
                reflectiveQuadTo(630f, 600f)
                quadToRelative(0f, -21f, 15f, -35.5f)
                reflectiveQuadToRelative(35f, -14.5f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(730f, 600f)
                quadToRelative(0f, 11f, -4.5f, 22f)
                reflectiveQuadTo(710f, 640f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-60f)
                close()
            }
        }.build()
        
        return _Broadcast_on_personal!!
    }

private var _Broadcast_on_personal: ImageVector? = null


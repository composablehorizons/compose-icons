package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Broadcast_on_home: ImageVector
    get() {
        if (_Broadcast_on_home != null) return _Broadcast_on_home!!
        
        _Broadcast_on_home = ImageVector.Builder(
            name = "broadcast_on_home",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(880f, 311f)
                quadToRelative(-18f, -14f, -38f, -26f)
                reflectiveQuadToRelative(-42f, -21f)
                verticalLineToRelative(-104f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(231f)
                close()
                moveTo(80f, 720f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(440f)
                horizontalLineTo(80f)
                close()
                moveToRelative(570f, 80f)
                verticalLineToRelative(-200f)
                quadToRelative(-9f, -8f, -14.5f, -18.5f)
                reflectiveQuadTo(630f, 560f)
                quadToRelative(0f, -21f, 15f, -35.5f)
                reflectiveQuadToRelative(35f, -14.5f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(730f, 560f)
                quadToRelative(0f, 11f, -4.5f, 22f)
                reflectiveQuadTo(710f, 600f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-154f, -56f)
                quadToRelative(-35f, -38f, -55.5f, -85.5f)
                reflectiveQuadTo(420f, 560f)
                quadToRelative(0f, -109f, 76f, -184.5f)
                reflectiveQuadTo(680f, 300f)
                quadToRelative(109f, 0f, 184.5f, 75.5f)
                reflectiveQuadTo(940f, 560f)
                quadToRelative(0f, 51f, -19f, 98.5f)
                reflectiveQuadTo(865f, 743f)
                lineToRelative(-43f, -43f)
                quadToRelative(29f, -29f, 43.5f, -65f)
                reflectiveQuadToRelative(14.5f, -75f)
                quadToRelative(0f, -84f, -58f, -142f)
                reflectiveQuadToRelative(-142f, -58f)
                quadToRelative(-83f, 0f, -141.5f, 58f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(0f, 39f, 15.5f, 75.5f)
                reflectiveQuadTo(539f, 701f)
                lineToRelative(-43f, 43f)
                close()
                moveTo(160f, 640f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-280f)
                horizontalLineTo(160f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(120f)
                horizontalLineToRelative(-120f)
                close()
                moveToRelative(407f, 33f)
                quadToRelative(-22f, -23f, -34.5f, -52f)
                reflectiveQuadTo(520f, 560f)
                quadToRelative(0f, -67f, 47f, -113.5f)
                reflectiveQuadTo(680f, 400f)
                quadToRelative(67f, 0f, 113.5f, 46.5f)
                reflectiveQuadTo(840f, 560f)
                quadToRelative(0f, 31f, -11.5f, 60f)
                reflectiveQuadTo(794f, 672f)
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
            }
        }.build()
        
        return _Broadcast_on_home!!
    }

private var _Broadcast_on_home: ImageVector? = null


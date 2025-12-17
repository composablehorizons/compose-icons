package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Garage_check: ImageVector
    get() {
        if (_Garage_check != null) return _Garage_check!!
        
        _Garage_check = ImageVector.Builder(
            name = "garage_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(292f)
                verticalLineToRelative(-12f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(40f, -356f)
                verticalLineToRelative(264f)
                quadToRelative(0f, 14f, 9f, 23f)
                reflectiveQuadToRelative(23f, 9f)
                horizontalLineToRelative(16f)
                quadToRelative(14f, 0f, 23f, -9f)
                reflectiveQuadToRelative(9f, -23f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(167f)
                quadToRelative(5f, -22f, 12.5f, -41.5f)
                reflectiveQuadTo(478f, 580f)
                horizontalLineTo(280f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(336f)
                quadToRelative(34f, -14f, 71f, -18f)
                reflectiveQuadToRelative(73f, 1f)
                lineToRelative(-66f, -191f)
                quadToRelative(-5f, -14f, -16.5f, -23f)
                reflectiveQuadToRelative(-25.5f, -9f)
                horizontalLineTo(308f)
                quadToRelative(-14f, 0f, -25.5f, 9f)
                reflectiveQuadTo(266f, 252f)
                lineToRelative(-66f, 192f)
                close()
                moveToRelative(106f, -64f)
                lineToRelative(28f, -80f)
                horizontalLineToRelative(292f)
                lineToRelative(28f, 80f)
                horizontalLineTo(306f)
                close()
                moveToRelative(54f, 180f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 520f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 560f)
                close()
                moveToRelative(332f, 250f)
                lineToRelative(142f, -142f)
                lineToRelative(-30f, -30f)
                lineToRelative(-112f, 112f)
                lineToRelative(-56f, -56f)
                lineToRelative(-30f, 30f)
                lineToRelative(86f, 86f)
                close()
                moveToRelative(28f, -290f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(331f)
                quadToRelative(-18f, -13f, -38f, -22.5f)
                reflectiveQuadTo(800f, 452f)
                verticalLineToRelative(-292f)
                horizontalLineTo(160f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(292f)
                quadToRelative(7f, 22f, 16.5f, 42f)
                reflectiveQuadTo(491f, 880f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Garage_check!!
    }

private var _Garage_check: ImageVector? = null


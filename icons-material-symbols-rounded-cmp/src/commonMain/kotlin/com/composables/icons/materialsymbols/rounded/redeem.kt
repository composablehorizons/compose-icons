package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Redeem: ImageVector
    get() {
        if (_Redeem != null) return _Redeem!!
        
        _Redeem = ImageVector.Builder(
            name = "redeem",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 680f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -440f)
                horizontalLineToRelative(88f)
                quadToRelative(-5f, -9f, -6.5f, -19f)
                reflectiveQuadToRelative(-1.5f, -21f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(30f, 0f, 55.5f, 15.5f)
                reflectiveQuadTo(460f, 134f)
                lineToRelative(20f, 26f)
                lineToRelative(20f, -26f)
                quadToRelative(18f, -24f, 44f, -39f)
                reflectiveQuadToRelative(56f, -15f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 11f, -1.5f, 21f)
                reflectiveQuadToRelative(-6.5f, 19f)
                horizontalLineToRelative(88f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 240f)
                close()
                moveToRelative(0f, 320f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-240f)
                horizontalLineTo(596f)
                lineToRelative(60f, 82f)
                quadToRelative(10f, 14f, 8f, 29.5f)
                reflectiveQuadTo(648f, 457f)
                quadToRelative(-14f, 10f, -29.5f, 7.5f)
                reflectiveQuadTo(593f, 449f)
                lineTo(480f, 296f)
                lineTo(367f, 449f)
                quadToRelative(-10f, 13f, -25.5f, 15.5f)
                reflectiveQuadTo(312f, 457f)
                quadToRelative(-14f, -10f, -16.5f, -25.5f)
                reflectiveQuadTo(303f, 402f)
                lineToRelative(59f, -82f)
                horizontalLineTo(160f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(200f, -320f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 240f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(560f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(600f, 240f)
                close()
            }
        }.build()
        
        return _Redeem!!
    }

private var _Redeem: ImageVector? = null


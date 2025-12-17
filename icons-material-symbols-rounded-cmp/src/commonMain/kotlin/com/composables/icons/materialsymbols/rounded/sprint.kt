package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Sprint: ImageVector
    get() {
        if (_Sprint != null) return _Sprint!!
        
        _Sprint = ImageVector.Builder(
            name = "sprint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(482f, 535f)
                lineTo(245f, 772f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(188f, 772f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(356f, -355f)
                horizontalLineTo(440f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 400f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 280f)
                horizontalLineToRelative(194f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(120f, 119f)
                quadToRelative(20f, 20f, 46.5f, 33.5f)
                reflectiveQuadTo(874f, 475f)
                quadToRelative(17f, 3f, 29.5f, 15.5f)
                reflectiveQuadTo(916f, 520f)
                quadToRelative(0f, 17f, -14f, 28f)
                reflectiveQuadToRelative(-31f, 9f)
                quadToRelative(-45f, -6f, -83f, -24f)
                reflectiveQuadToRelative(-70f, -49f)
                lineToRelative(-40f, -42f)
                lineToRelative(-88f, 88f)
                lineToRelative(53f, 53f)
                quadToRelative(14f, 14f, 11.5f, 33.5f)
                reflectiveQuadTo(635f, 646f)
                lineTo(453f, 751f)
                quadToRelative(-14f, 8f, -30.5f, 4f)
                reflectiveQuadTo(398f, 737f)
                quadToRelative(-8f, -14f, -3.5f, -30.5f)
                reflectiveQuadTo(413f, 682f)
                lineToRelative(137f, -79f)
                lineToRelative(-68f, -68f)
                close()
                moveToRelative(-322f, -15f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 440f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 520f)
                horizontalLineTo(160f)
                close()
                moveTo(80f, 400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 320f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(240f, 360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 400f)
                horizontalLineTo(80f)
                close()
                moveToRelative(699f, -80f)
                quadToRelative(-33f, 0f, -57f, -23.5f)
                reflectiveQuadTo(698f, 240f)
                quadToRelative(0f, -33f, 24f, -56.5f)
                reflectiveQuadToRelative(57f, -23.5f)
                quadToRelative(33f, 0f, 57f, 23.5f)
                reflectiveQuadToRelative(24f, 56.5f)
                quadToRelative(0f, 33f, -24f, 56.5f)
                reflectiveQuadTo(779f, 320f)
                close()
                moveToRelative(-619f, -40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 200f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 280f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Sprint!!
    }

private var _Sprint: ImageVector? = null


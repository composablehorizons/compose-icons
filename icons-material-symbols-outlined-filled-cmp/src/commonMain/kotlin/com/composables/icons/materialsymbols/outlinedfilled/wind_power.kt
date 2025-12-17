package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Wind_power: ImageVector
    get() {
        if (_Wind_power != null) return _Wind_power!!
        
        _Wind_power = ImageVector.Builder(
            name = "wind_power",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 920f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 840f)
                verticalLineToRelative(-229f)
                quadToRelative(9f, 4f, 19f, 6f)
                reflectiveQuadToRelative(21f, 2f)
                quadToRelative(42f, 0f, 70.5f, -28.5f)
                reflectiveQuadTo(619f, 520f)
                verticalLineToRelative(-9f)
                lineToRelative(128f, 31f)
                quadToRelative(16f, 4f, 29f, 14f)
                reflectiveQuadToRelative(21f, 24f)
                lineToRelative(91f, 164f)
                quadToRelative(15f, 27f, 11f, 57f)
                reflectiveQuadToRelative(-26f, 52f)
                quadToRelative(-27f, 27f, -64.5f, 27f)
                reflectiveQuadTo(744f, 853f)
                lineTo(560f, 669f)
                verticalLineToRelative(171f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 920f)
                horizontalLineTo(400f)
                close()
                moveToRelative(-280f, -80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(166f, -170f)
                lineToRelative(-180f, -51f)
                quadToRelative(-29f, -8f, -47.5f, -32.5f)
                reflectiveQuadTo(40f, 531f)
                quadToRelative(0f, -38f, 26.5f, -64.5f)
                reflectiveQuadTo(131f, 440f)
                horizontalLineToRelative(330f)
                quadToRelative(-19f, 14f, -29.5f, 34.5f)
                reflectiveQuadTo(421f, 520f)
                quadToRelative(0f, 23f, 9f, 42f)
                reflectiveQuadToRelative(25f, 33f)
                lineToRelative(-105f, 67f)
                quadToRelative(-14f, 8f, -30.5f, 10.5f)
                reflectiveQuadTo(286f, 670f)
                close()
                moveToRelative(234f, -90f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(460f, 520f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(520f, 460f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(580f, 520f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(520f, 580f)
                close()
                moveToRelative(92f, -98f)
                quadToRelative(-11f, -27f, -35.5f, -44f)
                reflectiveQuadTo(520f, 421f)
                quadToRelative(-11f, 0f, -21f, 2f)
                reflectiveQuadToRelative(-19f, 6f)
                verticalLineToRelative(-158f)
                quadToRelative(0f, -17f, 6.5f, -32f)
                reflectiveQuadToRelative(18.5f, -26f)
                lineToRelative(137f, -128f)
                quadToRelative(23f, -22f, 53.5f, -25f)
                reflectiveQuadToRelative(56.5f, 13f)
                quadToRelative(32f, 20f, 41.5f, 56.5f)
                reflectiveQuadTo(783f, 198f)
                lineTo(612f, 482f)
                close()
                moveTo(40f, 360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(120f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Wind_power!!
    }

private var _Wind_power: ImageVector? = null


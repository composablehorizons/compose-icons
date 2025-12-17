package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Construction: ImageVector
    get() {
        if (_Construction != null) return _Construction!!
        
        _Construction = ImageVector.Builder(
            name = "construction",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(714f, 798f)
                lineTo(537f, 621f)
                lineToRelative(84f, -84f)
                lineToRelative(177f, 177f)
                quadToRelative(17f, 17f, 17f, 42f)
                reflectiveQuadToRelative(-17f, 42f)
                quadToRelative(-17f, 17f, -42f, 17f)
                reflectiveQuadToRelative(-42f, -17f)
                close()
                moveToRelative(-552f, 0f)
                quadToRelative(-17f, -17f, -17f, -42f)
                reflectiveQuadToRelative(17f, -42f)
                lineToRelative(234f, -234f)
                lineToRelative(-68f, -68f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-23f, -23f)
                verticalLineToRelative(90f)
                quadToRelative(0f, 14f, -12f, 19f)
                reflectiveQuadToRelative(-22f, -5f)
                lineTo(106f, 384f)
                quadToRelative(-10f, -10f, -5f, -22f)
                reflectiveQuadToRelative(19f, -12f)
                horizontalLineToRelative(90f)
                lineToRelative(-22f, -22f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(114f, -114f)
                quadToRelative(20f, -20f, 43f, -29f)
                reflectiveQuadToRelative(47f, -9f)
                quadToRelative(20f, 0f, 37.5f, 6f)
                reflectiveQuadToRelative(34.5f, 18f)
                quadToRelative(8f, 5f, 8.5f, 14f)
                reflectiveQuadToRelative(-6.5f, 16f)
                lineToRelative(-76f, 76f)
                lineToRelative(22f, 22f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(68f, 68f)
                lineToRelative(90f, -90f)
                quadToRelative(-4f, -11f, -6.5f, -23f)
                reflectiveQuadToRelative(-2.5f, -24f)
                quadToRelative(0f, -59f, 40.5f, -99.5f)
                reflectiveQuadTo(701f, 119f)
                quadToRelative(8f, 0f, 15f, 0.5f)
                reflectiveQuadToRelative(14f, 2.5f)
                quadToRelative(9f, 3f, 11.5f, 12.5f)
                reflectiveQuadTo(737f, 151f)
                lineToRelative(-65f, 65f)
                quadToRelative(-6f, 6f, -6f, 14f)
                reflectiveQuadToRelative(6f, 14f)
                lineToRelative(44f, 44f)
                quadToRelative(6f, 6f, 14f, 6f)
                reflectiveQuadToRelative(14f, -6f)
                lineToRelative(65f, -65f)
                quadToRelative(7f, -7f, 16.5f, -5f)
                reflectiveQuadToRelative(12.5f, 12f)
                quadToRelative(2f, 7f, 2.5f, 14f)
                reflectiveQuadToRelative(0.5f, 15f)
                quadToRelative(0f, 59f, -40.5f, 99.5f)
                reflectiveQuadTo(701f, 399f)
                quadToRelative(-12f, 0f, -24f, -2f)
                reflectiveQuadToRelative(-23f, -7f)
                lineTo(246f, 798f)
                quadToRelative(-17f, 17f, -42f, 17f)
                reflectiveQuadToRelative(-42f, -17f)
                close()
            }
        }.build()
        
        return _Construction!!
    }

private var _Construction: ImageVector? = null


package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Plumbing: ImageVector
    get() {
        if (_Plumbing != null) return _Plumbing!!
        
        _Plumbing = ImageVector.Builder(
            name = "plumbing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(771f, 367f)
                lineTo(630f, 226f)
                lineToRelative(-85f, 84f)
                lineToRelative(-85f, -84f)
                lineToRelative(113f, -114f)
                quadToRelative(12f, -12f, 27f, -17.5f)
                reflectiveQuadToRelative(30f, -5.5f)
                quadToRelative(16f, 0f, 30.5f, 5.5f)
                reflectiveQuadTo(686f, 112f)
                lineToRelative(85f, 85f)
                quadToRelative(18f, 17f, 26.5f, 39.5f)
                reflectiveQuadTo(806f, 282f)
                quadToRelative(0f, 23f, -8.5f, 45f)
                reflectiveQuadTo(771f, 367f)
                close()
                moveTo(220f, 551f)
                quadToRelative(-18f, -18f, -18f, -42.5f)
                reflectiveQuadToRelative(18f, -42.5f)
                lineToRelative(98f, -99f)
                lineToRelative(85f, 85f)
                lineToRelative(-99f, 99f)
                quadToRelative(-17f, 18f, -41.5f, 18f)
                reflectiveQuadTo(220f, 551f)
                close()
                moveToRelative(-43f, 297f)
                quadToRelative(-11f, -12f, -17f, -26.5f)
                reflectiveQuadToRelative(-6f, -30.5f)
                quadToRelative(0f, -16f, 5.5f, -30.5f)
                reflectiveQuadTo(177f, 734f)
                lineToRelative(283f, -282f)
                lineToRelative(-127f, -128f)
                quadToRelative(-18f, -17f, -18f, -41.5f)
                reflectiveQuadToRelative(18f, -42.5f)
                quadToRelative(17f, -18f, 42f, -18f)
                reflectiveQuadToRelative(43f, 18f)
                lineToRelative(127f, 127f)
                lineToRelative(57f, -57f)
                lineToRelative(112f, 114f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(290f, 848f)
                quadToRelative(-12f, 12f, -26.5f, 17.5f)
                reflectiveQuadTo(234f, 871f)
                quadToRelative(-15f, 0f, -30f, -6f)
                reflectiveQuadToRelative(-27f, -17f)
                close()
            }
        }.build()
        
        return _Plumbing!!
    }

private var _Plumbing: ImageVector? = null


package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Rotate_left: ImageVector
    get() {
        if (_Rotate_left != null) return _Rotate_left!!
        
        _Rotate_left = ImageVector.Builder(
            name = "rotate_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(170f, 482f)
                quadToRelative(-21f, 0f, -33.5f, -15f)
                reflectiveQuadToRelative(-7.5f, -35f)
                quadToRelative(6f, -25f, 16f, -48f)
                reflectiveQuadToRelative(23f, -45f)
                quadToRelative(10f, -17f, 29.5f, -19f)
                reflectiveQuadToRelative(34.5f, 12f)
                quadToRelative(9f, 9f, 11f, 22.5f)
                reflectiveQuadToRelative(-5f, 24.5f)
                quadToRelative(-10f, 17f, -17.5f, 35.5f)
                reflectiveQuadTo(208f, 452f)
                quadToRelative(-3f, 13f, -14.5f, 21.5f)
                reflectiveQuadTo(170f, 482f)
                close()
                moveToRelative(268f, 348f)
                quadToRelative(0f, 22f, -15f, 34f)
                reflectiveQuadToRelative(-35f, 7f)
                quadToRelative(-24f, -7f, -47f, -16.5f)
                reflectiveQuadTo(295f, 832f)
                quadToRelative(-17f, -10f, -19f, -29.5f)
                reflectiveQuadToRelative(12f, -34.5f)
                quadToRelative(9f, -9f, 22.5f, -11f)
                reflectiveQuadToRelative(24.5f, 5f)
                quadToRelative(17f, 10f, 35.5f, 17.5f)
                reflectiveQuadTo(408f, 792f)
                quadToRelative(13f, 3f, 21.5f, 14.5f)
                reflectiveQuadTo(438f, 830f)
                close()
                moveTo(232f, 712f)
                quadToRelative(-15f, 14f, -34.5f, 12f)
                reflectiveQuadTo(168f, 705f)
                quadToRelative(-13f, -23f, -22.5f, -46f)
                reflectiveQuadTo(129f, 612f)
                quadToRelative(-5f, -20f, 7f, -35f)
                reflectiveQuadToRelative(34f, -15f)
                quadToRelative(13f, 0f, 24f, 8.5f)
                reflectiveQuadToRelative(14f, 21.5f)
                quadToRelative(5f, 19f, 12.5f, 37.5f)
                reflectiveQuadTo(238f, 665f)
                quadToRelative(7f, 11f, 5f, 25f)
                reflectiveQuadToRelative(-11f, 22f)
                close()
                moveTo(567f, 870f)
                quadToRelative(-20f, 5f, -34.5f, -7f)
                reflectiveQuadTo(518f, 830f)
                quadToRelative(0f, -13f, 8.5f, -24f)
                reflectiveQuadToRelative(21.5f, -14f)
                quadToRelative(92f, -24f, 151f, -98.5f)
                reflectiveQuadTo(758f, 522f)
                quadToRelative(0f, -117f, -81.5f, -198.5f)
                reflectiveQuadTo(478f, 242f)
                horizontalLineToRelative(-8f)
                lineToRelative(36f, 36f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(346f, 230f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadToRelative(-2.5f, -15f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(103f, -104f)
                quadToRelative(12f, -11f, 29f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(12f, 12f, 12f, 29f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-35f, 35f)
                horizontalLineToRelative(6f)
                quadToRelative(150f, 0f, 255f, 105f)
                reflectiveQuadToRelative(105f, 255f)
                quadToRelative(0f, 124f, -76f, 220f)
                reflectiveQuadTo(567f, 870f)
                close()
            }
        }.build()
        
        return _Rotate_left!!
    }

private var _Rotate_left: ImageVector? = null


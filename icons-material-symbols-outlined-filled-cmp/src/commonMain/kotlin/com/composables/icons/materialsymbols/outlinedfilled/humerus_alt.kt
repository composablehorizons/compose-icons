package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Humerus_alt: ImageVector
    get() {
        if (_Humerus_alt != null) return _Humerus_alt!!
        
        _Humerus_alt = ImageVector.Builder(
            name = "humerus_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 511f)
                lineToRelative(220f, -351f)
                quadToRelative(75f, 37f, 139f, 101.5f)
                reflectiveQuadTo(535f, 396f)
                quadToRelative(36f, -38f, 79.5f, -61f)
                reflectiveQuadTo(736f, 292f)
                quadToRelative(46f, -13f, 79.5f, -25f)
                reflectiveQuadToRelative(64.5f, -27f)
                verticalLineToRelative(386f)
                lineTo(580f, 815f)
                quadToRelative(-19f, 12f, -40.5f, 18.5f)
                reflectiveQuadTo(494f, 840f)
                quadToRelative(-30f, 0f, -58f, -11.5f)
                reflectiveQuadTo(385f, 796f)
                lineTo(80f, 511f)
                close()
                moveToRelative(320f, 129f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 600f)
                verticalLineToRelative(-4f)
                quadToRelative(0f, -2f, -1f, -4f)
                quadToRelative(17f, 0f, 29f, -11.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(440f, 512f)
                quadToRelative(-8f, 0f, -15.5f, 3.5f)
                reflectiveQuadTo(412f, 524f)
                lineTo(309f, 408f)
                quadToRelative(5f, -5f, 8f, -12.5f)
                reflectiveQuadToRelative(3f, -15.5f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(280f, 340f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 380f)
                verticalLineToRelative(4f)
                quadToRelative(0f, 2f, 1f, 4f)
                quadToRelative(-17f, 0f, -29f, 11.5f)
                reflectiveQuadTo(200f, 428f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 468f)
                quadToRelative(9f, 0f, 16.5f, -3.5f)
                reflectiveQuadTo(269f, 455f)
                lineToRelative(103f, 116f)
                quadToRelative(-6f, 5f, -9f, 13f)
                reflectiveQuadToRelative(-3f, 16f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 640f)
                close()
            }
        }.build()
        
        return _Humerus_alt!!
    }

private var _Humerus_alt: ImageVector? = null


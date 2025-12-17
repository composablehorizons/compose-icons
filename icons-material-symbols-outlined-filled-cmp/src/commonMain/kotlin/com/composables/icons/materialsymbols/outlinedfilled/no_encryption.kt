package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.No_encryption: ImageVector
    get() {
        if (_No_encryption != null) return _No_encryption!!
        
        _No_encryption = ImageVector.Builder(
            name = "no_encryption",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 686f)
                lineTo(434f, 320f)
                horizontalLineToRelative(166f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -50f, -34.5f, -85f)
                reflectiveQuadTo(481f, 120f)
                quadToRelative(-50f, 0f, -84f, 35f)
                reflectiveQuadToRelative(-34f, 85f)
                verticalLineToRelative(9f)
                lineToRelative(-73f, -73f)
                quadToRelative(22f, -61f, 74f, -98.5f)
                reflectiveQuadTo(481f, 40f)
                quadToRelative(83f, 0f, 141f, 58.5f)
                reflectiveQuadTo(680f, 240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 400f)
                verticalLineToRelative(286f)
                close()
                moveToRelative(20f, 246f)
                lineToRelative(-62f, -62f)
                quadToRelative(-9f, 5f, -18.5f, 7.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -26f, 14.5f, -46.5f)
                reflectiveQuadTo(212f, 324f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(425f, 537f)
                quadToRelative(-11f, 12f, -17f, 26.5f)
                reflectiveQuadToRelative(-6f, 30.5f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(482f, 674f)
                quadToRelative(16f, 0f, 30.5f, -6f)
                reflectiveQuadToRelative(26.5f, -17f)
                lineTo(425f, 537f)
                close()
            }
        }.build()
        
        return _No_encryption!!
    }

private var _No_encryption: ImageVector? = null


package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Exposure_neg_1: ImageVector
    get() {
        if (_Exposure_neg_1 != null) return _Exposure_neg_1!!
        
        _Exposure_neg_1 = ImageVector.Builder(
            name = "exposure_neg_1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 560f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 480f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 560f)
                close()
                moveToRelative(270f, -238f)
                lineToRelative(-57f, 41f)
                quadToRelative(-14f, 11f, -31.5f, 7.5f)
                reflectiveQuadTo(514f, 352f)
                quadToRelative(-9f, -14f, -6f, -30.5f)
                reflectiveQuadToRelative(17f, -26.5f)
                lineToRelative(123f, -89f)
                quadToRelative(4f, -3f, 8.5f, -4.5f)
                reflectiveQuadToRelative(9.5f, -1.5f)
                horizontalLineToRelative(22f)
                quadToRelative(14f, 0f, 23f, 9f)
                reflectiveQuadToRelative(9f, 23f)
                verticalLineToRelative(483f)
                quadToRelative(0f, 19f, -13f, 32f)
                reflectiveQuadToRelative(-32f, 13f)
                quadToRelative(-19f, 0f, -32f, -13f)
                reflectiveQuadToRelative(-13f, -32f)
                verticalLineToRelative(-393f)
                close()
            }
        }.build()
        
        return _Exposure_neg_1!!
    }

private var _Exposure_neg_1: ImageVector? = null


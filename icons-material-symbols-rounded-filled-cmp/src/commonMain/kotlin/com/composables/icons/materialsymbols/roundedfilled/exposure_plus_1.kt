package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Exposure_plus_1: ImageVector
    get() {
        if (_Exposure_plus_1 != null) return _Exposure_plus_1!!
        
        _Exposure_plus_1 = ImageVector.Builder(
            name = "exposure_plus_1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 560f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 400f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 560f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 680f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 640f)
                verticalLineToRelative(-80f)
                close()
                moveToRelative(390f, -238f)
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
        
        return _Exposure_plus_1!!
    }

private var _Exposure_plus_1: ImageVector? = null


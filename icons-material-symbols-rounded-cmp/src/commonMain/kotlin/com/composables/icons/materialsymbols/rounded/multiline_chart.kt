package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Multiline_chart: ImageVector
    get() {
        if (_Multiline_chart != null) return _Multiline_chart!!
        
        _Multiline_chart = ImageVector.Builder(
            name = "multiline_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 662f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 702f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 662f)
                quadToRelative(-6f, -50f, -20.5f, -95.5f)
                reflectiveQuadTo(702f, 480f)
                lineTo(600f, 595f)
                quadToRelative(-23f, 26f, -57f, 27f)
                reflectiveQuadToRelative(-59f, -23f)
                lineTo(380f, 496f)
                lineTo(165f, 711f)
                quadToRelative(-12f, 12f, -28.5f, 11.5f)
                reflectiveQuadTo(108f, 710f)
                quadToRelative(-11f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                lineToRelative(215f, -215f)
                quadToRelative(23f, -23f, 57f, -23f)
                reflectiveQuadToRelative(57f, 23f)
                lineToRelative(103f, 103f)
                lineToRelative(116f, -130f)
                quadToRelative(-51f, -60f, -120f, -95f)
                reflectiveQuadToRelative(-152f, -35f)
                quadToRelative(-71f, 0f, -134f, 26.5f)
                reflectiveQuadTo(136f, 380f)
                quadToRelative(-6f, 5f, -13f, 8f)
                reflectiveQuadToRelative(-15f, 3f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(68f, 351f)
                quadToRelative(0f, -8f, 3f, -16f)
                reflectiveQuadToRelative(9f, -13f)
                quadToRelative(61f, -55f, 139f, -87.5f)
                reflectiveQuadTo(384f, 202f)
                quadToRelative(98f, 0f, 181f, 39.5f)
                reflectiveQuadTo(710f, 352f)
                lineToRelative(85f, -97f)
                quadToRelative(11f, -14f, 29f, -14.5f)
                reflectiveQuadToRelative(30f, 12.5f)
                quadToRelative(11f, 11f, 11.5f, 27f)
                reflectiveQuadTo(855f, 308f)
                lineToRelative(-95f, 108f)
                quadToRelative(29f, 47f, 54.5f, 119f)
                reflectiveQuadTo(840f, 662f)
                close()
            }
        }.build()
        
        return _Multiline_chart!!
    }

private var _Multiline_chart: ImageVector? = null


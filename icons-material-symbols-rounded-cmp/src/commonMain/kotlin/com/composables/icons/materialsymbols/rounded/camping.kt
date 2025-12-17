package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Camping: ImageVector
    get() {
        if (_Camping != null) return _Camping!!
        
        _Camping = ImageVector.Builder(
            name = "camping",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -13f, 4f, -25f)
                reflectiveQuadToRelative(12f, -23f)
                lineToRelative(334f, -450f)
                lineToRelative(-46f, -62f)
                quadToRelative(-5f, -7f, -7f, -14.5f)
                reflectiveQuadToRelative(-1f, -15f)
                quadToRelative(1f, -7.5f, 5f, -14.5f)
                reflectiveQuadToRelative(11f, -12f)
                quadToRelative(14f, -10f, 30f, -8f)
                reflectiveQuadToRelative(26f, 16f)
                lineToRelative(32f, 43f)
                lineToRelative(32f, -43f)
                quadToRelative(10f, -14f, 26f, -16f)
                reflectiveQuadToRelative(30f, 8f)
                quadToRelative(14f, 10f, 16f, 26f)
                reflectiveQuadToRelative(-8f, 30f)
                lineToRelative(-46f, 62f)
                lineToRelative(334f, 450f)
                quadToRelative(8f, 11f, 12f, 23f)
                reflectiveQuadToRelative(4f, 25f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 880f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 840f)
                close()
                moveToRelative(400f, -551f)
                lineTo(160f, 720f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                lineToRelative(167f, -234f)
                quadToRelative(12f, -17f, 33f, -17f)
                reflectiveQuadToRelative(33f, 17f)
                lineToRelative(167f, 234f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                lineTo(480f, 289f)
                close()
                moveTo(378f, 800f)
                horizontalLineToRelative(204f)
                lineTo(480f, 658f)
                lineTo(378f, 800f)
                close()
                moveToRelative(135f, -234f)
                lineToRelative(167f, 234f)
                lineToRelative(-167f, -234f)
                quadToRelative(-12f, -17f, -33f, -17f)
                reflectiveQuadToRelative(-33f, 17f)
                lineTo(280f, 800f)
                lineToRelative(167f, -234f)
                quadToRelative(12f, -17f, 33f, -17f)
                reflectiveQuadToRelative(33f, 17f)
                close()
            }
        }.build()
        
        return _Camping!!
    }

private var _Camping: ImageVector? = null


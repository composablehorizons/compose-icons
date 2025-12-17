package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Hand_meal: ImageVector
    get() {
        if (_Hand_meal != null) return _Hand_meal!!
        
        _Hand_meal = ImageVector.Builder(
            name = "hand_meal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(99f)
                quadToRelative(34f, -97f, 114.5f, -162f)
                reflectiveQuadTo(440f, 121f)
                verticalLineToRelative(-41f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(41f)
                quadToRelative(105f, 12f, 185.5f, 77f)
                reflectiveQuadTo(820f, 360f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(280f, 400f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(272f)
                quadToRelative(14f, 0f, 24f, 8f)
                reflectiveQuadToRelative(14f, 19f)
                quadToRelative(4f, 11f, 1.5f, 23f)
                reflectiveQuadTo(618f, 591f)
                lineToRelative(-59f, 49f)
                horizontalLineTo(400f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(180f)
                lineToRelative(162f, -134f)
                quadToRelative(22f, -16f, 46.5f, -20f)
                reflectiveQuadToRelative(48.5f, 2f)
                quadToRelative(24f, 6f, 45.5f, 20.5f)
                reflectiveQuadTo(919f, 606f)
                lineTo(684f, 803f)
                quadToRelative(-22f, 18f, -48f, 27.5f)
                reflectiveQuadToRelative(-54f, 9.5f)
                horizontalLineTo(320f)
                close()
                moveTo(120f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 840f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 520f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 880f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Hand_meal!!
    }

private var _Hand_meal: ImageVector? = null


package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Photo_prints: ImageVector
    get() {
        if (_Photo_prints != null) return _Photo_prints!!
        
        _Photo_prints = ImageVector.Builder(
            name = "photo_prints",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(581f, 560f)
                quadToRelative(68f, 0f, 115.5f, -47f)
                reflectiveQuadTo(749f, 400f)
                quadToRelative(-68f, 0f, -116.5f, 47f)
                reflectiveQuadTo(581f, 560f)
                close()
                moveToRelative(0f, 0f)
                quadToRelative(-3f, -66f, -51.5f, -113f)
                reflectiveQuadTo(413f, 400f)
                quadToRelative(5f, 66f, 52.5f, 113f)
                reflectiveQuadTo(581f, 560f)
                close()
                moveToRelative(0f, -120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(621f, 400f)
                verticalLineToRelative(-10f)
                lineToRelative(10f, 4f)
                quadToRelative(15f, 6f, 30.5f, 3f)
                reflectiveQuadToRelative(23.5f, -17f)
                quadToRelative(9f, -15f, 6f, -32f)
                reflectiveQuadToRelative(-20f, -24f)
                lineToRelative(-10f, -4f)
                lineToRelative(10f, -4f)
                quadToRelative(17f, -7f, 19.5f, -24.5f)
                reflectiveQuadTo(685f, 260f)
                quadToRelative(-9f, -15f, -24f, -17.5f)
                reflectiveQuadToRelative(-30f, 3.5f)
                lineToRelative(-10f, 4f)
                verticalLineToRelative(-10f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(581f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(541f, 240f)
                verticalLineToRelative(10f)
                lineToRelative(-10f, -4f)
                quadToRelative(-15f, -6f, -30f, -3.5f)
                reflectiveQuadTo(477f, 260f)
                quadToRelative(-8f, 14f, -5.5f, 31.5f)
                reflectiveQuadTo(491f, 316f)
                lineToRelative(10f, 4f)
                lineToRelative(-10f, 4f)
                quadToRelative(-17f, 7f, -20f, 24f)
                reflectiveQuadToRelative(6f, 32f)
                quadToRelative(8f, 14f, 23.5f, 17f)
                reflectiveQuadToRelative(30.5f, -3f)
                lineToRelative(10f, -4f)
                verticalLineToRelative(10f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(581f, 440f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(541f, 320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(581f, 280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(621f, 320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(581f, 360f)
                close()
                moveToRelative(-68f, 400f)
                horizontalLineToRelative(217f)
                lineToRelative(7f, 53f)
                lineToRelative(-587f, 72f)
                lineToRelative(-74f, -597f)
                lineToRelative(125f, -14f)
                verticalLineToRelative(80f)
                lineToRelative(-36f, 4f)
                lineToRelative(54f, 438f)
                lineToRelative(294f, -36f)
                close()
                moveToRelative(-232f, -80f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(600f)
                horizontalLineTo(281f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-440f)
                horizontalLineTo(361f)
                verticalLineToRelative(440f)
                close()
                moveTo(219f, 796f)
                close()
                moveToRelative(362f, -416f)
                close()
            }
        }.build()
        
        return _Photo_prints!!
    }

private var _Photo_prints: ImageVector? = null


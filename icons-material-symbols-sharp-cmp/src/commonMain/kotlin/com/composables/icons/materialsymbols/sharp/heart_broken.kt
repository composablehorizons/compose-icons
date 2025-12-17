package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Heart_broken: ImageVector
    get() {
        if (_Heart_broken != null) return _Heart_broken!!
        
        _Heart_broken = ImageVector.Builder(
            name = "heart_broken",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(481f, 877f)
                quadTo(347f, 742f, 267.5f, 659f)
                reflectiveQuadToRelative(-121f, -138f)
                quadToRelative(-41.5f, -55f, -54f, -94f)
                reflectiveQuadTo(80f, 340f)
                quadToRelative(0f, -92f, 64f, -156f)
                reflectiveQuadToRelative(156f, -64f)
                quadToRelative(45f, 0f, 87f, 16.5f)
                reflectiveQuadToRelative(75f, 47.5f)
                lineToRelative(-62f, 216f)
                horizontalLineToRelative(120f)
                lineToRelative(-34f, 335f)
                lineToRelative(114f, -375f)
                horizontalLineTo(480f)
                lineToRelative(71f, -212f)
                quadToRelative(25f, -14f, 52.5f, -21f)
                reflectiveQuadToRelative(56.5f, -7f)
                quadToRelative(92f, 0f, 156f, 64f)
                reflectiveQuadToRelative(64f, 156f)
                quadToRelative(0f, 48f, -13f, 88f)
                reflectiveQuadToRelative(-55f, 95.5f)
                quadToRelative(-42f, 55.5f, -121f, 138f)
                reflectiveQuadTo(481f, 877f)
                close()
                moveToRelative(-71f, -186f)
                lineToRelative(21f, -211f)
                horizontalLineTo(294f)
                lineToRelative(75f, -263f)
                quadToRelative(-16f, -8f, -33.5f, -12.5f)
                reflectiveQuadTo(300f, 200f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 31f, 11.5f, 62f)
                reflectiveQuadToRelative(40f, 70.5f)
                quadToRelative(28.5f, 39.5f, 77f, 92f)
                reflectiveQuadTo(410f, 691f)
                close()
                moveToRelative(188f, -48f)
                quadToRelative(111f, -113f, 156.5f, -180f)
                reflectiveQuadTo(800f, 340f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-11f, 0f, -22f, 1.5f)
                reflectiveQuadToRelative(-22f, 5.5f)
                lineToRelative(-24f, 73f)
                horizontalLineToRelative(116f)
                lineTo(598f, 643f)
                close()
                moveToRelative(110f, -363f)
                close()
                moveTo(294f, 480f)
                close()
            }
        }.build()
        
        return _Heart_broken!!
    }

private var _Heart_broken: ImageVector? = null


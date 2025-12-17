package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Landslide: ImageVector
    get() {
        if (_Landslide != null) return _Landslide!!
        
        _Landslide = ImageVector.Builder(
            name = "landslide",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-90f)
                lineToRelative(160f, 52f)
                lineToRelative(441f, -147f)
                lineToRelative(103f, 137f)
                quadToRelative(30f, 40f, 8f, 84f)
                reflectiveQuadToRelative(-72f, 44f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                close()
                moveToRelative(160f, -122f)
                lineTo(80f, 624f)
                verticalLineToRelative(-74f)
                lineToRelative(160f, 52f)
                lineToRelative(276f, -92f)
                lineToRelative(102f, 41f)
                lineToRelative(-378f, 127f)
                close()
                moveToRelative(533f, -133f)
                lineToRelative(111f, -49f)
                quadToRelative(17f, -8f, 26.5f, -22.5f)
                reflectiveQuadTo(920f, 441f)
                verticalLineToRelative(-73f)
                quadToRelative(0f, -21f, -13.5f, -37f)
                reflectiveQuadTo(873f, 310f)
                lineToRelative(-105f, -24f)
                quadToRelative(-14f, -3f, -26.5f, 0.5f)
                reflectiveQuadTo(718f, 298f)
                lineToRelative(-55f, 44f)
                quadToRelative(-11f, 8f, -17f, 20.5f)
                reflectiveQuadToRelative(-6f, 26.5f)
                verticalLineToRelative(62f)
                quadToRelative(0f, 14f, 6f, 26.5f)
                reflectiveQuadToRelative(17f, 20.5f)
                lineToRelative(49f, 39f)
                quadToRelative(14f, 11f, 30f, 13f)
                reflectiveQuadToRelative(31f, -5f)
                close()
                moveToRelative(-533f, -27f)
                lineTo(80f, 464f)
                verticalLineToRelative(-64f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 320f)
                horizontalLineToRelative(120f)
                quadToRelative(19f, 0f, 36f, 8.5f)
                reflectiveQuadToRelative(28f, 23.5f)
                lineToRelative(79f, 105f)
                lineToRelative(-183f, 61f)
                close()
                moveToRelative(269f, -210f)
                lineToRelative(133f, -53f)
                quadToRelative(17f, -7f, 27.5f, -22f)
                reflectiveQuadToRelative(10.5f, -34f)
                verticalLineToRelative(-110f)
                quadToRelative(0f, -22f, -13.5f, -38f)
                reflectiveQuadTo(632f, 30f)
                lineToRelative(-128f, -25f)
                quadToRelative(-12f, -2f, -23.5f, 0f)
                reflectiveQuadToRelative(-21.5f, 9f)
                lineToRelative(-72f, 48f)
                quadToRelative(-13f, 8f, -20f, 21.5f)
                reflectiveQuadToRelative(-7f, 28.5f)
                verticalLineToRelative(96f)
                quadToRelative(0f, 15f, 7f, 28.5f)
                reflectiveQuadToRelative(20f, 21.5f)
                lineToRelative(67f, 44f)
                quadToRelative(12f, 8f, 26.5f, 9.5f)
                reflectiveQuadTo(509f, 308f)
                close()
            }
        }.build()
        
        return _Landslide!!
    }

private var _Landslide: ImageVector? = null


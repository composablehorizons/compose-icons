package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Landslide: ImageVector
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
                moveTo(160f, 880f)
                horizontalLineToRelative(560f)
                quadToRelative(50f, 0f, 72f, -44f)
                reflectiveQuadToRelative(-8f, -84f)
                lineTo(653f, 578f)
                quadToRelative(-7f, -9f, -15f, -15.5f)
                reflectiveQuadTo(619f, 552f)
                lineToRelative(-179f, -72f)
                lineToRelative(-96f, -128f)
                quadToRelative(-11f, -15f, -28f, -23.5f)
                reflectiveQuadToRelative(-36f, -8.5f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(80f, 400f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(160f, 880f)
                close()
                moveToRelative(0f, -80f)
                verticalLineToRelative(-64f)
                lineToRelative(80f, 26f)
                lineToRelative(361f, -120f)
                lineToRelative(119f, 158f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -122f)
                lineToRelative(-80f, -27f)
                verticalLineToRelative(-75f)
                lineToRelative(80f, 26f)
                lineToRelative(158f, -52f)
                lineToRelative(96f, 43f)
                lineToRelative(-254f, 85f)
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
                lineToRelative(-80f, -27f)
                verticalLineToRelative(-91f)
                horizontalLineToRelative(120f)
                lineToRelative(65f, 83f)
                lineToRelative(-105f, 35f)
                close()
                moveToRelative(512f, -51f)
                lineToRelative(-32f, -25f)
                verticalLineToRelative(-44f)
                lineToRelative(40f, -32f)
                lineToRelative(80f, 18f)
                verticalLineToRelative(44f)
                lineToRelative(-88f, 39f)
                close()
                moveTo(509f, 308f)
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
                moveToRelative(-20f, -78f)
                lineToRelative(-49f, -33f)
                verticalLineToRelative(-74f)
                lineToRelative(57f, -38f)
                lineToRelative(103f, 21f)
                verticalLineToRelative(80f)
                lineToRelative(-111f, 44f)
                close()
            }
        }.build()
        
        return _Landslide!!
    }

private var _Landslide: ImageVector? = null


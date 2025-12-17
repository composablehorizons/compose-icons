package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Outdoor_grill: ImageVector
    get() {
        if (_Outdoor_grill != null) return _Outdoor_grill!!
        
        _Outdoor_grill = ImageVector.Builder(
            name = "outdoor_grill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 640f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-38f, 0f, -68.5f, -22f)
                reflectiveQuadTo(528f, 800f)
                horizontalLineTo(274f)
                lineToRelative(-40f, 62f)
                quadToRelative(-9f, 14f, -25.5f, 17.5f)
                reflectiveQuadTo(178f, 874f)
                quadToRelative(-14f, -9f, -17.5f, -25.5f)
                reflectiveQuadTo(166f, 818f)
                lineToRelative(158f, -242f)
                quadToRelative(-72f, -33f, -118f, -101.5f)
                reflectiveQuadTo(160f, 320f)
                horizontalLineToRelative(560f)
                quadToRelative(0f, 86f, -46f, 154.5f)
                reflectiveQuadTo(556f, 576f)
                lineToRelative(23f, 36f)
                quadToRelative(-21f, 10f, -34.5f, 20f)
                reflectiveQuadTo(515f, 660f)
                lineToRelative(-40f, -62f)
                quadToRelative(-8f, 2f, -17f, 2f)
                horizontalLineToRelative(-36f)
                quadToRelative(-9f, 0f, -17f, -2f)
                lineToRelative(-79f, 122f)
                horizontalLineToRelative(202f)
                quadToRelative(13f, -36f, 43.5f, -58f)
                reflectiveQuadToRelative(68.5f, -22f)
                close()
                moveToRelative(0f, 160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 760f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 720f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(600f, 760f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(640f, 800f)
                close()
                moveTo(336f, 280f)
                quadToRelative(5f, -29f, -1.5f, -49f)
                reflectiveQuadTo(307f, 185f)
                quadToRelative(-20f, -26f, -26.5f, -49.5f)
                reflectiveQuadTo(279f, 80f)
                horizontalLineToRelative(40f)
                quadToRelative(-5f, 29f, 1.5f, 48.5f)
                reflectiveQuadTo(348f, 174f)
                quadToRelative(21f, 26f, 27f, 49.5f)
                reflectiveQuadToRelative(1f, 56.5f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(100f, 0f)
                quadToRelative(5f, -29f, -1f, -49f)
                reflectiveQuadToRelative(-27f, -46f)
                quadToRelative(-21f, -25f, -27.5f, -48.5f)
                reflectiveQuadTo(379f, 80f)
                horizontalLineToRelative(40f)
                quadToRelative(-5f, 29f, 1.5f, 48.5f)
                reflectiveQuadTo(448f, 174f)
                quadToRelative(20f, 25f, 26.5f, 48.5f)
                reflectiveQuadTo(476f, 280f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(100f, 0f)
                quadToRelative(5f, -29f, -1f, -49f)
                reflectiveQuadToRelative(-27f, -46f)
                quadToRelative(-21f, -25f, -27.5f, -48.5f)
                reflectiveQuadTo(479f, 80f)
                horizontalLineToRelative(40f)
                quadToRelative(-5f, 29f, 1.5f, 48.5f)
                reflectiveQuadTo(548f, 174f)
                quadToRelative(20f, 25f, 26.5f, 48.5f)
                reflectiveQuadTo(576f, 280f)
                horizontalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Outdoor_grill!!
    }

private var _Outdoor_grill: ImageVector? = null


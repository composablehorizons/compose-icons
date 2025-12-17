package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Biotech: ImageVector
    get() {
        if (_Biotech != null) return _Biotech!!
        
        _Biotech = ImageVector.Builder(
            name = "biotech",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 760f)
                verticalLineToRelative(-80f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, -61f, 33.5f, -111f)
                reflectiveQuadToRelative(90.5f, -73f)
                quadToRelative(8f, -34f, 35.5f, -55f)
                reflectiveQuadToRelative(62.5f, -21f)
                lineToRelative(-9f, -25f)
                quadToRelative(-5f, -16f, 1.5f, -30.5f)
                reflectiveQuadTo(437f, 144f)
                horizontalLineToRelative(1f)
                quadToRelative(-6f, -15f, 1f, -29.5f)
                reflectiveQuadToRelative(24f, -20.5f)
                quadToRelative(15f, -5f, 29.5f, 1.5f)
                reflectiveQuadTo(512f, 118f)
                quadToRelative(16f, -6f, 31f, 1f)
                reflectiveQuadToRelative(21f, 23f)
                lineToRelative(82f, 225f)
                quadToRelative(6f, 16f, -0.5f, 30.5f)
                reflectiveQuadTo(623f, 418f)
                horizontalLineToRelative(-1f)
                quadToRelative(6f, 16f, -1f, 31f)
                reflectiveQuadToRelative(-24f, 21f)
                quadToRelative(-15f, 5f, -29.5f, -1.5f)
                reflectiveQuadTo(548f, 446f)
                quadToRelative(-16f, 6f, -31f, -1f)
                reflectiveQuadToRelative(-21f, -23f)
                lineToRelative(-10f, -28f)
                quadToRelative(-15f, 14f, -34.5f, 21f)
                reflectiveQuadToRelative(-39.5f, 5f)
                quadToRelative(-22f, -2f, -41f, -13.5f)
                reflectiveQuadTo(338f, 378f)
                quadToRelative(-27f, 16f, -42.5f, 43f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                horizontalLineToRelative(280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 680f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 840f)
                horizontalLineTo(240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 760f)
                horizontalLineToRelative(160f)
                close()
                moveToRelative(146f, -378f)
                lineToRelative(36f, -14f)
                lineToRelative(-68f, -188f)
                lineToRelative(-38f, 14f)
                lineToRelative(70f, 188f)
                close()
                moveToRelative(-126f, -22f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(460f, 320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(420f, 280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(380f, 320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(420f, 360f)
                close()
                moveToRelative(126f, 22f)
                close()
                moveToRelative(-126f, -62f)
                close()
                moveToRelative(0f, 0f)
                close()
            }
        }.build()
        
        return _Biotech!!
    }

private var _Biotech: ImageVector? = null


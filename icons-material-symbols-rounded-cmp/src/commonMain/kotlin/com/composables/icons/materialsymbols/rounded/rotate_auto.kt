package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Rotate_auto: ImageVector
    get() {
        if (_Rotate_auto != null) return _Rotate_auto!!
        
        _Rotate_auto = ImageVector.Builder(
            name = "rotate_auto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-76f, 0f, -144.5f, -27f)
                reflectiveQuadToRelative(-122f, -74.5f)
                quadTo(160f, 731f, 126f, 666.5f)
                reflectiveQuadTo(83f, 526f)
                quadToRelative(-2f, -19f, 9f, -29.5f)
                reflectiveQuadToRelative(26f, -12.5f)
                quadToRelative(15f, -2f, 29f, 6.5f)
                reflectiveQuadToRelative(16f, 29.5f)
                quadToRelative(15f, 121f, 105.5f, 201f)
                reflectiveQuadTo(480f, 801f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-89f, 0f, -161.5f, 43.5f)
                reflectiveQuadTo(204f, 320f)
                horizontalLineToRelative(76f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 400f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 360f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 200f)
                verticalLineToRelative(40f)
                quadToRelative(55f, -73f, 138f, -116.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                close()
                moveToRelative(-472f, 68f)
                horizontalLineToRelative(146f)
                lineToRelative(25f, 73f)
                quadToRelative(3f, 8f, 10.5f, 13.5f)
                reflectiveQuadTo(606f, 640f)
                quadToRelative(15f, 0f, 23.5f, -12.5f)
                reflectiveQuadTo(633f, 601f)
                lineTo(519f, 299f)
                quadToRelative(-3f, -9f, -11f, -14f)
                reflectiveQuadToRelative(-17f, -5f)
                horizontalLineToRelative(-22f)
                quadToRelative(-9f, 0f, -17f, 5f)
                reflectiveQuadToRelative(-11f, 14f)
                lineTo(327f, 600f)
                quadToRelative(-5f, 14f, 3.5f, 27f)
                reflectiveQuadToRelative(24.5f, 13f)
                quadToRelative(10f, 0f, 17.5f, -5.5f)
                reflectiveQuadTo(383f, 620f)
                lineToRelative(25f, -72f)
                close()
                moveToRelative(18f, -52f)
                lineToRelative(52f, -150f)
                horizontalLineToRelative(4f)
                lineToRelative(52f, 150f)
                horizontalLineTo(426f)
                close()
            }
        }.build()
        
        return _Rotate_auto!!
    }

private var _Rotate_auto: ImageVector? = null


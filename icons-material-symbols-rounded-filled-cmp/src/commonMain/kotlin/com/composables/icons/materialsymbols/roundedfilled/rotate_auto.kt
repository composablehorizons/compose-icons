package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Rotate_auto: ImageVector
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
                quadToRelative(-77f, 0f, -146f, -27.5f)
                reflectiveQuadToRelative(-122f, -76f)
                quadTo(159f, 728f, 124.5f, 662f)
                reflectiveQuadTo(82f, 520f)
                quadToRelative(-2f, -18f, 9.5f, -28f)
                reflectiveQuadToRelative(26.5f, -11f)
                quadToRelative(15f, -1f, 29f, 8f)
                reflectiveQuadToRelative(16f, 31f)
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
                moveTo(312f, 640f)
                horizontalLineToRelative(64f)
                lineToRelative(16f, -46f)
                quadToRelative(8f, -21f, 31.5f, -33.5f)
                reflectiveQuadTo(505f, 548f)
                quadToRelative(22f, 0f, 39.5f, 12.5f)
                reflectiveQuadTo(570f, 594f)
                lineToRelative(9f, 27f)
                quadToRelative(3f, 8f, 10.5f, 13.5f)
                reflectiveQuadTo(606f, 640f)
                quadToRelative(15f, 0f, 23.5f, -12.5f)
                reflectiveQuadTo(633f, 601f)
                lineTo(519f, 299f)
                quadToRelative(-3f, -9f, -13.5f, -14f)
                reflectiveQuadToRelative(-36.5f, -5f)
                quadToRelative(-9f, 0f, -17f, 5f)
                reflectiveQuadToRelative(-11f, 14f)
                lineTo(312f, 640f)
                close()
                moveToRelative(114f, -144f)
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


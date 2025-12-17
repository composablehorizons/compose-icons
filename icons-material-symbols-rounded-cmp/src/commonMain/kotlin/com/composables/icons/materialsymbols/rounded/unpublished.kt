package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Unpublished: ImageVector
    get() {
        if (_Unpublished != null) return _Unpublished!!
        
        _Unpublished = ImageVector.Builder(
            name = "unpublished",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 800f)
                quadToRelative(45f, 0f, 85.5f, -12f)
                reflectiveQuadToRelative(76.5f, -33f)
                lineTo(487f, 600f)
                lineToRelative(-35f, 35f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(395f, 635f)
                lineTo(282f, 522f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(86f, 86f)
                lineToRelative(7f, -8f)
                lineToRelative(-226f, -226f)
                quadToRelative(-21f, 36f, -33f, 76.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 133f, 93.5f, 226.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(122f, -314f)
                lineToRelative(-56f, -56f)
                lineToRelative(76f, -76f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-76f, 76f)
                close()
                moveTo(763f, 876f)
                lineToRelative(-63f, -62f)
                quadToRelative(-49f, 32f, -104.5f, 49f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -60f, 17f, -115.5f)
                reflectiveQuadTo(146f, 260f)
                lineToRelative(-63f, -63f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(83f, 140f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(680f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                close()
                moveTo(480f, 160f)
                quadToRelative(-33f, 0f, -64.5f, 6.5f)
                reflectiveQuadTo(354f, 186f)
                quadToRelative(-16f, 7f, -32f, 2f)
                reflectiveQuadToRelative(-24f, -19f)
                quadToRelative(-8f, -14f, -3.5f, -30f)
                reflectiveQuadToRelative(19.5f, -23f)
                quadToRelative(39f, -18f, 80.5f, -27f)
                reflectiveQuadToRelative(85.5f, -9f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 44f, -9f, 85.5f)
                reflectiveQuadTo(844f, 646f)
                quadToRelative(-7f, 15f, -23f, 19.5f)
                reflectiveQuadToRelative(-30f, -3.5f)
                quadToRelative(-14f, -8f, -19f, -24f)
                reflectiveQuadToRelative(2f, -32f)
                quadToRelative(13f, -30f, 19.5f, -61.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -133f, -93.5f, -226.5f)
                reflectiveQuadTo(480f, 160f)
                close()
                moveToRelative(57f, 263f)
                close()
                moveTo(423f, 537f)
                close()
            }
        }.build()
        
        return _Unpublished!!
    }

private var _Unpublished: ImageVector? = null


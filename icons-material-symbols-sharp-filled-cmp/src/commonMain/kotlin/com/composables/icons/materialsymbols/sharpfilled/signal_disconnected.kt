package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Signal_disconnected: ImageVector
    get() {
        if (_Signal_disconnected != null) return _Signal_disconnected!!
        
        _Signal_disconnected = ImageVector.Builder(
            name = "signal_disconnected",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(684f, 571f)
                lineToRelative(-49f, -49f)
                quadToRelative(22f, -26f, 33.5f, -57f)
                reflectiveQuadToRelative(11.5f, -65f)
                quadToRelative(0f, -40f, -16f, -76f)
                reflectiveQuadToRelative(-44f, -64f)
                lineToRelative(48f, -48f)
                quadToRelative(38f, 38f, 59f, 86f)
                reflectiveQuadToRelative(21f, 102f)
                quadToRelative(0f, 48f, -17f, 91.5f)
                reflectiveQuadTo(684f, 571f)
                close()
                moveTo(565f, 452f)
                lineTo(428f, 315f)
                quadToRelative(12f, -7f, 25f, -11f)
                reflectiveQuadToRelative(27f, -4f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 14f, -4f, 27f)
                reflectiveQuadToRelative(-11f, 25f)
                close()
                moveToRelative(215f, 214f)
                lineToRelative(-48f, -48f)
                quadToRelative(40f, -45f, 60f, -101.5f)
                reflectiveQuadTo(812f, 400f)
                quadToRelative(0f, -66f, -24.5f, -127.5f)
                reflectiveQuadTo(716f, 164f)
                lineToRelative(48f, -48f)
                quadToRelative(55f, 58f, 85.5f, 131f)
                reflectiveQuadTo(880f, 400f)
                quadToRelative(0f, 74f, -25.5f, 142.5f)
                reflectiveQuadTo(780f, 666f)
                close()
                moveToRelative(11f, 238f)
                lineTo(520f, 633f)
                verticalLineToRelative(207f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-287f)
                lineTo(280f, 394f)
                verticalLineToRelative(6f)
                quadToRelative(0f, 40f, 16f, 76f)
                reflectiveQuadToRelative(44f, 64f)
                lineToRelative(-48f, 48f)
                quadToRelative(-38f, -38f, -59f, -86f)
                reflectiveQuadToRelative(-21f, -102f)
                quadToRelative(0f, -17f, 2f, -33f)
                reflectiveQuadToRelative(7f, -33f)
                lineToRelative(-51f, -51f)
                quadToRelative(-11f, 29f, -16.5f, 58f)
                reflectiveQuadToRelative(-5.5f, 59f)
                quadToRelative(0f, 66f, 24.5f, 127.5f)
                reflectiveQuadTo(244f, 636f)
                lineToRelative(-48f, 48f)
                quadToRelative(-55f, -58f, -85.5f, -131f)
                reflectiveQuadTo(80f, 400f)
                quadToRelative(0f, -44f, 9.5f, -86.5f)
                reflectiveQuadTo(118f, 231f)
                lineToRelative(-62f, -62f)
                lineToRelative(56f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 56f)
                close()
            }
        }.build()
        
        return _Signal_disconnected!!
    }

private var _Signal_disconnected: ImageVector? = null


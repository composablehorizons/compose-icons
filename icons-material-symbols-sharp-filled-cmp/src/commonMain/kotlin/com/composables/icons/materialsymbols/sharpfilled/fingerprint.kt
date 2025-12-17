package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Fingerprint: ImageVector
    get() {
        if (_Fingerprint != null) return _Fingerprint!!
        
        _Fingerprint = ImageVector.Builder(
            name = "fingerprint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(481f, 179f)
                quadToRelative(113f, 0f, 206f, 48.5f)
                reflectiveQuadTo(850f, 372f)
                lineToRelative(-32f, 24f)
                quadToRelative(-63f, -88f, -147.5f, -132.5f)
                reflectiveQuadTo(481f, 219f)
                quadToRelative(-104f, 0f, -188f, 45f)
                reflectiveQuadTo(146f, 398f)
                lineToRelative(-32f, -23f)
                quadToRelative(71f, -97f, 163.5f, -146.5f)
                reflectiveQuadTo(481f, 179f)
                close()
                moveToRelative(0f, 94f)
                quadToRelative(137f, 0f, 233f, 91f)
                reflectiveQuadToRelative(96f, 222f)
                quadToRelative(0f, 49f, -35.5f, 83f)
                reflectiveQuadTo(688f, 703f)
                quadToRelative(-52f, 0f, -88f, -34f)
                reflectiveQuadToRelative(-36f, -83f)
                quadToRelative(0f, -32f, -24f, -55f)
                reflectiveQuadToRelative(-59f, -23f)
                quadToRelative(-35f, 0f, -59f, 23f)
                reflectiveQuadToRelative(-24f, 55f)
                quadToRelative(0f, 95f, 57f, 160.5f)
                reflectiveQuadTo(623f, 845f)
                lineToRelative(-10f, 39f)
                quadToRelative(-122f, -31f, -188.5f, -108.5f)
                reflectiveQuadTo(358f, 586f)
                quadToRelative(0f, -49f, 36f, -83.5f)
                reflectiveQuadToRelative(87f, -34.5f)
                quadToRelative(51f, 0f, 87f, 34.5f)
                reflectiveQuadToRelative(36f, 83.5f)
                quadToRelative(0f, 32f, 24.5f, 55f)
                reflectiveQuadToRelative(59.5f, 23f)
                quadToRelative(34f, 0f, 58f, -23f)
                reflectiveQuadToRelative(24f, -55f)
                quadToRelative(0f, -114f, -84f, -194f)
                reflectiveQuadToRelative(-204f, -80f)
                quadToRelative(-120f, 0f, -204f, 80f)
                reflectiveQuadToRelative(-84f, 193f)
                quadToRelative(0f, 35f, 7.5f, 75f)
                reflectiveQuadToRelative(24.5f, 88f)
                lineToRelative(-36f, 14f)
                quadToRelative(-18f, -46f, -27f, -90f)
                reflectiveQuadToRelative(-9f, -86f)
                quadToRelative(0f, -131f, 95f, -222f)
                reflectiveQuadToRelative(232f, -91f)
                close()
                moveToRelative(0f, -192f)
                quadToRelative(65f, 0f, 127f, 16f)
                reflectiveQuadToRelative(133f, 52f)
                lineToRelative(-16f, 37f)
                quadToRelative(-69f, -35f, -126.5f, -50f)
                reflectiveQuadTo(481f, 121f)
                quadToRelative(-66f, 0f, -122f, 16f)
                reflectiveQuadToRelative(-117f, 51f)
                lineToRelative(-18f, -35f)
                quadToRelative(66f, -37f, 128f, -54.5f)
                reflectiveQuadTo(481f, 81f)
                close()
                moveToRelative(0f, 289f)
                quadToRelative(100f, 0f, 163.5f, 66f)
                reflectiveQuadTo(708f, 606f)
                horizontalLineToRelative(-40f)
                quadToRelative(0f, -88f, -52f, -142f)
                reflectiveQuadToRelative(-135f, -54f)
                quadToRelative(-77f, 0f, -131f, 51.5f)
                reflectiveQuadTo(296f, 586f)
                quadToRelative(0f, 77f, 27f, 134.5f)
                reflectiveQuadTo(420f, 851f)
                lineToRelative(-28f, 28f)
                quadToRelative(-75f, -78f, -105.5f, -143.5f)
                reflectiveQuadTo(256f, 586f)
                quadToRelative(0f, -90f, 65.5f, -153f)
                reflectiveQuadTo(481f, 370f)
                close()
                moveToRelative(45f, 367f)
                quadToRelative(-32f, -30f, -49f, -73.5f)
                reflectiveQuadTo(460f, 566f)
                horizontalLineToRelative(40f)
                quadToRelative(0f, 45f, 14f, 82f)
                reflectiveQuadToRelative(40f, 61f)
                quadToRelative(26f, 23f, 58.5f, 35.5f)
                reflectiveQuadTo(680f, 757f)
                quadToRelative(17f, 0f, 33f, -3.5f)
                reflectiveQuadToRelative(31f, -9.5f)
                lineToRelative(7f, 39f)
                quadToRelative(-17f, 8f, -35f, 11f)
                reflectiveQuadToRelative(-36f, 3f)
                quadToRelative(-44f, 0f, -83.5f, -15.5f)
                reflectiveQuadTo(526f, 737f)
                close()
            }
        }.build()
        
        return _Fingerprint!!
    }

private var _Fingerprint: ImageVector? = null


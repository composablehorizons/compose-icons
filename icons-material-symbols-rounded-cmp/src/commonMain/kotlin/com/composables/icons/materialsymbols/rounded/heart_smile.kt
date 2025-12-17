package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Heart_smile: ImageVector
    get() {
        if (_Heart_smile != null) return _Heart_smile!!
        
        _Heart_smile = ImageVector.Builder(
            name = "heart_smile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 620f)
                quadToRelative(54f, 0f, 98.5f, -29.5f)
                reflectiveQuadTo(646f, 512f)
                quadToRelative(7f, -15f, 0f, -30f)
                reflectiveQuadToRelative(-23f, -21f)
                quadToRelative(-15f, -6f, -29.5f, 0.5f)
                reflectiveQuadTo(572f, 483f)
                quadToRelative(-12f, 27f, -37.5f, 42f)
                reflectiveQuadTo(480f, 540f)
                quadToRelative(-29f, 0f, -54.5f, -15f)
                reflectiveQuadTo(388f, 483f)
                quadToRelative(-7f, -15f, -21.5f, -21.5f)
                reflectiveQuadTo(337f, 461f)
                quadToRelative(-16f, 6f, -23f, 21f)
                reflectiveQuadToRelative(0f, 30f)
                quadToRelative(23f, 49f, 67.5f, 78.5f)
                reflectiveQuadTo(480f, 620f)
                close()
                moveTo(370f, 420f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(420f, 370f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(370f, 320f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(320f, 370f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(370f, 420f)
                close()
                moveToRelative(220f, 0f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(640f, 370f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(590f, 320f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(540f, 370f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(590f, 420f)
                close()
                moveTo(480f, 204f)
                quadToRelative(34f, -40f, 81f, -62f)
                reflectiveQuadToRelative(99f, -22f)
                quadToRelative(94f, 0f, 157f, 63f)
                reflectiveQuadToRelative(63f, 157f)
                quadToRelative(0f, 42f, -12.5f, 80.5f)
                reflectiveQuadToRelative(-43f, 83f)
                quadTo(794f, 548f, 742.5f, 601f)
                reflectiveQuadTo(613f, 724f)
                lineToRelative(-80f, 70f)
                quadToRelative(-23f, 20f, -53f, 20f)
                reflectiveQuadToRelative(-53f, -20f)
                lineToRelative(-80f, -70f)
                quadToRelative(-78f, -70f, -129.5f, -123f)
                reflectiveQuadToRelative(-82f, -97.5f)
                quadToRelative(-30.5f, -44.5f, -43f, -83f)
                reflectiveQuadTo(80f, 340f)
                quadToRelative(0f, -94f, 63f, -157f)
                reflectiveQuadToRelative(157f, -63f)
                quadToRelative(52f, 0f, 99f, 22f)
                reflectiveQuadToRelative(81f, 62f)
                close()
                moveToRelative(320f, 136f)
                quadToRelative(0f, -60f, -40f, -100f)
                reflectiveQuadToRelative(-100f, -40f)
                quadToRelative(-35f, 0f, -67.5f, 15.5f)
                reflectiveQuadTo(538f, 259f)
                quadToRelative(-14f, 17f, -28.5f, 26f)
                reflectiveQuadToRelative(-29.5f, 9f)
                quadToRelative(-15f, 0f, -30f, -9f)
                reflectiveQuadToRelative(-29f, -27f)
                quadToRelative(-22f, -27f, -54f, -42.5f)
                reflectiveQuadTo(300f, 200f)
                quadToRelative(-60f, 0f, -100f, 40f)
                reflectiveQuadToRelative(-40f, 100f)
                quadToRelative(0f, 34f, 14f, 68.5f)
                reflectiveQuadToRelative(50f, 78.5f)
                quadToRelative(36f, 44f, 98f, 103f)
                reflectiveQuadToRelative(158f, 142f)
                quadToRelative(96f, -83f, 158f, -142f)
                reflectiveQuadToRelative(98f, -103f)
                quadToRelative(36f, -44f, 50f, -78.5f)
                reflectiveQuadToRelative(14f, -68.5f)
                close()
                moveTo(480f, 466f)
                close()
            }
        }.build()
        
        return _Heart_smile!!
    }

private var _Heart_smile: ImageVector? = null


package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Heart_smile: ImageVector
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
                quadToRelative(63f, 0f, 112f, -39f)
                reflectiveQuadToRelative(63f, -101f)
                horizontalLineToRelative(-83f)
                quadToRelative(-12f, 27f, -37f, 43.5f)
                reflectiveQuadTo(480f, 540f)
                quadToRelative(-30f, 0f, -55f, -16.5f)
                reflectiveQuadTo(388f, 480f)
                horizontalLineToRelative(-83f)
                quadToRelative(14f, 62f, 63f, 101f)
                reflectiveQuadToRelative(112f, 39f)
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
                moveTo(480f, 840f)
                lineToRelative(-58f, -50f)
                quadToRelative(-101f, -88f, -167f, -152f)
                reflectiveQuadTo(150f, 523f)
                quadToRelative(-39f, -51f, -54.5f, -94f)
                reflectiveQuadTo(80f, 340f)
                quadToRelative(0f, -94f, 63f, -157f)
                reflectiveQuadToRelative(157f, -63f)
                quadToRelative(52f, 0f, 99f, 22f)
                reflectiveQuadToRelative(81f, 62f)
                quadToRelative(34f, -40f, 81f, -62f)
                reflectiveQuadToRelative(99f, -22f)
                quadToRelative(94f, 0f, 157f, 63f)
                reflectiveQuadToRelative(63f, 157f)
                quadToRelative(0f, 46f, -15.5f, 89f)
                reflectiveQuadTo(810f, 523f)
                quadToRelative(-39f, 51f, -105f, 115f)
                reflectiveQuadTo(538f, 790f)
                lineToRelative(-58f, 50f)
                close()
            }
        }.build()
        
        return _Heart_smile!!
    }

private var _Heart_smile: ImageVector? = null


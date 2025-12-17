package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sound_detection_loud_sound: ImageVector
    get() {
        if (_Sound_detection_loud_sound != null) return _Sound_detection_loud_sound!!
        
        _Sound_detection_loud_sound = ImageVector.Builder(
            name = "sound_detection_loud_sound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(313f, 874f)
                lineTo(86f, 648f)
                lineToRelative(169f, -169f)
                verticalLineToRelative(-227f)
                lineToRelative(454f, 453f)
                horizontalLineTo(482f)
                lineTo(313f, 874f)
                close()
                moveToRelative(471f, -204f)
                lineToRelative(-58f, -58f)
                quadToRelative(45f, -82f, 31.5f, -173.5f)
                reflectiveQuadTo(678f, 281f)
                quadToRelative(-66f, -66f, -157.5f, -79.5f)
                reflectiveQuadTo(347f, 233f)
                lineToRelative(-58f, -58f)
                quadToRelative(107f, -68f, 231.5f, -54.5f)
                reflectiveQuadTo(735f, 224f)
                quadToRelative(90f, 90f, 103.5f, 214.5f)
                reflectiveQuadTo(784f, 670f)
                close()
                moveTo(666f, 552f)
                lineToRelative(-68f, -68f)
                quadToRelative(0f, -25f, -7.5f, -48.5f)
                reflectiveQuadTo(566f, 395f)
                quadToRelative(-18f, -18f, -41.5f, -26f)
                reflectiveQuadToRelative(-49.5f, -8f)
                lineToRelative(-68f, -68f)
                quadToRelative(57f, -17f, 115f, -7f)
                reflectiveQuadToRelative(100f, 52f)
                quadToRelative(42f, 42f, 51.5f, 99.5f)
                reflectiveQuadTo(666f, 552f)
                close()
            }
        }.build()
        
        return _Sound_detection_loud_sound!!
    }

private var _Sound_detection_loud_sound: ImageVector? = null


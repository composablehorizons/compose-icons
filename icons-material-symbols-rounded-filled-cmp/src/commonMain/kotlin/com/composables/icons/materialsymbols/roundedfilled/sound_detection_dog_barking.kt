package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Sound_detection_dog_barking: ImageVector
    get() {
        if (_Sound_detection_dog_barking != null) return _Sound_detection_dog_barking!!
        
        _Sound_detection_dog_barking = ImageVector.Builder(
            name = "sound_detection_dog_barking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(194f, 880f)
                verticalLineToRelative(-271f)
                lineToRelative(197f, 197f)
                quadToRelative(54f, -54f, 96.5f, -116.5f)
                reflectiveQuadTo(530f, 551f)
                quadToRelative(0f, -56f, -22f, -107.5f)
                reflectiveQuadTo(447f, 353f)
                lineTo(334f, 240f)
                horizontalLineToRelative(140f)
                lineToRelative(160f, -160f)
                lineToRelative(82f, 82f)
                quadToRelative(40f, 40f, 62f, 90.5f)
                reflectiveQuadTo(800f, 360f)
                quadToRelative(0f, 57f, -22f, 107.5f)
                reflectiveQuadTo(716f, 558f)
                lineToRelative(-82f, 82f)
                verticalLineToRelative(240f)
                horizontalLineTo(194f)
                close()
                moveToRelative(197f, -187f)
                lineTo(183f, 485f)
                quadToRelative(-11f, -11f, -17f, -26f)
                reflectiveQuadToRelative(-6f, -31f)
                quadToRelative(0f, -16f, 6f, -30.5f)
                reflectiveQuadToRelative(17f, -25.5f)
                lineToRelative(84f, -85f)
                lineToRelative(124f, 123f)
                quadToRelative(28f, 28f, 43.5f, 64.5f)
                reflectiveQuadTo(450f, 551f)
                quadToRelative(0f, 40f, -15f, 76.5f)
                reflectiveQuadTo(391f, 693f)
                close()
            }
        }.build()
        
        return _Sound_detection_dog_barking!!
    }

private var _Sound_detection_dog_barking: ImageVector? = null


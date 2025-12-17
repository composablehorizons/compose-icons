package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Wrong_location: ImageVector
    get() {
        if (_Wrong_location != null) return _Wrong_location!!
        
        _Wrong_location = ImageVector.Builder(
            name = "wrong_location",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 480f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 400f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 400f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 480f)
                close()
                moveToRelative(0f, 400f)
                quadTo(319f, 743f, 239.5f, 625.5f)
                reflectiveQuadTo(160f, 408f)
                quadToRelative(0f, -150f, 96.5f, -239f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(17f, 0f, 35f, 2f)
                reflectiveQuadToRelative(35f, 4f)
                lineToRelative(96f, 96f)
                lineToRelative(-84f, 84f)
                lineToRelative(113f, 113f)
                lineToRelative(84f, -84f)
                lineToRelative(31f, 32f)
                quadToRelative(4f, 20f, 7f, 40f)
                reflectiveQuadToRelative(3f, 41f)
                quadToRelative(0f, 100f, -79.5f, 217.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(195f, -558f)
                lineToRelative(-56f, -56f)
                lineToRelative(84f, -84f)
                lineToRelative(-84f, -84f)
                lineToRelative(56f, -56f)
                lineToRelative(84f, 84f)
                lineToRelative(84f, -84f)
                lineToRelative(56f, 56f)
                lineToRelative(-84f, 84f)
                lineToRelative(84f, 84f)
                lineToRelative(-56f, 56f)
                lineToRelative(-84f, -84f)
                lineToRelative(-84f, 84f)
                close()
            }
        }.build()
        
        return _Wrong_location!!
    }

private var _Wrong_location: ImageVector? = null


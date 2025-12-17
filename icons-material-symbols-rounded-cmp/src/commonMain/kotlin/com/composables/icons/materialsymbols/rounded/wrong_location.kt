package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Wrong_location: ImageVector
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
                moveTo(480f, 80f)
                quadToRelative(10f, 0f, 19.5f, 0.5f)
                reflectiveQuadTo(520f, 83f)
                verticalLineToRelative(81f)
                quadToRelative(-10f, -2f, -20f, -3f)
                reflectiveQuadToRelative(-20f, -1f)
                quadToRelative(-101f, 0f, -170.5f, 69.5f)
                reflectiveQuadTo(240f, 408f)
                quadToRelative(0f, 71f, 59f, 162.5f)
                reflectiveQuadTo(480f, 774f)
                quadToRelative(122f, -112f, 181f, -203.5f)
                reflectiveQuadTo(720f, 408f)
                quadToRelative(0f, -2f, -0.5f, -4f)
                reflectiveQuadToRelative(-0.5f, -4f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 2f, 0.5f, 4f)
                reflectiveQuadToRelative(0.5f, 4f)
                quadToRelative(0f, 94f, -68f, 201f)
                reflectiveQuadTo(533f, 833f)
                quadToRelative(-11f, 10f, -25f, 15f)
                reflectiveQuadToRelative(-28f, 5f)
                quadToRelative(-14f, 0f, -28f, -5f)
                reflectiveQuadToRelative(-25f, -15f)
                quadToRelative(-65f, -60f, -115f, -117f)
                reflectiveQuadToRelative(-83.5f, -110.5f)
                quadToRelative(-33.5f, -53.5f, -51f, -103f)
                reflectiveQuadTo(160f, 408f)
                quadToRelative(0f, -150f, 96.5f, -239f)
                reflectiveQuadTo(480f, 80f)
                close()
                moveToRelative(0f, 320f)
                close()
                moveToRelative(279f, -162f)
                lineToRelative(56f, 56f)
                quadToRelative(11f, 11f, 28f, 11f)
                reflectiveQuadToRelative(28f, -11f)
                quadToRelative(11f, -11f, 11f, -28f)
                reflectiveQuadToRelative(-11f, -28f)
                lineToRelative(-56f, -56f)
                lineToRelative(56f, -56f)
                quadToRelative(11f, -11f, 11f, -28f)
                reflectiveQuadToRelative(-11f, -28f)
                quadToRelative(-11f, -11f, -28f, -11f)
                reflectiveQuadToRelative(-28f, 11f)
                lineToRelative(-56f, 56f)
                lineToRelative(-56f, -56f)
                quadToRelative(-11f, -11f, -28f, -11f)
                reflectiveQuadToRelative(-28f, 11f)
                quadToRelative(-11f, 11f, -11f, 28f)
                reflectiveQuadToRelative(11f, 28f)
                lineToRelative(56f, 56f)
                lineToRelative(-56f, 56f)
                quadToRelative(-11f, 11f, -11f, 28f)
                reflectiveQuadToRelative(11f, 28f)
                quadToRelative(11f, 11f, 28f, 11f)
                reflectiveQuadToRelative(28f, -11f)
                lineToRelative(56f, -56f)
                close()
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
            }
        }.build()
        
        return _Wrong_location!!
    }

private var _Wrong_location: ImageVector? = null


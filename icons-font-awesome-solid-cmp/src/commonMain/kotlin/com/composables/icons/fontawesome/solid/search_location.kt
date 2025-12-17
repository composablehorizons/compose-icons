package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SearchLocation: ImageVector
    get() {
        if (_SearchLocation != null) return _SearchLocation!!
        
        _SearchLocation = ImageVector.Builder(
            name = "search-location",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(505.04f, 442.66f)
                lineToRelative(-99.71f, -99.69f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7f, -17f, -7f)
                horizontalLineToRelative(-16.3f)
                curveToRelative(27.6f, -35.3f, 44f, -79.69f, 44f, -127.99f)
                curveTo(416.03f, 93.09f, 322.92f, 0f, 208.02f, 0f)
                reflectiveCurveTo(0f, 93.09f, 0f, 207.98f)
                reflectiveCurveToRelative(93.11f, 207.98f, 208.02f, 207.98f)
                curveToRelative(48.3f, 0f, 92.71f, -16.4f, 128.01f, -44f)
                verticalLineToRelative(16.3f)
                curveToRelative(0f, 6.4f, 2.5f, 12.5f, 7f, 17f)
                lineToRelative(99.71f, 99.69f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0f)
                lineToRelative(28.3f, -28.3f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.59f, 0.1f, -33.99f)
                close()
                moveToRelative(-297.02f, -90.7f)
                curveToRelative(-79.54f, 0f, -144f, -64.34f, -144f, -143.98f)
                curveToRelative(0f, -79.53f, 64.35f, -143.98f, 144f, -143.98f)
                curveToRelative(79.54f, 0f, 144f, 64.34f, 144f, 143.98f)
                curveToRelative(0f, 79.53f, -64.35f, 143.98f, -144f, 143.98f)
                close()
                moveToRelative(0.02f, -239.96f)
                curveToRelative(-40.78f, 0f, -73.84f, 33.05f, -73.84f, 73.83f)
                curveToRelative(0f, 32.96f, 48.26f, 93.05f, 66.75f, 114.86f)
                arcToRelative(9.24f, 9.24f, 0f, false, false, 14.18f, 0f)
                curveToRelative(18.49f, -21.81f, 66.75f, -81.89f, 66.75f, -114.86f)
                curveToRelative(0f, -40.78f, -33.06f, -73.83f, -73.84f, -73.83f)
                close()
                moveToRelative(0f, 96f)
                curveToRelative(-13.26f, 0f, -24f, -10.75f, -24f, -24f)
                curveToRelative(0f, -13.26f, 10.75f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.74f, 24f, 24f)
                curveToRelative(0f, 13.25f, -10.75f, 24f, -24f, 24f)
                close()
            }
        }.build()
        
        return _SearchLocation!!
    }

private var _SearchLocation: ImageVector? = null


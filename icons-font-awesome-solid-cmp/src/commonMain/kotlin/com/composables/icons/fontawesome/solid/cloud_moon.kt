package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CloudMoon: ImageVector
    get() {
        if (_CloudMoon != null) return _CloudMoon!!
        
        _CloudMoon = ImageVector.Builder(
            name = "cloud-moon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(342.8f, 352.7f)
                curveToRelative(5.7f, -9.6f, 9.2f, -20.7f, 9.2f, -32.7f)
                curveToRelative(0f, -35.3f, -28.7f, -64f, -64f, -64f)
                curveToRelative(-17.2f, 0f, -32.8f, 6.9f, -44.3f, 17.9f)
                curveToRelative(-16.3f, -29.6f, -47.5f, -49.9f, -83.7f, -49.9f)
                curveToRelative(-53f, 0f, -96f, 43f, -96f, 96f)
                curveToRelative(0f, 2f, 0.5f, 3.8f, 0.6f, 5.7f)
                curveTo(27.1f, 338.8f, 0f, 374.1f, 0f, 416f)
                curveToRelative(0f, 53f, 43f, 96f, 96f, 96f)
                horizontalLineToRelative(240f)
                curveToRelative(44.2f, 0f, 80f, -35.8f, 80f, -80f)
                curveToRelative(0f, -41.9f, -32.3f, -75.8f, -73.2f, -79.3f)
                close()
                moveToRelative(222.5f, -54.3f)
                curveToRelative(-93.1f, 17.7f, -178.5f, -53.7f, -178.5f, -147.7f)
                curveToRelative(0f, -54.2f, 29f, -104f, 76.1f, -130.8f)
                curveToRelative(7.3f, -4.1f, 5.4f, -15.1f, -2.8f, -16.7f)
                curveTo(448.4f, 1.1f, 436.7f, 0f, 425f, 0f)
                curveTo(319.1f, 0f, 233.1f, 85.9f, 233.1f, 192f)
                curveToRelative(0f, 8.5f, 0.7f, 16.8f, 1.8f, 25f)
                curveToRelative(5.9f, 4.3f, 11.6f, 8.9f, 16.7f, 14.2f)
                curveToRelative(11.4f, -4.7f, 23.7f, -7.2f, 36.4f, -7.2f)
                curveToRelative(52.9f, 0f, 96f, 43.1f, 96f, 96f)
                curveToRelative(0f, 3.6f, -0.2f, 7.2f, -0.6f, 10.7f)
                curveToRelative(23.6f, 10.8f, 42.4f, 29.5f, 53.5f, 52.6f)
                curveToRelative(54.4f, -3.4f, 103.7f, -29.3f, 137.1f, -70.4f)
                curveToRelative(5.3f, -6.5f, -0.5f, -16.1f, -8.7f, -14.5f)
                close()
            }
        }.build()
        
        return _CloudMoon!!
    }

private var _CloudMoon: ImageVector? = null


package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PooStorm: ImageVector
    get() {
        if (_PooStorm != null) return _PooStorm!!
        
        _PooStorm = ImageVector.Builder(
            name = "poo-storm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(308f, 336f)
                horizontalLineToRelative(-57.7f)
                lineToRelative(17.3f, -64.9f)
                curveToRelative(2f, -7.6f, -3.7f, -15.1f, -11.6f, -15.1f)
                horizontalLineToRelative(-68f)
                curveToRelative(-6f, 0f, -11.1f, 4.5f, -11.9f, 10.4f)
                lineToRelative(-16f, 120f)
                curveToRelative(-1f, 7.2f, 4.6f, 13.6f, 11.9f, 13.6f)
                horizontalLineToRelative(59.3f)
                lineToRelative(-23f, 97.2f)
                curveToRelative(-1.8f, 7.6f, 4f, 14.8f, 11.7f, 14.8f)
                curveToRelative(4.2f, 0f, 8.2f, -2.2f, 10.4f, -6f)
                lineToRelative(88f, -152f)
                curveToRelative(4.6f, -8f, -1.2f, -18f, -10.4f, -18f)
                close()
                moveToRelative(66.4f, -111.3f)
                curveToRelative(5.9f, -9.6f, 9.6f, -20.6f, 9.6f, -32.7f)
                curveToRelative(0f, -35.3f, -28.7f, -64f, -64f, -64f)
                horizontalLineToRelative(-5.9f)
                curveToRelative(3.6f, -10.1f, 5.9f, -20.7f, 5.9f, -32f)
                curveToRelative(0f, -53f, -43f, -96f, -96f, -96f)
                curveToRelative(-5.2f, 0f, -10.2f, 0.7f, -15.1f, 1.5f)
                curveTo(218.3f, 14.6f, 224f, 30.6f, 224f, 48f)
                curveToRelative(0f, 44.2f, -35.8f, 80f, -80f, 80f)
                horizontalLineToRelative(-16f)
                curveToRelative(-35.3f, 0f, -64f, 28.7f, -64f, 64f)
                curveToRelative(0f, 12.1f, 3.7f, 23.1f, 9.6f, 32.7f)
                curveTo(32.6f, 228f, 0f, 262.2f, 0f, 304f)
                curveToRelative(0f, 44f, 36f, 80f, 80f, 80f)
                horizontalLineToRelative(48.3f)
                curveToRelative(0.1f, -0.6f, 0f, -1.2f, 0f, -1.8f)
                lineToRelative(16f, -120f)
                curveToRelative(3f, -21.8f, 21.7f, -38.2f, 43.7f, -38.2f)
                horizontalLineToRelative(68f)
                curveToRelative(13.8f, 0f, 26.5f, 6.3f, 34.9f, 17.2f)
                reflectiveCurveToRelative(11.2f, 24.8f, 7.6f, 38.1f)
                lineToRelative(-6.6f, 24.7f)
                horizontalLineToRelative(16f)
                curveToRelative(15.7f, 0f, 30.3f, 8.4f, 38.1f, 22f)
                curveToRelative(7.8f, 13.6f, 7.8f, 30.5f, 0f, 44f)
                lineToRelative(-8.1f, 14f)
                horizontalLineToRelative(30f)
                curveToRelative(44f, 0f, 80f, -36f, 80f, -80f)
                curveToRelative(0.1f, -41.8f, -32.5f, -76f, -73.5f, -79.3f)
                close()
            }
        }.build()
        
        return _PooStorm!!
    }

private var _PooStorm: ImageVector? = null


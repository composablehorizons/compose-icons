package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ShareAlt: ImageVector
    get() {
        if (_ShareAlt != null) return _ShareAlt!!
        
        _ShareAlt = ImageVector.Builder(
            name = "share-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(352f, 320f)
                curveToRelative(-22.608f, 0f, -43.387f, 7.819f, -59.79f, 20.895f)
                lineToRelative(-102.486f, -64.054f)
                arcToRelative(96.551f, 96.551f, 0f, false, false, 0f, -41.683f)
                lineToRelative(102.486f, -64.054f)
                curveTo(308.613f, 184.181f, 329.392f, 192f, 352f, 192f)
                curveToRelative(53.019f, 0f, 96f, -42.981f, 96f, -96f)
                reflectiveCurveTo(405.019f, 0f, 352f, 0f)
                reflectiveCurveToRelative(-96f, 42.981f, -96f, 96f)
                curveToRelative(0f, 7.158f, 0.79f, 14.13f, 2.276f, 20.841f)
                lineTo(155.79f, 180.895f)
                curveTo(139.387f, 167.819f, 118.608f, 160f, 96f, 160f)
                curveToRelative(-53.019f, 0f, -96f, 42.981f, -96f, 96f)
                reflectiveCurveToRelative(42.981f, 96f, 96f, 96f)
                curveToRelative(22.608f, 0f, 43.387f, -7.819f, 59.79f, -20.895f)
                lineToRelative(102.486f, 64.054f)
                arcTo(96.301f, 96.301f, 0f, false, false, 256f, 416f)
                curveToRelative(0f, 53.019f, 42.981f, 96f, 96f, 96f)
                reflectiveCurveToRelative(96f, -42.981f, 96f, -96f)
                reflectiveCurveToRelative(-42.981f, -96f, -96f, -96f)
                close()
            }
        }.build()
        
        return _ShareAlt!!
    }

private var _ShareAlt: ImageVector? = null


package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Comment: ImageVector
    get() {
        if (_Comment != null) return _Comment!!
        
        _Comment = ImageVector.Builder(
            name = "comment",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 32f)
                curveTo(114.6f, 32f, 0f, 125.1f, 0f, 240f)
                curveToRelative(0f, 47.6f, 19.9f, 91.2f, 52.9f, 126.3f)
                curveTo(38f, 405.7f, 7f, 439.1f, 6.5f, 439.5f)
                curveToRelative(-6.6f, 7f, -8.4f, 17.2f, -4.6f, 26f)
                reflectiveCurveTo(14.4f, 480f, 24f, 480f)
                curveToRelative(61.5f, 0f, 110f, -25.7f, 139.1f, -46.3f)
                curveTo(192f, 442.8f, 223.2f, 448f, 256f, 448f)
                curveToRelative(141.4f, 0f, 256f, -93.1f, 256f, -208f)
                reflectiveCurveTo(397.4f, 32f, 256f, 32f)
                close()
                moveToRelative(0f, 368f)
                curveToRelative(-26.7f, 0f, -53.1f, -4.1f, -78.4f, -12.1f)
                lineToRelative(-22.7f, -7.2f)
                lineToRelative(-19.5f, 13.8f)
                curveToRelative(-14.3f, 10.1f, -33.9f, 21.4f, -57.5f, 29f)
                curveToRelative(7.3f, -12.1f, 14.4f, -25.7f, 19.9f, -40.2f)
                lineToRelative(10.6f, -28.1f)
                lineToRelative(-20.6f, -21.8f)
                curveTo(69.7f, 314.1f, 48f, 282.2f, 48f, 240f)
                curveToRelative(0f, -88.2f, 93.3f, -160f, 208f, -160f)
                reflectiveCurveToRelative(208f, 71.8f, 208f, 160f)
                reflectiveCurveToRelative(-93.3f, 160f, -208f, 160f)
                close()
            }
        }.build()
        
        return _Comment!!
    }

private var _Comment: ImageVector? = null


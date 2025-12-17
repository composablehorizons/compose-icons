package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HockeyPuck: ImageVector
    get() {
        if (_HockeyPuck != null) return _HockeyPuck!!
        
        _HockeyPuck = ImageVector.Builder(
            name = "hockey-puck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 160f)
                curveToRelative(0f, -53f, 114.6f, -96f, 256f, -96f)
                reflectiveCurveToRelative(256f, 43f, 256f, 96f)
                reflectiveCurveToRelative(-114.6f, 96f, -256f, 96f)
                reflectiveCurveTo(0f, 213f, 0f, 160f)
                close()
                moveToRelative(0f, 82.2f)
                verticalLineTo(352f)
                curveToRelative(0f, 53f, 114.6f, 96f, 256f, 96f)
                reflectiveCurveToRelative(256f, -43f, 256f, -96f)
                verticalLineTo(242.2f)
                curveToRelative(-113.4f, 82.3f, -398.5f, 82.4f, -512f, 0f)
                close()
            }
        }.build()
        
        return _HockeyPuck!!
    }

private var _HockeyPuck: ImageVector? = null


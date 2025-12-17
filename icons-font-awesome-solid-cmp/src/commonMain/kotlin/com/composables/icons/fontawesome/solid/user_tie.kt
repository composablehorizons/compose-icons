package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UserTie: ImageVector
    get() {
        if (_UserTie != null) return _UserTie!!
        
        _UserTie = ImageVector.Builder(
            name = "user-tie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 256f)
                curveToRelative(70.7f, 0f, 128f, -57.3f, 128f, -128f)
                reflectiveCurveTo(294.7f, 0f, 224f, 0f)
                reflectiveCurveTo(96f, 57.3f, 96f, 128f)
                reflectiveCurveToRelative(57.3f, 128f, 128f, 128f)
                close()
                moveToRelative(95.8f, 32.6f)
                lineTo(272f, 480f)
                lineToRelative(-32f, -136f)
                lineToRelative(32f, -56f)
                horizontalLineToRelative(-96f)
                lineToRelative(32f, 56f)
                lineToRelative(-32f, 136f)
                lineToRelative(-47.8f, -191.4f)
                curveTo(56.9f, 292f, 0f, 350.3f, 0f, 422.4f)
                verticalLineTo(464f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineToRelative(-41.6f)
                curveToRelative(0f, -72.1f, -56.9f, -130.4f, -128.2f, -133.8f)
                close()
            }
        }.build()
        
        return _UserTie!!
    }

private var _UserTie: ImageVector? = null


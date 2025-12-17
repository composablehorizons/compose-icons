package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PauseCircle: ImageVector
    get() {
        if (_PauseCircle != null) return _PauseCircle!!
        
        _PauseCircle = ImageVector.Builder(
            name = "pause-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 8f)
                curveTo(119f, 8f, 8f, 119f, 8f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(393f, 8f, 256f, 8f)
                close()
                moveToRelative(-16f, 328f)
                curveToRelative(0f, 8.8f, -7.2f, 16f, -16f, 16f)
                horizontalLineToRelative(-48f)
                curveToRelative(-8.8f, 0f, -16f, -7.2f, -16f, -16f)
                verticalLineTo(176f)
                curveToRelative(0f, -8.8f, 7.2f, -16f, 16f, -16f)
                horizontalLineToRelative(48f)
                curveToRelative(8.8f, 0f, 16f, 7.2f, 16f, 16f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(112f, 0f)
                curveToRelative(0f, 8.8f, -7.2f, 16f, -16f, 16f)
                horizontalLineToRelative(-48f)
                curveToRelative(-8.8f, 0f, -16f, -7.2f, -16f, -16f)
                verticalLineTo(176f)
                curveToRelative(0f, -8.8f, 7.2f, -16f, 16f, -16f)
                horizontalLineToRelative(48f)
                curveToRelative(8.8f, 0f, 16f, 7.2f, 16f, 16f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _PauseCircle!!
    }

private var _PauseCircle: ImageVector? = null


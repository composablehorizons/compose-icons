package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.MapSigns: ImageVector
    get() {
        if (_MapSigns != null) return _MapSigns!!
        
        _MapSigns = ImageVector.Builder(
            name = "map-signs",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(507.31f, 84.69f)
                lineTo(464f, 41.37f)
                curveToRelative(-6f, -6f, -14.14f, -9.37f, -22.63f, -9.37f)
                horizontalLineTo(288f)
                verticalLineTo(16f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineToRelative(-32f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(16f)
                horizontalLineTo(56f)
                curveToRelative(-13.25f, 0f, -24f, 10.75f, -24f, 24f)
                verticalLineToRelative(80f)
                curveToRelative(0f, 13.25f, 10.75f, 24f, 24f, 24f)
                horizontalLineToRelative(385.37f)
                curveToRelative(8.49f, 0f, 16.62f, -3.37f, 22.63f, -9.37f)
                lineToRelative(43.31f, -43.31f)
                curveToRelative(6.25f, -6.26f, 6.25f, -16.38f, 0f, -22.63f)
                close()
                moveTo(224f, 496f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(384f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(112f)
                close()
                moveToRelative(232f, -272f)
                horizontalLineTo(288f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(32f)
                horizontalLineTo(70.63f)
                curveToRelative(-8.49f, 0f, -16.62f, 3.37f, -22.63f, 9.37f)
                lineTo(4.69f, 276.69f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0f, 22.63f)
                lineTo(48f, 342.63f)
                curveToRelative(6f, 6f, 14.14f, 9.37f, 22.63f, 9.37f)
                horizontalLineTo(456f)
                curveToRelative(13.25f, 0f, 24f, -10.75f, 24f, -24f)
                verticalLineToRelative(-80f)
                curveToRelative(0f, -13.25f, -10.75f, -24f, -24f, -24f)
                close()
            }
        }.build()
        
        return _MapSigns!!
    }

private var _MapSigns: ImageVector? = null


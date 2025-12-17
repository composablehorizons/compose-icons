package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Male: ImageVector
    get() {
        if (_Male != null) return _Male!!
        
        _Male = ImageVector.Builder(
            name = "male",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 192f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(96f, 0f)
                curveToRelative(35.346f, 0f, 64f, 28.654f, 64f, 64f)
                reflectiveCurveToRelative(-28.654f, 64f, -64f, 64f)
                reflectiveCurveToRelative(-64f, -28.654f, -64f, -64f)
                reflectiveCurveTo(60.654f, 0f, 96f, 0f)
                moveToRelative(48f, 144f)
                horizontalLineToRelative(-11.36f)
                curveToRelative(-22.711f, 10.443f, -49.59f, 10.894f, -73.28f, 0f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                verticalLineToRelative(136f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(136f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(64f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(352f)
                horizontalLineToRelative(16f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(192f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                close()
            }
        }.build()
        
        return _Male!!
    }

private var _Male: ImageVector? = null


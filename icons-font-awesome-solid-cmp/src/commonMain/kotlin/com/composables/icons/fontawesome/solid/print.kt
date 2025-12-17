package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Print: ImageVector
    get() {
        if (_Print != null) return _Print!!
        
        _Print = ImageVector.Builder(
            name = "print",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 192f)
                verticalLineTo(77.25f)
                curveToRelative(0f, -8.49f, -3.37f, -16.62f, -9.37f, -22.63f)
                lineTo(393.37f, 9.37f)
                curveToRelative(-6f, -6f, -14.14f, -9.37f, -22.63f, -9.37f)
                horizontalLineTo(96f)
                curveTo(78.33f, 0f, 64f, 14.33f, 64f, 32f)
                verticalLineToRelative(160f)
                curveToRelative(-35.35f, 0f, -64f, 28.65f, -64f, 64f)
                verticalLineToRelative(112f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(320f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-96f)
                horizontalLineToRelative(48f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(256f)
                curveToRelative(0f, -35.35f, -28.65f, -64f, -64f, -64f)
                close()
                moveToRelative(-64f, 256f)
                horizontalLineTo(128f)
                verticalLineToRelative(-96f)
                horizontalLineToRelative(256f)
                verticalLineToRelative(96f)
                close()
                moveToRelative(0f, -224f)
                horizontalLineTo(128f)
                verticalLineTo(64f)
                horizontalLineToRelative(192f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(96f)
                close()
                moveToRelative(48f, 72f)
                curveToRelative(-13.25f, 0f, -24f, -10.75f, -24f, -24f)
                curveToRelative(0f, -13.26f, 10.75f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.74f, 24f, 24f)
                curveToRelative(0f, 13.25f, -10.75f, 24f, -24f, 24f)
                close()
            }
        }.build()
        
        return _Print!!
    }

private var _Print: ImageVector? = null


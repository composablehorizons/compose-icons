package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.VrCardboard: ImageVector
    get() {
        if (_VrCardboard != null) return _VrCardboard!!
        
        _VrCardboard = ImageVector.Builder(
            name = "vr-cardboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(608f, 64f)
                horizontalLineTo(32f)
                curveTo(14.33f, 64f, 0f, 78.33f, 0f, 96f)
                verticalLineToRelative(320f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(160.22f)
                curveToRelative(25.19f, 0f, 48.03f, -14.77f, 58.36f, -37.74f)
                lineToRelative(27.74f, -61.64f)
                curveTo(286.21f, 331.08f, 302.35f, 320f, 320f, 320f)
                reflectiveCurveToRelative(33.79f, 11.08f, 41.68f, 28.62f)
                lineToRelative(27.74f, 61.64f)
                curveTo(399.75f, 433.23f, 422.6f, 448f, 447.78f, 448f)
                horizontalLineTo(608f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(96f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveTo(160f, 304f)
                curveToRelative(-35.35f, 0f, -64f, -28.65f, -64f, -64f)
                reflectiveCurveToRelative(28.65f, -64f, 64f, -64f)
                reflectiveCurveToRelative(64f, 28.65f, 64f, 64f)
                reflectiveCurveToRelative(-28.65f, 64f, -64f, 64f)
                close()
                moveToRelative(320f, 0f)
                curveToRelative(-35.35f, 0f, -64f, -28.65f, -64f, -64f)
                reflectiveCurveToRelative(28.65f, -64f, 64f, -64f)
                reflectiveCurveToRelative(64f, 28.65f, 64f, 64f)
                reflectiveCurveToRelative(-28.65f, 64f, -64f, 64f)
                close()
            }
        }.build()
        
        return _VrCardboard!!
    }

private var _VrCardboard: ImageVector? = null


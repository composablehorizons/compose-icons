package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.BezierCurve: ImageVector
    get() {
        if (_BezierCurve != null) return _BezierCurve!!
        
        _BezierCurve = ImageVector.Builder(
            name = "bezier-curve",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(368f, 32f)
                horizontalLineToRelative(-96f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(96f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(64f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveTo(208f, 88f)
                horizontalLineToRelative(-84.75f)
                curveTo(113.75f, 64.56f, 90.84f, 48f, 64f, 48f)
                curveTo(28.66f, 48f, 0f, 76.65f, 0f, 112f)
                reflectiveCurveToRelative(28.66f, 64f, 64f, 64f)
                curveToRelative(26.84f, 0f, 49.75f, -16.56f, 59.25f, -40f)
                horizontalLineToRelative(79.73f)
                curveToRelative(-55.37f, 32.52f, -95.86f, 87.32f, -109.54f, 152f)
                horizontalLineToRelative(49.4f)
                curveToRelative(11.3f, -41.61f, 36.77f, -77.21f, 71.04f, -101.56f)
                curveToRelative(-3.7f, -8.08f, -5.88f, -16.99f, -5.88f, -26.44f)
                verticalLineTo(88f)
                close()
                moveToRelative(-48f, 232f)
                horizontalLineTo(64f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(96f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveTo(576f, 48f)
                curveToRelative(-26.84f, 0f, -49.75f, 16.56f, -59.25f, 40f)
                horizontalLineTo(432f)
                verticalLineToRelative(72f)
                curveToRelative(0f, 9.45f, -2.19f, 18.36f, -5.88f, 26.44f)
                curveToRelative(34.27f, 24.35f, 59.74f, 59.95f, 71.04f, 101.56f)
                horizontalLineToRelative(49.4f)
                curveToRelative(-13.68f, -64.68f, -54.17f, -119.48f, -109.54f, -152f)
                horizontalLineToRelative(79.73f)
                curveToRelative(9.5f, 23.44f, 32.41f, 40f, 59.25f, 40f)
                curveToRelative(35.34f, 0f, 64f, -28.65f, 64f, -64f)
                reflectiveCurveToRelative(-28.66f, -64f, -64f, -64f)
                close()
                moveToRelative(0f, 272f)
                horizontalLineToRelative(-96f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(96f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
            }
        }.build()
        
        return _BezierCurve!!
    }

private var _BezierCurve: ImageVector? = null


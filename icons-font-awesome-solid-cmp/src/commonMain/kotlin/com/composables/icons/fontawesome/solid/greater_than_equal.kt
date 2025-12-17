package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.GreaterThanEqual: ImageVector
    get() {
        if (_GreaterThanEqual != null) return _GreaterThanEqual!!
        
        _GreaterThanEqual = ImageVector.Builder(
            name = "greater-than-equal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(55.22f, 107.69f)
                lineToRelative(175.56f, 68.09f)
                lineToRelative(-175.44f, 68.05f)
                curveToRelative(-18.39f, 6.03f, -27.88f, 24.39f, -21.2f, 41f)
                lineToRelative(12.09f, 30.08f)
                curveToRelative(6.68f, 16.61f, 26.99f, 25.19f, 45.38f, 19.15f)
                lineTo(393.02f, 214.2f)
                curveToRelative(13.77f, -4.52f, 22.98f, -16.61f, 22.98f, -30.17f)
                verticalLineToRelative(-15.96f)
                curveToRelative(0f, -13.56f, -9.21f, -25.65f, -22.98f, -30.17f)
                lineTo(91.3f, 17.92f)
                curveToRelative(-18.29f, -6f, -38.51f, 2.53f, -45.15f, 19.06f)
                lineTo(34.12f, 66.9f)
                curveToRelative(-6.64f, 16.53f, 2.81f, 34.79f, 21.1f, 40.79f)
                close()
                moveTo(424f, 400f)
                horizontalLineTo(24f)
                curveToRelative(-13.25f, 0f, -24f, 10.74f, -24f, 24f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 13.25f, 10.75f, 24f, 24f, 24f)
                horizontalLineToRelative(400f)
                curveToRelative(13.25f, 0f, 24f, -10.75f, 24f, -24f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -13.26f, -10.75f, -24f, -24f, -24f)
                close()
            }
        }.build()
        
        return _GreaterThanEqual!!
    }

private var _GreaterThanEqual: ImageVector? = null


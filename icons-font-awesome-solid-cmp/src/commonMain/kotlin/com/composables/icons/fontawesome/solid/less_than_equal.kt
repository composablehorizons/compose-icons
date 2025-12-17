package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.LessThanEqual: ImageVector
    get() {
        if (_LessThanEqual != null) return _LessThanEqual!!
        
        _LessThanEqual = ImageVector.Builder(
            name = "less-than-equal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(54.98f, 214.2f)
                lineToRelative(301.41f, 119.87f)
                curveToRelative(18.39f, 6.03f, 38.71f, -2.54f, 45.38f, -19.15f)
                lineToRelative(12.09f, -30.08f)
                curveToRelative(6.68f, -16.61f, -2.82f, -34.97f, -21.21f, -41f)
                lineToRelative(-175.44f, -68.05f)
                lineToRelative(175.56f, -68.09f)
                curveToRelative(18.29f, -6f, 27.74f, -24.27f, 21.1f, -40.79f)
                lineToRelative(-12.03f, -29.92f)
                curveToRelative(-6.64f, -16.53f, -26.86f, -25.06f, -45.15f, -19.06f)
                lineTo(54.98f, 137.89f)
                curveTo(41.21f, 142.41f, 32f, 154.5f, 32f, 168.07f)
                verticalLineToRelative(15.96f)
                curveToRelative(0f, 13.56f, 9.21f, 25.65f, 22.98f, 30.17f)
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
        
        return _LessThanEqual!!
    }

private var _LessThanEqual: ImageVector? = null


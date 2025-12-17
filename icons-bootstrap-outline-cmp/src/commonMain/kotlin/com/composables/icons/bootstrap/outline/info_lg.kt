package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.InfoLg: ImageVector
    get() {
        if (_InfoLg != null) return _InfoLg!!
        
        _InfoLg = ImageVector.Builder(
            name = "info-lg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.708f, 6.075f)
                lineToRelative(-3.024f, 0.379f)
                lineToRelative(-0.108f, 0.502f)
                lineToRelative(0.595f, 0.108f)
                curveToRelative(0.387f, 0.093f, 0.464f, 0.232f, 0.38f, 0.619f)
                lineToRelative(-0.975f, 4.577f)
                curveToRelative(-0.255f, 1.183f, 0.14f, 1.74f, 1.067f, 1.74f)
                curveToRelative(0.72f, 0f, 1.554f, -0.332f, 1.933f, -0.789f)
                lineToRelative(0.116f, -0.549f)
                curveToRelative(-0.263f, 0.232f, -0.65f, 0.325f, -0.905f, 0.325f)
                curveToRelative(-0.363f, 0f, -0.494f, -0.255f, -0.402f, -0.704f)
                close()
                moveToRelative(0.091f, -2.755f)
                arcToRelative(1.32f, 1.32f, 0f, true, true, -2.64f, 0f)
                arcToRelative(1.32f, 1.32f, 0f, false, true, 2.64f, 0f)
            }
        }.build()
        
        return _InfoLg!!
    }

private var _InfoLg: ImageVector? = null


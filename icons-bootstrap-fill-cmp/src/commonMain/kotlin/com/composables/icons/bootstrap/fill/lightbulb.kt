package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Lightbulb: ImageVector
    get() {
        if (_Lightbulb != null) return _Lightbulb!!
        
        _Lightbulb = ImageVector.Builder(
            name = "lightbulb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 6f)
                arcToRelative(6f, 6f, 0f, true, true, 10.174f, 4.31f)
                curveToRelative(-0.203f, 0.196f, -0.359f, 0.4f, -0.453f, 0.619f)
                lineToRelative(-0.762f, 1.769f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10.5f, 13f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.46f, -0.302f)
                lineToRelative(-0.761f, -1.77f)
                arcToRelative(2f, 2f, 0f, false, false, -0.453f, -0.618f)
                arcTo(5.98f, 5.98f, 0f, false, true, 2f, 6f)
                moveToRelative(3f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                lineToRelative(-0.224f, 0.447f)
                arcToRelative(1f, 1f, 0f, false, true, -0.894f, 0.553f)
                horizontalLineTo(6.618f)
                arcToRelative(1f, 1f, 0f, false, true, -0.894f, -0.553f)
                lineTo(5.5f, 15f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
        }.build()
        
        return _Lightbulb!!
    }

private var _Lightbulb: ImageVector? = null


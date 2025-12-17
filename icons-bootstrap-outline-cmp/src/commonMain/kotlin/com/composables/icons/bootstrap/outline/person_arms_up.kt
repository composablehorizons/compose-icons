package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PersonArmsUp: ImageVector
    get() {
        if (_PersonArmsUp != null) return _PersonArmsUp!!
        
        _PersonArmsUp = ImageVector.Builder(
            name = "person-arms-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.93f, 6.704f)
                lineToRelative(-0.846f, 8.451f)
                arcToRelative(0.768f, 0.768f, 0f, false, false, 1.523f, 0.203f)
                lineToRelative(0.81f, -4.865f)
                arcToRelative(0.59f, 0.59f, 0f, false, true, 1.165f, 0f)
                lineToRelative(0.81f, 4.865f)
                arcToRelative(0.768f, 0.768f, 0f, false, false, 1.523f, -0.203f)
                lineToRelative(-0.845f, -8.451f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10.5f, 5.5f)
                lineTo(13f, 2.284f)
                arcToRelative(0.796f, 0.796f, 0f, false, false, -1.239f, -0.998f)
                lineTo(9.634f, 3.84f)
                arcToRelative(0.7f, 0.7f, 0f, false, true, -0.33f, 0.235f)
                curveToRelative(-0.23f, 0.074f, -0.665f, 0.176f, -1.304f, 0.176f)
                curveToRelative(-0.64f, 0f, -1.074f, -0.102f, -1.305f, -0.176f)
                arcToRelative(0.7f, 0.7f, 0f, false, true, -0.329f, -0.235f)
                lineTo(4.239f, 1.286f)
                arcToRelative(0.796f, 0.796f, 0f, false, false, -1.24f, 0.998f)
                lineToRelative(2.5f, 3.216f)
                curveToRelative(0.317f, 0.316f, 0.475f, 0.758f, 0.43f, 1.204f)
                close()
            }
        }.build()
        
        return _PersonArmsUp!!
    }

private var _PersonArmsUp: ImageVector? = null


package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Map: ImageVector
    get() {
        if (_Map != null) return _Map!!
        
        _Map = ImageVector.Builder(
            name = "map",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.65f, 4.98f)
                lineToRelative(-5f, -1.75f)
                curveToRelative(-0.42f, -0.15f, -0.88f, -0.15f, -1.3f, -0.01f)
                lineTo(4.36f, 4.56f)
                curveTo(3.55f, 4.84f, 3f, 5.6f, 3f, 6.46f)
                verticalLineToRelative(11.85f)
                curveToRelative(0f, 1.41f, 1.41f, 2.37f, 2.72f, 1.86f)
                lineToRelative(2.93f, -1.14f)
                curveToRelative(0.22f, -0.09f, 0.47f, -0.09f, 0.69f, -0.01f)
                lineToRelative(5f, 1.75f)
                curveToRelative(0.42f, 0.15f, 0.88f, 0.15f, 1.3f, 0.01f)
                lineToRelative(3.99f, -1.34f)
                curveToRelative(0.81f, -0.27f, 1.36f, -1.04f, 1.36f, -1.9f)
                verticalLineTo(5.69f)
                curveToRelative(0f, -1.41f, -1.41f, -2.37f, -2.72f, -1.86f)
                lineToRelative(-2.93f, 1.14f)
                curveToRelative(-0.22f, 0.08f, -0.46f, 0.09f, -0.69f, 0.01f)
                close()
                moveTo(15f, 18.89f)
                lineToRelative(-6f, -2.11f)
                verticalLineTo(5.11f)
                lineToRelative(6f, 2.11f)
                verticalLineToRelative(11.67f)
                close()
            }
        }.build()
        
        return _Map!!
    }

private var _Map: ImageVector? = null


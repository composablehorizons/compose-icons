package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Beach_access: ImageVector
    get() {
        if (_Beach_access != null) return _Beach_access!!
        
        _Beach_access = ImageVector.Builder(
            name = "beach_access",
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
                moveTo(13.13f, 14.56f)
                lineToRelative(1.43f, -1.43f)
                lineToRelative(5.73f, 5.73f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.03f, 0f, 1.43f)
                curveToRelative(-0.39f, 0.39f, -1.03f, 0.39f, -1.43f, 0f)
                lineToRelative(-5.73f, -5.73f)
                close()
                moveToRelative(4.29f, -5.73f)
                lineToRelative(1.27f, -1.27f)
                curveToRelative(0.89f, -0.89f, 0.77f, -2.43f, -0.31f, -3.08f)
                curveToRelative(-3.89f, -2.38f, -9.03f, -1.89f, -12.4f, 1.47f)
                curveToRelative(3.93f, -1.3f, 8.31f, -0.25f, 11.44f, 2.88f)
                close()
                moveTo(5.95f, 5.98f)
                curveToRelative(-3.36f, 3.37f, -3.85f, 8.51f, -1.48f, 12.4f)
                curveToRelative(0.66f, 1.08f, 2.19f, 1.21f, 3.08f, 0.31f)
                lineToRelative(1.27f, -1.27f)
                curveTo(5.7f, 14.29f, 4.65f, 9.91f, 5.95f, 5.98f)
                close()
                moveToRelative(0.02f, -0.02f)
                lineToRelative(-0.01f, 0.01f)
                curveToRelative(-0.38f, 3.01f, 1.17f, 6.88f, 4.3f, 10.02f)
                lineToRelative(5.73f, -5.73f)
                curveToRelative(-3.13f, -3.13f, -7.01f, -4.68f, -10.02f, -4.3f)
                close()
            }
        }.build()
        
        return _Beach_access!!
    }

private var _Beach_access: ImageVector? = null


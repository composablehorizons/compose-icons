package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Beach_access: ImageVector
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
                moveTo(21f, 19.57f)
                lineToRelative(-1.427f, 1.428f)
                lineToRelative(-6.442f, -6.442f)
                lineToRelative(1.43f, -1.428f)
                close()
                moveTo(13.12f, 3f)
                curveToRelative(-2.58f, 0f, -5.16f, 0.98f, -7.14f, 2.95f)
                lineToRelative(-0.01f, 0.01f)
                curveToRelative(-3.95f, 3.95f, -3.95f, 10.36f, 0f, 14.31f)
                lineToRelative(14.3f, -14.31f)
                curveTo(18.3f, 3.99f, 15.71f, 3f, 13.12f, 3f)
                close()
                moveTo(6.14f, 17.27f)
                curveTo(5.4f, 16.03f, 5f, 14.61f, 5f, 13.12f)
                curveToRelative(0f, -0.93f, 0.16f, -1.82f, 0.46f, -2.67f)
                curveToRelative(0.19f, 1.91f, 0.89f, 3.79f, 2.07f, 5.44f)
                lineToRelative(-1.39f, 1.38f)
                close()
                moveToRelative(2.84f, -2.84f)
                curveTo(7.63f, 12.38f, 7.12f, 9.93f, 7.6f, 7.6f)
                curveToRelative(0.58f, -0.12f, 1.16f, -0.18f, 1.75f, -0.18f)
                curveToRelative(1.8f, 0f, 3.55f, 0.55f, 5.08f, 1.56f)
                lineToRelative(-5.45f, 5.45f)
                close()
                moveToRelative(1.47f, -8.97f)
                curveToRelative(0.85f, -0.3f, 1.74f, -0.46f, 2.67f, -0.46f)
                curveToRelative(1.49f, 0f, 2.91f, 0.4f, 4.15f, 1.14f)
                lineToRelative(-1.39f, 1.39f)
                curveToRelative(-1.65f, -1.18f, -3.52f, -1.88f, -5.43f, -2.07f)
                close()
            }
        }.build()
        
        return _Beach_access!!
    }

private var _Beach_access: ImageVector? = null


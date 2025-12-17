package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Leak_add: ImageVector
    get() {
        if (_Leak_add != null) return _Leak_add!!
        
        _Leak_add = ImageVector.Builder(
            name = "leak_add",
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
                moveTo(11.05f, 21f)
                curveToRelative(0.5f, 0f, 0.94f, -0.37f, 0.99f, -0.87f)
                curveToRelative(0.41f, -4.27f, 3.81f, -7.67f, 8.08f, -8.08f)
                curveToRelative(0.5f, -0.05f, 0.88f, -0.48f, 0.88f, -0.99f)
                curveToRelative(0f, -0.59f, -0.51f, -1.06f, -1.1f, -1f)
                curveToRelative(-5.19f, 0.52f, -9.32f, 4.65f, -9.84f, 9.83f)
                curveToRelative(-0.06f, 0.59f, 0.4f, 1.11f, 0.99f, 1.11f)
                close()
                moveTo(18f, 21f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                close()
                moveToRelative(-2.91f, 0f)
                curveToRelative(0.49f, 0f, 0.9f, -0.36f, 0.98f, -0.85f)
                curveToRelative(0.36f, -2.08f, 2f, -3.72f, 4.08f, -4.08f)
                curveToRelative(0.49f, -0.08f, 0.85f, -0.49f, 0.85f, -0.98f)
                curveToRelative(0f, -0.61f, -0.54f, -1.09f, -1.14f, -1f)
                curveToRelative(-2.96f, 0.48f, -5.29f, 2.81f, -5.77f, 5.77f)
                curveToRelative(-0.1f, 0.6f, 0.39f, 1.14f, 1f, 1.14f)
                close()
                moveTo(12.97f, 3.02f)
                curveToRelative(-0.5f, 0f, -0.94f, 0.37f, -0.99f, 0.87f)
                curveToRelative(-0.41f, 4.27f, -3.81f, 7.67f, -8.08f, 8.08f)
                curveToRelative(-0.5f, 0.05f, -0.88f, 0.48f, -0.88f, 0.99f)
                curveToRelative(0f, 0.59f, 0.51f, 1.06f, 1.1f, 1f)
                curveToRelative(5.19f, -0.52f, 9.32f, -4.65f, 9.84f, -9.83f)
                curveToRelative(0.07f, -0.58f, -0.39f, -1.11f, -0.99f, -1.11f)
                close()
                moveToRelative(-6.94f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                close()
                moveToRelative(2.91f, 0f)
                curveToRelative(-0.49f, 0f, -0.9f, 0.36f, -0.98f, 0.85f)
                curveToRelative(-0.36f, 2.08f, -2f, 3.72f, -4.08f, 4.08f)
                curveToRelative(-0.49f, 0.09f, -0.85f, 0.49f, -0.85f, 0.99f)
                curveToRelative(0f, 0.61f, 0.54f, 1.09f, 1.14f, 1f)
                curveToRelative(2.96f, -0.48f, 5.29f, -2.81f, 5.77f, -5.77f)
                curveToRelative(0.09f, -0.61f, -0.4f, -1.15f, -1f, -1.15f)
                close()
            }
        }.build()
        
        return _Leak_add!!
    }

private var _Leak_add: ImageVector? = null


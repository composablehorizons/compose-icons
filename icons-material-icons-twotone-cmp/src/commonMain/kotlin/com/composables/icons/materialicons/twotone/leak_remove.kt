package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Leak_remove: ImageVector
    get() {
        if (_Leak_remove != null) return _Leak_remove!!
        
        _Leak_remove = ImageVector.Builder(
            name = "leak_remove",
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
                moveTo(14f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.35f, -0.31f, 2.63f, -0.84f, 3.77f)
                lineToRelative(1.49f, 1.49f)
                curveTo(13.51f, 6.7f, 14f, 4.91f, 14f, 3f)
                close()
                moveToRelative(7f, 9f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.91f, 0f, -3.7f, 0.49f, -5.27f, 1.35f)
                lineToRelative(1.49f, 1.49f)
                curveToRelative(1.15f, -0.53f, 2.43f, -0.84f, 3.78f, -0.84f)
                close()
                moveToRelative(0f, 4f)
                verticalLineToRelative(-2f)
                curveToRelative(-0.79f, 0f, -1.54f, 0.13f, -2.24f, 0.37f)
                lineToRelative(1.68f, 1.68f)
                curveToRelative(0.19f, -0.01f, 0.37f, -0.05f, 0.56f, -0.05f)
                close()
                moveTo(10f, 3f)
                horizontalLineTo(8f)
                curveToRelative(0f, 0.19f, -0.04f, 0.37f, -0.06f, 0.56f)
                lineToRelative(1.68f, 1.68f)
                curveToRelative(0.25f, -0.7f, 0.38f, -1.46f, 0.38f, -2.24f)
                close()
                moveToRelative(-5.59f, -0.14f)
                lineTo(3f, 4.27f)
                lineToRelative(2.84f, 2.84f)
                curveTo(5.03f, 7.67f, 4.06f, 8f, 3f, 8f)
                verticalLineToRelative(2f)
                curveToRelative(1.61f, 0f, 3.09f, -0.55f, 4.27f, -1.46f)
                lineTo(8.7f, 9.97f)
                curveTo(7.14f, 11.24f, 5.16f, 12f, 3f, 12f)
                verticalLineToRelative(2f)
                curveToRelative(2.72f, 0f, 5.2f, -0.99f, 7.11f, -2.62f)
                lineToRelative(2.51f, 2.51f)
                curveTo(10.99f, 15.81f, 10f, 18.29f, 10f, 21f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -2.16f, 0.76f, -4.14f, 2.03f, -5.7f)
                lineToRelative(1.43f, 1.43f)
                curveTo(14.55f, 17.91f, 14f, 19.39f, 14f, 21f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.06f, 0.33f, -2.03f, 0.89f, -2.84f)
                lineTo(19.73f, 21f)
                lineToRelative(1.41f, -1.41f)
                lineTo(4.41f, 2.86f)
                close()
            }
        }.build()
        
        return _Leak_remove!!
    }

private var _Leak_remove: ImageVector? = null


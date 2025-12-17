package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Set_meal: ImageVector
    get() {
        if (_Set_meal != null) return _Set_meal!!
        
        _Set_meal = ImageVector.Builder(
            name = "set_meal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.3f, 17.6f)
                lineTo(3.83f, 18.46f)
                curveToRelative(-0.41f, 0.02f, -0.77f, -0.3f, -0.79f, -0.71f)
                lineToRelative(0f, 0f)
                curveToRelative(-0.02f, -0.41f, 0.3f, -0.77f, 0.71f, -0.79f)
                lineToRelative(16.48f, -0.86f)
                curveToRelative(0.41f, -0.02f, 0.77f, 0.3f, 0.79f, 0.71f)
                verticalLineToRelative(0f)
                curveTo(21.04f, 17.22f, 20.72f, 17.58f, 20.3f, 17.6f)
                close()
                moveTo(20.25f, 19.48f)
                horizontalLineTo(3.75f)
                curveTo(3.34f, 19.48f, 3f, 19.82f, 3f, 20.23f)
                lineToRelative(0f, 0f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                lineToRelative(0f, 0f)
                curveTo(21f, 19.82f, 20.66f, 19.48f, 20.25f, 19.48f)
                close()
                moveTo(22f, 5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(16f)
                curveTo(21.1f, 3f, 22f, 3.9f, 22f, 5f)
                close()
                moveTo(19.12f, 6.09f)
                curveToRelative(-1.25f, 0.27f, -2.19f, 1.11f, -2.33f, 2.14f)
                curveTo(16.15f, 7.5f, 14.06f, 5.5f, 10.25f, 5.5f)
                curveToRelative(-3.44f, 0f, -5.48f, 1.63f, -6.31f, 2.49f)
                curveToRelative(-0.28f, 0.29f, -0.28f, 0.74f, 0f, 1.03f)
                curveToRelative(0.83f, 0.86f, 2.87f, 2.49f, 6.31f, 2.49f)
                curveToRelative(3.81f, 0f, 5.9f, -2f, 6.54f, -2.73f)
                curveToRelative(0.14f, 1.02f, 1.08f, 1.86f, 2.33f, 2.14f)
                curveToRelative(0.46f, 0.1f, 0.88f, -0.28f, 0.88f, -0.74f)
                verticalLineTo(6.84f)
                curveTo(20f, 6.37f, 19.57f, 5.99f, 19.12f, 6.09f)
                close()
            }
        }.build()
        
        return _Set_meal!!
    }

private var _Set_meal: ImageVector? = null


package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Grass: ImageVector
    get() {
        if (_Grass != null) return _Grass!!
        
        _Grass = ImageVector.Builder(
            name = "grass",
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
                moveTo(12f, 20f)
                horizontalLineTo(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.75f)
                lineToRelative(0f, 0f)
                curveTo(7.02f, 15.19f, 4.81f, 12.99f, 2f, 12.26f)
                curveTo(2.64f, 12.1f, 3.31f, 12f, 4f, 12f)
                curveTo(8.42f, 12f, 12f, 15.58f, 12f, 20f)
                close()
                moveTo(22f, 12.26f)
                curveTo(21.36f, 12.1f, 20.69f, 12f, 20f, 12f)
                curveToRelative(-2.93f, 0f, -5.48f, 1.58f, -6.88f, 3.93f)
                curveToRelative(0.29f, 0.66f, 0.53f, 1.35f, 0.67f, 2.07f)
                curveToRelative(0.13f, 0.65f, 0.2f, 1.32f, 0.2f, 2f)
                horizontalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5.75f)
                curveTo(16.98f, 15.19f, 19.19f, 12.99f, 22f, 12.26f)
                close()
                moveTo(15.64f, 11.02f)
                curveToRelative(0.78f, -2.09f, 2.23f, -3.84f, 4.09f, -5f)
                curveTo(15.44f, 6.16f, 12f, 9.67f, 12f, 14f)
                curveToRelative(0f, 0.01f, 0f, 0.02f, 0f, 0.02f)
                curveTo(12.95f, 12.75f, 14.2f, 11.72f, 15.64f, 11.02f)
                close()
                moveTo(11.42f, 8.85f)
                curveTo(10.58f, 6.66f, 8.88f, 4.89f, 6.7f, 4f)
                curveTo(8.14f, 5.86f, 9f, 8.18f, 9f, 10.71f)
                curveToRelative(0f, 0.21f, -0.03f, 0.41f, -0.04f, 0.61f)
                curveToRelative(0.43f, 0.24f, 0.83f, 0.52f, 1.22f, 0.82f)
                curveTo(10.39f, 10.96f, 10.83f, 9.85f, 11.42f, 8.85f)
                close()
            }
        }.build()
        
        return _Grass!!
    }

private var _Grass: ImageVector? = null


package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Recycling: ImageVector
    get() {
        if (_Recycling != null) return _Recycling!!
        
        _Recycling = ImageVector.Builder(
            name = "recycling",
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
                moveTo(6.2f, 7.41f)
                curveTo(5.97f, 7.27f, 5.89f, 6.96f, 6.03f, 6.73f)
                lineTo(7.2f, 4.78f)
                lineToRelative(1.03f, -1.71f)
                curveToRelative(0.39f, -0.65f, 1.33f, -0.65f, 1.72f, 0f)
                lineToRelative(1.48f, 2.46f)
                lineToRelative(-1.23f, 2.06f)
                lineToRelative(-0.72f, 1.2f)
                curveTo(9.32f, 9.02f, 9.01f, 9.1f, 8.77f, 8.96f)
                lineTo(6.2f, 7.41f)
                close()
                moveTo(21.72f, 12.97f)
                lineToRelative(-1.34f, -2.24f)
                curveToRelative(-0.14f, -0.23f, -0.44f, -0.31f, -0.68f, -0.18f)
                lineToRelative(-2.6f, 1.5f)
                curveToRelative(-0.24f, 0.14f, -0.32f, 0.45f, -0.18f, 0.69f)
                lineTo(18.87f, 16f)
                lineToRelative(1.09f, 0f)
                curveToRelative(0.61f, 0f, 1.2f, -0.26f, 1.59f, -0.73f)
                curveTo(21.85f, 14.9f, 22f, 14.45f, 22f, 14f)
                curveTo(22f, 13.64f, 21.9f, 13.29f, 21.72f, 12.97f)
                close()
                moveTo(16f, 21f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.76f, 0f, 1.45f, -0.43f, 1.79f, -1.11f)
                lineTo(20.74f, 17f)
                horizontalLineTo(16f)
                verticalLineToRelative(-0.79f)
                curveToRelative(0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f)
                lineToRelative(-2.79f, 2.79f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(2.79f, 2.79f)
                curveToRelative(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.35f)
                verticalLineTo(21f)
                close()
                moveTo(9.5f, 17f)
                horizontalLineTo(5.7f)
                lineToRelative(-0.84f, 1.41f)
                curveToRelative(-0.3f, 0.5f, -0.32f, 1.12f, -0.06f, 1.65f)
                lineToRelative(0f, 0f)
                curveTo(5.08f, 20.63f, 5.67f, 21f, 6.32f, 21f)
                horizontalLineTo(9.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-3f)
                curveTo(10f, 17.22f, 9.78f, 17f, 9.5f, 17f)
                close()
                moveTo(6.12f, 14.35f)
                lineToRelative(0.7f, 0.42f)
                curveToRelative(0.38f, 0.23f, 0.85f, -0.12f, 0.74f, -0.55f)
                lineTo(6.6f, 10.38f)
                curveTo(6.54f, 10.12f, 6.27f, 9.95f, 6f, 10.02f)
                lineToRelative(-3.83f, 0.96f)
                curveToRelative(-0.43f, 0.11f, -0.52f, 0.68f, -0.14f, 0.91f)
                lineToRelative(0.66f, 0.4f)
                lineToRelative(-0.41f, 0.69f)
                curveToRelative(-0.35f, 0.59f, -0.38f, 1.31f, -0.07f, 1.92f)
                lineToRelative(1.63f, 3.26f)
                lineTo(6.12f, 14.35f)
                close()
                moveTo(17.02f, 5.14f)
                lineToRelative(-1.3f, -2.17f)
                curveTo(15.35f, 2.37f, 14.7f, 2f, 14f, 2f)
                horizontalLineToRelative(-3.53f)
                lineToRelative(3.12f, 5.2f)
                lineTo(12.9f, 7.61f)
                curveToRelative(-0.38f, 0.23f, -0.3f, 0.81f, 0.14f, 0.91f)
                lineToRelative(3.83f, 0.96f)
                curveToRelative(0.27f, 0.07f, 0.54f, -0.1f, 0.61f, -0.36f)
                lineToRelative(0.96f, -3.83f)
                curveToRelative(0.11f, -0.43f, -0.36f, -0.78f, -0.74f, -0.55f)
                lineTo(17.02f, 5.14f)
                close()
            }
        }.build()
        
        return _Recycling!!
    }

private var _Recycling: ImageVector? = null


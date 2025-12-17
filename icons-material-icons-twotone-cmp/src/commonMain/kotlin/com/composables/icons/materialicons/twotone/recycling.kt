package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Recycling: ImageVector
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
                moveTo(5.77f, 7.15f)
                lineTo(7.2f, 4.78f)
                lineToRelative(1.03f, -1.71f)
                curveToRelative(0.39f, -0.65f, 1.33f, -0.65f, 1.72f, 0f)
                lineToRelative(1.48f, 2.46f)
                lineToRelative(-1.23f, 2.06f)
                lineTo(9.2f, 9.21f)
                lineTo(5.77f, 7.15f)
                close()
                moveTo(21.72f, 12.97f)
                lineToRelative(-1.6f, -2.66f)
                lineToRelative(-3.46f, 2f)
                lineTo(18.87f, 16f)
                horizontalLineTo(20f)
                curveToRelative(0.76f, 0f, 1.45f, -0.43f, 1.79f, -1.11f)
                curveTo(21.93f, 14.61f, 22f, 14.31f, 22f, 14f)
                curveTo(22f, 13.64f, 21.9f, 13.29f, 21.72f, 12.97f)
                close()
                moveTo(16f, 21f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.76f, 0f, 1.45f, -0.43f, 1.79f, -1.11f)
                lineTo(20.74f, 17f)
                horizontalLineTo(16f)
                verticalLineToRelative(-2f)
                lineToRelative(-4f, 4f)
                lineToRelative(4f, 4f)
                verticalLineTo(21f)
                close()
                moveTo(10f, 17f)
                horizontalLineTo(5.7f)
                lineToRelative(-0.84f, 1.41f)
                curveToRelative(-0.3f, 0.5f, -0.32f, 1.12f, -0.06f, 1.65f)
                lineToRelative(0f, 0f)
                curveTo(5.08f, 20.63f, 5.67f, 21f, 6.32f, 21f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                close()
                moveTo(6.12f, 14.35f)
                lineToRelative(1.73f, 1.04f)
                lineTo(6.48f, 9.9f)
                lineTo(1f, 11.27f)
                lineToRelative(1.7f, 1.02f)
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
                lineToRelative(-1.72f, 1.03f)
                lineToRelative(5.49f, 1.37f)
                lineToRelative(1.37f, -5.49f)
                lineTo(17.02f, 5.14f)
                close()
            }
        }.build()
        
        return _Recycling!!
    }

private var _Recycling: ImageVector? = null


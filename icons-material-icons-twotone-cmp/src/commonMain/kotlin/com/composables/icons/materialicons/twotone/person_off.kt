package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Person_off: ImageVector
    get() {
        if (_Person_off != null) return _Person_off!!
        
        _Person_off = ImageVector.Builder(
            name = "person_off",
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
                moveTo(15.17f, 18f)
                lineToRelative(-3f, -3f)
                curveToRelative(-0.06f, 0f, -0.11f, 0f, -0.17f, 0f)
                curveToRelative(-2.37f, 0f, -4.29f, 0.73f, -5.48f, 1.34f)
                curveTo(6.2f, 16.5f, 6f, 16.84f, 6f, 17.22f)
                verticalLineTo(18f)
                horizontalLineTo(15.17f)
                close()
                moveTo(10.13f, 7.3f)
                curveTo(10.41f, 6.54f, 11.14f, 6f, 12f, 6f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.86f, -0.54f, 1.59f, -1.3f, 1.87f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 17.17f)
                lineToRelative(-3.37f, -3.38f)
                curveToRelative(0.64f, 0.22f, 1.23f, 0.48f, 1.77f, 0.76f)
                curveTo(19.37f, 15.06f, 19.98f, 16.07f, 20f, 17.17f)
                close()
                moveTo(21.19f, 21.19f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(17.17f, 20f)
                horizontalLineTo(4f)
                verticalLineToRelative(-2.78f)
                curveToRelative(0f, -1.12f, 0.61f, -2.15f, 1.61f, -2.66f)
                curveToRelative(1.29f, -0.66f, 2.87f, -1.22f, 4.67f, -1.45f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(15.17f, 18f)
                lineToRelative(-3f, -3f)
                curveToRelative(-0.06f, 0f, -0.11f, 0f, -0.17f, 0f)
                curveToRelative(-2.37f, 0f, -4.29f, 0.73f, -5.48f, 1.34f)
                curveTo(6.2f, 16.5f, 6f, 16.84f, 6f, 17.22f)
                verticalLineTo(18f)
                horizontalLineTo(15.17f)
                close()
                moveTo(12f, 6f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.86f, -0.54f, 1.59f, -1.3f, 1.87f)
                lineToRelative(1.48f, 1.48f)
                curveTo(15.28f, 10.64f, 16f, 9.4f, 16f, 8f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-1.4f, 0f, -2.64f, 0.72f, -3.35f, 1.82f)
                lineToRelative(1.48f, 1.48f)
                curveTo(10.41f, 6.54f, 11.14f, 6f, 12f, 6f)
                close()
            }
        }.build()
        
        return _Person_off!!
    }

private var _Person_off: ImageVector? = null


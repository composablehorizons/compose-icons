package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Clean_hands: ImageVector
    get() {
        if (_Clean_hands != null) return _Clean_hands!!
        
        _Clean_hands = ImageVector.Builder(
            name = "clean_hands",
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
                moveTo(16.99f, 5f)
                lineToRelative(0.63f, 1.37f)
                lineTo(18.99f, 7f)
                lineToRelative(-1.37f, 0.63f)
                lineTo(16.99f, 9f)
                lineToRelative(-0.63f, -1.37f)
                lineTo(14.99f, 7f)
                lineToRelative(1.37f, -0.63f)
                lineTo(16.99f, 5f)
                moveTo(20f, 14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -1.1f, -2f, -4f, -2f, -4f)
                reflectiveCurveToRelative(-2f, 2.9f, -2f, 4f)
                curveTo(18f, 13.1f, 18.9f, 14f, 20f, 14f)
                close()
                moveTo(11f, 6.1f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                curveToRelative(0.57f, 0f, 1.1f, 0.17f, 1.55f, 0.45f)
                lineToRelative(1.43f, -1.43f)
                curveTo(15.15f, 2.39f, 14.13f, 2f, 13f, 2f)
                curveToRelative(-1.47f, 0f, -5.44f, 0f, -5.5f, 0f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                verticalLineToRelative(2.11f)
                curveTo(7.22f, 6.48f, 5.8f, 7.79f, 5.25f, 9.5f)
                horizontalLineToRelative(2.16f)
                curveTo(7.94f, 8.61f, 8.89f, 8f, 10f, 8f)
                curveToRelative(1.62f, 0f, 2.94f, 1.29f, 2.99f, 2.9f)
                lineTo(15f, 11.65f)
                verticalLineTo(11f)
                curveTo(15f, 8.58f, 13.28f, 6.56f, 11f, 6.1f)
                close()
                moveTo(22f, 19f)
                verticalLineToRelative(1f)
                lineToRelative(-8f, 2.5f)
                lineToRelative(-7f, -1.94f)
                verticalLineTo(22f)
                horizontalLineTo(1f)
                verticalLineTo(11f)
                horizontalLineToRelative(7.97f)
                lineToRelative(6.16f, 2.3f)
                curveTo(16.25f, 13.72f, 17f, 14.8f, 17f, 16f)
                horizontalLineToRelative(2f)
                curveTo(20.66f, 16f, 22f, 17.34f, 22f, 19f)
                close()
                moveTo(5f, 20f)
                verticalLineToRelative(-7f)
                horizontalLineTo(3f)
                verticalLineToRelative(7f)
                horizontalLineTo(5f)
                close()
                moveTo(19.9f, 18.57f)
                curveToRelative(-0.16f, -0.33f, -0.51f, -0.56f, -0.9f, -0.56f)
                horizontalLineToRelative(-5.35f)
                curveToRelative(-0.54f, 0f, -1.07f, -0.09f, -1.58f, -0.26f)
                lineToRelative(-2.38f, -0.79f)
                lineToRelative(0.63f, -1.9f)
                lineToRelative(2.38f, 0.79f)
                curveTo(13.01f, 15.95f, 15f, 16f, 15f, 16f)
                curveToRelative(0f, -0.37f, -0.23f, -0.7f, -0.57f, -0.83f)
                lineTo(8.61f, 13f)
                horizontalLineTo(7f)
                verticalLineToRelative(5.48f)
                lineToRelative(6.97f, 1.93f)
                lineTo(19.9f, 18.57f)
                close()
            }
        }.build()
        
        return _Clean_hands!!
    }

private var _Clean_hands: ImageVector? = null


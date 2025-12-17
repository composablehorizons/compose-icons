package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Battery_unknown: ImageVector
    get() {
        if (_Battery_unknown != null) return _Battery_unknown!!
        
        _Battery_unknown = ImageVector.Builder(
            name = "battery_unknown",
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
                moveTo(15.67f, 4f)
                horizontalLineTo(14f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineTo(8.33f)
                curveTo(7.6f, 4f, 7f, 4.6f, 7f, 5.33f)
                verticalLineToRelative(15.33f)
                curveTo(7f, 21.4f, 7.6f, 22f, 8.34f, 22f)
                horizontalLineToRelative(7.32f)
                curveToRelative(0.74f, 0f, 1.34f, -0.6f, 1.34f, -1.33f)
                verticalLineTo(5.33f)
                curveTo(17f, 4.6f, 16.4f, 4f, 15.67f, 4f)
                close()
                moveTo(13f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(1.3f, -5.31f)
                reflectiveCurveToRelative(-0.38f, 0.42f, -0.67f, 0.71f)
                curveToRelative(-0.14f, 0.14f, -0.27f, 0.31f, -0.39f, 0.47f)
                lineToRelative(-0.09f, 0.15f)
                curveToRelative(-0.08f, 0.12f, -0.14f, 0.25f, -0.19f, 0.37f)
                curveToRelative(-0.09f, 0.22f, -0.16f, 0.43f, -0.16f, 0.61f)
                horizontalLineToRelative(-1.6f)
                curveToRelative(0f, -0.42f, 0.12f, -0.8f, 0.29f, -1.13f)
                curveToRelative(0.06f, -0.11f, 0.13f, -0.21f, 0.2f, -0.31f)
                curveToRelative(0.03f, -0.05f, 0.06f, -0.11f, 0.1f, -0.16f)
                curveToRelative(0.11f, -0.14f, 0.23f, -0.28f, 0.34f, -0.4f)
                lineToRelative(0.93f, -0.94f)
                curveToRelative(0.27f, -0.27f, 0.44f, -0.65f, 0.44f, -1.06f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-0.65f, 0f, -1.21f, 0.41f, -1.41f, 0.99f)
                curveToRelative(-0.11f, 0.31f, -0.39f, 0.51f, -0.71f, 0.51f)
                curveToRelative(-0.52f, 0f, -0.88f, -0.52f, -0.71f, -1.01f)
                curveTo(9.59f, 8.83f, 10.69f, 8f, 12f, 8f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                curveToRelative(0f, 0.66f, -0.27f, 1.26f, -0.7f, 1.69f)
                close()
            }
        }.build()
        
        return _Battery_unknown!!
    }

private var _Battery_unknown: ImageVector? = null


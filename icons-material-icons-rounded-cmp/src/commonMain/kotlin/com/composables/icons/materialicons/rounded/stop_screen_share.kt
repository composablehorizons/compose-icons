package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Stop_screen_share: ImageVector
    get() {
        if (_Stop_screen_share != null) return _Stop_screen_share!!
        
        _Stop_screen_share = ImageVector.Builder(
            name = "stop_screen_share",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(23f, 18f)
                horizontalLineToRelative(-1.2f)
                lineToRelative(1.79f, 1.79f)
                curveToRelative(0.24f, -0.18f, 0.41f, -0.46f, 0.41f, -0.79f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(3.23f, 2.28f)
                curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(0.84f, 0.86f)
                reflectiveCurveToRelative(-0.66f, 0.57f, -0.66f, 1.47f)
                curveTo(2f, 6.92f, 2f, 16f, 2f, 16f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(0f, 1.09f, 0.88f, 1.98f, 1.97f, 1.99f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(17.13f)
                lineToRelative(2f, 2f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, -1.02f, 0f, -1.41f)
                lineTo(3.23f, 2.28f)
                close()
                moveTo(7f, 15f)
                curveToRelative(0.31f, -1.48f, 0.94f, -2.93f, 2.08f, -4.05f)
                lineToRelative(1.59f, 1.59f)
                curveTo(9.13f, 12.92f, 7.96f, 13.71f, 7f, 15f)
                close()
                moveToRelative(6f, -5.87f)
                verticalLineToRelative(-0.98f)
                curveToRelative(0f, -0.44f, 0.52f, -0.66f, 0.84f, -0.37f)
                lineTo(15f, 8.87f)
                lineToRelative(1.61f, 1.5f)
                curveToRelative(0.21f, 0.2f, 0.21f, 0.53f, 0f, 0.73f)
                lineToRelative(-0.89f, 0.83f)
                lineToRelative(5.58f, 5.58f)
                curveToRelative(0.43f, -0.37f, 0.7f, -0.9f, 0.7f, -1.51f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.09f, -0.89f, -1.98f, -1.98f, -1.98f)
                horizontalLineTo(7.8f)
                lineToRelative(5.14f, 5.13f)
                curveToRelative(0.02f, -0.01f, 0.04f, -0.02f, 0.06f, -0.02f)
                close()
            }
        }.build()
        
        return _Stop_screen_share!!
    }

private var _Stop_screen_share: ImageVector? = null


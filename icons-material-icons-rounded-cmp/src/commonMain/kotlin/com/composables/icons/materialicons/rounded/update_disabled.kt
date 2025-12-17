package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Update_disabled: ImageVector
    get() {
        if (_Update_disabled != null) return _Update_disabled!!
        
        _Update_disabled = ImageVector.Builder(
            name = "update_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.49f, 20.49f)
                lineTo(3.51f, 3.51f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(0f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(2.31f, 2.31f)
                curveTo(3.57f, 8.56f, 3.05f, 10.09f, 3f, 11.74f)
                curveTo(2.86f, 16.83f, 6.94f, 21f, 12f, 21f)
                curveToRelative(1.76f, 0f, 3.39f, -0.52f, 4.78f, -1.39f)
                lineToRelative(2.29f, 2.29f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(0f, 0f)
                curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f)
                close()
                moveTo(10.72f, 18.89f)
                curveToRelative(-2.78f, -0.49f, -5.04f, -2.71f, -5.58f, -5.47f)
                curveToRelative(-0.34f, -1.72f, -0.03f, -3.36f, 0.72f, -4.73f)
                lineToRelative(9.46f, 9.46f)
                curveTo(13.98f, 18.87f, 12.4f, 19.18f, 10.72f, 18.89f)
                close()
                moveTo(13f, 8f)
                verticalLineToRelative(2.17f)
                lineToRelative(-2f, -2f)
                verticalLineTo(8f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveTo(13f, 7.45f, 13f, 8f)
                close()
                moveTo(20.72f, 14.23f)
                curveToRelative(-0.23f, 0.92f, -0.61f, 1.77f, -1.1f, 2.55f)
                lineToRelative(-1.47f, -1.47f)
                curveToRelative(0.27f, -0.5f, 0.49f, -1.03f, 0.63f, -1.59f)
                curveTo(18.89f, 13.3f, 19.29f, 13f, 19.73f, 13f)
                horizontalLineToRelative(0f)
                curveTo(20.38f, 13f, 20.88f, 13.61f, 20.72f, 14.23f)
                close()
                moveTo(7.24f, 4.41f)
                curveToRelative(1.46f, -0.93f, 3.18f, -1.45f, 5f, -1.41f)
                curveToRelative(2.65f, 0.07f, 5f, 1.28f, 6.6f, 3.16f)
                lineToRelative(1.31f, -1.31f)
                curveTo(20.46f, 4.54f, 21f, 4.76f, 21f, 5.21f)
                verticalLineTo(9.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-4.29f)
                curveToRelative(-0.45f, 0f, -0.67f, -0.54f, -0.35f, -0.85f)
                lineToRelative(1.55f, -1.55f)
                curveTo(16.12f, 6.02f, 14.18f, 5f, 12f, 5f)
                curveToRelative(-1.2f, 0f, -2.33f, 0.31f, -3.32f, 0.85f)
                lineTo(7.24f, 4.41f)
                close()
            }
        }.build()
        
        return _Update_disabled!!
    }

private var _Update_disabled: ImageVector? = null


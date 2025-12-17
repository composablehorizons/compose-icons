package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Update_disabled: ImageVector
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
                moveTo(8.67f, 5.84f)
                lineTo(7.22f, 4.39f)
                curveTo(8.6f, 3.51f, 10.24f, 3f, 12f, 3f)
                curveToRelative(2.74f, 0f, 5.19f, 1.23f, 6.84f, 3.16f)
                lineTo(21f, 4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                lineToRelative(2.41f, -2.41f)
                curveTo(16.12f, 6.02f, 14.18f, 5f, 12f, 5f)
                curveTo(10.8f, 5f, 9.66f, 5.31f, 8.67f, 5.84f)
                close()
                moveTo(13f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.17f)
                lineToRelative(2f, 2f)
                verticalLineTo(7f)
                close()
                moveTo(19.78f, 22.61f)
                lineToRelative(-3f, -3f)
                curveTo(15.39f, 20.48f, 13.76f, 21f, 12f, 21f)
                curveToRelative(-4.97f, 0f, -9f, -4.03f, -9f, -9f)
                curveToRelative(0f, -1.76f, 0.51f, -3.4f, 1.39f, -4.78f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineTo(19.78f, 22.61f)
                close()
                moveTo(15.32f, 18.15f)
                lineTo(5.84f, 8.67f)
                curveTo(5.31f, 9.66f, 5f, 10.8f, 5f, 12f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                curveTo(13.2f, 19f, 14.34f, 18.69f, 15.32f, 18.15f)
                close()
                moveTo(20.94f, 13f)
                horizontalLineToRelative(-2.02f)
                curveToRelative(-0.12f, 0.83f, -0.39f, 1.61f, -0.77f, 2.32f)
                lineToRelative(1.47f, 1.47f)
                curveTo(20.32f, 15.67f, 20.79f, 14.38f, 20.94f, 13f)
                close()
            }
        }.build()
        
        return _Update_disabled!!
    }

private var _Update_disabled: ImageVector? = null


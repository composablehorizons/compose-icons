package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Update_disabled: ImageVector
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
                moveTo(20.94f, 13f)
                curveToRelative(-0.15f, 1.38f, -0.62f, 2.67f, -1.33f, 3.79f)
                lineToRelative(-1.47f, -1.47f)
                curveToRelative(0.38f, -0.71f, 0.65f, -1.49f, 0.77f, -2.32f)
                horizontalLineTo(20.94f)
                close()
                moveTo(8.67f, 5.84f)
                curveTo(9.66f, 5.31f, 10.8f, 5f, 12f, 5f)
                curveToRelative(2.37f, 0f, 4.47f, 1.19f, 5.74f, 3f)
                horizontalLineTo(15f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineTo(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.36f)
                curveTo(17.35f, 4.32f, 14.83f, 3f, 12f, 3f)
                curveToRelative(-1.76f, 0f, -3.4f, 0.51f, -4.78f, 1.39f)
                lineTo(8.67f, 5.84f)
                close()
                moveTo(11f, 7f)
                verticalLineToRelative(1.17f)
                lineToRelative(2f, 2f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
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
            }
        }.build()
        
        return _Update_disabled!!
    }

private var _Update_disabled: ImageVector? = null


package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Screen_rotation: ImageVector
    get() {
        if (_Screen_rotation != null) return _Screen_rotation!!
        
        _Screen_rotation = ImageVector.Builder(
            name = "screen_rotation",
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
                moveTo(14.828f, 21.192f)
                lineTo(2.808f, 9.172f)
                lineToRelative(6.357f, -6.357f)
                lineToRelative(12.02f, 12.02f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.48f, 2.52f)
                curveToRelative(3.27f, 1.55f, 5.61f, 4.72f, 5.97f, 8.48f)
                horizontalLineToRelative(1.5f)
                curveTo(23.44f, 4.84f, 18.29f, 0f, 12f, 0f)
                lineToRelative(-0.66f, 0.03f)
                lineToRelative(3.81f, 3.81f)
                lineToRelative(1.33f, -1.32f)
                close()
                moveToRelative(-6.25f, -0.77f)
                curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0f)
                lineTo(1.75f, 8.11f)
                curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0f, 2.12f)
                lineToRelative(12.02f, 12.02f)
                curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0f)
                lineToRelative(6.36f, -6.36f)
                curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0f, -2.12f)
                lineTo(10.23f, 1.75f)
                close()
                moveToRelative(4.6f, 19.44f)
                lineTo(2.81f, 9.17f)
                lineToRelative(6.36f, -6.36f)
                lineToRelative(12.02f, 12.02f)
                lineToRelative(-6.36f, 6.36f)
                close()
                moveToRelative(-7.31f, 0.29f)
                curveTo(4.25f, 19.94f, 1.91f, 16.76f, 1.55f, 13f)
                horizontalLineTo(0.05f)
                curveTo(0.56f, 19.16f, 5.71f, 24f, 12f, 24f)
                lineToRelative(0.66f, -0.03f)
                lineToRelative(-3.81f, -3.81f)
                lineToRelative(-1.33f, 1.32f)
                close()
            }
        }.build()
        
        return _Screen_rotation!!
    }

private var _Screen_rotation: ImageVector? = null


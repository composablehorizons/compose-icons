package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Rice_bowl: ImageVector
    get() {
        if (_Rice_bowl != null) return _Rice_bowl!!
        
        _Rice_bowl = ImageVector.Builder(
            name = "rice_bowl",
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
                moveTo(22f, 12f)
                lineTo(22f, 12f)
                curveToRelative(0f, -5.48f, -4.4f, -9.93f, -9.86f, -10f)
                curveTo(8.52f, 1.95f, 5.29f, 4.03f, 3.43f, 7.14f)
                curveTo(0.1f, 12.69f, 2.98f, 18.27f, 8f, 20.25f)
                verticalLineToRelative(0.25f)
                curveTo(8f, 21.33f, 8.67f, 22f, 9.5f, 22f)
                horizontalLineToRelative(5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.25f)
                curveTo(19.53f, 18.86f, 22f, 15.69f, 22f, 12f)
                close()
                moveTo(20f, 12f)
                horizontalLineToRelative(-4f)
                verticalLineTo(5.08f)
                curveTo(18.39f, 6.47f, 20f, 9.05f, 20f, 12f)
                close()
                moveTo(14f, 4.26f)
                verticalLineTo(12f)
                horizontalLineToRelative(-4f)
                verticalLineTo(4.26f)
                curveTo(10.64f, 4.1f, 11.31f, 4f, 12f, 4f)
                reflectiveCurveTo(13.36f, 4.1f, 14f, 4.26f)
                close()
                moveTo(4f, 12f)
                curveToRelative(0f, -2.95f, 1.61f, -5.53f, 4f, -6.92f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                close()
            }
        }.build()
        
        return _Rice_bowl!!
    }

private var _Rice_bowl: ImageVector? = null


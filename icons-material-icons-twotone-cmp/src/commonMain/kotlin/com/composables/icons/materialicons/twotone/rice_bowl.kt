package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Rice_bowl: ImageVector
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
                moveTo(19.66f, 14f)
                curveToRelative(-0.66f, 1.92f, -2.24f, 3.54f, -4.4f, 4.39f)
                lineTo(14f, 18.88f)
                verticalLineTo(20f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1.12f)
                lineToRelative(-1.27f, -0.5f)
                curveToRelative(-2.16f, -0.85f, -3.74f, -2.47f, -4.4f, -4.39f)
                horizontalLineTo(19.66f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.66f, 14f)
                curveToRelative(-0.66f, 1.92f, -2.24f, 3.54f, -4.4f, 4.39f)
                lineTo(14f, 18.88f)
                verticalLineTo(20f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1.12f)
                lineToRelative(-1.27f, -0.5f)
                curveToRelative(-2.16f, -0.85f, -3.74f, -2.47f, -4.4f, -4.39f)
                horizontalLineTo(19.66f)
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveToRelative(0f, 3.69f, 2.47f, 6.86f, 6f, 8.25f)
                verticalLineTo(22f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1.75f)
                curveToRelative(3.53f, -1.39f, 6f, -4.56f, 6f, -8.25f)
                horizontalLineToRelative(0f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                lineTo(12f, 2f)
                close()
                moveTo(10f, 12f)
                verticalLineTo(4.26f)
                curveTo(10.64f, 4.1f, 11.31f, 4f, 12f, 4f)
                reflectiveCurveToRelative(1.36f, 0.1f, 2f, 0.26f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                lineTo(10f, 12f)
                close()
                moveTo(16f, 12f)
                verticalLineTo(5.08f)
                curveToRelative(2.39f, 1.39f, 4f, 3.96f, 4f, 6.92f)
                horizontalLineTo(16f)
                lineTo(16f, 12f)
                close()
                moveTo(4f, 12f)
                curveToRelative(0f, -2.95f, 1.61f, -5.53f, 4f, -6.92f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                lineTo(4f, 12f)
                close()
            }
        }.build()
        
        return _Rice_bowl!!
    }

private var _Rice_bowl: ImageVector? = null


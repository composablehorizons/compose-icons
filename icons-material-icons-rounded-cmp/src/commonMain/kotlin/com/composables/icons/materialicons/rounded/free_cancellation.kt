package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Free_cancellation: ImageVector
    get() {
        if (_Free_cancellation != null) return _Free_cancellation!!
        
        _Free_cancellation = ImageVector.Builder(
            name = "free_cancellation",
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
                moveTo(10.79f, 20f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2.96f)
                curveToRelative(0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f)
                lineToRelative(0f, 0f)
                curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-1f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveTo(6.45f, 2f, 6f, 2.45f, 6f, 3f)
                verticalLineToRelative(1f)
                horizontalLineTo(5f)
                curveTo(3.89f, 4f, 3.01f, 4.9f, 3.01f, 6f)
                lineTo(3f, 20f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(5.79f)
                curveToRelative(0.89f, 0f, 1.34f, -1.08f, 0.71f, -1.71f)
                lineToRelative(0f, 0f)
                curveTo(11.31f, 20.11f, 11.06f, 20f, 10.79f, 20f)
                close()
                moveTo(13.71f, 18.26f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.54f, -3.54f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-4.24f, 4.24f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-2.12f, -2.12f)
                curveTo(13.32f, 19.28f, 13.32f, 18.65f, 13.71f, 18.26f)
                close()
                moveTo(11.29f, 16.29f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineTo(9f, 15.41f)
                lineToRelative(-0.88f, 0.88f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                lineTo(7.59f, 14f)
                lineToRelative(-0.88f, -0.88f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineTo(9f, 12.59f)
                lineToRelative(0.88f, -0.88f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineTo(10.41f, 14f)
                lineToRelative(0.88f, 0.88f)
                curveTo(11.68f, 15.27f, 11.68f, 15.9f, 11.29f, 16.29f)
                close()
            }
        }.build()
        
        return _Free_cancellation!!
    }

private var _Free_cancellation: ImageVector? = null


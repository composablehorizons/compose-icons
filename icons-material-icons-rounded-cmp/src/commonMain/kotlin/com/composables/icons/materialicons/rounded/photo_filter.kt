package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Photo_filter: ImageVector
    get() {
        if (_Photo_filter != null) return _Photo_filter!!
        
        _Photo_filter = ImageVector.Builder(
            name = "photo_filter",
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
                moveTo(19.02f, 10.99f)
                verticalLineTo(18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(5.02f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineTo(19f)
                curveToRelative(1.1f, 0f, 2f, -0.89f, 2f, -2f)
                verticalLineToRelative(-8.01f)
                curveToRelative(0f, -0.55f, -0.44f, -0.99f, -0.99f, -0.99f)
                reflectiveCurveToRelative(-0.99f, 0.44f, -0.99f, 0.99f)
                close()
                moveToRelative(-5.77f, -0.24f)
                lineTo(12.46f, 9f)
                curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0f)
                lineToRelative(-0.79f, 1.75f)
                lineToRelative(-1.76f, 0.79f)
                curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0f, 0.91f)
                lineToRelative(1.75f, 0.79f)
                lineToRelative(0.79f, 1.76f)
                curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0f)
                lineToRelative(0.79f, -1.75f)
                lineToRelative(1.76f, -0.79f)
                curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0f, -0.91f)
                lineToRelative(-1.75f, -0.8f)
                close()
                moveToRelative(4.69f, -4.69f)
                lineToRelative(-0.6f, -1.32f)
                curveToRelative(-0.13f, -0.29f, -0.55f, -0.29f, -0.69f, 0f)
                lineToRelative(-0.6f, 1.32f)
                lineToRelative(-1.32f, 0.6f)
                curveToRelative(-0.29f, 0.13f, -0.29f, 0.55f, 0f, 0.69f)
                lineToRelative(1.32f, 0.6f)
                lineToRelative(0.6f, 1.32f)
                curveToRelative(0.13f, 0.29f, 0.55f, 0.29f, 0.69f, 0f)
                lineToRelative(0.6f, -1.32f)
                lineToRelative(1.32f, -0.6f)
                curveToRelative(0.29f, -0.13f, 0.29f, -0.55f, 0f, -0.69f)
                lineToRelative(-1.32f, -0.6f)
                close()
            }
        }.build()
        
        return _Photo_filter!!
    }

private var _Photo_filter: ImageVector? = null


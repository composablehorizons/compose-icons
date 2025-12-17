package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Draw: ImageVector
    get() {
        if (_Draw != null) return _Draw!!
        
        _Draw = ImageVector.Builder(
            name = "draw",
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
                moveTo(18.85f, 10.39f)
                lineToRelative(1.06f, -1.06f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0f, -2.83f)
                lineTo(18.5f, 5.09f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
                lineToRelative(-1.06f, 1.06f)
                lineTo(18.85f, 10.39f)
                close()
                moveTo(14.61f, 11.81f)
                lineTo(7.41f, 19f)
                horizontalLineTo(6f)
                verticalLineToRelative(-1.41f)
                lineToRelative(7.19f, -7.19f)
                lineTo(14.61f, 11.81f)
                close()
                moveTo(13.19f, 7.56f)
                lineTo(4f, 16.76f)
                verticalLineTo(21f)
                horizontalLineToRelative(4.24f)
                lineToRelative(9.19f, -9.19f)
                lineTo(13.19f, 7.56f)
                lineTo(13.19f, 7.56f)
                close()
                moveTo(19f, 17.5f)
                curveToRelative(0f, 2.19f, -2.54f, 3.5f, -5f, 3.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(1.54f, 0f, 3f, -0.73f, 3f, -1.5f)
                curveToRelative(0f, -0.47f, -0.48f, -0.87f, -1.23f, -1.2f)
                lineToRelative(1.48f, -1.48f)
                curveTo(18.32f, 15.45f, 19f, 16.29f, 19f, 17.5f)
                close()
                moveTo(4.58f, 13.35f)
                curveTo(3.61f, 12.79f, 3f, 12.06f, 3f, 11f)
                curveToRelative(0f, -1.8f, 1.89f, -2.63f, 3.56f, -3.36f)
                curveTo(7.59f, 7.18f, 9f, 6.56f, 9f, 6f)
                curveToRelative(0f, -0.41f, -0.78f, -1f, -2f, -1f)
                curveTo(5.74f, 5f, 5.2f, 5.61f, 5.17f, 5.64f)
                curveTo(4.82f, 6.05f, 4.19f, 6.1f, 3.77f, 5.76f)
                curveTo(3.36f, 5.42f, 3.28f, 4.81f, 3.62f, 4.38f)
                curveTo(3.73f, 4.24f, 4.76f, 3f, 7f, 3f)
                curveToRelative(2.24f, 0f, 4f, 1.32f, 4f, 3f)
                curveToRelative(0f, 1.87f, -1.93f, 2.72f, -3.64f, 3.47f)
                curveTo(6.42f, 9.88f, 5f, 10.5f, 5f, 11f)
                curveToRelative(0f, 0.31f, 0.43f, 0.6f, 1.07f, 0.86f)
                lineTo(4.58f, 13.35f)
                close()
            }
        }.build()
        
        return _Draw!!
    }

private var _Draw: ImageVector? = null


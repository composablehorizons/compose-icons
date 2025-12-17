package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Back_hand: ImageVector
    get() {
        if (_Back_hand != null) return _Back_hand!!
        
        _Back_hand = ImageVector.Builder(
            name = "back_hand",
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
                moveTo(21f, 7f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.17f, 0f, -0.34f, 0.02f, -0.5f, 0.05f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.23f, 0f, -0.46f, 0.03f, -0.67f, 0.09f)
                curveTo(14.46f, 0.66f, 13.56f, 0f, 12.5f, 0f)
                curveToRelative(-1.23f, 0f, -2.25f, 0.89f, -2.46f, 2.06f)
                curveTo(9.87f, 2.02f, 9.69f, 2f, 9.5f, 2f)
                curveTo(8.12f, 2f, 7f, 3.12f, 7f, 4.5f)
                verticalLineToRelative(5.89f)
                curveToRelative(-0.34f, -0.31f, -0.76f, -0.54f, -1.22f, -0.66f)
                lineTo(5.01f, 9.52f)
                curveToRelative(-0.83f, -0.23f, -1.7f, 0.09f, -2.19f, 0.83f)
                curveToRelative(-0.38f, 0.57f, -0.4f, 1.31f, -0.15f, 1.95f)
                lineToRelative(2.56f, 6.43f)
                curveTo(6.49f, 21.91f, 9.57f, 24f, 13f, 24f)
                horizontalLineToRelative(0f)
                curveToRelative(4.42f, 0f, 8f, -3.58f, 8f, -8f)
                verticalLineTo(7f)
                close()
                moveTo(19f, 16f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                horizontalLineToRelative(0f)
                curveToRelative(-2.61f, 0f, -4.95f, -1.59f, -5.91f, -4.01f)
                lineToRelative(-2.6f, -6.54f)
                lineToRelative(0.53f, 0.14f)
                curveToRelative(0.46f, 0.12f, 0.83f, 0.46f, 1f, 0.9f)
                lineTo(7f, 15f)
                horizontalLineToRelative(2f)
                verticalLineTo(4.5f)
                curveTo(9f, 4.22f, 9.22f, 4f, 9.5f, 4f)
                reflectiveCurveTo(10f, 4.22f, 10f, 4.5f)
                verticalLineTo(12f)
                horizontalLineToRelative(2f)
                verticalLineTo(2.5f)
                curveTo(12f, 2.22f, 12.22f, 2f, 12.5f, 2f)
                reflectiveCurveTo(13f, 2.22f, 13f, 2.5f)
                verticalLineTo(12f)
                horizontalLineToRelative(2f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveTo(16f, 3.72f, 16f, 4f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveTo(19f, 6.72f, 19f, 7f)
                lineTo(19f, 16f)
                close()
            }
        }.build()
        
        return _Back_hand!!
    }

private var _Back_hand: ImageVector? = null


package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Loyalty: ImageVector
    get() {
        if (_Loyalty != null) return _Loyalty!!
        
        _Loyalty = ImageVector.Builder(
            name = "loyalty",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21.41f, 11.58f)
                lineToRelative(-9f, -9f)
                curveTo(12.05f, 2.22f, 11.55f, 2f, 11f, 2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.55f, 0.22f, 1.05f, 0.59f, 1.42f)
                lineToRelative(9f, 9f)
                curveToRelative(0.36f, 0.36f, 0.86f, 0.58f, 1.41f, 0.58f)
                curveToRelative(0.55f, 0f, 1.05f, -0.22f, 1.41f, -0.59f)
                lineToRelative(7f, -7f)
                curveToRelative(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f)
                curveToRelative(0f, -0.55f, -0.23f, -1.06f, -0.59f, -1.42f)
                close()
                moveTo(5.5f, 7f)
                curveTo(4.67f, 7f, 4f, 6.33f, 4f, 5.5f)
                reflectiveCurveTo(4.67f, 4f, 5.5f, 4f)
                reflectiveCurveTo(7f, 4.67f, 7f, 5.5f)
                reflectiveCurveTo(6.33f, 7f, 5.5f, 7f)
                close()
                moveToRelative(11.77f, 8.27f)
                lineTo(13f, 19.54f)
                lineToRelative(-4.27f, -4.27f)
                curveTo(8.28f, 14.81f, 8f, 14.19f, 8f, 13.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.69f, 0f, 1.32f, 0.28f, 1.77f, 0.74f)
                lineToRelative(0.73f, 0.72f)
                lineToRelative(0.73f, -0.73f)
                curveToRelative(0.45f, -0.45f, 1.08f, -0.73f, 1.77f, -0.73f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 0.69f, -0.28f, 1.32f, -0.73f, 1.77f)
                close()
            }
        }.build()
        
        return _Loyalty!!
    }

private var _Loyalty: ImageVector? = null


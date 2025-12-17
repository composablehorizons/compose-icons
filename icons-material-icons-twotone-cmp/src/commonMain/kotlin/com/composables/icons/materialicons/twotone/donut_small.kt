package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Donut_small: ImageVector
    get() {
        if (_Donut_small != null) return _Donut_small!!
        
        _Donut_small = ImageVector.Builder(
            name = "donut_small",
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
                moveTo(15.99f, 9f)
                horizontalLineToRelative(3.43f)
                curveTo(18.6f, 7f, 17f, 5.4f, 15f, 4.58f)
                verticalLineToRelative(3.43f)
                curveToRelative(0.37f, 0.28f, 0.71f, 0.62f, 0.99f, 0.99f)
                close()
                moveTo(4f, 12f)
                curveToRelative(0f, 3.35f, 2.04f, 6.24f, 5f, 7.42f)
                verticalLineToRelative(-3.44f)
                curveToRelative(-1.23f, -0.93f, -2f, -2.4f, -2f, -3.99f)
                curveTo(7f, 10.4f, 7.77f, 8.93f, 9f, 8f)
                verticalLineTo(4.58f)
                curveTo(6.04f, 5.76f, 4f, 8.65f, 4f, 12f)
                close()
                moveToRelative(11f, 3.99f)
                verticalLineToRelative(3.43f)
                curveToRelative(2f, -0.82f, 3.6f, -2.42f, 4.42f, -4.42f)
                horizontalLineToRelative(-3.43f)
                curveToRelative(-0.28f, 0.37f, -0.62f, 0.71f, -0.99f, 0.99f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.82f, 11f)
                horizontalLineToRelative(7.13f)
                curveToRelative(-0.47f, -4.72f, -4.23f, -8.48f, -8.95f, -8.95f)
                verticalLineToRelative(7.13f)
                curveToRelative(0.85f, 0.31f, 1.51f, 0.97f, 1.82f, 1.82f)
                close()
                moveTo(15f, 4.58f)
                curveTo(17f, 5.4f, 18.6f, 7f, 19.42f, 9f)
                horizontalLineToRelative(-3.43f)
                curveToRelative(-0.28f, -0.37f, -0.62f, -0.71f, -0.99f, -0.99f)
                verticalLineTo(4.58f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, 5.19f, 3.95f, 9.45f, 9f, 9.95f)
                verticalLineToRelative(-7.13f)
                curveTo(9.84f, 14.4f, 9f, 13.3f, 9f, 12f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                verticalLineTo(2.05f)
                curveToRelative(-5.05f, 0.5f, -9f, 4.76f, -9f, 9.95f)
                close()
                moveToRelative(7f, -7.42f)
                verticalLineToRelative(3.44f)
                curveToRelative(-1.23f, 0.92f, -2f, 2.39f, -2f, 3.98f)
                curveToRelative(0f, 1.59f, 0.77f, 3.06f, 2f, 3.99f)
                verticalLineToRelative(3.44f)
                curveTo(6.04f, 18.24f, 4f, 15.35f, 4f, 12f)
                curveToRelative(0f, -3.35f, 2.04f, -6.24f, 5f, -7.42f)
                close()
                moveToRelative(4f, 10.24f)
                verticalLineToRelative(7.13f)
                curveToRelative(4.72f, -0.47f, 8.48f, -4.23f, 8.95f, -8.95f)
                horizontalLineToRelative(-7.13f)
                curveToRelative(-0.31f, 0.85f, -0.97f, 1.51f, -1.82f, 1.82f)
                close()
                moveToRelative(2f, 1.17f)
                curveToRelative(0.37f, -0.28f, 0.71f, -0.61f, 0.99f, -0.99f)
                horizontalLineToRelative(3.43f)
                curveTo(18.6f, 17f, 17f, 18.6f, 15f, 19.42f)
                verticalLineToRelative(-3.43f)
                close()
            }
        }.build()
        
        return _Donut_small!!
    }

private var _Donut_small: ImageVector? = null


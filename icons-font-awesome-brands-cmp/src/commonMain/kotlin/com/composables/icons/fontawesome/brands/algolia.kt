package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Algolia: ImageVector
    get() {
        if (_Algolia != null) return _Algolia!!
        
        _Algolia = ImageVector.Builder(
            name = "algolia",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(229.3f, 182.6f)
                curveToRelative(-49.3f, 0f, -89.2f, 39.9f, -89.2f, 89.2f)
                curveToRelative(0f, 49.3f, 39.9f, 89.2f, 89.2f, 89.2f)
                reflectiveCurveToRelative(89.2f, -39.9f, 89.2f, -89.2f)
                curveToRelative(0f, -49.3f, -40f, -89.2f, -89.2f, -89.2f)
                close()
                moveToRelative(62.7f, 56.6f)
                lineToRelative(-58.9f, 30.6f)
                curveToRelative(-1.8f, 0.9f, -3.8f, -0.4f, -3.8f, -2.3f)
                verticalLineTo(201f)
                curveToRelative(0f, -1.5f, 1.3f, -2.7f, 2.7f, -2.6f)
                curveToRelative(26.2f, 1f, 48.9f, 15.7f, 61.1f, 37.1f)
                curveToRelative(0.7f, 1.3f, 0.2f, 3f, -1.1f, 3.7f)
                close()
                moveTo(389.1f, 32f)
                horizontalLineTo(58.9f)
                curveTo(26.4f, 32f, 0f, 58.4f, 0f, 90.9f)
                verticalLineTo(421f)
                curveToRelative(0f, 32.6f, 26.4f, 59f, 58.9f, 59f)
                horizontalLineTo(389f)
                curveToRelative(32.6f, 0f, 58.9f, -26.4f, 58.9f, -58.9f)
                verticalLineTo(90.9f)
                curveTo(448f, 58.4f, 421.6f, 32f, 389.1f, 32f)
                close()
                moveToRelative(-202.6f, 84.7f)
                curveToRelative(0f, -10.8f, 8.7f, -19.5f, 19.5f, -19.5f)
                horizontalLineToRelative(45.3f)
                curveToRelative(10.8f, 0f, 19.5f, 8.7f, 19.5f, 19.5f)
                verticalLineToRelative(15.4f)
                curveToRelative(0f, 1.8f, -1.7f, 3f, -3.3f, 2.5f)
                curveToRelative(-12.3f, -3.4f, -25.1f, -5.1f, -38.1f, -5.1f)
                curveToRelative(-13.5f, 0f, -26.7f, 1.8f, -39.4f, 5.5f)
                curveToRelative(-1.7f, 0.5f, -3.4f, -0.8f, -3.4f, -2.5f)
                verticalLineToRelative(-15.8f)
                close()
                moveToRelative(-84.4f, 37f)
                lineToRelative(9.2f, -9.2f)
                curveToRelative(7.6f, -7.6f, 19.9f, -7.6f, 27.5f, 0f)
                lineToRelative(7.7f, 7.7f)
                curveToRelative(1.1f, 1.1f, 1f, 3f, -0.3f, 4f)
                curveToRelative(-6.2f, 4.5f, -12.1f, 9.4f, -17.6f, 14.9f)
                curveToRelative(-5.4f, 5.4f, -10.4f, 11.3f, -14.8f, 17.4f)
                curveToRelative(-1f, 1.3f, -2.9f, 1.5f, -4f, 0.3f)
                lineToRelative(-7.7f, -7.7f)
                curveToRelative(-7.6f, -7.5f, -7.6f, -19.8f, 0f, -27.4f)
                close()
                moveToRelative(127.2f, 244.8f)
                curveToRelative(-70f, 0f, -126.6f, -56.7f, -126.6f, -126.6f)
                reflectiveCurveToRelative(56.7f, -126.6f, 126.6f, -126.6f)
                curveToRelative(70f, 0f, 126.6f, 56.6f, 126.6f, 126.6f)
                curveToRelative(0f, 69.8f, -56.7f, 126.6f, -126.6f, 126.6f)
                close()
            }
        }.build()
        
        return _Algolia!!
    }

private var _Algolia: ImageVector? = null


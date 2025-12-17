package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Pageview: ImageVector
    get() {
        if (_Pageview != null) return _Pageview!!
        
        _Pageview = ImageVector.Builder(
            name = "pageview",
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
                moveTo(4f, 18f)
                horizontalLineToRelative(16f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineToRelative(12f)
                close()
                moveToRelative(7.5f, -11f)
                curveToRelative(2.49f, 0f, 4.5f, 2.01f, 4.5f, 4.5f)
                curveToRelative(0f, 0.88f, -0.26f, 1.69f, -0.7f, 2.39f)
                lineToRelative(2.44f, 2.43f)
                lineToRelative(-1.42f, 1.42f)
                lineToRelative(-2.44f, -2.44f)
                curveToRelative(-0.69f, 0.44f, -1.51f, 0.7f, -2.39f, 0.7f)
                curveTo(9.01f, 16f, 7f, 13.99f, 7f, 11.5f)
                reflectiveCurveTo(9.01f, 7f, 11.5f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.49f, 16f)
                curveToRelative(0.88f, 0f, 1.7f, -0.26f, 2.39f, -0.7f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(-2.44f, -2.43f)
                curveToRelative(0.44f, -0.7f, 0.7f, -1.51f, 0.7f, -2.39f)
                curveTo(16f, 9.01f, 13.99f, 7f, 11.5f, 7f)
                reflectiveCurveTo(7f, 9.01f, 7f, 11.5f)
                reflectiveCurveTo(9.01f, 16f, 11.49f, 16f)
                close()
                moveToRelative(0.01f, -7f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveTo(12.88f, 14f, 11.5f, 14f)
                reflectiveCurveTo(9f, 12.88f, 9f, 11.5f)
                reflectiveCurveTo(10.12f, 9f, 11.5f, 9f)
                close()
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 14f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                close()
            }
        }.build()
        
        return _Pageview!!
    }

private var _Pageview: ImageVector? = null


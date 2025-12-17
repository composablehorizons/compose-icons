package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Contact_page: ImageVector
    get() {
        if (_Contact_page != null) return _Contact_page!!
        
        _Contact_page = ImageVector.Builder(
            name = "contact_page",
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
                moveTo(13.17f, 2f)
                horizontalLineTo(6f)
                curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(8.83f)
                curveToRelative(0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f)
                lineToRelative(-4.83f, -4.83f)
                curveTo(14.21f, 2.21f, 13.7f, 2f, 13.17f, 2f)
                close()
                moveTo(12f, 10f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                curveTo(10f, 10.9f, 10.9f, 10f, 12f, 10f)
                close()
                moveTo(16f, 18f)
                horizontalLineTo(8f)
                verticalLineToRelative(-0.57f)
                curveToRelative(0f, -0.81f, 0.48f, -1.53f, 1.22f, -1.85f)
                curveTo(10.07f, 15.21f, 11.01f, 15f, 12f, 15f)
                curveToRelative(0.99f, 0f, 1.93f, 0.21f, 2.78f, 0.58f)
                curveTo(15.52f, 15.9f, 16f, 16.62f, 16f, 17.43f)
                verticalLineTo(18f)
                close()
            }
        }.build()
        
        return _Contact_page!!
    }

private var _Contact_page: ImageVector? = null


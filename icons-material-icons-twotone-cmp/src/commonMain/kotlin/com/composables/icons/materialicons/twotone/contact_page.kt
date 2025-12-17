package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Contact_page: ImageVector
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
                moveTo(13.17f, 4f)
                lineTo(18f, 8.83f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13.17f)
                moveTo(12f, 14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveTo(10f, 13.1f, 10.9f, 14f, 12f, 14f)
                close()
                moveTo(16f, 17.43f)
                curveToRelative(0f, -0.81f, -0.48f, -1.53f, -1.22f, -1.85f)
                curveTo(13.93f, 15.21f, 12.99f, 15f, 12f, 15f)
                curveToRelative(-0.99f, 0f, -1.93f, 0.21f, -2.78f, 0.58f)
                curveTo(8.48f, 15.9f, 8f, 16.62f, 8f, 17.43f)
                verticalLineTo(18f)
                horizontalLineToRelative(8f)
                verticalLineTo(17.43f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.17f, 4f)
                lineTo(18f, 8.83f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13.17f)
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                lineTo(14f, 2f)
                close()
                moveTo(12f, 14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveTo(10f, 13.1f, 10.9f, 14f, 12f, 14f)
                close()
                moveTo(16f, 17.43f)
                curveToRelative(0f, -0.81f, -0.48f, -1.53f, -1.22f, -1.85f)
                curveTo(13.93f, 15.21f, 12.99f, 15f, 12f, 15f)
                curveToRelative(-0.99f, 0f, -1.93f, 0.21f, -2.78f, 0.58f)
                curveTo(8.48f, 15.9f, 8f, 16.62f, 8f, 17.43f)
                verticalLineTo(18f)
                horizontalLineToRelative(8f)
                verticalLineTo(17.43f)
                close()
            }
        }.build()
        
        return _Contact_page!!
    }

private var _Contact_page: ImageVector? = null


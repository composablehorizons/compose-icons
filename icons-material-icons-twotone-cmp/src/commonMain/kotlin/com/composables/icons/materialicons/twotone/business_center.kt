package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Business_center: ImageVector
    get() {
        if (_Business_center != null) return _Business_center!!
        
        _Business_center = ImageVector.Builder(
            name = "business_center",
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
                moveTo(15f, 17f)
                horizontalLineTo(9f)
                verticalLineToRelative(-1f)
                horizontalLineTo(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(4f, 14f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 7f)
                horizontalLineToRelative(-4f)
                verticalLineTo(5f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(-4f)
                lineTo(8f, 5f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.75f, 0.4f, 1.38f, 1f, 1.73f)
                verticalLineTo(19f)
                curveToRelative(0f, 1.11f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.11f, 0f, 2f, -0.89f, 2f, -2f)
                verticalLineToRelative(-3.28f)
                curveToRelative(0.59f, -0.35f, 1f, -0.99f, 1f, -1.72f)
                verticalLineTo(9f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(10f, 5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineTo(5f)
                close()
                moveToRelative(9f, 14f)
                horizontalLineTo(5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(-8f, -4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(9f, -1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                horizontalLineTo(9f)
                verticalLineToRelative(3f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(5f)
                close()
            }
        }.build()
        
        return _Business_center!!
    }

private var _Business_center: ImageVector? = null


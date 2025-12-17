package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Business_center: ImageVector
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
                moveTo(10f, 16f)
                verticalLineToRelative(-1f)
                horizontalLineTo(3.01f)
                verticalLineToRelative(6f)
                horizontalLineTo(21f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                close()
                moveToRelative(12f, -9f)
                horizontalLineToRelative(-6f)
                verticalLineTo(5f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(-4f)
                lineTo(8f, 5f)
                verticalLineToRelative(2f)
                horizontalLineTo(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineTo(7f)
                close()
                moveToRelative(-8f, 0f)
                horizontalLineToRelative(-4f)
                verticalLineTo(5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Business_center!!
    }

private var _Business_center: ImageVector? = null


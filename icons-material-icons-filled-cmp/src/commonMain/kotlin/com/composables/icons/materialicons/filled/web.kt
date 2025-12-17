package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Web: ImageVector
    get() {
        if (_Web != null) return _Web!!
        
        _Web = ImageVector.Builder(
            name = "web",
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
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                lineTo(2f, 18f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-5f, 14f)
                horizontalLineTo(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(0f, -5f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(5f, 5f)
                horizontalLineToRelative(-4f)
                verticalLineTo(9f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(9f)
                close()
            }
        }.build()
        
        return _Web!!
    }

private var _Web: ImageVector? = null


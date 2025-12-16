package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.BorderWidth: ImageVector
    get() {
        if (_BorderWidth != null) return _BorderWidth!!
        
        _BorderWidth = ImageVector.Builder(
            name = "border-width",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 12.75f)
                horizontalLineTo(1f)
                verticalLineTo(10.25f)
                horizontalLineTo(14f)
                verticalLineTo(12.75f)
                close()
                moveTo(14f, 8f)
                horizontalLineTo(1f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                close()
                moveTo(14f, 4f)
                horizontalLineTo(1f)
                verticalLineTo(3f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                close()
            }
        }.build()
        
        return _BorderWidth!!
    }

private var _BorderWidth: ImageVector? = null


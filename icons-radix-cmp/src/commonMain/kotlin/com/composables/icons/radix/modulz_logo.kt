package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ModulzLogo: ImageVector
    get() {
        if (_ModulzLogo != null) return _ModulzLogo!!
        
        _ModulzLogo = ImageVector.Builder(
            name = "modulz-logo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.88867f, 11.833f)
                lineTo(1f, 14f)
                verticalLineTo(9.66699f)
                lineTo(3.88867f, 11.833f)
                close()
                moveTo(14f, 14f)
                lineTo(11.1113f, 11.833f)
                lineTo(14f, 9.66699f)
                verticalLineTo(14f)
                close()
                moveTo(3.88867f, 11.1113f)
                lineTo(1f, 8.94434f)
                lineTo(3.88867f, 6.77734f)
                verticalLineTo(11.1113f)
                close()
                moveTo(14f, 8.94434f)
                lineTo(11.1113f, 11.1113f)
                verticalLineTo(6.77734f)
                lineTo(14f, 8.94434f)
                close()
                moveTo(3.88867f, 6.05566f)
                lineTo(1f, 8.22266f)
                verticalLineTo(3.88867f)
                lineTo(3.88867f, 6.05566f)
                close()
                moveTo(7.25879f, 8.22266f)
                lineTo(4.37012f, 6.05566f)
                lineTo(7.25879f, 3.88867f)
                verticalLineTo(8.22266f)
                close()
                moveTo(10.6299f, 6.05566f)
                lineTo(7.74121f, 8.22266f)
                verticalLineTo(3.88867f)
                lineTo(10.6299f, 6.05566f)
                close()
                moveTo(14f, 8.22266f)
                lineTo(11.1113f, 6.05566f)
                lineTo(14f, 3.88867f)
                verticalLineTo(8.22266f)
                close()
                moveTo(3.88867f, 5.33301f)
                lineTo(1f, 3.16699f)
                lineTo(3.88867f, 1f)
                verticalLineTo(5.33301f)
                close()
                moveTo(7.25879f, 3.16699f)
                lineTo(4.37012f, 5.33301f)
                verticalLineTo(1f)
                lineTo(7.25879f, 3.16699f)
                close()
                moveTo(10.6299f, 5.33301f)
                lineTo(7.74121f, 3.16699f)
                lineTo(10.6299f, 1f)
                verticalLineTo(5.33301f)
                close()
                moveTo(14f, 3.16699f)
                lineTo(11.1113f, 5.33301f)
                verticalLineTo(1f)
                lineTo(14f, 3.16699f)
                close()
            }
        }.build()
        
        return _ModulzLogo!!
    }

private var _ModulzLogo: ImageVector? = null


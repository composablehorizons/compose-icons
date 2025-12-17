package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Medium: ImageVector
    get() {
        if (_Medium != null) return _Medium!!
        
        _Medium = ImageVector.Builder(
            name = "medium",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 32f)
                verticalLineToRelative(448f)
                horizontalLineToRelative(448f)
                verticalLineTo(32f)
                horizontalLineTo(0f)
                close()
                moveToRelative(372.2f, 106.1f)
                lineToRelative(-24f, 23f)
                curveToRelative(-2.1f, 1.6f, -3.1f, 4.2f, -2.7f, 6.7f)
                verticalLineToRelative(169.3f)
                curveToRelative(-0.4f, 2.6f, 0.6f, 5.2f, 2.7f, 6.7f)
                lineToRelative(23.5f, 23f)
                verticalLineToRelative(5.1f)
                horizontalLineToRelative(-118f)
                verticalLineTo(367f)
                lineToRelative(24.3f, -23.6f)
                curveToRelative(2.4f, -2.4f, 2.4f, -3.1f, 2.4f, -6.7f)
                verticalLineTo(199.8f)
                lineToRelative(-67.6f, 171.6f)
                horizontalLineToRelative(-9.1f)
                lineTo(125f, 199.8f)
                verticalLineToRelative(115f)
                curveToRelative(-0.7f, 4.8f, 1f, 9.7f, 4.4f, 13.2f)
                lineToRelative(31.6f, 38.3f)
                verticalLineToRelative(5.1f)
                horizontalLineTo(71.2f)
                verticalLineToRelative(-5.1f)
                lineToRelative(31.6f, -38.3f)
                curveToRelative(3.4f, -3.5f, 4.9f, -8.4f, 4.1f, -13.2f)
                verticalLineToRelative(-133f)
                curveToRelative(0.4f, -3.7f, -1f, -7.3f, -3.8f, -9.8f)
                lineTo(75f, 138.1f)
                verticalLineTo(133f)
                horizontalLineToRelative(87.3f)
                lineToRelative(67.4f, 148f)
                lineTo(289f, 133.1f)
                horizontalLineToRelative(83.2f)
                verticalLineToRelative(5f)
                close()
            }
        }.build()
        
        return _Medium!!
    }

private var _Medium: ImageVector? = null

